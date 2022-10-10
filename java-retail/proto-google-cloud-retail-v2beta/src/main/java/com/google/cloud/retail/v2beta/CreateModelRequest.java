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
// source: google/cloud/retail/v2beta/model_service.proto

package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * Request for creating a model.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.CreateModelRequest}
 */
public final class CreateModelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.CreateModelRequest)
    CreateModelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateModelRequest.newBuilder() to construct.
  private CreateModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateModelRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateModelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2beta.ModelServiceProto
        .internal_static_google_cloud_retail_v2beta_CreateModelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.ModelServiceProto
        .internal_static_google_cloud_retail_v2beta_CreateModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.CreateModelRequest.class,
            com.google.cloud.retail.v2beta.CreateModelRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource under which to create the model. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
   * Required. The parent resource under which to create the model. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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

  public static final int MODEL_FIELD_NUMBER = 2;
  private com.google.cloud.retail.v2beta.Model model_;
  /**
   *
   *
   * <pre>
   * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
   * create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
   * create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The model.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.Model getModel() {
    return model_ == null ? com.google.cloud.retail.v2beta.Model.getDefaultInstance() : model_;
  }
  /**
   *
   *
   * <pre>
   * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
   * create.
   * </pre>
   *
   * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2beta.ModelOrBuilder getModelOrBuilder() {
    return getModel();
  }

  public static final int DRY_RUN_FIELD_NUMBER = 3;
  private boolean dryRun_;
  /**
   *
   *
   * <pre>
   * Optional. Whether to run a dry run to validate the request (without
   * actually creating the model).
   * </pre>
   *
   * <code>bool dry_run = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dryRun.
   */
  @java.lang.Override
  public boolean getDryRun() {
    return dryRun_;
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
    if (model_ != null) {
      output.writeMessage(2, getModel());
    }
    if (dryRun_ != false) {
      output.writeBool(3, dryRun_);
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
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getModel());
    }
    if (dryRun_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, dryRun_);
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.CreateModelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.CreateModelRequest other =
        (com.google.cloud.retail.v2beta.CreateModelRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (!getModel().equals(other.getModel())) return false;
    }
    if (getDryRun() != other.getDryRun()) return false;
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
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    hash = (37 * hash) + DRY_RUN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDryRun());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2beta.CreateModelRequest prototype) {
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
   * Request for creating a model.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.CreateModelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.CreateModelRequest)
      com.google.cloud.retail.v2beta.CreateModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.ModelServiceProto
          .internal_static_google_cloud_retail_v2beta_CreateModelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.ModelServiceProto
          .internal_static_google_cloud_retail_v2beta_CreateModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.CreateModelRequest.class,
              com.google.cloud.retail.v2beta.CreateModelRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2beta.CreateModelRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      dryRun_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.ModelServiceProto
          .internal_static_google_cloud_retail_v2beta_CreateModelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.CreateModelRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.CreateModelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.CreateModelRequest build() {
      com.google.cloud.retail.v2beta.CreateModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.CreateModelRequest buildPartial() {
      com.google.cloud.retail.v2beta.CreateModelRequest result =
          new com.google.cloud.retail.v2beta.CreateModelRequest(this);
      result.parent_ = parent_;
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
      }
      result.dryRun_ = dryRun_;
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
      if (other instanceof com.google.cloud.retail.v2beta.CreateModelRequest) {
        return mergeFrom((com.google.cloud.retail.v2beta.CreateModelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2beta.CreateModelRequest other) {
      if (other == com.google.cloud.retail.v2beta.CreateModelRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasModel()) {
        mergeModel(other.getModel());
      }
      if (other.getDryRun() != false) {
        setDryRun(other.getDryRun());
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
                input.readMessage(getModelFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 24:
              {
                dryRun_ = input.readBool();

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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource under which to create the model. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. The parent resource under which to create the model. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. The parent resource under which to create the model. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. The parent resource under which to create the model. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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
     * Required. The parent resource under which to create the model. Format:
     * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
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

    private com.google.cloud.retail.v2beta.Model model_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.Model,
            com.google.cloud.retail.v2beta.Model.Builder,
            com.google.cloud.retail.v2beta.ModelOrBuilder>
        modelBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the model field is set.
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The model.
     */
    public com.google.cloud.retail.v2beta.Model getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? com.google.cloud.retail.v2beta.Model.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModel(com.google.cloud.retail.v2beta.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setModel(com.google.cloud.retail.v2beta.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeModel(com.google.cloud.retail.v2beta.Model value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
              com.google.cloud.retail.v2beta.Model.newBuilder(model_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.Model.Builder getModelBuilder() {

      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2beta.ModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ? com.google.cloud.retail.v2beta.Model.getDefaultInstance() : model_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The payload of the [Model][google.cloud.retail.v2beta.Model]  to
     * create.
     * </pre>
     *
     * <code>.google.cloud.retail.v2beta.Model model = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2beta.Model,
            com.google.cloud.retail.v2beta.Model.Builder,
            com.google.cloud.retail.v2beta.ModelOrBuilder>
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2beta.Model,
                com.google.cloud.retail.v2beta.Model.Builder,
                com.google.cloud.retail.v2beta.ModelOrBuilder>(
                getModel(), getParentForChildren(), isClean());
        model_ = null;
      }
      return modelBuilder_;
    }

    private boolean dryRun_;
    /**
     *
     *
     * <pre>
     * Optional. Whether to run a dry run to validate the request (without
     * actually creating the model).
     * </pre>
     *
     * <code>bool dry_run = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The dryRun.
     */
    @java.lang.Override
    public boolean getDryRun() {
      return dryRun_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether to run a dry run to validate the request (without
     * actually creating the model).
     * </pre>
     *
     * <code>bool dry_run = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The dryRun to set.
     * @return This builder for chaining.
     */
    public Builder setDryRun(boolean value) {

      dryRun_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether to run a dry run to validate the request (without
     * actually creating the model).
     * </pre>
     *
     * <code>bool dry_run = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDryRun() {

      dryRun_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.CreateModelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.CreateModelRequest)
  private static final com.google.cloud.retail.v2beta.CreateModelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.CreateModelRequest();
  }

  public static com.google.cloud.retail.v2beta.CreateModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateModelRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateModelRequest>() {
        @java.lang.Override
        public CreateModelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateModelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.CreateModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
