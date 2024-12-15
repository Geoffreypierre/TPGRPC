package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service gRPC pour gérer les chambres
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ChambreServiceGrpc {

  private ChambreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.ChambreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ChambreList> getGetAllChambresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllChambres",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.ChambreList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ChambreList> getGetAllChambresMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.ChambreList> getGetAllChambresMethod;
    if ((getGetAllChambresMethod = ChambreServiceGrpc.getGetAllChambresMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getGetAllChambresMethod = ChambreServiceGrpc.getGetAllChambresMethod) == null) {
          ChambreServiceGrpc.getGetAllChambresMethod = getGetAllChambresMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.ChambreList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllChambres"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ChambreList.getDefaultInstance()))
              .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("getAllChambres"))
              .build();
        }
      }
    }
    return getGetAllChambresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ChambreCount> getGetChambreCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getChambreCount",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.ChambreCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ChambreCount> getGetChambreCountMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.ChambreCount> getGetChambreCountMethod;
    if ((getGetChambreCountMethod = ChambreServiceGrpc.getGetChambreCountMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getGetChambreCountMethod = ChambreServiceGrpc.getGetChambreCountMethod) == null) {
          ChambreServiceGrpc.getGetChambreCountMethod = getGetChambreCountMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.ChambreCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getChambreCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ChambreCount.getDefaultInstance()))
              .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("getChambreCount"))
              .build();
        }
      }
    }
    return getGetChambreCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.ChambreId,
      com.example.grpc.Chambre> getGetChambreByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getChambreById",
      requestType = com.example.grpc.ChambreId.class,
      responseType = com.example.grpc.Chambre.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.ChambreId,
      com.example.grpc.Chambre> getGetChambreByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.ChambreId, com.example.grpc.Chambre> getGetChambreByIdMethod;
    if ((getGetChambreByIdMethod = ChambreServiceGrpc.getGetChambreByIdMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getGetChambreByIdMethod = ChambreServiceGrpc.getGetChambreByIdMethod) == null) {
          ChambreServiceGrpc.getGetChambreByIdMethod = getGetChambreByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.ChambreId, com.example.grpc.Chambre>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getChambreById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ChambreId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Chambre.getDefaultInstance()))
              .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("getChambreById"))
              .build();
        }
      }
    }
    return getGetChambreByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Chambre,
      com.example.grpc.Chambre> getAddChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addChambre",
      requestType = com.example.grpc.Chambre.class,
      responseType = com.example.grpc.Chambre.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Chambre,
      com.example.grpc.Chambre> getAddChambreMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Chambre, com.example.grpc.Chambre> getAddChambreMethod;
    if ((getAddChambreMethod = ChambreServiceGrpc.getAddChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getAddChambreMethod = ChambreServiceGrpc.getAddChambreMethod) == null) {
          ChambreServiceGrpc.getAddChambreMethod = getAddChambreMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Chambre, com.example.grpc.Chambre>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Chambre.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Chambre.getDefaultInstance()))
              .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("addChambre"))
              .build();
        }
      }
    }
    return getAddChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Chambre,
      com.example.grpc.Chambre> getUpdateChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateChambre",
      requestType = com.example.grpc.Chambre.class,
      responseType = com.example.grpc.Chambre.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Chambre,
      com.example.grpc.Chambre> getUpdateChambreMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Chambre, com.example.grpc.Chambre> getUpdateChambreMethod;
    if ((getUpdateChambreMethod = ChambreServiceGrpc.getUpdateChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getUpdateChambreMethod = ChambreServiceGrpc.getUpdateChambreMethod) == null) {
          ChambreServiceGrpc.getUpdateChambreMethod = getUpdateChambreMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Chambre, com.example.grpc.Chambre>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Chambre.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Chambre.getDefaultInstance()))
              .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("updateChambre"))
              .build();
        }
      }
    }
    return getUpdateChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.ChambreId,
      com.example.grpc.Empty> getDeleteChambreByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteChambreById",
      requestType = com.example.grpc.ChambreId.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.ChambreId,
      com.example.grpc.Empty> getDeleteChambreByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.ChambreId, com.example.grpc.Empty> getDeleteChambreByIdMethod;
    if ((getDeleteChambreByIdMethod = ChambreServiceGrpc.getDeleteChambreByIdMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getDeleteChambreByIdMethod = ChambreServiceGrpc.getDeleteChambreByIdMethod) == null) {
          ChambreServiceGrpc.getDeleteChambreByIdMethod = getDeleteChambreByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.ChambreId, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteChambreById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ChambreId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("deleteChambreById"))
              .build();
        }
      }
    }
    return getDeleteChambreByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChambreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChambreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChambreServiceStub>() {
        @java.lang.Override
        public ChambreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChambreServiceStub(channel, callOptions);
        }
      };
    return ChambreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChambreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChambreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChambreServiceBlockingStub>() {
        @java.lang.Override
        public ChambreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChambreServiceBlockingStub(channel, callOptions);
        }
      };
    return ChambreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChambreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChambreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChambreServiceFutureStub>() {
        @java.lang.Override
        public ChambreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChambreServiceFutureStub(channel, callOptions);
        }
      };
    return ChambreServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service gRPC pour gérer les chambres
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getAllChambres(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ChambreList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllChambresMethod(), responseObserver);
    }

    /**
     */
    default void getChambreCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ChambreCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChambreCountMethod(), responseObserver);
    }

    /**
     */
    default void getChambreById(com.example.grpc.ChambreId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Chambre> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChambreByIdMethod(), responseObserver);
    }

    /**
     */
    default void addChambre(com.example.grpc.Chambre request,
        io.grpc.stub.StreamObserver<com.example.grpc.Chambre> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddChambreMethod(), responseObserver);
    }

    /**
     */
    default void updateChambre(com.example.grpc.Chambre request,
        io.grpc.stub.StreamObserver<com.example.grpc.Chambre> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateChambreMethod(), responseObserver);
    }

    /**
     */
    default void deleteChambreById(com.example.grpc.ChambreId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteChambreByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ChambreService.
   * <pre>
   * Service gRPC pour gérer les chambres
   * </pre>
   */
  public static abstract class ChambreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ChambreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ChambreService.
   * <pre>
   * Service gRPC pour gérer les chambres
   * </pre>
   */
  public static final class ChambreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ChambreServiceStub> {
    private ChambreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChambreServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllChambres(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ChambreList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllChambresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChambreCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ChambreCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChambreCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChambreById(com.example.grpc.ChambreId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Chambre> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChambreByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addChambre(com.example.grpc.Chambre request,
        io.grpc.stub.StreamObserver<com.example.grpc.Chambre> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateChambre(com.example.grpc.Chambre request,
        io.grpc.stub.StreamObserver<com.example.grpc.Chambre> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChambreById(com.example.grpc.ChambreId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteChambreByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ChambreService.
   * <pre>
   * Service gRPC pour gérer les chambres
   * </pre>
   */
  public static final class ChambreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ChambreServiceBlockingStub> {
    private ChambreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChambreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.ChambreList getAllChambres(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllChambresMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.ChambreCount getChambreCount(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChambreCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Chambre getChambreById(com.example.grpc.ChambreId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChambreByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Chambre addChambre(com.example.grpc.Chambre request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Chambre updateChambre(com.example.grpc.Chambre request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Empty deleteChambreById(com.example.grpc.ChambreId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteChambreByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ChambreService.
   * <pre>
   * Service gRPC pour gérer les chambres
   * </pre>
   */
  public static final class ChambreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ChambreServiceFutureStub> {
    private ChambreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChambreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ChambreList> getAllChambres(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllChambresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ChambreCount> getChambreCount(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChambreCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Chambre> getChambreById(
        com.example.grpc.ChambreId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChambreByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Chambre> addChambre(
        com.example.grpc.Chambre request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Chambre> updateChambre(
        com.example.grpc.Chambre request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> deleteChambreById(
        com.example.grpc.ChambreId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteChambreByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CHAMBRES = 0;
  private static final int METHODID_GET_CHAMBRE_COUNT = 1;
  private static final int METHODID_GET_CHAMBRE_BY_ID = 2;
  private static final int METHODID_ADD_CHAMBRE = 3;
  private static final int METHODID_UPDATE_CHAMBRE = 4;
  private static final int METHODID_DELETE_CHAMBRE_BY_ID = 5;

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
        case METHODID_GET_ALL_CHAMBRES:
          serviceImpl.getAllChambres((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ChambreList>) responseObserver);
          break;
        case METHODID_GET_CHAMBRE_COUNT:
          serviceImpl.getChambreCount((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ChambreCount>) responseObserver);
          break;
        case METHODID_GET_CHAMBRE_BY_ID:
          serviceImpl.getChambreById((com.example.grpc.ChambreId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Chambre>) responseObserver);
          break;
        case METHODID_ADD_CHAMBRE:
          serviceImpl.addChambre((com.example.grpc.Chambre) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Chambre>) responseObserver);
          break;
        case METHODID_UPDATE_CHAMBRE:
          serviceImpl.updateChambre((com.example.grpc.Chambre) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Chambre>) responseObserver);
          break;
        case METHODID_DELETE_CHAMBRE_BY_ID:
          serviceImpl.deleteChambreById((com.example.grpc.ChambreId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Empty>) responseObserver);
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
          getGetAllChambresMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.ChambreList>(
                service, METHODID_GET_ALL_CHAMBRES)))
        .addMethod(
          getGetChambreCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.ChambreCount>(
                service, METHODID_GET_CHAMBRE_COUNT)))
        .addMethod(
          getGetChambreByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.ChambreId,
              com.example.grpc.Chambre>(
                service, METHODID_GET_CHAMBRE_BY_ID)))
        .addMethod(
          getAddChambreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Chambre,
              com.example.grpc.Chambre>(
                service, METHODID_ADD_CHAMBRE)))
        .addMethod(
          getUpdateChambreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Chambre,
              com.example.grpc.Chambre>(
                service, METHODID_UPDATE_CHAMBRE)))
        .addMethod(
          getDeleteChambreByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.ChambreId,
              com.example.grpc.Empty>(
                service, METHODID_DELETE_CHAMBRE_BY_ID)))
        .build();
  }

  private static abstract class ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChambreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChambreService");
    }
  }

  private static final class ChambreServiceFileDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier {
    ChambreServiceFileDescriptorSupplier() {}
  }

  private static final class ChambreServiceMethodDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ChambreServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ChambreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChambreServiceFileDescriptorSupplier())
              .addMethod(getGetAllChambresMethod())
              .addMethod(getGetChambreCountMethod())
              .addMethod(getGetChambreByIdMethod())
              .addMethod(getAddChambreMethod())
              .addMethod(getUpdateChambreMethod())
              .addMethod(getDeleteChambreByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
