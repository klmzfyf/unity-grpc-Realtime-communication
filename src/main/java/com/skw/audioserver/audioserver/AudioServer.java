package com.skw.audioserver.audioserver;

import com.skw.audioserver.playerOperateServer.PlayerOperateImpl;
import com.skw.audioserver.userserver.UserServerImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AudioServer {


    public Server server;
    public void start() throws IOException {
        int port = 55530;
        server= ServerBuilder.forPort(port).addService(new AudioTranformImpl())
                .addService(new UserServerImpl())
                .addService(new PlayerOperateImpl())
                .build().start();
        System.out.println("server start,listen port"+port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("系统正在关闭了");
            AudioServer.this.stop();
            System.err.println("已关闭");
        }));
    }
    public void stop(){
        if(server!=null){
            server.shutdown();
        }
    }
    private void blockUntilShutdown() throws InterruptedException {
        if(server !=null){
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        final AudioServer server = new AudioServer();
        server.start();


        server.blockUntilShutdown();

    }
}
