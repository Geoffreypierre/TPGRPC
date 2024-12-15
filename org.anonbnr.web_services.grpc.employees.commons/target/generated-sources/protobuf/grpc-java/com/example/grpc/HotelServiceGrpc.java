package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service gRPC pour gérer les hôtels
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HotelServiceGrpc {

  private HotelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.HotelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Hotel,
      com.example.grpc.Hotel> getAddHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addHotel",
      requestType = com.example.grpc.Hotel.class,
      responseType = com.example.grpc.Hotel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Hotel,
      com.example.grpc.Hotel> getAddHotelMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Hotel, com.example.grpc.Hotel> getAddHotelMethod;
    if ((getAddHotelMethod = HotelServiceGrpc.getAddHotelMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getAddHotelMethod = HotelServiceGrpc.getAddHotelMethod) == null) {
          HotelServiceGrpc.getAddHotelMethod = getAddHotelMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Hotel, com.example.grpc.Hotel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Hotel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Hotel.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("addHotel"))
              .build();
        }
      }
    }
    return getAddHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.HotelId,
      com.example.grpc.Hotel> getGetHotelByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHotelById",
      requestType = com.example.grpc.HotelId.class,
      responseType = com.example.grpc.Hotel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.HotelId,
      com.example.grpc.Hotel> getGetHotelByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.HotelId, com.example.grpc.Hotel> getGetHotelByIdMethod;
    if ((getGetHotelByIdMethod = HotelServiceGrpc.getGetHotelByIdMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetHotelByIdMethod = HotelServiceGrpc.getGetHotelByIdMethod) == null) {
          HotelServiceGrpc.getGetHotelByIdMethod = getGetHotelByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.HotelId, com.example.grpc.Hotel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHotelById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HotelId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Hotel.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("getHotelById"))
              .build();
        }
      }
    }
    return getGetHotelByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.HotelList> getGetAllHotelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllHotels",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.HotelList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.HotelList> getGetAllHotelsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.HotelList> getGetAllHotelsMethod;
    if ((getGetAllHotelsMethod = HotelServiceGrpc.getGetAllHotelsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetAllHotelsMethod = HotelServiceGrpc.getGetAllHotelsMethod) == null) {
          HotelServiceGrpc.getGetAllHotelsMethod = getGetAllHotelsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.HotelList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllHotels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HotelList.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("getAllHotels"))
              .build();
        }
      }
    }
    return getGetAllHotelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.HotelCount> getGetHotelCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHotelCount",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.HotelCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.HotelCount> getGetHotelCountMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.HotelCount> getGetHotelCountMethod;
    if ((getGetHotelCountMethod = HotelServiceGrpc.getGetHotelCountMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetHotelCountMethod = HotelServiceGrpc.getGetHotelCountMethod) == null) {
          HotelServiceGrpc.getGetHotelCountMethod = getGetHotelCountMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.HotelCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHotelCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HotelCount.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("getHotelCount"))
              .build();
        }
      }
    }
    return getGetHotelCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.HotelId,
      com.example.grpc.Empty> getDeleteHotelByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteHotelById",
      requestType = com.example.grpc.HotelId.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.HotelId,
      com.example.grpc.Empty> getDeleteHotelByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.HotelId, com.example.grpc.Empty> getDeleteHotelByIdMethod;
    if ((getDeleteHotelByIdMethod = HotelServiceGrpc.getDeleteHotelByIdMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getDeleteHotelByIdMethod = HotelServiceGrpc.getDeleteHotelByIdMethod) == null) {
          HotelServiceGrpc.getDeleteHotelByIdMethod = getDeleteHotelByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.HotelId, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteHotelById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.HotelId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("deleteHotelById"))
              .build();
        }
      }
    }
    return getDeleteHotelByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Hotel,
      com.example.grpc.Hotel> getUpdateHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateHotel",
      requestType = com.example.grpc.Hotel.class,
      responseType = com.example.grpc.Hotel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Hotel,
      com.example.grpc.Hotel> getUpdateHotelMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Hotel, com.example.grpc.Hotel> getUpdateHotelMethod;
    if ((getUpdateHotelMethod = HotelServiceGrpc.getUpdateHotelMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getUpdateHotelMethod = HotelServiceGrpc.getUpdateHotelMethod) == null) {
          HotelServiceGrpc.getUpdateHotelMethod = getUpdateHotelMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Hotel, com.example.grpc.Hotel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Hotel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Hotel.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("updateHotel"))
              .build();
        }
      }
    }
    return getUpdateHotelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub>() {
        @java.lang.Override
        public HotelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceStub(channel, callOptions);
        }
      };
    return HotelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub>() {
        @java.lang.Override
        public HotelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceBlockingStub(channel, callOptions);
        }
      };
    return HotelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub>() {
        @java.lang.Override
        public HotelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceFutureStub(channel, callOptions);
        }
      };
    return HotelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service gRPC pour gérer les hôtels
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void addHotel(com.example.grpc.Hotel request,
        io.grpc.stub.StreamObserver<com.example.grpc.Hotel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHotelMethod(), responseObserver);
    }

    /**
     */
    default void getHotelById(com.example.grpc.HotelId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Hotel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelByIdMethod(), responseObserver);
    }

    /**
     */
    default void getAllHotels(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.HotelList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllHotelsMethod(), responseObserver);
    }

    /**
     */
    default void getHotelCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.HotelCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelCountMethod(), responseObserver);
    }

    /**
     */
    default void deleteHotelById(com.example.grpc.HotelId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHotelByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateHotel(com.example.grpc.Hotel request,
        io.grpc.stub.StreamObserver<com.example.grpc.Hotel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHotelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HotelService.
   * <pre>
   * Service gRPC pour gérer les hôtels
   * </pre>
   */
  public static abstract class HotelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HotelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HotelService.
   * <pre>
   * Service gRPC pour gérer les hôtels
   * </pre>
   */
  public static final class HotelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HotelServiceStub> {
    private HotelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceStub(channel, callOptions);
    }

    /**
     */
    public void addHotel(com.example.grpc.Hotel request,
        io.grpc.stub.StreamObserver<com.example.grpc.Hotel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelById(com.example.grpc.HotelId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Hotel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllHotels(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.HotelList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllHotelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.HotelCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHotelById(com.example.grpc.HotelId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHotelByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHotel(com.example.grpc.Hotel request,
        io.grpc.stub.StreamObserver<com.example.grpc.Hotel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHotelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HotelService.
   * <pre>
   * Service gRPC pour gérer les hôtels
   * </pre>
   */
  public static final class HotelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HotelServiceBlockingStub> {
    private HotelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Hotel addHotel(com.example.grpc.Hotel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Hotel getHotelById(com.example.grpc.HotelId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.HotelList getAllHotels(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllHotelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.HotelCount getHotelCount(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Empty deleteHotelById(com.example.grpc.HotelId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHotelByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Hotel updateHotel(com.example.grpc.Hotel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHotelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HotelService.
   * <pre>
   * Service gRPC pour gérer les hôtels
   * </pre>
   */
  public static final class HotelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HotelServiceFutureStub> {
    private HotelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Hotel> addHotel(
        com.example.grpc.Hotel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Hotel> getHotelById(
        com.example.grpc.HotelId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.HotelList> getAllHotels(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllHotelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.HotelCount> getHotelCount(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> deleteHotelById(
        com.example.grpc.HotelId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHotelByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Hotel> updateHotel(
        com.example.grpc.Hotel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHotelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_HOTEL = 0;
  private static final int METHODID_GET_HOTEL_BY_ID = 1;
  private static final int METHODID_GET_ALL_HOTELS = 2;
  private static final int METHODID_GET_HOTEL_COUNT = 3;
  private static final int METHODID_DELETE_HOTEL_BY_ID = 4;
  private static final int METHODID_UPDATE_HOTEL = 5;

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
        case METHODID_ADD_HOTEL:
          serviceImpl.addHotel((com.example.grpc.Hotel) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Hotel>) responseObserver);
          break;
        case METHODID_GET_HOTEL_BY_ID:
          serviceImpl.getHotelById((com.example.grpc.HotelId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Hotel>) responseObserver);
          break;
        case METHODID_GET_ALL_HOTELS:
          serviceImpl.getAllHotels((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.HotelList>) responseObserver);
          break;
        case METHODID_GET_HOTEL_COUNT:
          serviceImpl.getHotelCount((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.HotelCount>) responseObserver);
          break;
        case METHODID_DELETE_HOTEL_BY_ID:
          serviceImpl.deleteHotelById((com.example.grpc.HotelId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_HOTEL:
          serviceImpl.updateHotel((com.example.grpc.Hotel) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Hotel>) responseObserver);
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
          getAddHotelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Hotel,
              com.example.grpc.Hotel>(
                service, METHODID_ADD_HOTEL)))
        .addMethod(
          getGetHotelByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.HotelId,
              com.example.grpc.Hotel>(
                service, METHODID_GET_HOTEL_BY_ID)))
        .addMethod(
          getGetAllHotelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.HotelList>(
                service, METHODID_GET_ALL_HOTELS)))
        .addMethod(
          getGetHotelCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.HotelCount>(
                service, METHODID_GET_HOTEL_COUNT)))
        .addMethod(
          getDeleteHotelByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.HotelId,
              com.example.grpc.Empty>(
                service, METHODID_DELETE_HOTEL_BY_ID)))
        .addMethod(
          getUpdateHotelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Hotel,
              com.example.grpc.Hotel>(
                service, METHODID_UPDATE_HOTEL)))
        .build();
  }

  private static abstract class HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelService");
    }
  }

  private static final class HotelServiceFileDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier {
    HotelServiceFileDescriptorSupplier() {}
  }

  private static final class HotelServiceMethodDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HotelServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HotelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceFileDescriptorSupplier())
              .addMethod(getAddHotelMethod())
              .addMethod(getGetHotelByIdMethod())
              .addMethod(getGetAllHotelsMethod())
              .addMethod(getGetHotelCountMethod())
              .addMethod(getDeleteHotelByIdMethod())
              .addMethod(getUpdateHotelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
