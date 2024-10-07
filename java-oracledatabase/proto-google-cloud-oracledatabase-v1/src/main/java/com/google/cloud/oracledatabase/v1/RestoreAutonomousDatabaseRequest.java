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
 * The request for `AutonomousDatabase.Restore`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest}
 */
public final class RestoreAutonomousDatabaseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest)
    RestoreAutonomousDatabaseRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RestoreAutonomousDatabaseRequest.newBuilder() to construct.
  private RestoreAutonomousDatabaseRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RestoreAutonomousDatabaseRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RestoreAutonomousDatabaseRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oracledatabase.v1.V1mainProto
        .internal_static_google_cloud_oracledatabase_v1_RestoreAutonomousDatabaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oracledatabase.v1.V1mainProto
        .internal_static_google_cloud_oracledatabase_v1_RestoreAutonomousDatabaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest.class,
            com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest.Builder.class);
  }

  private int bitField0_;
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

  public static final int RESTORE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp restoreTime_;
  /**
   *
   *
   * <pre>
   * Required. The time and date to restore the database to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the restoreTime field is set.
   */
  @java.lang.Override
  public boolean hasRestoreTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The time and date to restore the database to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The restoreTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getRestoreTime() {
    return restoreTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : restoreTime_;
  }
  /**
   *
   *
   * <pre>
   * Required. The time and date to restore the database to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getRestoreTimeOrBuilder() {
    return restoreTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : restoreTime_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getRestoreTime());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRestoreTime());
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
    if (!(obj instanceof com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest other =
        (com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasRestoreTime() != other.hasRestoreTime()) return false;
    if (hasRestoreTime()) {
      if (!getRestoreTime().equals(other.getRestoreTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasRestoreTime()) {
      hash = (37 * hash) + RESTORE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getRestoreTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest parseFrom(
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
      com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest prototype) {
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
   * The request for `AutonomousDatabase.Restore`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest)
      com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_RestoreAutonomousDatabaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_RestoreAutonomousDatabaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest.class,
              com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRestoreTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      restoreTime_ = null;
      if (restoreTimeBuilder_ != null) {
        restoreTimeBuilder_.dispose();
        restoreTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oracledatabase.v1.V1mainProto
          .internal_static_google_cloud_oracledatabase_v1_RestoreAutonomousDatabaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
        getDefaultInstanceForType() {
      return com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest build() {
      com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest buildPartial() {
      com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest result =
          new com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.restoreTime_ =
            restoreTimeBuilder_ == null ? restoreTime_ : restoreTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest) {
        return mergeFrom(
            (com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest other) {
      if (other
          == com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRestoreTime()) {
        mergeRestoreTime(other.getRestoreTime());
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
                input.readMessage(getRestoreTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.Timestamp restoreTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        restoreTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the restoreTime field is set.
     */
    public boolean hasRestoreTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The restoreTime.
     */
    public com.google.protobuf.Timestamp getRestoreTime() {
      if (restoreTimeBuilder_ == null) {
        return restoreTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : restoreTime_;
      } else {
        return restoreTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestoreTime(com.google.protobuf.Timestamp value) {
      if (restoreTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        restoreTime_ = value;
      } else {
        restoreTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestoreTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (restoreTimeBuilder_ == null) {
        restoreTime_ = builderForValue.build();
      } else {
        restoreTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRestoreTime(com.google.protobuf.Timestamp value) {
      if (restoreTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && restoreTime_ != null
            && restoreTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getRestoreTimeBuilder().mergeFrom(value);
        } else {
          restoreTime_ = value;
        }
      } else {
        restoreTimeBuilder_.mergeFrom(value);
      }
      if (restoreTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRestoreTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      restoreTime_ = null;
      if (restoreTimeBuilder_ != null) {
        restoreTimeBuilder_.dispose();
        restoreTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getRestoreTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRestoreTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getRestoreTimeOrBuilder() {
      if (restoreTimeBuilder_ != null) {
        return restoreTimeBuilder_.getMessageOrBuilder();
      } else {
        return restoreTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : restoreTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The time and date to restore the database to.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp restore_time = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getRestoreTimeFieldBuilder() {
      if (restoreTimeBuilder_ == null) {
        restoreTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getRestoreTime(), getParentForChildren(), isClean());
        restoreTime_ = null;
      }
      return restoreTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest)
  private static final com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest();
  }

  public static com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestoreAutonomousDatabaseRequest> PARSER =
      new com.google.protobuf.AbstractParser<RestoreAutonomousDatabaseRequest>() {
        @java.lang.Override
        public RestoreAutonomousDatabaseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RestoreAutonomousDatabaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestoreAutonomousDatabaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.RestoreAutonomousDatabaseRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
