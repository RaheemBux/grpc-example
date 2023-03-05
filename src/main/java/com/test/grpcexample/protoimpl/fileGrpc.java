package com.test.grpcexample.protoimpl;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: file.proto")
public final class fileGrpc {

  private fileGrpc() {}

  public static final String SERVICE_NAME = "file";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.test.grpcexample.protoimpl.UploadRequest,
      com.test.grpcexample.protoimpl.UploadResponse> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "upload",
      requestType = com.test.grpcexample.protoimpl.UploadRequest.class,
      responseType = com.test.grpcexample.protoimpl.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test.grpcexample.protoimpl.UploadRequest,
      com.test.grpcexample.protoimpl.UploadResponse> getUploadMethod() {
    io.grpc.MethodDescriptor<com.test.grpcexample.protoimpl.UploadRequest, com.test.grpcexample.protoimpl.UploadResponse> getUploadMethod;
    if ((getUploadMethod = fileGrpc.getUploadMethod) == null) {
      synchronized (fileGrpc.class) {
        if ((getUploadMethod = fileGrpc.getUploadMethod) == null) {
          fileGrpc.getUploadMethod = getUploadMethod = 
              io.grpc.MethodDescriptor.<com.test.grpcexample.protoimpl.UploadRequest, com.test.grpcexample.protoimpl.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file", "upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpcexample.protoimpl.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpcexample.protoimpl.UploadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new fileMethodDescriptorSupplier("upload"))
                  .build();
          }
        }
     }
     return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.test.grpcexample.protoimpl.DownloadRequest,
      com.test.grpcexample.protoimpl.DownloadResponse> getDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "download",
      requestType = com.test.grpcexample.protoimpl.DownloadRequest.class,
      responseType = com.test.grpcexample.protoimpl.DownloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test.grpcexample.protoimpl.DownloadRequest,
      com.test.grpcexample.protoimpl.DownloadResponse> getDownloadMethod() {
    io.grpc.MethodDescriptor<com.test.grpcexample.protoimpl.DownloadRequest, com.test.grpcexample.protoimpl.DownloadResponse> getDownloadMethod;
    if ((getDownloadMethod = fileGrpc.getDownloadMethod) == null) {
      synchronized (fileGrpc.class) {
        if ((getDownloadMethod = fileGrpc.getDownloadMethod) == null) {
          fileGrpc.getDownloadMethod = getDownloadMethod = 
              io.grpc.MethodDescriptor.<com.test.grpcexample.protoimpl.DownloadRequest, com.test.grpcexample.protoimpl.DownloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "file", "download"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpcexample.protoimpl.DownloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpcexample.protoimpl.DownloadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new fileMethodDescriptorSupplier("download"))
                  .build();
          }
        }
     }
     return getDownloadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static fileStub newStub(io.grpc.Channel channel) {
    return new fileStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static fileBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new fileBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static fileFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new fileFutureStub(channel);
  }

  /**
   */
  public static abstract class fileImplBase implements io.grpc.BindableService {

    /**
     */
    public void upload(com.test.grpcexample.protoimpl.UploadRequest request,
        io.grpc.stub.StreamObserver<com.test.grpcexample.protoimpl.UploadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     */
    public void download(com.test.grpcexample.protoimpl.DownloadRequest request,
        io.grpc.stub.StreamObserver<com.test.grpcexample.protoimpl.DownloadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpcexample.protoimpl.UploadRequest,
                com.test.grpcexample.protoimpl.UploadResponse>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getDownloadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpcexample.protoimpl.DownloadRequest,
                com.test.grpcexample.protoimpl.DownloadResponse>(
                  this, METHODID_DOWNLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class fileStub extends io.grpc.stub.AbstractStub<fileStub> {
    private fileStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fileStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected fileStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fileStub(channel, callOptions);
    }

    /**
     */
    public void upload(com.test.grpcexample.protoimpl.UploadRequest request,
        io.grpc.stub.StreamObserver<com.test.grpcexample.protoimpl.UploadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void download(com.test.grpcexample.protoimpl.DownloadRequest request,
        io.grpc.stub.StreamObserver<com.test.grpcexample.protoimpl.DownloadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class fileBlockingStub extends io.grpc.stub.AbstractStub<fileBlockingStub> {
    private fileBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fileBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected fileBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fileBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.grpcexample.protoimpl.UploadResponse upload(com.test.grpcexample.protoimpl.UploadRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.test.grpcexample.protoimpl.DownloadResponse download(com.test.grpcexample.protoimpl.DownloadRequest request) {
      return blockingUnaryCall(
          getChannel(), getDownloadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class fileFutureStub extends io.grpc.stub.AbstractStub<fileFutureStub> {
    private fileFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private fileFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected fileFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new fileFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpcexample.protoimpl.UploadResponse> upload(
        com.test.grpcexample.protoimpl.UploadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpcexample.protoimpl.DownloadResponse> download(
        com.test.grpcexample.protoimpl.DownloadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD = 0;
  private static final int METHODID_DOWNLOAD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final fileImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(fileImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD:
          serviceImpl.upload((com.test.grpcexample.protoimpl.UploadRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpcexample.protoimpl.UploadResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD:
          serviceImpl.download((com.test.grpcexample.protoimpl.DownloadRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpcexample.protoimpl.DownloadResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class fileBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    fileBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpcexample.protoimpl.File.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("file");
    }
  }

  private static final class fileFileDescriptorSupplier
      extends fileBaseDescriptorSupplier {
    fileFileDescriptorSupplier() {}
  }

  private static final class fileMethodDescriptorSupplier
      extends fileBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    fileMethodDescriptorSupplier(String methodName) {
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
      synchronized (fileGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new fileFileDescriptorSupplier())
              .addMethod(getUploadMethod())
              .addMethod(getDownloadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
