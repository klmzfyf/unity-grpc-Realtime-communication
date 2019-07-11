package com.skw.audioserver.playerOperateServer;

import com.skw.playerOperate.AllPlayerOperation;
import com.skw.playerOperate.OnePlayerOperation;
import com.skw.playerOperate.PlayerOperateGrpc;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;


public class PlayerOperateImpl extends PlayerOperateGrpc.PlayerOperateImplBase {

    Map<Integer,StreamObserver<AllPlayerOperation>> resStream = new HashMap<Integer,StreamObserver<AllPlayerOperation>>();
    Map<Integer,OnePlayerOperation> everyOperation = new HashMap<>();

    public StreamObserver<OnePlayerOperation> sendAndReceiveOperation(
            StreamObserver<AllPlayerOperation> responseObserver) {
        return new StreamObserver<OnePlayerOperation>(){

            @Override
            public void onNext(OnePlayerOperation value) {
                //客户端发送一条数据过来，如果该客户端不在resSteam中。则加入，
                if(!resStream.keySet().contains(value.getId())){
                    resStream.put(value.getId(),responseObserver);
                }
                //如果该客户端在resStream中。则加入待发送队列。
                everyOperation.put(value.getId(),value);
                //判断消息是否到齐。到齐后广播给所有人。
                if(everyOperation.size()== resStream.size() ){
                    responseObserver.onNext(AllPlayerOperation.newBuilder()
                            .addAllPlayerOperation(everyOperation.values()).build());
                }
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("出错了");
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };


    }
}
