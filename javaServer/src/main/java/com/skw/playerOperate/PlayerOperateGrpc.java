package com.skw.playerOperate;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: PlayerOperate.proto")
public final class PlayerOperateGrpc {

  private PlayerOperateGrpc() {}

  public static final String SERVICE_NAME = "com.skw.playerOperate.PlayerOperate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.skw.playerOperate.OnePlayerOperation,
      com.skw.playerOperate.AllPlayerOperation> getSendAndReceiveOperationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendAndReceiveOperation",
      requestType = com.skw.playerOperate.OnePlayerOperation.class,
      responseType = com.skw.playerOperate.AllPlayerOperation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.skw.playerOperate.OnePlayerOperation,
      com.skw.playerOperate.AllPlayerOperation> getSendAndReceiveOperationMethod() {
    io.grpc.MethodDescriptor<com.skw.playerOperate.OnePlayerOperation, com.skw.playerOperate.AllPlayerOperation> getSendAndReceiveOperationMethod;
    if ((getSendAndReceiveOperationMethod = PlayerOperateGrpc.getSendAndReceiveOperationMethod) == null) {
      synchronized (PlayerOperateGrpc.class) {
        if ((getSendAndReceiveOperationMethod = PlayerOperateGrpc.getSendAndReceiveOperationMethod) == null) {
          PlayerOperateGrpc.getSendAndReceiveOperationMethod = getSendAndReceiveOperationMethod = 
              io.grpc.MethodDescriptor.<com.skw.playerOperate.OnePlayerOperation, com.skw.playerOperate.AllPlayerOperation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.skw.playerOperate.PlayerOperate", "sendAndReceiveOperation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skw.playerOperate.OnePlayerOperation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.skw.playerOperate.AllPlayerOperation.getDefaultInstance()))
                  .setSchemaDescriptor(new PlayerOperateMethodDescriptorSupplier("sendAndReceiveOperation"))
                  .build();
          }
        }
     }
     return getSendAndReceiveOperationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerOperateStub newStub(io.grpc.Channel channel) {
    return new PlayerOperateStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerOperateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PlayerOperateBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerOperateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PlayerOperateFutureStub(channel);
  }

  /**
   */
  public static abstract class PlayerOperateImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.skw.playerOperate.OnePlayerOperation> sendAndReceiveOperation(
        io.grpc.stub.StreamObserver<com.skw.playerOperate.AllPlayerOperation> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendAndReceiveOperationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendAndReceiveOperationMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.skw.playerOperate.OnePlayerOperation,
                com.skw.playerOperate.AllPlayerOperation>(
                  this, METHODID_SEND_AND_RECEIVE_OPERATION)))
          .build();
    }
  }

  /**
   */
  public static final class PlayerOperateStub extends io.grpc.stub.AbstractStub<PlayerOperateStub> {
    private PlayerOperateStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerOperateStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerOperateStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerOperateStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.skw.playerOperate.OnePlayerOperation> sendAndReceiveOperation(
        io.grpc.stub.StreamObserver<com.skw.playerOperate.AllPlayerOperation> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendAndReceiveOperationMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PlayerOperateBlockingStub extends io.grpc.stub.AbstractStub<PlayerOperateBlockingStub> {
    private PlayerOperateBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerOperateBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerOperateBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerOperateBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class PlayerOperateFutureStub extends io.grpc.stub.AbstractStub<PlayerOperateFutureStub> {
    private PlayerOperateFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerOperateFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerOperateFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerOperateFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_AND_RECEIVE_OPERATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlayerOperateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlayerOperateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_AND_RECEIVE_OPERATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendAndReceiveOperation(
              (io.grpc.stub.StreamObserver<com.skw.playerOperate.AllPlayerOperation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PlayerOperateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerOperateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.skw.playerOperate.PlayerOperateOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayerOperate");
    }
  }

  private static final class PlayerOperateFileDescriptorSupplier
      extends PlayerOperateBaseDescriptorSupplier {
    PlayerOperateFileDescriptorSupplier() {}
  }

  private static final class PlayerOperateMethodDescriptorSupplier
      extends PlayerOperateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlayerOperateMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PlayerOperateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerOperateFileDescriptorSupplier())
              .addMethod(getSendAndReceiveOperationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
