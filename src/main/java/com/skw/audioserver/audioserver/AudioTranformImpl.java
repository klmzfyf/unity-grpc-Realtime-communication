package com.skw.audioserver.audioserver;

import com.skw.protoBean.*;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public class AudioTranformImpl extends IAudioTransformGrpc.IAudioTransformImplBase {


    Map<Integer,StreamObserver<Audio>> streamObserverList = new HashMap<>();

    public StreamObserver<SendBean> getAudio(StreamObserver<Ok> responseObserver) {
        return new StreamObserver<SendBean>(){

            @Override
            public void onNext(SendBean sendBean) {
                //连接建立
                System.out.println("接受到来自于"+sendBean.getPlayer()+"的语音");
                //System.out.println("将要发送给"+sendBean.getNearPlayerList().get(0));
                streamObserverList.forEach((key,streamObserver)->{
                    if(sendBean.getNearPlayerList().contains(key)){
                        streamObserver.onNext(sendBean.getAudio());
                    }
                });
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("出错了");
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Ok.newBuilder().setOk("iokl").build());
                responseObserver.onCompleted();
                System.out.println("连接断开");

            }
        };
    }
    //客户端调用该方法建立长连接。该方法返回其他用户的声音
    public void sendAudio(AskReq request,StreamObserver<Audio> responseObserver) {
        System.out.println(request.getReq()+"加入了");
        StreamObserver<Audio> oldAudio =  streamObserverList.put(request.getReq(),responseObserver);
        if(oldAudio != null){
            //说明key重复了。 把这个旧连接关闭
            System.out.println("关掉旧连接");
            oldAudio.onCompleted();
        }
        Object lock = new Object();
        synchronized (lock){
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("================================连接关闭了");
        streamObserverList.forEach((key,stream) ->{
            stream.onCompleted();
        });
    }
    private void sendToOthers(Map<String,StreamObserver<Audio>> streamObserverList,Audio audio){

    }
}
