package com.skw.protoBean;

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
    comments = "Source: Audio.proto")
public final class IAudioTransformGrpc {

  private IAudioTransformGrpc() {}

  public static final String SERVICE_NAME = "com.skw.protoBean.IAudioTransform";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SendBean,
      Ok> getGetAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAudio",
      requestType = SendBean.class,
      responseType = Ok.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<SendBean,
      Ok> getGetAudioMethod() {
    io.grpc.MethodDescriptor<SendBean, Ok> getGetAudioMethod;
    if ((getGetAudioMethod = IAudioTransformGrpc.getGetAudioMethod) == null) {
      synchronized (IAudioTransformGrpc.class) {
        if ((getGetAudioMethod = IAudioTransformGrpc.getGetAudioMethod) == null) {
          IAudioTransformGrpc.getGetAudioMethod = getGetAudioMethod = 
              io.grpc.MethodDescriptor.<SendBean, Ok>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.skw.protoBean.IAudioTransform", "GetAudio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendBean.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Ok.getDefaultInstance()))
                  .setSchemaDescriptor(new IAudioTransformMethodDescriptorSupplier("GetAudio"))
                  .build();
          }
        }
     }
     return getGetAudioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AskReq,
      Audio> getSendAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAudio",
      requestType = AskReq.class,
      responseType = Audio.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<AskReq,
      Audio> getSendAudioMethod() {
    io.grpc.MethodDescriptor<AskReq, Audio> getSendAudioMethod;
    if ((getSendAudioMethod = IAudioTransformGrpc.getSendAudioMethod) == null) {
      synchronized (IAudioTransformGrpc.class) {
        if ((getSendAudioMethod = IAudioTransformGrpc.getSendAudioMethod) == null) {
          IAudioTransformGrpc.getSendAudioMethod = getSendAudioMethod = 
              io.grpc.MethodDescriptor.<AskReq, Audio>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.skw.protoBean.IAudioTransform", "SendAudio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AskReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Audio.getDefaultInstance()))
                  .setSchemaDescriptor(new IAudioTransformMethodDescriptorSupplier("SendAudio"))
                  .build();
          }
        }
     }
     return getSendAudioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IAudioTransformStub newStub(io.grpc.Channel channel) {
    return new IAudioTransformStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IAudioTransformBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IAudioTransformBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IAudioTransformFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IAudioTransformFutureStub(channel);
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static abstract class IAudioTransformImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<SendBean> getAudio(
        io.grpc.stub.StreamObserver<Ok> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetAudioMethod(), responseObserver);
    }

    /**
     */
    public void sendAudio(AskReq request,
                          io.grpc.stub.StreamObserver<Audio> responseObserver) {
      asyncUnimplementedUnaryCall(getSendAudioMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAudioMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                SendBean,
                Ok>(
                  this, METHODID_GET_AUDIO)))
          .addMethod(
            getSendAudioMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                AskReq,
                Audio>(
                  this, METHODID_SEND_AUDIO)))
          .build();
    }
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static final class IAudioTransformStub extends io.grpc.stub.AbstractStub<IAudioTransformStub> {
    private IAudioTransformStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAudioTransformStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected IAudioTransformStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAudioTransformStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<SendBean> getAudio(
        io.grpc.stub.StreamObserver<Ok> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetAudioMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void sendAudio(AskReq request,
                          io.grpc.stub.StreamObserver<Audio> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSendAudioMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static final class IAudioTransformBlockingStub extends io.grpc.stub.AbstractStub<IAudioTransformBlockingStub> {
    private IAudioTransformBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAudioTransformBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected IAudioTransformBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAudioTransformBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<Audio> sendAudio(
        AskReq request) {
      return blockingServerStreamingCall(
          getChannel(), getSendAudioMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *传入一个用户list。向这个list里的用户发送实时语音到服务器。
   * </pre>
   */
  public static final class IAudioTransformFutureStub extends io.grpc.stub.AbstractStub<IAudioTransformFutureStub> {
    private IAudioTransformFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAudioTransformFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected IAudioTransformFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAudioTransformFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_AUDIO = 0;
  private static final int METHODID_GET_AUDIO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IAudioTransformImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IAudioTransformImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_AUDIO:
          serviceImpl.sendAudio((AskReq) request,
              (io.grpc.stub.StreamObserver<Audio>) responseObserver);
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
        case METHODID_GET_AUDIO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getAudio(
              (io.grpc.stub.StreamObserver<Ok>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IAudioTransformBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IAudioTransformBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AudioOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IAudioTransform");
    }
  }

  private static final class IAudioTransformFileDescriptorSupplier
      extends IAudioTransformBaseDescriptorSupplier {
    IAudioTransformFileDescriptorSupplier() {}
  }

  private static final class IAudioTransformMethodDescriptorSupplier
      extends IAudioTransformBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IAudioTransformMethodDescriptorSupplier(String methodName) {
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
      synchronized (IAudioTransformGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IAudioTransformFileDescriptorSupplier())
              .addMethod(getGetAudioMethod())
              .addMethod(getSendAudioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
