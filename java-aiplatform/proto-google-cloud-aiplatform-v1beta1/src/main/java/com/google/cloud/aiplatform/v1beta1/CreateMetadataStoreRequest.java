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
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [MetadataService.CreateMetadataStore][google.cloud.aiplatform.v1beta1.MetadataService.CreateMetadataStore].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest}
 */
public final class CreateMetadataStoreRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest)
    CreateMetadataStoreRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateMetadataStoreRequest.newBuilder() to construct.
  private CreateMetadataStoreRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateMetadataStoreRequest() {
    parent_ = "";
    metadataStoreId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateMetadataStoreRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataStoreRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataStoreRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest.class,
            com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location where the MetadataStore should
   * be created.
   * Format: `projects/{project}/locations/{location}/`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. The resource name of the Location where the MetadataStore should
   * be created.
   * Format: `projects/{project}/locations/{location}/`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int METADATA_STORE_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.MetadataStore metadataStore_;
  /**
   *
   *
   * <pre>
   * Required. The MetadataStore to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metadataStore field is set.
   */
  @java.lang.Override
  public boolean hasMetadataStore() {
    return metadataStore_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The MetadataStore to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metadataStore.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MetadataStore getMetadataStore() {
    return metadataStore_ == null
        ? com.google.cloud.aiplatform.v1beta1.MetadataStore.getDefaultInstance()
        : metadataStore_;
  }
  /**
   *
   *
   * <pre>
   * Required. The MetadataStore to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder getMetadataStoreOrBuilder() {
    return getMetadataStore();
  }

  public static final int METADATA_STORE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object metadataStoreId_;
  /**
   *
   *
   * <pre>
   * The {metadatastore} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * If not provided, the MetadataStore's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all MetadataStores in the parent Location.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting MetadataStore.)
   * </pre>
   *
   * <code>string metadata_store_id = 3;</code>
   *
   * @return The metadataStoreId.
   */
  @java.lang.Override
  public java.lang.String getMetadataStoreId() {
    java.lang.Object ref = metadataStoreId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metadataStoreId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The {metadatastore} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * If not provided, the MetadataStore's ID will be a UUID generated by the
   * service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all MetadataStores in the parent Location.
   * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
   * if the caller can't view the preexisting MetadataStore.)
   * </pre>
   *
   * <code>string metadata_store_id = 3;</code>
   *
   * @return The bytes for metadataStoreId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetadataStoreIdBytes() {
    java.lang.Object ref = metadataStoreId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      metadataStoreId_ = b;
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
    if (metadataStore_ != null) {
      output.writeMessage(2, getMetadataStore());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataStoreId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, metadataStoreId_);
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
    if (metadataStore_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetadataStore());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(metadataStoreId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, metadataStoreId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest other =
        (com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasMetadataStore() != other.hasMetadataStore()) return false;
    if (hasMetadataStore()) {
      if (!getMetadataStore().equals(other.getMetadataStore())) return false;
    }
    if (!getMetadataStoreId().equals(other.getMetadataStoreId())) return false;
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
    if (hasMetadataStore()) {
      hash = (37 * hash) + METADATA_STORE_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataStore().hashCode();
    }
    hash = (37 * hash) + METADATA_STORE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMetadataStoreId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest prototype) {
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
   * Request message for [MetadataService.CreateMetadataStore][google.cloud.aiplatform.v1beta1.MetadataService.CreateMetadataStore].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest)
      com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataStoreRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataStoreRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest.class,
              com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (metadataStoreBuilder_ == null) {
        metadataStore_ = null;
      } else {
        metadataStore_ = null;
        metadataStoreBuilder_ = null;
      }
      metadataStoreId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_CreateMetadataStoreRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest result =
          new com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest(this);
      result.parent_ = parent_;
      if (metadataStoreBuilder_ == null) {
        result.metadataStore_ = metadataStore_;
      } else {
        result.metadataStore_ = metadataStoreBuilder_.build();
      }
      result.metadataStoreId_ = metadataStoreId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasMetadataStore()) {
        mergeMetadataStore(other.getMetadataStore());
      }
      if (!other.getMetadataStoreId().isEmpty()) {
        metadataStoreId_ = other.metadataStoreId_;
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
                input.readMessage(getMetadataStoreFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 26:
              {
                metadataStoreId_ = input.readStringRequireUtf8();

                break;
              } // case 26
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
     * Required. The resource name of the Location where the MetadataStore should
     * be created.
     * Format: `projects/{project}/locations/{location}/`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the Location where the MetadataStore should
     * be created.
     * Format: `projects/{project}/locations/{location}/`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the Location where the MetadataStore should
     * be created.
     * Format: `projects/{project}/locations/{location}/`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the Location where the MetadataStore should
     * be created.
     * Format: `projects/{project}/locations/{location}/`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The resource name of the Location where the MetadataStore should
     * be created.
     * Format: `projects/{project}/locations/{location}/`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private com.google.cloud.aiplatform.v1beta1.MetadataStore metadataStore_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.MetadataStore,
            com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder,
            com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder>
        metadataStoreBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the metadataStore field is set.
     */
    public boolean hasMetadataStore() {
      return metadataStoreBuilder_ != null || metadataStore_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The metadataStore.
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStore getMetadataStore() {
      if (metadataStoreBuilder_ == null) {
        return metadataStore_ == null
            ? com.google.cloud.aiplatform.v1beta1.MetadataStore.getDefaultInstance()
            : metadataStore_;
      } else {
        return metadataStoreBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetadataStore(com.google.cloud.aiplatform.v1beta1.MetadataStore value) {
      if (metadataStoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadataStore_ = value;
        onChanged();
      } else {
        metadataStoreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetadataStore(
        com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder builderForValue) {
      if (metadataStoreBuilder_ == null) {
        metadataStore_ = builderForValue.build();
        onChanged();
      } else {
        metadataStoreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMetadataStore(com.google.cloud.aiplatform.v1beta1.MetadataStore value) {
      if (metadataStoreBuilder_ == null) {
        if (metadataStore_ != null) {
          metadataStore_ =
              com.google.cloud.aiplatform.v1beta1.MetadataStore.newBuilder(metadataStore_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metadataStore_ = value;
        }
        onChanged();
      } else {
        metadataStoreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMetadataStore() {
      if (metadataStoreBuilder_ == null) {
        metadataStore_ = null;
        onChanged();
      } else {
        metadataStore_ = null;
        metadataStoreBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder getMetadataStoreBuilder() {

      onChanged();
      return getMetadataStoreFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder getMetadataStoreOrBuilder() {
      if (metadataStoreBuilder_ != null) {
        return metadataStoreBuilder_.getMessageOrBuilder();
      } else {
        return metadataStore_ == null
            ? com.google.cloud.aiplatform.v1beta1.MetadataStore.getDefaultInstance()
            : metadataStore_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The MetadataStore to create.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.MetadataStore metadata_store = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.MetadataStore,
            com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder,
            com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder>
        getMetadataStoreFieldBuilder() {
      if (metadataStoreBuilder_ == null) {
        metadataStoreBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.MetadataStore,
                com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder,
                com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder>(
                getMetadataStore(), getParentForChildren(), isClean());
        metadataStore_ = null;
      }
      return metadataStoreBuilder_;
    }

    private java.lang.Object metadataStoreId_ = "";
    /**
     *
     *
     * <pre>
     * The {metadatastore} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataStores in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataStore.)
     * </pre>
     *
     * <code>string metadata_store_id = 3;</code>
     *
     * @return The metadataStoreId.
     */
    public java.lang.String getMetadataStoreId() {
      java.lang.Object ref = metadataStoreId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metadataStoreId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The {metadatastore} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataStores in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataStore.)
     * </pre>
     *
     * <code>string metadata_store_id = 3;</code>
     *
     * @return The bytes for metadataStoreId.
     */
    public com.google.protobuf.ByteString getMetadataStoreIdBytes() {
      java.lang.Object ref = metadataStoreId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        metadataStoreId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The {metadatastore} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataStores in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataStore.)
     * </pre>
     *
     * <code>string metadata_store_id = 3;</code>
     *
     * @param value The metadataStoreId to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataStoreId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      metadataStoreId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The {metadatastore} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataStores in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataStore.)
     * </pre>
     *
     * <code>string metadata_store_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMetadataStoreId() {

      metadataStoreId_ = getDefaultInstance().getMetadataStoreId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The {metadatastore} portion of the resource name with the format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
     * If not provided, the MetadataStore's ID will be a UUID generated by the
     * service.
     * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
     * Must be unique across all MetadataStores in the parent Location.
     * (Otherwise the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED
     * if the caller can't view the preexisting MetadataStore.)
     * </pre>
     *
     * <code>string metadata_store_id = 3;</code>
     *
     * @param value The bytes for metadataStoreId to set.
     * @return This builder for chaining.
     */
    public Builder setMetadataStoreIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      metadataStoreId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMetadataStoreRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateMetadataStoreRequest>() {
        @java.lang.Override
        public CreateMetadataStoreRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMetadataStoreRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMetadataStoreRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateMetadataStoreRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
