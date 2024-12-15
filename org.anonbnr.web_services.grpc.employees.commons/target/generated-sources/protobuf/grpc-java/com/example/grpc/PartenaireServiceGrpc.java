package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PartenaireServiceGrpc {

  private PartenaireServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.PartenaireService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Partenaire,
      com.example.grpc.Partenaire> getAddPartenaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPartenaire",
      requestType = com.example.grpc.Partenaire.class,
      responseType = com.example.grpc.Partenaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Partenaire,
      com.example.grpc.Partenaire> getAddPartenaireMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Partenaire, com.example.grpc.Partenaire> getAddPartenaireMethod;
    if ((getAddPartenaireMethod = PartenaireServiceGrpc.getAddPartenaireMethod) == null) {
      synchronized (PartenaireServiceGrpc.class) {
        if ((getAddPartenaireMethod = PartenaireServiceGrpc.getAddPartenaireMethod) == null) {
          PartenaireServiceGrpc.getAddPartenaireMethod = getAddPartenaireMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Partenaire, com.example.grpc.Partenaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addPartenaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Partenaire.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Partenaire.getDefaultInstance()))
              .setSchemaDescriptor(new PartenaireServiceMethodDescriptorSupplier("addPartenaire"))
              .build();
        }
      }
    }
    return getAddPartenaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.PartenaireId,
      com.example.grpc.Partenaire> getGetPartenaireByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPartenaireById",
      requestType = com.example.grpc.PartenaireId.class,
      responseType = com.example.grpc.Partenaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.PartenaireId,
      com.example.grpc.Partenaire> getGetPartenaireByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.PartenaireId, com.example.grpc.Partenaire> getGetPartenaireByIdMethod;
    if ((getGetPartenaireByIdMethod = PartenaireServiceGrpc.getGetPartenaireByIdMethod) == null) {
      synchronized (PartenaireServiceGrpc.class) {
        if ((getGetPartenaireByIdMethod = PartenaireServiceGrpc.getGetPartenaireByIdMethod) == null) {
          PartenaireServiceGrpc.getGetPartenaireByIdMethod = getGetPartenaireByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.PartenaireId, com.example.grpc.Partenaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPartenaireById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.PartenaireId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Partenaire.getDefaultInstance()))
              .setSchemaDescriptor(new PartenaireServiceMethodDescriptorSupplier("getPartenaireById"))
              .build();
        }
      }
    }
    return getGetPartenaireByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.PartenaireList> getGetAllPartenairesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllPartenaires",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.PartenaireList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.PartenaireList> getGetAllPartenairesMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.PartenaireList> getGetAllPartenairesMethod;
    if ((getGetAllPartenairesMethod = PartenaireServiceGrpc.getGetAllPartenairesMethod) == null) {
      synchronized (PartenaireServiceGrpc.class) {
        if ((getGetAllPartenairesMethod = PartenaireServiceGrpc.getGetAllPartenairesMethod) == null) {
          PartenaireServiceGrpc.getGetAllPartenairesMethod = getGetAllPartenairesMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.PartenaireList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllPartenaires"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.PartenaireList.getDefaultInstance()))
              .setSchemaDescriptor(new PartenaireServiceMethodDescriptorSupplier("getAllPartenaires"))
              .build();
        }
      }
    }
    return getGetAllPartenairesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.PartenaireCount> getGetPartenaireCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPartenaireCount",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.PartenaireCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.PartenaireCount> getGetPartenaireCountMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.PartenaireCount> getGetPartenaireCountMethod;
    if ((getGetPartenaireCountMethod = PartenaireServiceGrpc.getGetPartenaireCountMethod) == null) {
      synchronized (PartenaireServiceGrpc.class) {
        if ((getGetPartenaireCountMethod = PartenaireServiceGrpc.getGetPartenaireCountMethod) == null) {
          PartenaireServiceGrpc.getGetPartenaireCountMethod = getGetPartenaireCountMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.PartenaireCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPartenaireCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.PartenaireCount.getDefaultInstance()))
              .setSchemaDescriptor(new PartenaireServiceMethodDescriptorSupplier("getPartenaireCount"))
              .build();
        }
      }
    }
    return getGetPartenaireCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.PartenaireId,
      com.example.grpc.Empty> getDeletePartenaireByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePartenaireById",
      requestType = com.example.grpc.PartenaireId.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.PartenaireId,
      com.example.grpc.Empty> getDeletePartenaireByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.PartenaireId, com.example.grpc.Empty> getDeletePartenaireByIdMethod;
    if ((getDeletePartenaireByIdMethod = PartenaireServiceGrpc.getDeletePartenaireByIdMethod) == null) {
      synchronized (PartenaireServiceGrpc.class) {
        if ((getDeletePartenaireByIdMethod = PartenaireServiceGrpc.getDeletePartenaireByIdMethod) == null) {
          PartenaireServiceGrpc.getDeletePartenaireByIdMethod = getDeletePartenaireByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.PartenaireId, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletePartenaireById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.PartenaireId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PartenaireServiceMethodDescriptorSupplier("deletePartenaireById"))
              .build();
        }
      }
    }
    return getDeletePartenaireByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Partenaire,
      com.example.grpc.Partenaire> getUpdatePartenaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePartenaire",
      requestType = com.example.grpc.Partenaire.class,
      responseType = com.example.grpc.Partenaire.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Partenaire,
      com.example.grpc.Partenaire> getUpdatePartenaireMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Partenaire, com.example.grpc.Partenaire> getUpdatePartenaireMethod;
    if ((getUpdatePartenaireMethod = PartenaireServiceGrpc.getUpdatePartenaireMethod) == null) {
      synchronized (PartenaireServiceGrpc.class) {
        if ((getUpdatePartenaireMethod = PartenaireServiceGrpc.getUpdatePartenaireMethod) == null) {
          PartenaireServiceGrpc.getUpdatePartenaireMethod = getUpdatePartenaireMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Partenaire, com.example.grpc.Partenaire>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updatePartenaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Partenaire.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Partenaire.getDefaultInstance()))
              .setSchemaDescriptor(new PartenaireServiceMethodDescriptorSupplier("updatePartenaire"))
              .build();
        }
      }
    }
    return getUpdatePartenaireMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartenaireServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartenaireServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartenaireServiceStub>() {
        @java.lang.Override
        public PartenaireServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartenaireServiceStub(channel, callOptions);
        }
      };
    return PartenaireServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartenaireServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartenaireServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartenaireServiceBlockingStub>() {
        @java.lang.Override
        public PartenaireServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartenaireServiceBlockingStub(channel, callOptions);
        }
      };
    return PartenaireServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartenaireServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartenaireServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartenaireServiceFutureStub>() {
        @java.lang.Override
        public PartenaireServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartenaireServiceFutureStub(channel, callOptions);
        }
      };
    return PartenaireServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addPartenaire(com.example.grpc.Partenaire request,
        io.grpc.stub.StreamObserver<com.example.grpc.Partenaire> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPartenaireMethod(), responseObserver);
    }

    /**
     */
    default void getPartenaireById(com.example.grpc.PartenaireId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Partenaire> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPartenaireByIdMethod(), responseObserver);
    }

    /**
     */
    default void getAllPartenaires(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.PartenaireList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllPartenairesMethod(), responseObserver);
    }

    /**
     */
    default void getPartenaireCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.PartenaireCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPartenaireCountMethod(), responseObserver);
    }

    /**
     */
    default void deletePartenaireById(com.example.grpc.PartenaireId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePartenaireByIdMethod(), responseObserver);
    }

    /**
     */
    default void updatePartenaire(com.example.grpc.Partenaire request,
        io.grpc.stub.StreamObserver<com.example.grpc.Partenaire> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePartenaireMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PartenaireService.
   */
  public static abstract class PartenaireServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PartenaireServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PartenaireService.
   */
  public static final class PartenaireServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PartenaireServiceStub> {
    private PartenaireServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartenaireServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartenaireServiceStub(channel, callOptions);
    }

    /**
     */
    public void addPartenaire(com.example.grpc.Partenaire request,
        io.grpc.stub.StreamObserver<com.example.grpc.Partenaire> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPartenaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPartenaireById(com.example.grpc.PartenaireId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Partenaire> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPartenaireByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllPartenaires(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.PartenaireList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllPartenairesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPartenaireCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.PartenaireCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPartenaireCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePartenaireById(com.example.grpc.PartenaireId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePartenaireByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePartenaire(com.example.grpc.Partenaire request,
        io.grpc.stub.StreamObserver<com.example.grpc.Partenaire> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePartenaireMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PartenaireService.
   */
  public static final class PartenaireServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PartenaireServiceBlockingStub> {
    private PartenaireServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartenaireServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartenaireServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Partenaire addPartenaire(com.example.grpc.Partenaire request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPartenaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Partenaire getPartenaireById(com.example.grpc.PartenaireId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPartenaireByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.PartenaireList getAllPartenaires(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllPartenairesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.PartenaireCount getPartenaireCount(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPartenaireCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Empty deletePartenaireById(com.example.grpc.PartenaireId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePartenaireByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Partenaire updatePartenaire(com.example.grpc.Partenaire request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePartenaireMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PartenaireService.
   */
  public static final class PartenaireServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PartenaireServiceFutureStub> {
    private PartenaireServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartenaireServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartenaireServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Partenaire> addPartenaire(
        com.example.grpc.Partenaire request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPartenaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Partenaire> getPartenaireById(
        com.example.grpc.PartenaireId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPartenaireByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.PartenaireList> getAllPartenaires(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllPartenairesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.PartenaireCount> getPartenaireCount(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPartenaireCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> deletePartenaireById(
        com.example.grpc.PartenaireId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePartenaireByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Partenaire> updatePartenaire(
        com.example.grpc.Partenaire request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePartenaireMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PARTENAIRE = 0;
  private static final int METHODID_GET_PARTENAIRE_BY_ID = 1;
  private static final int METHODID_GET_ALL_PARTENAIRES = 2;
  private static final int METHODID_GET_PARTENAIRE_COUNT = 3;
  private static final int METHODID_DELETE_PARTENAIRE_BY_ID = 4;
  private static final int METHODID_UPDATE_PARTENAIRE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PARTENAIRE:
          serviceImpl.addPartenaire((com.example.grpc.Partenaire) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Partenaire>) responseObserver);
          break;
        case METHODID_GET_PARTENAIRE_BY_ID:
          serviceImpl.getPartenaireById((com.example.grpc.PartenaireId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Partenaire>) responseObserver);
          break;
        case METHODID_GET_ALL_PARTENAIRES:
          serviceImpl.getAllPartenaires((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.PartenaireList>) responseObserver);
          break;
        case METHODID_GET_PARTENAIRE_COUNT:
          serviceImpl.getPartenaireCount((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.PartenaireCount>) responseObserver);
          break;
        case METHODID_DELETE_PARTENAIRE_BY_ID:
          serviceImpl.deletePartenaireById((com.example.grpc.PartenaireId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PARTENAIRE:
          serviceImpl.updatePartenaire((com.example.grpc.Partenaire) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Partenaire>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddPartenaireMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Partenaire,
              com.example.grpc.Partenaire>(
                service, METHODID_ADD_PARTENAIRE)))
        .addMethod(
          getGetPartenaireByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.PartenaireId,
              com.example.grpc.Partenaire>(
                service, METHODID_GET_PARTENAIRE_BY_ID)))
        .addMethod(
          getGetAllPartenairesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.PartenaireList>(
                service, METHODID_GET_ALL_PARTENAIRES)))
        .addMethod(
          getGetPartenaireCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.PartenaireCount>(
                service, METHODID_GET_PARTENAIRE_COUNT)))
        .addMethod(
          getDeletePartenaireByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.PartenaireId,
              com.example.grpc.Empty>(
                service, METHODID_DELETE_PARTENAIRE_BY_ID)))
        .addMethod(
          getUpdatePartenaireMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Partenaire,
              com.example.grpc.Partenaire>(
                service, METHODID_UPDATE_PARTENAIRE)))
        .build();
  }

  private static abstract class PartenaireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PartenaireServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PartenaireService");
    }
  }

  private static final class PartenaireServiceFileDescriptorSupplier
      extends PartenaireServiceBaseDescriptorSupplier {
    PartenaireServiceFileDescriptorSupplier() {}
  }

  private static final class PartenaireServiceMethodDescriptorSupplier
      extends PartenaireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PartenaireServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PartenaireServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartenaireServiceFileDescriptorSupplier())
              .addMethod(getAddPartenaireMethod())
              .addMethod(getGetPartenaireByIdMethod())
              .addMethod(getGetAllPartenairesMethod())
              .addMethod(getGetPartenaireCountMethod())
              .addMethod(getDeletePartenaireByIdMethod())
              .addMethod(getUpdatePartenaireMethod())
              .build();
        }
      }
    }
    return result;
  }
}
