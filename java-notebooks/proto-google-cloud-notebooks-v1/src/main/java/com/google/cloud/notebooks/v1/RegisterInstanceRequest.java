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
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Request for registering a notebook instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.RegisterInstanceRequest}
 */
public final class RegisterInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.RegisterInstanceRequest)
    RegisterInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RegisterInstanceRequest.newBuilder() to construct.
  private RegisterInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RegisterInstanceRequest() {
    parent_ = "";
    instanceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RegisterInstanceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_RegisterInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_RegisterInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.RegisterInstanceRequest.class,
            com.google.cloud.notebooks.v1.RegisterInstanceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object instanceId_;
  /**
   *
   *
   * <pre>
   * Required. User defined unique ID of this instance. The `instance_id` must
   * be 1 to 63 characters long and contain only lowercase letters,
   * numeric characters, and dashes. The first character must be a lowercase
   * letter and the last character cannot be a dash.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instanceId.
   */
  @java.lang.Override
  public java.lang.String getInstanceId() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. User defined unique ID of this instance. The `instance_id` must
   * be 1 to 63 characters long and contain only lowercase letters,
   * numeric characters, and dashes. The first character must be a lowercase
   * letter and the last character cannot be a dash.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instanceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceIdBytes() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceId_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.RegisterInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.RegisterInstanceRequest other =
        (com.google.cloud.notebooks.v1.RegisterInstanceRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getInstanceId().equals(other.getInstanceId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + INSTANCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest parseFrom(
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
      com.google.cloud.notebooks.v1.RegisterInstanceRequest prototype) {
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
   * Request for registering a notebook instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.RegisterInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.RegisterInstanceRequest)
      com.google.cloud.notebooks.v1.RegisterInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_RegisterInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_RegisterInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.RegisterInstanceRequest.class,
              com.google.cloud.notebooks.v1.RegisterInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.RegisterInstanceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      instanceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_RegisterInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RegisterInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.RegisterInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RegisterInstanceRequest build() {
      com.google.cloud.notebooks.v1.RegisterInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RegisterInstanceRequest buildPartial() {
      com.google.cloud.notebooks.v1.RegisterInstanceRequest result =
          new com.google.cloud.notebooks.v1.RegisterInstanceRequest(this);
      result.parent_ = parent_;
      result.instanceId_ = instanceId_;
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
      if (other instanceof com.google.cloud.notebooks.v1.RegisterInstanceRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.RegisterInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.RegisterInstanceRequest other) {
      if (other == com.google.cloud.notebooks.v1.RegisterInstanceRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
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
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                instanceId_ = input.readStringRequireUtf8();

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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object instanceId_ = "";
    /**
     *
     *
     * <pre>
     * Required. User defined unique ID of this instance. The `instance_id` must
     * be 1 to 63 characters long and contain only lowercase letters,
     * numeric characters, and dashes. The first character must be a lowercase
     * letter and the last character cannot be a dash.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The instanceId.
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User defined unique ID of this instance. The `instance_id` must
     * be 1 to 63 characters long and contain only lowercase letters,
     * numeric characters, and dashes. The first character must be a lowercase
     * letter and the last character cannot be a dash.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for instanceId.
     */
    public com.google.protobuf.ByteString getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User defined unique ID of this instance. The `instance_id` must
     * be 1 to 63 characters long and contain only lowercase letters,
     * numeric characters, and dashes. The first character must be a lowercase
     * letter and the last character cannot be a dash.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      instanceId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User defined unique ID of this instance. The `instance_id` must
     * be 1 to 63 characters long and contain only lowercase letters,
     * numeric characters, and dashes. The first character must be a lowercase
     * letter and the last character cannot be a dash.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceId() {

      instanceId_ = getDefaultInstance().getInstanceId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User defined unique ID of this instance. The `instance_id` must
     * be 1 to 63 characters long and contain only lowercase letters,
     * numeric characters, and dashes. The first character must be a lowercase
     * letter and the last character cannot be a dash.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      instanceId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.RegisterInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.RegisterInstanceRequest)
  private static final com.google.cloud.notebooks.v1.RegisterInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.RegisterInstanceRequest();
  }

  public static com.google.cloud.notebooks.v1.RegisterInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<RegisterInstanceRequest>() {
        @java.lang.Override
        public RegisterInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegisterInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.RegisterInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
