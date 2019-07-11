using com.skw.send;
using System.Collections;
using UnityEngine;

public class SendRadio : MonoBehaviour
{
   
   
    SendM client;
    //做一个时间间隔。抬起说话键后两秒不能让重新按下说话键
    private float TimeInterval;
    private AudioClip clip;
    private byte[] recordData;
    //通常的无损音质的采样率是44100，即每秒音频用44100个float数据表示，但是语音只需8000（通常移动电话是8000）就够了
    //不然音频数据太大，不利于传输和存储
    public const int SamplingRate = 8000;
    //循环一次时间
    public const int LoopTime = 1;
    //循环一次的数据长度
    private int Loopsize = SamplingRate * LoopTime;

    //做音频分割
    bool willLoop = false;
    //录音是否结束
    bool isEnd = false;
    //是否可以开始录音
    bool begin = false;
    //抽取数据前半部分还是后半部分
    int loopindex = 0;
    public string ip;
    public int port;
    // Start is called before the first frame update
    void Start()
    {
        if (ip != null && port != 0)
        {
            client = new SendM(ip,port);

        }
        else
        {
            client = new SendM();
        }

    }

    // Update is called once per frame
    void Update()
    {
        TimeInterval -= Time.deltaTime;


        if (Input.GetKey(KeyCode.M) && begin == false)
        {
            GetComponent<PlayerInfo>().checkNearPlayers();
            if (TimeInterval <= 0)
            {
                init();
                begin = true;
                OnRecording(null, begin);
            }
           

        }
        if (Input.GetKeyUp(KeyCode.M) && begin == true)
        {
           

            if(TimeInterval <= 0)
            {
                TimeInterval = 2 * LoopTime;
            }
            begin = false;
            //这里可以实现一套多长时间不通话就关掉连接的逻辑。暂未实现
            isEnd = true;
            //StartCoroutine(stopRadio(LoopTime*100000));
        }
        if (willLoop)
        {
            StartCoroutine(sendfile(clip, LoopTime, isEnd));
        }
    }

 
    private void init()
    {
      
        willLoop = false;
        isEnd = false;
    }


    //按钮按下开始录音，弹起结束录音
    void OnRecording(GameObject goSender, bool flag)
    {


        if (flag)
        {//按钮按下开始录音
            loopindex = 0;
            Microphone.End(null);//这句可以不需要，但是在开始录音以前调用一次是好习惯
            //两次一个循环
            clip = Microphone.Start(null, true, LoopTime*2, SamplingRate);
            //开了一个新线程专门去录音频，开一个协程。5秒后开始播放音乐。
            willLoop = true;
            
        }
    }

    private IEnumerator sendfile(AudioClip clip, int LoopTime,bool isEnd)
    {
        if(isEnd != true)
        {
            willLoop = false;
            yield return new WaitForSeconds(LoopTime);
           
            //if (audioLength < 1.0f) return;//录音小于1秒就不处理了
            //如果要便于传输还需要进行压缩，压缩后的recordData就可以用于网络传输了
            float[] a = new float[Loopsize];
            clip.GetData(a, loopindex*8000);
            if (loopindex == 1) loopindex--;
            else if (loopindex == 0) loopindex++;
            client.sendMusicAsync(a, GetComponent<PlayerInfo>().NearIds, GetComponent<PlayerInfo>().Id);
            willLoop = true;
        }
        else
        {
            //最后一个音节要添加标记
            willLoop = false;
            yield return new WaitForSeconds(LoopTime);
            //做最后的处理
            float[] a = new float[Loopsize];
            clip.GetData(a, loopindex * 8000);
            if (loopindex == 1) loopindex--;
            else if (loopindex == 0) loopindex++;
            client.sendMusicAsync(a, GetComponent<PlayerInfo>().NearIds, GetComponent<PlayerInfo>().Id);
            Microphone.End(null);
        }
    }
    private IEnumerator stopRadio(int LoopTime)
    {
        yield return new WaitForSeconds(100000f);
        client.stopAsync();
    }

}
