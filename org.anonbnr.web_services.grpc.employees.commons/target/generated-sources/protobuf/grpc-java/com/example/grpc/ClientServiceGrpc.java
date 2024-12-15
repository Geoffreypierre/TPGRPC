package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service gRPC pour gérer les clients
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ClientList> getGetAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllClients",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.ClientList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ClientList> getGetAllClientsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.ClientList> getGetAllClientsMethod;
    if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
          ClientServiceGrpc.getGetAllClientsMethod = getGetAllClientsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.ClientList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ClientList.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("getAllClients"))
              .build();
        }
      }
    }
    return getGetAllClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ClientCount> getGetClientCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getClientCount",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.ClientCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.ClientCount> getGetClientCountMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.ClientCount> getGetClientCountMethod;
    if ((getGetClientCountMethod = ClientServiceGrpc.getGetClientCountMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientCountMethod = ClientServiceGrpc.getGetClientCountMethod) == null) {
          ClientServiceGrpc.getGetClientCountMethod = getGetClientCountMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.ClientCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getClientCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ClientCount.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("getClientCount"))
              .build();
        }
      }
    }
    return getGetClientCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.ClientId,
      com.example.grpc.Client> getGetClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getClientById",
      requestType = com.example.grpc.ClientId.class,
      responseType = com.example.grpc.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.ClientId,
      com.example.grpc.Client> getGetClientByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.ClientId, com.example.grpc.Client> getGetClientByIdMethod;
    if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
          ClientServiceGrpc.getGetClientByIdMethod = getGetClientByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.ClientId, com.example.grpc.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ClientId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Client.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("getClientById"))
              .build();
        }
      }
    }
    return getGetClientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Client,
      com.example.grpc.Client> getAddClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addClient",
      requestType = com.example.grpc.Client.class,
      responseType = com.example.grpc.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Client,
      com.example.grpc.Client> getAddClientMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Client, com.example.grpc.Client> getAddClientMethod;
    if ((getAddClientMethod = ClientServiceGrpc.getAddClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getAddClientMethod = ClientServiceGrpc.getAddClientMethod) == null) {
          ClientServiceGrpc.getAddClientMethod = getAddClientMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Client, com.example.grpc.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Client.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("addClient"))
              .build();
        }
      }
    }
    return getAddClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Client,
      com.example.grpc.Client> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateClient",
      requestType = com.example.grpc.Client.class,
      responseType = com.example.grpc.Client.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Client,
      com.example.grpc.Client> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Client, com.example.grpc.Client> getUpdateClientMethod;
    if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
          ClientServiceGrpc.getUpdateClientMethod = getUpdateClientMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Client, com.example.grpc.Client>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Client.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("updateClient"))
              .build();
        }
      }
    }
    return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.ClientId,
      com.example.grpc.Empty> getDeleteClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteClientById",
      requestType = com.example.grpc.ClientId.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.ClientId,
      com.example.grpc.Empty> getDeleteClientByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.ClientId, com.example.grpc.Empty> getDeleteClientByIdMethod;
    if ((getDeleteClientByIdMethod = ClientServiceGrpc.getDeleteClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientByIdMethod = ClientServiceGrpc.getDeleteClientByIdMethod) == null) {
          ClientServiceGrpc.getDeleteClientByIdMethod = getDeleteClientByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.ClientId, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.ClientId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("deleteClientById"))
              .build();
        }
      }
    }
    return getDeleteClientByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceStub>() {
        @java.lang.Override
        public ClientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceStub(channel, callOptions);
        }
      };
    return ClientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceBlockingStub>() {
        @java.lang.Override
        public ClientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceBlockingStub(channel, callOptions);
        }
      };
    return ClientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClientServiceFutureStub>() {
        @java.lang.Override
        public ClientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClientServiceFutureStub(channel, callOptions);
        }
      };
    return ClientServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service gRPC pour gérer les clients
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void getAllClients(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ClientList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllClientsMethod(), responseObserver);
    }

    /**
     */
    default void getClientCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ClientCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientCountMethod(), responseObserver);
    }

    /**
     */
    default void getClientById(com.example.grpc.ClientId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Client> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientByIdMethod(), responseObserver);
    }

    /**
     */
    default void addClient(com.example.grpc.Client request,
        io.grpc.stub.StreamObserver<com.example.grpc.Client> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddClientMethod(), responseObserver);
    }

    /**
     */
    default void updateClient(com.example.grpc.Client request,
        io.grpc.stub.StreamObserver<com.example.grpc.Client> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     */
    default void deleteClientById(com.example.grpc.ClientId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteClientByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClientService.
   * <pre>
   * Service gRPC pour gérer les clients
   * </pre>
   */
  public static abstract class ClientServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClientServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClientService.
   * <pre>
   * Service gRPC pour gérer les clients
   * </pre>
   */
  public static final class ClientServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClientServiceStub> {
    private ClientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllClients(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ClientList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.ClientCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientById(com.example.grpc.ClientId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Client> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addClient(com.example.grpc.Client request,
        io.grpc.stub.StreamObserver<com.example.grpc.Client> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClient(com.example.grpc.Client request,
        io.grpc.stub.StreamObserver<com.example.grpc.Client> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClientById(com.example.grpc.ClientId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteClientByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClientService.
   * <pre>
   * Service gRPC pour gérer les clients
   * </pre>
   */
  public static final class ClientServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.ClientList getAllClients(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.ClientCount getClientCount(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Client getClientById(com.example.grpc.ClientId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Client addClient(com.example.grpc.Client request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Client updateClient(com.example.grpc.Client request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Empty deleteClientById(com.example.grpc.ClientId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteClientByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClientService.
   * <pre>
   * Service gRPC pour gérer les clients
   * </pre>
   */
  public static final class ClientServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ClientList> getAllClients(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.ClientCount> getClientCount(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Client> getClientById(
        com.example.grpc.ClientId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Client> addClient(
        com.example.grpc.Client request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Client> updateClient(
        com.example.grpc.Client request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> deleteClientById(
        com.example.grpc.ClientId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteClientByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CLIENTS = 0;
  private static final int METHODID_GET_CLIENT_COUNT = 1;
  private static final int METHODID_GET_CLIENT_BY_ID = 2;
  private static final int METHODID_ADD_CLIENT = 3;
  private static final int METHODID_UPDATE_CLIENT = 4;
  private static final int METHODID_DELETE_CLIENT_BY_ID = 5;

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
        case METHODID_GET_ALL_CLIENTS:
          serviceImpl.getAllClients((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ClientList>) responseObserver);
          break;
        case METHODID_GET_CLIENT_COUNT:
          serviceImpl.getClientCount((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.ClientCount>) responseObserver);
          break;
        case METHODID_GET_CLIENT_BY_ID:
          serviceImpl.getClientById((com.example.grpc.ClientId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Client>) responseObserver);
          break;
        case METHODID_ADD_CLIENT:
          serviceImpl.addClient((com.example.grpc.Client) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Client>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((com.example.grpc.Client) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Client>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT_BY_ID:
          serviceImpl.deleteClientById((com.example.grpc.ClientId) request,
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
          getGetAllClientsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.ClientList>(
                service, METHODID_GET_ALL_CLIENTS)))
        .addMethod(
          getGetClientCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.ClientCount>(
                service, METHODID_GET_CLIENT_COUNT)))
        .addMethod(
          getGetClientByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.ClientId,
              com.example.grpc.Client>(
                service, METHODID_GET_CLIENT_BY_ID)))
        .addMethod(
          getAddClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Client,
              com.example.grpc.Client>(
                service, METHODID_ADD_CLIENT)))
        .addMethod(
          getUpdateClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Client,
              com.example.grpc.Client>(
                service, METHODID_UPDATE_CLIENT)))
        .addMethod(
          getDeleteClientByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.ClientId,
              com.example.grpc.Empty>(
                service, METHODID_DELETE_CLIENT_BY_ID)))
        .build();
  }

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClientServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getGetAllClientsMethod())
              .addMethod(getGetClientCountMethod())
              .addMethod(getGetClientByIdMethod())
              .addMethod(getAddClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getDeleteClientByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
