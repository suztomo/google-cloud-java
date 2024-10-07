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
// source: google/cloud/oracledatabase/v1/oracledatabase.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.oracledatabase.v1;

/**
 *
 *
 * <pre>
 * The request for `AutonomousDatabase.GenerateWallet`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest}
 */
public final class GenerateAutonomousDatabaseWalletRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest)
    GenerateAutonomousDatabaseWalletRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateAutonomousDatabaseWalletRequest.newBuilder() to construct.
  private GenerateAutonomousDatabaseWalletRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateAutonomousDatabaseWalletRequest() {
    name_ = "";
    type_ = 0;
    password_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateAutonomousDatabaseWalletRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oracledatabase.v1.V1mainProto
        .internal_static_google_cloud_oracledatabase_v1_GenerateAutonomousDatabaseWalletRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oracledatabase.v1.V1mainProto
        .internal_static_google_cloud_oracledatabase_v1_GenerateAutonomousDatabaseWalletRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest.class,
            com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest.Builder
                .class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the Autonomous Database in the following format:
   * projects/{project}/locations/{location}/autonomousDatabases/{autonomous_database}.
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
   * Required. The name of the Autonomous Database in the following format:
   * projects/{project}/locations/{location}/autonomousDatabases/{autonomous_database}.
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

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The type of wallet generation for the Autonomous Database. The
   * default value is SINGLE.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.GenerateType type = 2 [(.google.api.field_behavior) = OPTIONAL];
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
   * Optional. The type of wallet generation for the Autonomous Database. The
   * default value is SINGLE.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.GenerateType type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.GenerateType getType() {
    com.google.cloud.oracledatabase.v1.GenerateType result =
        com.google.cloud.oracledatabase.v1.GenerateType.forNumber(type_);
    return result == null ? com.google.cloud.oracledatabase.v1.GenerateType.UNRECOGNIZED : result;
  }

  public static final int IS_REGIONAL_FIELD_NUMBER = 3;
  private boolean isRegional_ = false;
  /**
   *
   *
   * <pre>
   * Optional. True when requesting regional connection strings in PDB connect
   * info, applicable to cross-region Data Guard only.
   * </pre>
   *
   * <code>bool is_regional = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The isRegional.
   */
  @java.lang.Override
  public boolean getIsRegional() {
    return isRegional_;
  }

  public static final int PASSWORD_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object password_ = "";
  /**
   *
   *
   * <pre>
   * Required. The password used to encrypt the keys inside the wallet. The
   * password must be a minimum of 8 characters.
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The password used to encrypt the keys inside the wallet. The
   * password must be a minimum of 8 characters.
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      password_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (type_
        != com.google.cloud.oracledatabase.v1.GenerateType.GENERATE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (isRegional_ != false) {
      output.writeBool(3, isRegional_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, password_);
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
    if (type_
        != com.google.cloud.oracledatabase.v1.GenerateType.GENERATE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
    }
    if (isRegional_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isRegional_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, password_);
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
    if (!(obj
        instanceof com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest other =
        (com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (type_ != other.type_) return false;
    if (getIsRegional() != other.getIsRegional()) return false;
    if (!getPassword().equals(other.getPassword())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + IS_REGIONAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsRegional());
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      parseFrom(
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
      com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest prototype) {
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
   * The request for `AutonomousDatabase.GenerateWallet`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest)
      com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_GenerateAutonomousDatabaseWalletRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_GenerateAutonomousDatabaseWalletRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest.class,
              com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      type_ = 0;
      isRegional_ = false;
      password_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_GenerateAutonomousDatabaseWalletRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
        getDefaultInstanceForType() {
      return com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest build() {
      com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
        buildPartial() {
      com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest result =
          new com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isRegional_ = isRegional_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.password_ = password_;
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
      if (other
          instanceof com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest) {
        return mergeFrom(
            (com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest other) {
      if (other
          == com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getIsRegional() != false) {
        setIsRegional(other.getIsRegional());
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 16:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                isRegional_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                password_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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
     * Required. The name of the Autonomous Database in the following format:
     * projects/{project}/locations/{location}/autonomousDatabases/{autonomous_database}.
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
     * Required. The name of the Autonomous Database in the following format:
     * projects/{project}/locations/{location}/autonomousDatabases/{autonomous_database}.
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
     * Required. The name of the Autonomous Database in the following format:
     * projects/{project}/locations/{location}/autonomousDatabases/{autonomous_database}.
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
     * Required. The name of the Autonomous Database in the following format:
     * projects/{project}/locations/{location}/autonomousDatabases/{autonomous_database}.
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
     * Required. The name of the Autonomous Database in the following format:
     * projects/{project}/locations/{location}/autonomousDatabases/{autonomous_database}.
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

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The type of wallet generation for the Autonomous Database. The
     * default value is SINGLE.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.GenerateType type = 2 [(.google.api.field_behavior) = OPTIONAL];
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
     * Optional. The type of wallet generation for the Autonomous Database. The
     * default value is SINGLE.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.GenerateType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of wallet generation for the Autonomous Database. The
     * default value is SINGLE.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.GenerateType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.GenerateType getType() {
      com.google.cloud.oracledatabase.v1.GenerateType result =
          com.google.cloud.oracledatabase.v1.GenerateType.forNumber(type_);
      return result == null ? com.google.cloud.oracledatabase.v1.GenerateType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of wallet generation for the Autonomous Database. The
     * default value is SINGLE.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.GenerateType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.oracledatabase.v1.GenerateType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of wallet generation for the Autonomous Database. The
     * default value is SINGLE.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.GenerateType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      type_ = 0;
      onChanged();
      return this;
    }

    private boolean isRegional_;
    /**
     *
     *
     * <pre>
     * Optional. True when requesting regional connection strings in PDB connect
     * info, applicable to cross-region Data Guard only.
     * </pre>
     *
     * <code>bool is_regional = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The isRegional.
     */
    @java.lang.Override
    public boolean getIsRegional() {
      return isRegional_;
    }
    /**
     *
     *
     * <pre>
     * Optional. True when requesting regional connection strings in PDB connect
     * info, applicable to cross-region Data Guard only.
     * </pre>
     *
     * <code>bool is_regional = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The isRegional to set.
     * @return This builder for chaining.
     */
    public Builder setIsRegional(boolean value) {

      isRegional_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. True when requesting regional connection strings in PDB connect
     * info, applicable to cross-region Data Guard only.
     * </pre>
     *
     * <code>bool is_regional = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsRegional() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isRegional_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     *
     *
     * <pre>
     * Required. The password used to encrypt the keys inside the wallet. The
     * password must be a minimum of 8 characters.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The password used to encrypt the keys inside the wallet. The
     * password must be a minimum of 8 characters.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The password used to encrypt the keys inside the wallet. The
     * password must be a minimum of 8 characters.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      password_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The password used to encrypt the keys inside the wallet. The
     * password must be a minimum of 8 characters.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      password_ = getDefaultInstance().getPassword();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The password used to encrypt the keys inside the wallet. The
     * password must be a minimum of 8 characters.
     * </pre>
     *
     * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      password_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest)
  private static final com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest();
  }

  public static com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateAutonomousDatabaseWalletRequest> PARSER =
      new com.google.protobuf.AbstractParser<GenerateAutonomousDatabaseWalletRequest>() {
        @java.lang.Override
        public GenerateAutonomousDatabaseWalletRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateAutonomousDatabaseWalletRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateAutonomousDatabaseWalletRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.GenerateAutonomousDatabaseWalletRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
