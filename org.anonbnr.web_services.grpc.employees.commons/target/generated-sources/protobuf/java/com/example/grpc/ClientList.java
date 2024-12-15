// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.example.grpc;

/**
 * <pre>
 * Liste de clients
 * </pre>
 *
 * Protobuf type {@code com.example.grpc.ClientList}
 */
public final class ClientList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.ClientList)
    ClientListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientList.newBuilder() to construct.
  private ClientList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientList() {
    clients_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_ClientList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_ClientList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.ClientList.class, com.example.grpc.ClientList.Builder.class);
  }

  public static final int CLIENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.example.grpc.Client> clients_;
  /**
   * <code>repeated .com.example.grpc.Client clients = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.grpc.Client> getClientsList() {
    return clients_;
  }
  /**
   * <code>repeated .com.example.grpc.Client clients = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.grpc.ClientOrBuilder> 
      getClientsOrBuilderList() {
    return clients_;
  }
  /**
   * <code>repeated .com.example.grpc.Client clients = 1;</code>
   */
  @java.lang.Override
  public int getClientsCount() {
    return clients_.size();
  }
  /**
   * <code>repeated .com.example.grpc.Client clients = 1;</code>
   */
  @java.lang.Override
  public com.example.grpc.Client getClients(int index) {
    return clients_.get(index);
  }
  /**
   * <code>repeated .com.example.grpc.Client clients = 1;</code>
   */
  @java.lang.Override
  public com.example.grpc.ClientOrBuilder getClientsOrBuilder(
      int index) {
    return clients_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < clients_.size(); i++) {
      output.writeMessage(1, clients_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < clients_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, clients_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.ClientList)) {
      return super.equals(obj);
    }
    com.example.grpc.ClientList other = (com.example.grpc.ClientList) obj;

    if (!getClientsList()
        .equals(other.getClientsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getClientsCount() > 0) {
      hash = (37 * hash) + CLIENTS_FIELD_NUMBER;
      hash = (53 * hash) + getClientsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.ClientList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.ClientList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.ClientList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.ClientList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.ClientList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.ClientList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.ClientList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.ClientList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.ClientList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.ClientList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.ClientList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.ClientList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.ClientList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Liste de clients
   * </pre>
   *
   * Protobuf type {@code com.example.grpc.ClientList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.ClientList)
      com.example.grpc.ClientListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_ClientList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_ClientList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.ClientList.class, com.example.grpc.ClientList.Builder.class);
    }

    // Construct using com.example.grpc.ClientList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
      } else {
        clients_ = null;
        clientsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_ClientList_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.ClientList getDefaultInstanceForType() {
      return com.example.grpc.ClientList.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.ClientList build() {
      com.example.grpc.ClientList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.ClientList buildPartial() {
      com.example.grpc.ClientList result = new com.example.grpc.ClientList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.example.grpc.ClientList result) {
      if (clientsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          clients_ = java.util.Collections.unmodifiableList(clients_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.clients_ = clients_;
      } else {
        result.clients_ = clientsBuilder_.build();
      }
    }

    private void buildPartial0(com.example.grpc.ClientList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.ClientList) {
        return mergeFrom((com.example.grpc.ClientList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.ClientList other) {
      if (other == com.example.grpc.ClientList.getDefaultInstance()) return this;
      if (clientsBuilder_ == null) {
        if (!other.clients_.isEmpty()) {
          if (clients_.isEmpty()) {
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClientsIsMutable();
            clients_.addAll(other.clients_);
          }
          onChanged();
        }
      } else {
        if (!other.clients_.isEmpty()) {
          if (clientsBuilder_.isEmpty()) {
            clientsBuilder_.dispose();
            clientsBuilder_ = null;
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000001);
            clientsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClientsFieldBuilder() : null;
          } else {
            clientsBuilder_.addAllMessages(other.clients_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.example.grpc.Client m =
                  input.readMessage(
                      com.example.grpc.Client.parser(),
                      extensionRegistry);
              if (clientsBuilder_ == null) {
                ensureClientsIsMutable();
                clients_.add(m);
              } else {
                clientsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.grpc.Client> clients_ =
      java.util.Collections.emptyList();
    private void ensureClientsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        clients_ = new java.util.ArrayList<com.example.grpc.Client>(clients_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.Client, com.example.grpc.Client.Builder, com.example.grpc.ClientOrBuilder> clientsBuilder_;

    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public java.util.List<com.example.grpc.Client> getClientsList() {
      if (clientsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clients_);
      } else {
        return clientsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public int getClientsCount() {
      if (clientsBuilder_ == null) {
        return clients_.size();
      } else {
        return clientsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public com.example.grpc.Client getClients(int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);
      } else {
        return clientsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder setClients(
        int index, com.example.grpc.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.set(index, value);
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder setClients(
        int index, com.example.grpc.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.set(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder addClients(com.example.grpc.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder addClients(
        int index, com.example.grpc.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(index, value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder addClients(
        com.example.grpc.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder addClients(
        int index, com.example.grpc.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder addAllClients(
        java.lang.Iterable<? extends com.example.grpc.Client> values) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clients_);
        onChanged();
      } else {
        clientsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder clearClients() {
      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        clientsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public Builder removeClients(int index) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.remove(index);
        onChanged();
      } else {
        clientsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public com.example.grpc.Client.Builder getClientsBuilder(
        int index) {
      return getClientsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public com.example.grpc.ClientOrBuilder getClientsOrBuilder(
        int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);  } else {
        return clientsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public java.util.List<? extends com.example.grpc.ClientOrBuilder> 
         getClientsOrBuilderList() {
      if (clientsBuilder_ != null) {
        return clientsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clients_);
      }
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public com.example.grpc.Client.Builder addClientsBuilder() {
      return getClientsFieldBuilder().addBuilder(
          com.example.grpc.Client.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public com.example.grpc.Client.Builder addClientsBuilder(
        int index) {
      return getClientsFieldBuilder().addBuilder(
          index, com.example.grpc.Client.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.Client clients = 1;</code>
     */
    public java.util.List<com.example.grpc.Client.Builder> 
         getClientsBuilderList() {
      return getClientsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.Client, com.example.grpc.Client.Builder, com.example.grpc.ClientOrBuilder> 
        getClientsFieldBuilder() {
      if (clientsBuilder_ == null) {
        clientsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.grpc.Client, com.example.grpc.Client.Builder, com.example.grpc.ClientOrBuilder>(
                clients_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        clients_ = null;
      }
      return clientsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.ClientList)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.ClientList)
  private static final com.example.grpc.ClientList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.ClientList();
  }

  public static com.example.grpc.ClientList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientList>
      PARSER = new com.google.protobuf.AbstractParser<ClientList>() {
    @java.lang.Override
    public ClientList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ClientList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.ClientList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

