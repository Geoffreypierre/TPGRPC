// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.example.grpc;

/**
 * <pre>
 * Message représentant une réservation
 * </pre>
 *
 * Protobuf type {@code com.example.grpc.Reservation}
 */
public final class Reservation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.Reservation)
    ReservationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reservation.newBuilder() to construct.
  private Reservation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reservation() {
    dateArrivee_ = "";
    dateDepart_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reservation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Reservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Reservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.Reservation.class, com.example.grpc.Reservation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int DATEARRIVEE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dateArrivee_ = "";
  /**
   * <pre>
   * Date d'arrivée sous format String (par exemple "2024-12-09")
   * </pre>
   *
   * <code>string dateArrivee = 2;</code>
   * @return The dateArrivee.
   */
  @java.lang.Override
  public java.lang.String getDateArrivee() {
    java.lang.Object ref = dateArrivee_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateArrivee_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Date d'arrivée sous format String (par exemple "2024-12-09")
   * </pre>
   *
   * <code>string dateArrivee = 2;</code>
   * @return The bytes for dateArrivee.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateArriveeBytes() {
    java.lang.Object ref = dateArrivee_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateArrivee_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATEDEPART_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dateDepart_ = "";
  /**
   * <pre>
   * Date de départ sous format String (par exemple "2024-12-10")
   * </pre>
   *
   * <code>string dateDepart = 3;</code>
   * @return The dateDepart.
   */
  @java.lang.Override
  public java.lang.String getDateDepart() {
    java.lang.Object ref = dateDepart_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateDepart_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Date de départ sous format String (par exemple "2024-12-10")
   * </pre>
   *
   * <code>string dateDepart = 3;</code>
   * @return The bytes for dateDepart.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateDepartBytes() {
    java.lang.Object ref = dateDepart_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateDepart_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_FIELD_NUMBER = 4;
  private com.example.grpc.Client client_;
  /**
   * <pre>
   * Le client associé à la reservation
   * </pre>
   *
   * <code>.com.example.grpc.Client client = 4;</code>
   * @return Whether the client field is set.
   */
  @java.lang.Override
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <pre>
   * Le client associé à la reservation
   * </pre>
   *
   * <code>.com.example.grpc.Client client = 4;</code>
   * @return The client.
   */
  @java.lang.Override
  public com.example.grpc.Client getClient() {
    return client_ == null ? com.example.grpc.Client.getDefaultInstance() : client_;
  }
  /**
   * <pre>
   * Le client associé à la reservation
   * </pre>
   *
   * <code>.com.example.grpc.Client client = 4;</code>
   */
  @java.lang.Override
  public com.example.grpc.ClientOrBuilder getClientOrBuilder() {
    return client_ == null ? com.example.grpc.Client.getDefaultInstance() : client_;
  }

  public static final int CHAMBRE_FIELD_NUMBER = 5;
  private com.example.grpc.Chambre chambre_;
  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.com.example.grpc.Chambre chambre = 5;</code>
   * @return Whether the chambre field is set.
   */
  @java.lang.Override
  public boolean hasChambre() {
    return chambre_ != null;
  }
  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.com.example.grpc.Chambre chambre = 5;</code>
   * @return The chambre.
   */
  @java.lang.Override
  public com.example.grpc.Chambre getChambre() {
    return chambre_ == null ? com.example.grpc.Chambre.getDefaultInstance() : chambre_;
  }
  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.com.example.grpc.Chambre chambre = 5;</code>
   */
  @java.lang.Override
  public com.example.grpc.ChambreOrBuilder getChambreOrBuilder() {
    return chambre_ == null ? com.example.grpc.Chambre.getDefaultInstance() : chambre_;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateArrivee_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dateArrivee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateDepart_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dateDepart_);
    }
    if (client_ != null) {
      output.writeMessage(4, getClient());
    }
    if (chambre_ != null) {
      output.writeMessage(5, getChambre());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateArrivee_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dateArrivee_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateDepart_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dateDepart_);
    }
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getClient());
    }
    if (chambre_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getChambre());
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
    if (!(obj instanceof com.example.grpc.Reservation)) {
      return super.equals(obj);
    }
    com.example.grpc.Reservation other = (com.example.grpc.Reservation) obj;

    if (getId()
        != other.getId()) return false;
    if (!getDateArrivee()
        .equals(other.getDateArrivee())) return false;
    if (!getDateDepart()
        .equals(other.getDateDepart())) return false;
    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
    }
    if (hasChambre() != other.hasChambre()) return false;
    if (hasChambre()) {
      if (!getChambre()
          .equals(other.getChambre())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + DATEARRIVEE_FIELD_NUMBER;
    hash = (53 * hash) + getDateArrivee().hashCode();
    hash = (37 * hash) + DATEDEPART_FIELD_NUMBER;
    hash = (53 * hash) + getDateDepart().hashCode();
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    if (hasChambre()) {
      hash = (37 * hash) + CHAMBRE_FIELD_NUMBER;
      hash = (53 * hash) + getChambre().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.Reservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.Reservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.Reservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.Reservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.Reservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.Reservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.Reservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.Reservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.Reservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.Reservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.Reservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.Reservation parseFrom(
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
  public static Builder newBuilder(com.example.grpc.Reservation prototype) {
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
   * Message représentant une réservation
   * </pre>
   *
   * Protobuf type {@code com.example.grpc.Reservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.Reservation)
      com.example.grpc.ReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Reservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Reservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.Reservation.class, com.example.grpc.Reservation.Builder.class);
    }

    // Construct using com.example.grpc.Reservation.newBuilder()
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
      id_ = 0L;
      dateArrivee_ = "";
      dateDepart_ = "";
      client_ = null;
      if (clientBuilder_ != null) {
        clientBuilder_.dispose();
        clientBuilder_ = null;
      }
      chambre_ = null;
      if (chambreBuilder_ != null) {
        chambreBuilder_.dispose();
        chambreBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Reservation_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.Reservation getDefaultInstanceForType() {
      return com.example.grpc.Reservation.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.Reservation build() {
      com.example.grpc.Reservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.Reservation buildPartial() {
      com.example.grpc.Reservation result = new com.example.grpc.Reservation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.grpc.Reservation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dateArrivee_ = dateArrivee_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dateDepart_ = dateDepart_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.client_ = clientBuilder_ == null
            ? client_
            : clientBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.chambre_ = chambreBuilder_ == null
            ? chambre_
            : chambreBuilder_.build();
      }
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
      if (other instanceof com.example.grpc.Reservation) {
        return mergeFrom((com.example.grpc.Reservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.Reservation other) {
      if (other == com.example.grpc.Reservation.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getDateArrivee().isEmpty()) {
        dateArrivee_ = other.dateArrivee_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDateDepart().isEmpty()) {
        dateDepart_ = other.dateDepart_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasClient()) {
        mergeClient(other.getClient());
      }
      if (other.hasChambre()) {
        mergeChambre(other.getChambre());
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
            case 8: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              dateArrivee_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              dateDepart_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getClientFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getChambreFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object dateArrivee_ = "";
    /**
     * <pre>
     * Date d'arrivée sous format String (par exemple "2024-12-09")
     * </pre>
     *
     * <code>string dateArrivee = 2;</code>
     * @return The dateArrivee.
     */
    public java.lang.String getDateArrivee() {
      java.lang.Object ref = dateArrivee_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateArrivee_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Date d'arrivée sous format String (par exemple "2024-12-09")
     * </pre>
     *
     * <code>string dateArrivee = 2;</code>
     * @return The bytes for dateArrivee.
     */
    public com.google.protobuf.ByteString
        getDateArriveeBytes() {
      java.lang.Object ref = dateArrivee_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateArrivee_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Date d'arrivée sous format String (par exemple "2024-12-09")
     * </pre>
     *
     * <code>string dateArrivee = 2;</code>
     * @param value The dateArrivee to set.
     * @return This builder for chaining.
     */
    public Builder setDateArrivee(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dateArrivee_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date d'arrivée sous format String (par exemple "2024-12-09")
     * </pre>
     *
     * <code>string dateArrivee = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateArrivee() {
      dateArrivee_ = getDefaultInstance().getDateArrivee();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date d'arrivée sous format String (par exemple "2024-12-09")
     * </pre>
     *
     * <code>string dateArrivee = 2;</code>
     * @param value The bytes for dateArrivee to set.
     * @return This builder for chaining.
     */
    public Builder setDateArriveeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dateArrivee_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object dateDepart_ = "";
    /**
     * <pre>
     * Date de départ sous format String (par exemple "2024-12-10")
     * </pre>
     *
     * <code>string dateDepart = 3;</code>
     * @return The dateDepart.
     */
    public java.lang.String getDateDepart() {
      java.lang.Object ref = dateDepart_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateDepart_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Date de départ sous format String (par exemple "2024-12-10")
     * </pre>
     *
     * <code>string dateDepart = 3;</code>
     * @return The bytes for dateDepart.
     */
    public com.google.protobuf.ByteString
        getDateDepartBytes() {
      java.lang.Object ref = dateDepart_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateDepart_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Date de départ sous format String (par exemple "2024-12-10")
     * </pre>
     *
     * <code>string dateDepart = 3;</code>
     * @param value The dateDepart to set.
     * @return This builder for chaining.
     */
    public Builder setDateDepart(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dateDepart_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date de départ sous format String (par exemple "2024-12-10")
     * </pre>
     *
     * <code>string dateDepart = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateDepart() {
      dateDepart_ = getDefaultInstance().getDateDepart();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Date de départ sous format String (par exemple "2024-12-10")
     * </pre>
     *
     * <code>string dateDepart = 3;</code>
     * @param value The bytes for dateDepart to set.
     * @return This builder for chaining.
     */
    public Builder setDateDepartBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dateDepart_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.example.grpc.Client client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.Client, com.example.grpc.Client.Builder, com.example.grpc.ClientOrBuilder> clientBuilder_;
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     * @return The client.
     */
    public com.example.grpc.Client getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? com.example.grpc.Client.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     */
    public Builder setClient(com.example.grpc.Client value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
      } else {
        clientBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     */
    public Builder setClient(
        com.example.grpc.Client.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     */
    public Builder mergeClient(com.example.grpc.Client value) {
      if (clientBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          client_ != null &&
          client_ != com.example.grpc.Client.getDefaultInstance()) {
          getClientBuilder().mergeFrom(value);
        } else {
          client_ = value;
        }
      } else {
        clientBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     */
    public Builder clearClient() {
      bitField0_ = (bitField0_ & ~0x00000008);
      client_ = null;
      if (clientBuilder_ != null) {
        clientBuilder_.dispose();
        clientBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     */
    public com.example.grpc.Client.Builder getClientBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     */
    public com.example.grpc.ClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            com.example.grpc.Client.getDefaultInstance() : client_;
      }
    }
    /**
     * <pre>
     * Le client associé à la reservation
     * </pre>
     *
     * <code>.com.example.grpc.Client client = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.Client, com.example.grpc.Client.Builder, com.example.grpc.ClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.Client, com.example.grpc.Client.Builder, com.example.grpc.ClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
    }

    private com.example.grpc.Chambre chambre_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.Chambre, com.example.grpc.Chambre.Builder, com.example.grpc.ChambreOrBuilder> chambreBuilder_;
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     * @return Whether the chambre field is set.
     */
    public boolean hasChambre() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     * @return The chambre.
     */
    public com.example.grpc.Chambre getChambre() {
      if (chambreBuilder_ == null) {
        return chambre_ == null ? com.example.grpc.Chambre.getDefaultInstance() : chambre_;
      } else {
        return chambreBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     */
    public Builder setChambre(com.example.grpc.Chambre value) {
      if (chambreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chambre_ = value;
      } else {
        chambreBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     */
    public Builder setChambre(
        com.example.grpc.Chambre.Builder builderForValue) {
      if (chambreBuilder_ == null) {
        chambre_ = builderForValue.build();
      } else {
        chambreBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     */
    public Builder mergeChambre(com.example.grpc.Chambre value) {
      if (chambreBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          chambre_ != null &&
          chambre_ != com.example.grpc.Chambre.getDefaultInstance()) {
          getChambreBuilder().mergeFrom(value);
        } else {
          chambre_ = value;
        }
      } else {
        chambreBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     */
    public Builder clearChambre() {
      bitField0_ = (bitField0_ & ~0x00000010);
      chambre_ = null;
      if (chambreBuilder_ != null) {
        chambreBuilder_.dispose();
        chambreBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     */
    public com.example.grpc.Chambre.Builder getChambreBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getChambreFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     */
    public com.example.grpc.ChambreOrBuilder getChambreOrBuilder() {
      if (chambreBuilder_ != null) {
        return chambreBuilder_.getMessageOrBuilder();
      } else {
        return chambre_ == null ?
            com.example.grpc.Chambre.getDefaultInstance() : chambre_;
      }
    }
    /**
     * <pre>
     * La chambre réservée
     * </pre>
     *
     * <code>.com.example.grpc.Chambre chambre = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.Chambre, com.example.grpc.Chambre.Builder, com.example.grpc.ChambreOrBuilder> 
        getChambreFieldBuilder() {
      if (chambreBuilder_ == null) {
        chambreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.Chambre, com.example.grpc.Chambre.Builder, com.example.grpc.ChambreOrBuilder>(
                getChambre(),
                getParentForChildren(),
                isClean());
        chambre_ = null;
      }
      return chambreBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.example.grpc.Reservation)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.Reservation)
  private static final com.example.grpc.Reservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.Reservation();
  }

  public static com.example.grpc.Reservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reservation>
      PARSER = new com.google.protobuf.AbstractParser<Reservation>() {
    @java.lang.Override
    public Reservation parsePartialFrom(
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

  public static com.google.protobuf.Parser<Reservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.Reservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

