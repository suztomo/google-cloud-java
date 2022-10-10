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
// source: google/cloud/apigateway/v1/apigateway.proto

package com.google.cloud.apigateway.v1;

/**
 *
 *
 * <pre>
 * Request message for ApiGatewayService.UpdateApi
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigateway.v1.UpdateApiRequest}
 */
public final class UpdateApiRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigateway.v1.UpdateApiRequest)
    UpdateApiRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateApiRequest.newBuilder() to construct.
  private UpdateApiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateApiRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateApiRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apigateway.v1.Apigateway
        .internal_static_google_cloud_apigateway_v1_UpdateApiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigateway.v1.Apigateway
        .internal_static_google_cloud_apigateway_v1_UpdateApiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigateway.v1.UpdateApiRequest.class,
            com.google.cloud.apigateway.v1.UpdateApiRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * Api resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * Api resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * Api resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int API_FIELD_NUMBER = 2;
  private com.google.cloud.apigateway.v1.Api api_;
  /**
   *
   *
   * <pre>
   * Required. API resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the api field is set.
   */
  @java.lang.Override
  public boolean hasApi() {
    return api_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. API resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The api.
   */
  @java.lang.Override
  public com.google.cloud.apigateway.v1.Api getApi() {
    return api_ == null ? com.google.cloud.apigateway.v1.Api.getDefaultInstance() : api_;
  }
  /**
   *
   *
   * <pre>
   * Required. API resource.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.apigateway.v1.ApiOrBuilder getApiOrBuilder() {
    return getApi();
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (api_ != null) {
      output.writeMessage(2, getApi());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (api_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getApi());
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
    if (!(obj instanceof com.google.cloud.apigateway.v1.UpdateApiRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.apigateway.v1.UpdateApiRequest other =
        (com.google.cloud.apigateway.v1.UpdateApiRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasApi() != other.hasApi()) return false;
    if (hasApi()) {
      if (!getApi().equals(other.getApi())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasApi()) {
      hash = (37 * hash) + API_FIELD_NUMBER;
      hash = (53 * hash) + getApi().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apigateway.v1.UpdateApiRequest prototype) {
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
   * Request message for ApiGatewayService.UpdateApi
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigateway.v1.UpdateApiRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigateway.v1.UpdateApiRequest)
      com.google.cloud.apigateway.v1.UpdateApiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apigateway.v1.Apigateway
          .internal_static_google_cloud_apigateway_v1_UpdateApiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigateway.v1.Apigateway
          .internal_static_google_cloud_apigateway_v1_UpdateApiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigateway.v1.UpdateApiRequest.class,
              com.google.cloud.apigateway.v1.UpdateApiRequest.Builder.class);
    }

    // Construct using com.google.cloud.apigateway.v1.UpdateApiRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      if (apiBuilder_ == null) {
        api_ = null;
      } else {
        api_ = null;
        apiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apigateway.v1.Apigateway
          .internal_static_google_cloud_apigateway_v1_UpdateApiRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.UpdateApiRequest getDefaultInstanceForType() {
      return com.google.cloud.apigateway.v1.UpdateApiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.UpdateApiRequest build() {
      com.google.cloud.apigateway.v1.UpdateApiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigateway.v1.UpdateApiRequest buildPartial() {
      com.google.cloud.apigateway.v1.UpdateApiRequest result =
          new com.google.cloud.apigateway.v1.UpdateApiRequest(this);
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      if (apiBuilder_ == null) {
        result.api_ = api_;
      } else {
        result.api_ = apiBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.apigateway.v1.UpdateApiRequest) {
        return mergeFrom((com.google.cloud.apigateway.v1.UpdateApiRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigateway.v1.UpdateApiRequest other) {
      if (other == com.google.cloud.apigateway.v1.UpdateApiRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasApi()) {
        mergeApi(other.getApi());
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getApiFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Field mask is used to specify the fields to be overwritten in the
     * Api resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.apigateway.v1.Api api_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigateway.v1.Api,
            com.google.cloud.apigateway.v1.Api.Builder,
            com.google.cloud.apigateway.v1.ApiOrBuilder>
        apiBuilder_;
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the api field is set.
     */
    public boolean hasApi() {
      return apiBuilder_ != null || api_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The api.
     */
    public com.google.cloud.apigateway.v1.Api getApi() {
      if (apiBuilder_ == null) {
        return api_ == null ? com.google.cloud.apigateway.v1.Api.getDefaultInstance() : api_;
      } else {
        return apiBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApi(com.google.cloud.apigateway.v1.Api value) {
      if (apiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        api_ = value;
        onChanged();
      } else {
        apiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setApi(com.google.cloud.apigateway.v1.Api.Builder builderForValue) {
      if (apiBuilder_ == null) {
        api_ = builderForValue.build();
        onChanged();
      } else {
        apiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeApi(com.google.cloud.apigateway.v1.Api value) {
      if (apiBuilder_ == null) {
        if (api_ != null) {
          api_ =
              com.google.cloud.apigateway.v1.Api.newBuilder(api_).mergeFrom(value).buildPartial();
        } else {
          api_ = value;
        }
        onChanged();
      } else {
        apiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearApi() {
      if (apiBuilder_ == null) {
        api_ = null;
        onChanged();
      } else {
        api_ = null;
        apiBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigateway.v1.Api.Builder getApiBuilder() {

      onChanged();
      return getApiFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.apigateway.v1.ApiOrBuilder getApiOrBuilder() {
      if (apiBuilder_ != null) {
        return apiBuilder_.getMessageOrBuilder();
      } else {
        return api_ == null ? com.google.cloud.apigateway.v1.Api.getDefaultInstance() : api_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. API resource.
     * </pre>
     *
     * <code>.google.cloud.apigateway.v1.Api api = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigateway.v1.Api,
            com.google.cloud.apigateway.v1.Api.Builder,
            com.google.cloud.apigateway.v1.ApiOrBuilder>
        getApiFieldBuilder() {
      if (apiBuilder_ == null) {
        apiBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apigateway.v1.Api,
                com.google.cloud.apigateway.v1.Api.Builder,
                com.google.cloud.apigateway.v1.ApiOrBuilder>(
                getApi(), getParentForChildren(), isClean());
        api_ = null;
      }
      return apiBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apigateway.v1.UpdateApiRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigateway.v1.UpdateApiRequest)
  private static final com.google.cloud.apigateway.v1.UpdateApiRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigateway.v1.UpdateApiRequest();
  }

  public static com.google.cloud.apigateway.v1.UpdateApiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateApiRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateApiRequest>() {
        @java.lang.Override
        public UpdateApiRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateApiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateApiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigateway.v1.UpdateApiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
