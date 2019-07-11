package com.skw.userBean;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *传入一个用户list。向这个list里的用户发送实时语音到服务器。
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: User.proto")
public final class UserControllerGrpc {

  private UserControllerGrpc() {}

  public static final String SERVICE_NAME = "com.skw.userBean.UserController";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<UserRegisterBean,
      RegisterResult> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = UserRegisterBean.class,
      responseType = RegisterResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserRegisterBean,
      RegisterResult> getRegisterMethod() {
    io.grpc.MethodDescriptor<UserRegisterBean, RegisterResult> getRegisterMethod;
    if ((getRegisterMethod = UserControllerGrpc.getRegisterMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getRegisterMethod = UserControllerGrpc.getRegisterMethod) == null) {
          UserControllerGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<UserRegisterBean, RegisterResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.skw.userBean.UserController", "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserRegisterBean.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RegisterResult.getDefaultInstance()))
                  .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserLoginBean,
      LoginResult> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = UserLoginBean.class,
      responseType = LoginResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserLoginBean,
      LoginResult> getLoginMethod() {
    io.grpc.MethodDescriptor<UserLoginBean, LoginResult> getLoginMethod;
    if ((getLoginMethod = UserControllerGrpc.getLoginMethod) == null) {
      synchronized (UserControllerGrpc.class) {
        if ((getLoginMethod = UserControllerGrpc.getLoginMethod) == null) {
          UserControllerGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<UserLoginBean, LoginResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.skw.userBean.UserController", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserLoginBean.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LoginResult.getDefaultInstance()))
                  .setSchemaDescriptor(new UserControllerMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserControllerStub newStub(io.grpc.Channel channel) {
    return new UserControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserControllerFutureStub(channel);
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static abstract class UserControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(UserRegisterBean request,
                         io.grpc.stub.StreamObserver<RegisterResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void login(UserLoginBean request,
                      io.grpc.stub.StreamObserver<LoginResult> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserRegisterBean,
                RegisterResult>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                UserLoginBean,
                LoginResult>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static final class UserControllerStub extends io.grpc.stub.AbstractStub<UserControllerStub> {
    private UserControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserControllerStub(channel, callOptions);
    }

    /**
     */
    public void register(UserRegisterBean request,
                         io.grpc.stub.StreamObserver<RegisterResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(UserLoginBean request,
                      io.grpc.stub.StreamObserver<LoginResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static final class UserControllerBlockingStub extends io.grpc.stub.AbstractStub<UserControllerBlockingStub> {
    private UserControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public RegisterResult register(UserRegisterBean request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public LoginResult login(UserLoginBean request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static final class UserControllerFutureStub extends io.grpc.stub.AbstractStub<UserControllerFutureStub> {
    private UserControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RegisterResult> register(
        UserRegisterBean request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LoginResult> login(
        UserLoginBean request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((UserRegisterBean) request,
              (io.grpc.stub.StreamObserver<RegisterResult>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((UserLoginBean) request,
              (io.grpc.stub.StreamObserver<LoginResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserControllerBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return User.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserController");
    }
  }

  private static final class UserControllerFileDescriptorSupplier
      extends UserControllerBaseDescriptorSupplier {
    UserControllerFileDescriptorSupplier() {}
  }

  private static final class UserControllerMethodDescriptorSupplier
      extends UserControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserControllerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserControllerFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
