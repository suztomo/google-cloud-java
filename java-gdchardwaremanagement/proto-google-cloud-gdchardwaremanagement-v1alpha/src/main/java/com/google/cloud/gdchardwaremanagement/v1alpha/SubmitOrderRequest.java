/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/gdchardwaremanagement/v1alpha/service.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.gdchardwaremanagement.v1alpha;

/**
 *
 *
 * <pre>
 * A request to submit an order.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest}
 */
public final class SubmitOrderRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest)
    SubmitOrderRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubmitOrderRequest.newBuilder() to construct.
  private SubmitOrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubmitOrderRequest() {
    name_ = "";
    requestId_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubmitOrderRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gdchardwaremanagement.v1alpha.ServiceProto
        .internal_static_google_cloud_gdchardwaremanagement_v1alpha_SubmitOrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gdchardwaremanagement.v1alpha.ServiceProto
        .internal_static_google_cloud_gdchardwaremanagement_v1alpha_SubmitOrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.class,
            com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Valid types of submit order request.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Request type is unspecified. This should not be used.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Use this request type to submit your order and initiate conversation with
     * Google. After this submission, you will not be able to modify the number
     * or SKU of your ordered hardware. Please note that this order will not be
     * ready for fulfillment yet until you provide more information, such as
     * zone network configuration, hardware physical and installation
     * information, etc.
     * If you are submitting an order for a SKU type of RACK, please use this
     * request type, as additional information will be required outside of the
     * API.
     * </pre>
     *
     * <code>INFO_PENDING = 1;</code>
     */
    INFO_PENDING(1),
    /**
     *
     *
     * <pre>
     * Use this request type if and when you are ready to submit your order for
     * fulfillment. In addition to the information required for `INFO_PENDING`,
     * the order must contain all required information, such as zone network
     * configuration, hardware physical and installation information, etc.
     * Further changes to any order information will no longer be allowed.
     * </pre>
     *
     * <code>INFO_COMPLETE = 2;</code>
     */
    INFO_COMPLETE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Request type is unspecified. This should not be used.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Use this request type to submit your order and initiate conversation with
     * Google. After this submission, you will not be able to modify the number
     * or SKU of your ordered hardware. Please note that this order will not be
     * ready for fulfillment yet until you provide more information, such as
     * zone network configuration, hardware physical and installation
     * information, etc.
     * If you are submitting an order for a SKU type of RACK, please use this
     * request type, as additional information will be required outside of the
     * API.
     * </pre>
     *
     * <code>INFO_PENDING = 1;</code>
     */
    public static final int INFO_PENDING_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Use this request type if and when you are ready to submit your order for
     * fulfillment. In addition to the information required for `INFO_PENDING`,
     * the order must contain all required information, such as zone network
     * configuration, hardware physical and installation information, etc.
     * Further changes to any order information will no longer be allowed.
     * </pre>
     *
     * <code>INFO_COMPLETE = 2;</code>
     */
    public static final int INFO_COMPLETE_VALUE = 2;

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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 1:
          return INFO_PENDING;
        case 2:
          return INFO_COMPLETE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
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
      return com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the order.
   * Format: `projects/{project}/locations/{location}/orders/{order}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the order.
   * Format: `projects/{project}/locations/{location}/orders/{order}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   *
   *
   * <pre>
   * Optional. An optional unique identifier for this request. See
   * [AIP-155](https://google.aip.dev/155).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. An optional unique identifier for this request. See
   * [AIP-155](https://google.aip.dev/155).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Type of this request. If unset, the request type is assumed to be
   * `INFO_PENDING`.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Type of this request. If unset, the request type is assumed to be
   * `INFO_PENDING`.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type getType() {
    com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type result =
        com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type.forNumber(type_);
    return result == null
        ? com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requestId_);
    }
    if (type_
        != com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type.TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requestId_);
    }
    if (type_
        != com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type.TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, type_);
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
    if (!(obj instanceof com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest other =
        (com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getRequestId().equals(other.getRequestId())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest parseFrom(
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
      com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest prototype) {
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
   * A request to submit an order.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest)
      com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gdchardwaremanagement.v1alpha.ServiceProto
          .internal_static_google_cloud_gdchardwaremanagement_v1alpha_SubmitOrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gdchardwaremanagement.v1alpha.ServiceProto
          .internal_static_google_cloud_gdchardwaremanagement_v1alpha_SubmitOrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.class,
              com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      requestId_ = "";
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gdchardwaremanagement.v1alpha.ServiceProto
          .internal_static_google_cloud_gdchardwaremanagement_v1alpha_SubmitOrderRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest
        getDefaultInstanceForType() {
      return com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest build() {
      com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest buildPartial() {
      com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest result =
          new com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requestId_ = requestId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
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
      if (other instanceof com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest) {
        return mergeFrom((com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest other) {
      if (other
          == com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                requestId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the order.
     * Format: `projects/{project}/locations/{location}/orders/{order}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the order.
     * Format: `projects/{project}/locations/{location}/orders/{order}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the order.
     * Format: `projects/{project}/locations/{location}/orders/{order}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the order.
     * Format: `projects/{project}/locations/{location}/orders/{order}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the order.
     * Format: `projects/{project}/locations/{location}/orders/{order}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object requestId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. An optional unique identifier for this request. See
     * [AIP-155](https://google.aip.dev/155).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional unique identifier for this request. See
     * [AIP-155](https://google.aip.dev/155).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional unique identifier for this request. See
     * [AIP-155](https://google.aip.dev/155).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      requestId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional unique identifier for this request. See
     * [AIP-155](https://google.aip.dev/155).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional unique identifier for this request. See
     * [AIP-155](https://google.aip.dev/155).
     * </pre>
     *
     * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      requestId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Type of this request. If unset, the request type is assumed to be
     * `INFO_PENDING`.
     * </pre>
     *
     * <code>
     * .google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of this request. If unset, the request type is assumed to be
     * `INFO_PENDING`.
     * </pre>
     *
     * <code>
     * .google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of this request. If unset, the request type is assumed to be
     * `INFO_PENDING`.
     * </pre>
     *
     * <code>
     * .google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type getType() {
      com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type result =
          com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type.forNumber(type_);
      return result == null
          ? com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of this request. If unset, the request type is assumed to be
     * `INFO_PENDING`.
     * </pre>
     *
     * <code>
     * .google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of this request. If unset, the request type is assumed to be
     * `INFO_PENDING`.
     * </pre>
     *
     * <code>
     * .google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest.Type type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest)
  private static final com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest();
  }

  public static com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitOrderRequest> PARSER =
      new com.google.protobuf.AbstractParser<SubmitOrderRequest>() {
        @java.lang.Override
        public SubmitOrderRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubmitOrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitOrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gdchardwaremanagement.v1alpha.SubmitOrderRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
