package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service gRPC pour gérer les réservations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ReservationList> getGetAllReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllReservation",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.ReservationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ReservationList> getGetAllReservationMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.ReservationList> getGetAllReservationMethod;
    if ((getGetAllReservationMethod = ReservationServiceGrpc.getGetAllReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationMethod = ReservationServiceGrpc.getGetAllReservationMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationMethod = getGetAllReservationMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.ReservationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ReservationList.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("getAllReservation"))
              .build();
        }
      }
    }
    return getGetAllReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ReservationCount> getGetReservationCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReservationCount",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.ReservationCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ReservationCount> getGetReservationCountMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.ReservationCount> getGetReservationCountMethod;
    if ((getGetReservationCountMethod = ReservationServiceGrpc.getGetReservationCountMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationCountMethod = ReservationServiceGrpc.getGetReservationCountMethod) == null) {
          ReservationServiceGrpc.getGetReservationCountMethod = getGetReservationCountMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.ReservationCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservationCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ReservationCount.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("getReservationCount"))
              .build();
        }
      }
    }
    return getGetReservationCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Reservation,
      com.example.grpc.Reservation> getAddReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addReservation",
      requestType = com.example.grpc.Reservation.class,
      responseType = com.example.grpc.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Reservation,
      com.example.grpc.Reservation> getAddReservationMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Reservation, com.example.grpc.Reservation> getAddReservationMethod;
    if ((getAddReservationMethod = ReservationServiceGrpc.getAddReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAddReservationMethod = ReservationServiceGrpc.getAddReservationMethod) == null) {
          ReservationServiceGrpc.getAddReservationMethod = getAddReservationMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Reservation, com.example.grpc.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Reservation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Reservation.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("addReservation"))
              .build();
        }
      }
    }
    return getAddReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.ReservationId,
      com.example.grpc.Reservation> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReservationById",
      requestType = com.example.grpc.ReservationId.class,
      responseType = com.example.grpc.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.ReservationId,
      com.example.grpc.Reservation> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.ReservationId, com.example.grpc.Reservation> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.ReservationId, com.example.grpc.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ReservationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Reservation.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("getReservationById"))
              .build();
        }
      }
    }
    return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ReservationList> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReservations",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.ReservationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ReservationList> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.ReservationList> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.ReservationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ReservationList.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetAllReservations"))
              .build();
        }
      }
    }
    return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.ReservationId,
      com.example.grpc.Empty> getDeleteReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservationById",
      requestType = com.example.grpc.ReservationId.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.ReservationId,
      com.example.grpc.Empty> getDeleteReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.ReservationId, com.example.grpc.Empty> getDeleteReservationByIdMethod;
    if ((getDeleteReservationByIdMethod = ReservationServiceGrpc.getDeleteReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationByIdMethod = ReservationServiceGrpc.getDeleteReservationByIdMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationByIdMethod = getDeleteReservationByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.ReservationId, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ReservationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservationById"))
              .build();
        }
      }
    }
    return getDeleteReservationByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub>() {
        @java.lang.Override
        public ReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceStub(channel, callOptions);
        }
      };
    return ReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub>() {
        @java.lang.Override
        public ReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub>() {
        @java.lang.Override
        public ReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceFutureStub(channel, callOptions);
        }
      };
    return ReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getAllReservation(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ReservationList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllReservationMethod(), responseObserver);
    }

    /**
     */
    default void getReservationCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ReservationCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationCountMethod(), responseObserver);
    }

    /**
     */
    default void addReservation(com.example.grpc.Reservation request,
        io.grpc.stub.StreamObserver<com.example.grpc.Reservation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddReservationMethod(), responseObserver);
    }

    /**
     */
    default void getReservationById(com.example.grpc.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Reservation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     */
    default void getAllReservations(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ReservationList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     */
    default void deleteReservationById(com.example.grpc.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReservationByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReservationService.
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static abstract class ReservationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReservationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReservationService.
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReservationServiceStub> {
    private ReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllReservation(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ReservationList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ReservationCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReservation(com.example.grpc.Reservation request,
        io.grpc.stub.StreamObserver<com.example.grpc.Reservation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationById(com.example.grpc.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Reservation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReservations(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ReservationList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservationById(com.example.grpc.ReservationId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReservationService.
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.ReservationList getAllReservation(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.ReservationCount getReservationCount(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Reservation addReservation(com.example.grpc.Reservation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Reservation getReservationById(com.example.grpc.ReservationId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.ReservationList getAllReservations(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Empty deleteReservationById(com.example.grpc.ReservationId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReservationByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReservationService.
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ReservationList> getAllReservation(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ReservationCount> getReservationCount(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Reservation> addReservation(
        com.example.grpc.Reservation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Reservation> getReservationById(
        com.example.grpc.ReservationId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ReservationList> getAllReservations(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> deleteReservationById(
        com.example.grpc.ReservationId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReservationByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RESERVATION = 0;
  private static final int METHODID_GET_RESERVATION_COUNT = 1;
  private static final int METHODID_ADD_RESERVATION = 2;
  private static final int METHODID_GET_RESERVATION_BY_ID = 3;
  private static final int METHODID_GET_ALL_RESERVATIONS = 4;
  private static final int METHODID_DELETE_RESERVATION_BY_ID = 5;

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
        case METHODID_GET_ALL_RESERVATION:
          serviceImpl.getAllReservation((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ReservationList>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_COUNT:
          serviceImpl.getReservationCount((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ReservationCount>) responseObserver);
          break;
        case METHODID_ADD_RESERVATION:
          serviceImpl.addReservation((com.example.grpc.Reservation) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Reservation>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((com.example.grpc.ReservationId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Reservation>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ReservationList>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION_BY_ID:
          serviceImpl.deleteReservationById((com.example.grpc.ReservationId) request,
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
          getGetAllReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.ReservationList>(
                service, METHODID_GET_ALL_RESERVATION)))
        .addMethod(
          getGetReservationCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.ReservationCount>(
                service, METHODID_GET_RESERVATION_COUNT)))
        .addMethod(
          getAddReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Reservation,
              com.example.grpc.Reservation>(
                service, METHODID_ADD_RESERVATION)))
        .addMethod(
          getGetReservationByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.ReservationId,
              com.example.grpc.Reservation>(
                service, METHODID_GET_RESERVATION_BY_ID)))
        .addMethod(
          getGetAllReservationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.ReservationList>(
                service, METHODID_GET_ALL_RESERVATIONS)))
        .addMethod(
          getDeleteReservationByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.ReservationId,
              com.example.grpc.Empty>(
                service, METHODID_DELETE_RESERVATION_BY_ID)))
        .build();
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReservationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getGetAllReservationMethod())
              .addMethod(getGetReservationCountMethod())
              .addMethod(getAddReservationMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getDeleteReservationByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
