using Com.Skw.ProtoBean;
using Grpc.Core;
using System;
using System.Collections;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using UnityEngine;

namespace com.skw.recive
{
    class RecviM : MonoBehaviour
    {
        private Channel channel;
        private IAudioTransform.IAudioTransformClient client;
        private AsyncServerStreamingCall<Audio> call;
        public String ip="127.0.0.1";
        public int port=55530;
        public AudioSource audioSource;
        private ConcurrentQueue<Audio> queue = new ConcurrentQueue<Audio>();
        private const int SamplingRate = 8000;
        void Start()
        {
            PlayerInfo playerInfo = gameObject.GetComponent<PlayerInfo>();
            RecviMessage(playerInfo.Id);
            StartCoroutine(PlayMusic(audioSource));

        }

        public async void  RecviMessage(int id)
        {
            
            channel = new Channel(ip, port, ChannelCredentials.Insecure);
            client = new IAudioTransform.IAudioTransformClient(channel);
            AskReq askreq = new AskReq();
            askreq.Req = id;
            using (
                call = this.client.SendAudio(askreq))
            {
           
                while ( await call.ResponseStream.MoveNext())
                {
                   
                    Audio audioCurrent = call.ResponseStream.Current;
                    //把这个对象入队列
                    Debug.Log("放入一个对象到队列中。队列长度为"+ queue.Count);
                    queue.Enqueue(audioCurrent);
                    //判断该queue是否已经有两个对象。若是，则发送播放信号。
                }
            }
            channel.ShutdownAsync().Wait();
        }

   

        private IEnumerator PlayMusic(AudioSource audioSource)
        {
            while (true)
            {
                if (queue.Count > 1)
                {
                    audioSource.clip = AudioClip.Create("radio", 800000, 1, SamplingRate, false);
                    //如果queue里有两个元素时。开始播放。播放到没有元素。并判断是否会继续有两个元素
                    int i = 0;
                    Debug.Log("队列中第一个片段播放开始，长度为" + queue.Count);
                   
                    audioSource.clip.SetData(deQueue(queue).AMessage.ToArray(), i);
                    audioSource.Play();
                    
                    while (queue.Count > 0)
                    {
                        i++;
                        Debug.Log("取出队列中的一个片段，长度为"+ queue.Count);
                        audioSource.clip.SetData(deQueue(queue).AMessage.ToArray(), i*8000);

                        //audioSource.Play();
                        //休息1秒钟。因为一个数据包是1秒中。这里应该把数据包时间放到一个常量类里统一管理
                        yield return new WaitForSeconds(1);
                    }
                }
                yield return new WaitForSeconds(1);
            }
        }
        private Audio deQueue(ConcurrentQueue<Audio> queue)
        {
            Audio audiocache;
            queue.TryDequeue(out audiocache);
            return audiocache;
        }   
    }
}
