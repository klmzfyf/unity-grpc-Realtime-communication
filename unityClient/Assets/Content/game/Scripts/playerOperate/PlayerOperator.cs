using Com.Skw.PlayerOperate;
using Com.Skw.ProtoBean;
using Grpc.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assets.Content.game.Scripts.playerOperate
{
    class PlayerOperator
    {
        private Channel channel;
        private PlayerOperate.PlayerOperateClient client;
        private String ip = "127.0.0.1";
        private int port = 55530;
        AsyncDuplexStreamingCall<OnePlayerOperation, AllPlayerOperation> call;
        public PlayerOperator()
        {
            channel = new Channel(ip, port, ChannelCredentials.Insecure);
            client = new PlayerOperate.PlayerOperateClient(channel);
            call = client.sendAndReceiveOperation();
        }

        public async void sendOperate(OnePlayerOperation onePlayerOperation)
        {


            await call.RequestStream.WriteAsync(onePlayerOperation);
            
        }
        public async Task<AllPlayerOperation> receiveOperate()
        {
            while (await call.ResponseStream.MoveNext())
            {
                AllPlayerOperation allPlayerOperation = call.ResponseStream.Current;
                return await Task.FromResult(allPlayerOperation);
            }
            
            return null;
        }

    }
}
