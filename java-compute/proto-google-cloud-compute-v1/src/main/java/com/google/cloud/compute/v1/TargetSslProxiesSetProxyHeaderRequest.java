/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest}
 */
public final class TargetSslProxiesSetProxyHeaderRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest)
    TargetSslProxiesSetProxyHeaderRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TargetSslProxiesSetProxyHeaderRequest.newBuilder() to construct.
  private TargetSslProxiesSetProxyHeaderRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetSslProxiesSetProxyHeaderRequest() {
    proxyHeader_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetSslProxiesSetProxyHeaderRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TargetSslProxiesSetProxyHeaderRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 1282993138:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              proxyHeader_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetSslProxiesSetProxyHeaderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetSslProxiesSetProxyHeaderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.class,
            com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.ProxyHeader}
   */
  public enum ProxyHeader implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PROXY_HEADER = 0;</code>
     */
    UNDEFINED_PROXY_HEADER(0),
    /** <code>NONE = 2402104;</code> */
    NONE(2402104),
    /** <code>PROXY_V1 = 334352940;</code> */
    PROXY_V1(334352940),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PROXY_HEADER = 0;</code>
     */
    public static final int UNDEFINED_PROXY_HEADER_VALUE = 0;
    /** <code>NONE = 2402104;</code> */
    public static final int NONE_VALUE = 2402104;
    /** <code>PROXY_V1 = 334352940;</code> */
    public static final int PROXY_V1_VALUE = 334352940;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProxyHeader valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProxyHeader forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_PROXY_HEADER;
        case 2402104:
          return NONE;
        case 334352940:
          return PROXY_V1;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProxyHeader> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ProxyHeader> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProxyHeader>() {
          public ProxyHeader findValueByNumber(int number) {
            return ProxyHeader.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ProxyHeader[] VALUES = values();

    public static ProxyHeader valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ProxyHeader(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.ProxyHeader)
  }

  private int bitField0_;
  public static final int PROXY_HEADER_FIELD_NUMBER = 160374142;
  private volatile java.lang.Object proxyHeader_;
  /**
   *
   *
   * <pre>
   * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return Whether the proxyHeader field is set.
   */
  @java.lang.Override
  public boolean hasProxyHeader() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The proxyHeader.
   */
  @java.lang.Override
  public java.lang.String getProxyHeader() {
    java.lang.Object ref = proxyHeader_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proxyHeader_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The bytes for proxyHeader.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProxyHeaderBytes() {
    java.lang.Object ref = proxyHeader_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      proxyHeader_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 160374142, proxyHeader_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(160374142, proxyHeader_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest other =
        (com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest) obj;

    if (hasProxyHeader() != other.hasProxyHeader()) return false;
    if (hasProxyHeader()) {
      if (!getProxyHeader().equals(other.getProxyHeader())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProxyHeader()) {
      hash = (37 * hash) + PROXY_HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getProxyHeader().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest)
      com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetSslProxiesSetProxyHeaderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetSslProxiesSetProxyHeaderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.class,
              com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      proxyHeader_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetSslProxiesSetProxyHeaderRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest build() {
      com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest buildPartial() {
      com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest result =
          new com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.proxyHeader_ = proxyHeader_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest) {
        return mergeFrom((com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest other) {
      if (other
          == com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest.getDefaultInstance())
        return this;
      if (other.hasProxyHeader()) {
        bitField0_ |= 0x00000001;
        proxyHeader_ = other.proxyHeader_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object proxyHeader_ = "";
    /**
     *
     *
     * <pre>
     * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
     * Check the ProxyHeader enum for the list of possible values.
     * </pre>
     *
     * <code>optional string proxy_header = 160374142;</code>
     *
     * @return Whether the proxyHeader field is set.
     */
    public boolean hasProxyHeader() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
     * Check the ProxyHeader enum for the list of possible values.
     * </pre>
     *
     * <code>optional string proxy_header = 160374142;</code>
     *
     * @return The proxyHeader.
     */
    public java.lang.String getProxyHeader() {
      java.lang.Object ref = proxyHeader_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proxyHeader_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
     * Check the ProxyHeader enum for the list of possible values.
     * </pre>
     *
     * <code>optional string proxy_header = 160374142;</code>
     *
     * @return The bytes for proxyHeader.
     */
    public com.google.protobuf.ByteString getProxyHeaderBytes() {
      java.lang.Object ref = proxyHeader_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        proxyHeader_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
     * Check the ProxyHeader enum for the list of possible values.
     * </pre>
     *
     * <code>optional string proxy_header = 160374142;</code>
     *
     * @param value The proxyHeader to set.
     * @return This builder for chaining.
     */
    public Builder setProxyHeader(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      proxyHeader_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
     * Check the ProxyHeader enum for the list of possible values.
     * </pre>
     *
     * <code>optional string proxy_header = 160374142;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProxyHeader() {
      bitField0_ = (bitField0_ & ~0x00000001);
      proxyHeader_ = getDefaultInstance().getProxyHeader();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
     * Check the ProxyHeader enum for the list of possible values.
     * </pre>
     *
     * <code>optional string proxy_header = 160374142;</code>
     *
     * @param value The bytes for proxyHeader to set.
     * @return This builder for chaining.
     */
    public Builder setProxyHeaderBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      proxyHeader_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest)
  private static final com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest();
  }

  public static com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetSslProxiesSetProxyHeaderRequest> PARSER =
      new com.google.protobuf.AbstractParser<TargetSslProxiesSetProxyHeaderRequest>() {
        @java.lang.Override
        public TargetSslProxiesSetProxyHeaderRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TargetSslProxiesSetProxyHeaderRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TargetSslProxiesSetProxyHeaderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetSslProxiesSetProxyHeaderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
