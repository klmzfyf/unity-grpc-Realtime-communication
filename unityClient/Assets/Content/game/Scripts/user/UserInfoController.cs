using Com.Skw.PlayerOperate;
using Com.Skw.UserBean;
using Grpc.Core;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class UserInfoController : MonoBehaviour
{
    string ip = "127.0.0.1";
    int port = 55530;
    public GameObject player;
    // Start is called before the first frame update
    void Start()
    {   
    }

    // Update is called once per frame
    void Update()
    { 
    }
    public async void regist()
    {
        InputField name = GameObject.FindGameObjectWithTag("nameInfo").GetComponent<InputField>();
        InputField password = GameObject.FindGameObjectWithTag("passwordInfo").GetComponent<InputField>();
        //打开grpc通道
        Channel channel = new Channel(ip, port, ChannelCredentials.Insecure);
        UserController.UserControllerClient client = new UserController.UserControllerClient(channel);
        UserRegisterBean userRegisterBean =  new UserRegisterBean();
        userRegisterBean.Name = name.text;
        userRegisterBean.Password = password.text;
        RegisterResult result =await client.registerAsync(userRegisterBean);
        if(result.ResultType ==  0)
        {
            //注册成功
            connectOthers(result.Id,result.Name);
        }
        else
        {
            //注册失败
            Debug.Log("用户名已存在");
        }
        channel.ShutdownAsync().Wait();
    }

    private void connectOthers(int id,string name)
    {


        Egg.create(player,id, name ,transform.position,transform.rotation , true);
        GameObject obj = GameObject.FindGameObjectWithTag("loginUI");
        obj.SetActive(false);

    }
    public async void login()
    {
        InputField name = GameObject.FindGameObjectWithTag("nameInfo").GetComponent<InputField>();
        InputField password = GameObject.FindGameObjectWithTag("passwordInfo").GetComponent<InputField>();
        //打开grpc通道
        Channel channel = new Channel(ip, port, ChannelCredentials.Insecure);
        UserController.UserControllerClient client = new UserController.UserControllerClient(channel);
        UserLoginBean userLoginBean = new UserLoginBean();
        userLoginBean.Name = name.text;
        userLoginBean.Password = password.text;

        LoginResult result = await client.loginAsync(userLoginBean);
        

        if (result.ResultType == 0)
        {
            //登录成功
            Debug.Log("登录成功"+ result.Id);
            connectOthers(result.Id,result.Name);
        }
        else
        {
            Debug.Log("登录失败");
        }
        channel.ShutdownAsync().Wait();
    }


}
