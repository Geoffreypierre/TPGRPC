// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.example.grpc;

/**
 * <pre>
 * Message représentant un partenaire
 * </pre>
 *
 * Protobuf type {@code com.example.grpc.Partenaire}
 */
public final class Partenaire extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.Partenaire)
    PartenaireOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Partenaire.newBuilder() to construct.
  private Partenaire(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Partenaire() {
    nomPartenaire_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Partenaire();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Partenaire_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Partenaire_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.Partenaire.class, com.example.grpc.Partenaire.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <pre>
   * Identifiant du partenaire
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NOM_PARTENAIRE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nomPartenaire_ = "";
  /**
   * <pre>
   * Nom du partenaire
   * </pre>
   *
   * <code>string Nom_partenaire = 2;</code>
   * @return The nomPartenaire.
   */
  @java.lang.Override
  public java.lang.String getNomPartenaire() {
    java.lang.Object ref = nomPartenaire_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nomPartenaire_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Nom du partenaire
   * </pre>
   *
   * <code>string Nom_partenaire = 2;</code>
   * @return The bytes for nomPartenaire.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNomPartenaireBytes() {
    java.lang.Object ref = nomPartenaire_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nomPartenaire_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REDUC_POURCENTAGE_FIELD_NUMBER = 3;
  private int reducPourcentage_ = 0;
  /**
   * <pre>
   * Email du partenaire
   * </pre>
   *
   * <code>int32 reduc_pourcentage = 3;</code>
   * @return The reducPourcentage.
   */
  @java.lang.Override
  public int getReducPourcentage() {
    return reducPourcentage_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nomPartenaire_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nomPartenaire_);
    }
    if (reducPourcentage_ != 0) {
      output.writeInt32(3, reducPourcentage_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nomPartenaire_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nomPartenaire_);
    }
    if (reducPourcentage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, reducPourcentage_);
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
    if (!(obj instanceof com.example.grpc.Partenaire)) {
      return super.equals(obj);
    }
    com.example.grpc.Partenaire other = (com.example.grpc.Partenaire) obj;

    if (getId()
        != other.getId()) return false;
    if (!getNomPartenaire()
        .equals(other.getNomPartenaire())) return false;
    if (getReducPourcentage()
        != other.getReducPourcentage()) return false;
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
    hash = (37 * hash) + NOM_PARTENAIRE_FIELD_NUMBER;
    hash = (53 * hash) + getNomPartenaire().hashCode();
    hash = (37 * hash) + REDUC_POURCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getReducPourcentage();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.Partenaire parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.Partenaire parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.Partenaire parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.Partenaire parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.Partenaire parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.Partenaire parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.Partenaire parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.Partenaire parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.Partenaire parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.Partenaire parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.Partenaire parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.Partenaire parseFrom(
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
  public static Builder newBuilder(com.example.grpc.Partenaire prototype) {
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
   * Message représentant un partenaire
   * </pre>
   *
   * Protobuf type {@code com.example.grpc.Partenaire}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.Partenaire)
      com.example.grpc.PartenaireOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Partenaire_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Partenaire_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.Partenaire.class, com.example.grpc.Partenaire.Builder.class);
    }

    // Construct using com.example.grpc.Partenaire.newBuilder()
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
      nomPartenaire_ = "";
      reducPourcentage_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.EmployeeOuterClass.internal_static_com_example_grpc_Partenaire_descriptor;
    }

    @java.lang.Override
    public com.example.grpc.Partenaire getDefaultInstanceForType() {
      return com.example.grpc.Partenaire.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc.Partenaire build() {
      com.example.grpc.Partenaire result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc.Partenaire buildPartial() {
      com.example.grpc.Partenaire result = new com.example.grpc.Partenaire(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.example.grpc.Partenaire result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nomPartenaire_ = nomPartenaire_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.reducPourcentage_ = reducPourcentage_;
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
      if (other instanceof com.example.grpc.Partenaire) {
        return mergeFrom((com.example.grpc.Partenaire)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.Partenaire other) {
      if (other == com.example.grpc.Partenaire.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getNomPartenaire().isEmpty()) {
        nomPartenaire_ = other.nomPartenaire_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getReducPourcentage() != 0) {
        setReducPourcentage(other.getReducPourcentage());
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
              nomPartenaire_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              reducPourcentage_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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
     * <pre>
     * Identifiant du partenaire
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * Identifiant du partenaire
     * </pre>
     *
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
     * <pre>
     * Identifiant du partenaire
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object nomPartenaire_ = "";
    /**
     * <pre>
     * Nom du partenaire
     * </pre>
     *
     * <code>string Nom_partenaire = 2;</code>
     * @return The nomPartenaire.
     */
    public java.lang.String getNomPartenaire() {
      java.lang.Object ref = nomPartenaire_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nomPartenaire_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Nom du partenaire
     * </pre>
     *
     * <code>string Nom_partenaire = 2;</code>
     * @return The bytes for nomPartenaire.
     */
    public com.google.protobuf.ByteString
        getNomPartenaireBytes() {
      java.lang.Object ref = nomPartenaire_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nomPartenaire_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Nom du partenaire
     * </pre>
     *
     * <code>string Nom_partenaire = 2;</code>
     * @param value The nomPartenaire to set.
     * @return This builder for chaining.
     */
    public Builder setNomPartenaire(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nomPartenaire_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Nom du partenaire
     * </pre>
     *
     * <code>string Nom_partenaire = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNomPartenaire() {
      nomPartenaire_ = getDefaultInstance().getNomPartenaire();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Nom du partenaire
     * </pre>
     *
     * <code>string Nom_partenaire = 2;</code>
     * @param value The bytes for nomPartenaire to set.
     * @return This builder for chaining.
     */
    public Builder setNomPartenaireBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nomPartenaire_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int reducPourcentage_ ;
    /**
     * <pre>
     * Email du partenaire
     * </pre>
     *
     * <code>int32 reduc_pourcentage = 3;</code>
     * @return The reducPourcentage.
     */
    @java.lang.Override
    public int getReducPourcentage() {
      return reducPourcentage_;
    }
    /**
     * <pre>
     * Email du partenaire
     * </pre>
     *
     * <code>int32 reduc_pourcentage = 3;</code>
     * @param value The reducPourcentage to set.
     * @return This builder for chaining.
     */
    public Builder setReducPourcentage(int value) {
      
      reducPourcentage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Email du partenaire
     * </pre>
     *
     * <code>int32 reduc_pourcentage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReducPourcentage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      reducPourcentage_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:com.example.grpc.Partenaire)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.Partenaire)
  private static final com.example.grpc.Partenaire DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.Partenaire();
  }

  public static com.example.grpc.Partenaire getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Partenaire>
      PARSER = new com.google.protobuf.AbstractParser<Partenaire>() {
    @java.lang.Override
    public Partenaire parsePartialFrom(
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

  public static com.google.protobuf.Parser<Partenaire> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Partenaire> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc.Partenaire getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

