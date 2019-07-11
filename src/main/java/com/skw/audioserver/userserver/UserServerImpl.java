package com.skw.audioserver.userserver;

import com.skw.audioserver.userserver.model.PlayerInfo;
import com.skw.userBean.*;
import io.grpc.stub.StreamObserver;


public class UserServerImpl extends UserControllerGrpc.UserControllerImplBase {
    UserDao dao = new UserDao();

    public void register(UserRegisterBean request,
                         StreamObserver<RegisterResult> responseObserver) {
        PlayerInfo playerInfo = null;
        try {
            playerInfo = dao.register(request);


        } catch (Exception e) {
            RegisterResult registerResult = RegisterResult.newBuilder().setResultType(Constant.FAILED).build();
            responseObserver.onNext(registerResult);
            responseObserver.onCompleted();
        }
        if (playerInfo != null) {
            RegisterResult registerResult = RegisterResult.newBuilder().setResultType(Constant.SUCCESS)
                    .setId(playerInfo.getId()).setName(playerInfo.getName()).build();
            responseObserver.onNext(registerResult);
            responseObserver.onCompleted();
        }
    }


    public void login(UserLoginBean request,
                      StreamObserver<LoginResult> responseObserver) {
        System.out.println("发起了登录请求");
        PlayerInfo info = null;
        try {
            info = dao.query(new PlayerInfo(request.getName(), request.getPassword(), 0));
        } catch (Exception e) {
            responseObserver.onNext(LoginResult.newBuilder().setResultType(Constant.FAILED).build());
        }
        if (info != null) {

            responseObserver.onNext(LoginResult.newBuilder().setResultType(Constant.SUCCESS).setId(info.getId())
                    .setName(info.getName()).build());
        } else {
            responseObserver.onNext(LoginResult.newBuilder().setResultType(Constant.FAILED).build());
        }
        responseObserver.onCompleted();
    }
}
