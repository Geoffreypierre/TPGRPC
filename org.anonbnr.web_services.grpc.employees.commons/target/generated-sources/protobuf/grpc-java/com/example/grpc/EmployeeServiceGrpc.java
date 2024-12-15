package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.EmployeeList> getGetAllEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllEmployees",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.EmployeeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.EmployeeList> getGetAllEmployeesMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.EmployeeList> getGetAllEmployeesMethod;
    if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
          EmployeeServiceGrpc.getGetAllEmployeesMethod = getGetAllEmployeesMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.EmployeeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EmployeeList.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getAllEmployees"))
              .build();
        }
      }
    }
    return getGetAllEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.EmployeeCount> getGetEmployeeCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeCount",
      requestType = com.example.grpc.Empty.class,
      responseType = com.example.grpc.EmployeeCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Empty,
      com.example.grpc.EmployeeCount> getGetEmployeeCountMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Empty, com.example.grpc.EmployeeCount> getGetEmployeeCountMethod;
    if ((getGetEmployeeCountMethod = EmployeeServiceGrpc.getGetEmployeeCountMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeCountMethod = EmployeeServiceGrpc.getGetEmployeeCountMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeCountMethod = getGetEmployeeCountMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Empty, com.example.grpc.EmployeeCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EmployeeCount.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeCount"))
              .build();
        }
      }
    }
    return getGetEmployeeCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Employee> getGetEmployeeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeById",
      requestType = com.example.grpc.EmployeeId.class,
      responseType = com.example.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Employee> getGetEmployeeByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EmployeeId, com.example.grpc.Employee> getGetEmployeeByIdMethod;
    if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeByIdMethod = getGetEmployeeByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EmployeeId, com.example.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeById"))
              .build();
        }
      }
    }
    return getGetEmployeeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Employee,
      com.example.grpc.Employee> getAddEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployee",
      requestType = com.example.grpc.Employee.class,
      responseType = com.example.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Employee,
      com.example.grpc.Employee> getAddEmployeeMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Employee, com.example.grpc.Employee> getAddEmployeeMethod;
    if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddEmployeeMethod = EmployeeServiceGrpc.getAddEmployeeMethod) == null) {
          EmployeeServiceGrpc.getAddEmployeeMethod = getAddEmployeeMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Employee, com.example.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("addEmployee"))
              .build();
        }
      }
    }
    return getAddEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Empty> getDeleteEmployeeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEmployeeById",
      requestType = com.example.grpc.EmployeeId.class,
      responseType = com.example.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.EmployeeId,
      com.example.grpc.Empty> getDeleteEmployeeByIdMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EmployeeId, com.example.grpc.Empty> getDeleteEmployeeByIdMethod;
    if ((getDeleteEmployeeByIdMethod = EmployeeServiceGrpc.getDeleteEmployeeByIdMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getDeleteEmployeeByIdMethod = EmployeeServiceGrpc.getDeleteEmployeeByIdMethod) == null) {
          EmployeeServiceGrpc.getDeleteEmployeeByIdMethod = getDeleteEmployeeByIdMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EmployeeId, com.example.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEmployeeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("deleteEmployeeById"))
              .build();
        }
      }
    }
    return getDeleteEmployeeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Employee,
      com.example.grpc.Employee> getUpdateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEmployee",
      requestType = com.example.grpc.Employee.class,
      responseType = com.example.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Employee,
      com.example.grpc.Employee> getUpdateEmployeeMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Employee, com.example.grpc.Employee> getUpdateEmployeeMethod;
    if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getUpdateEmployeeMethod = getUpdateEmployeeMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Employee, com.example.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("updateEmployee"))
              .build();
        }
      }
    }
    return getUpdateEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllEmployees(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.EmployeeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllEmployeesMethod(), responseObserver);
    }

    /**
     */
    default void getEmployeeCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.EmployeeCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeCountMethod(), responseObserver);
    }

    /**
     */
    default void getEmployeeById(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeByIdMethod(), responseObserver);
    }

    /**
     */
    default void addEmployee(com.example.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void deleteEmployeeById(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateEmployee(com.example.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmployeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeService.
   */
  public static abstract class EmployeeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmployeeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllEmployees(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.EmployeeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployeeCount(com.example.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.EmployeeCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployeeById(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addEmployee(com.example.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployeeById(com.example.grpc.EmployeeId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmployee(com.example.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.example.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.EmployeeList getAllEmployees(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllEmployeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.EmployeeCount getEmployeeCount(com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Employee getEmployeeById(com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Employee addEmployee(com.example.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Empty deleteEmployeeById(com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Employee updateEmployee(com.example.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.EmployeeList> getAllEmployees(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.EmployeeCount> getEmployeeCount(
        com.example.grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Employee> getEmployeeById(
        com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Employee> addEmployee(
        com.example.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Empty> deleteEmployeeById(
        com.example.grpc.EmployeeId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Employee> updateEmployee(
        com.example.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_EMPLOYEES = 0;
  private static final int METHODID_GET_EMPLOYEE_COUNT = 1;
  private static final int METHODID_GET_EMPLOYEE_BY_ID = 2;
  private static final int METHODID_ADD_EMPLOYEE = 3;
  private static final int METHODID_DELETE_EMPLOYEE_BY_ID = 4;
  private static final int METHODID_UPDATE_EMPLOYEE = 5;

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
        case METHODID_GET_ALL_EMPLOYEES:
          serviceImpl.getAllEmployees((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.EmployeeList>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE_COUNT:
          serviceImpl.getEmployeeCount((com.example.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.EmployeeCount>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE_BY_ID:
          serviceImpl.getEmployeeById((com.example.grpc.EmployeeId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Employee>) responseObserver);
          break;
        case METHODID_ADD_EMPLOYEE:
          serviceImpl.addEmployee((com.example.grpc.Employee) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Employee>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE_BY_ID:
          serviceImpl.deleteEmployeeById((com.example.grpc.EmployeeId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE:
          serviceImpl.updateEmployee((com.example.grpc.Employee) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Employee>) responseObserver);
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
          getGetAllEmployeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.EmployeeList>(
                service, METHODID_GET_ALL_EMPLOYEES)))
        .addMethod(
          getGetEmployeeCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Empty,
              com.example.grpc.EmployeeCount>(
                service, METHODID_GET_EMPLOYEE_COUNT)))
        .addMethod(
          getGetEmployeeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.EmployeeId,
              com.example.grpc.Employee>(
                service, METHODID_GET_EMPLOYEE_BY_ID)))
        .addMethod(
          getAddEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Employee,
              com.example.grpc.Employee>(
                service, METHODID_ADD_EMPLOYEE)))
        .addMethod(
          getDeleteEmployeeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.EmployeeId,
              com.example.grpc.Empty>(
                service, METHODID_DELETE_EMPLOYEE_BY_ID)))
        .addMethod(
          getUpdateEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.Employee,
              com.example.grpc.Employee>(
                service, METHODID_UPDATE_EMPLOYEE)))
        .build();
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmployeeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetAllEmployeesMethod())
              .addMethod(getGetEmployeeCountMethod())
              .addMethod(getGetEmployeeByIdMethod())
              .addMethod(getAddEmployeeMethod())
              .addMethod(getDeleteEmployeeByIdMethod())
              .addMethod(getUpdateEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
