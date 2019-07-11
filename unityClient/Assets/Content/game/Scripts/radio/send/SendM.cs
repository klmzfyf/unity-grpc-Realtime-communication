
using Com.Skw.ProtoBean;
using Grpc.Core;
using System.Collections.Generic;

namespace com.skw.send
{
    class SendM
    {
        Channel channel;
        IAudioTransform.IAudioTransformClient client;
        AsyncClientStreamingCall<SendBean, Ok> call;
        SendBean sb;
        string ip = "127.0.0.1";
        int port = 55530;

        public SendM()
        {
            init(this.ip, this.port);
        }

        public SendM(string ip,int port)
        {
            init(ip, port);
        }
        public void init(string ip, int port)
        {
            channel = new Channel(ip, port, ChannelCredentials.Insecure);
            client = new IAudioTransform.IAudioTransformClient(channel);
            //GetAudio指针对服务器是接受语音。
            call = this.client.GetAudio();
            sb = new SendBean();
            sb.Audio = new Audio();    
           
        }

        public async void sendMusicAsync(float[] a,List<int> nearids,int playerid)
        {
         
            sb.Audio.AMessage.Clear();        
            sb.Audio.AMessage.Add(a);
            sb.NearPlayer.Clear();
            sb.NearPlayer.Add(nearids);
            sb.Player = playerid;
            await call.RequestStream.WriteAsync(sb);
        

        }
        public async void stopAsync()
        {
            await call.RequestStream.CompleteAsync();
         
            Ok ok = await call.ResponseAsync;
            channel.ShutdownAsync().Wait();
        }
        
    }
}
