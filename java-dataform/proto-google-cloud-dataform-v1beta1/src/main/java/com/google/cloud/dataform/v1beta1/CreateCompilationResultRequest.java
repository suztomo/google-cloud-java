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
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

/**
 *
 *
 * <pre>
 * `CreateCompilationResult` request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.CreateCompilationResultRequest}
 */
public final class CreateCompilationResultRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.CreateCompilationResultRequest)
    CreateCompilationResultRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCompilationResultRequest.newBuilder() to construct.
  private CreateCompilationResultRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCompilationResultRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCompilationResultRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_CreateCompilationResultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto
        .internal_static_google_cloud_dataform_v1beta1_CreateCompilationResultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest.class,
            com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The repository in which to create the compilation result. Must be in the
   * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
   * Required. The repository in which to create the compilation result. Must be in the
   * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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

  public static final int COMPILATION_RESULT_FIELD_NUMBER = 2;
  private com.google.cloud.dataform.v1beta1.CompilationResult compilationResult_;
  /**
   *
   *
   * <pre>
   * Required. The compilation result to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the compilationResult field is set.
   */
  @java.lang.Override
  public boolean hasCompilationResult() {
    return compilationResult_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The compilation result to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The compilationResult.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.CompilationResult getCompilationResult() {
    return compilationResult_ == null
        ? com.google.cloud.dataform.v1beta1.CompilationResult.getDefaultInstance()
        : compilationResult_;
  }
  /**
   *
   *
   * <pre>
   * Required. The compilation result to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.CompilationResultOrBuilder
      getCompilationResultOrBuilder() {
    return getCompilationResult();
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
    if (compilationResult_ != null) {
      output.writeMessage(2, getCompilationResult());
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
    if (compilationResult_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCompilationResult());
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest other =
        (com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasCompilationResult() != other.hasCompilationResult()) return false;
    if (hasCompilationResult()) {
      if (!getCompilationResult().equals(other.getCompilationResult())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCompilationResult()) {
      hash = (37 * hash) + COMPILATION_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getCompilationResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest parseFrom(
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
      com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest prototype) {
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
   * `CreateCompilationResult` request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.CreateCompilationResultRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.CreateCompilationResultRequest)
      com.google.cloud.dataform.v1beta1.CreateCompilationResultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CreateCompilationResultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CreateCompilationResultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest.class,
              com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (compilationResultBuilder_ == null) {
        compilationResult_ = null;
      } else {
        compilationResult_ = null;
        compilationResultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto
          .internal_static_google_cloud_dataform_v1beta1_CreateCompilationResultRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest build() {
      com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest buildPartial() {
      com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest result =
          new com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest(this);
      result.parent_ = parent_;
      if (compilationResultBuilder_ == null) {
        result.compilationResult_ = compilationResult_;
      } else {
        result.compilationResult_ = compilationResultBuilder_.build();
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
      if (other instanceof com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest other) {
      if (other
          == com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCompilationResult()) {
        mergeCompilationResult(other.getCompilationResult());
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
                input.readMessage(
                    getCompilationResultFieldBuilder().getBuilder(), extensionRegistry);

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
     * Required. The repository in which to create the compilation result. Must be in the
     * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the compilation result. Must be in the
     * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the compilation result. Must be in the
     * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the compilation result. Must be in the
     * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
     * Required. The repository in which to create the compilation result. Must be in the
     * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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

    private com.google.cloud.dataform.v1beta1.CompilationResult compilationResult_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.CompilationResult,
            com.google.cloud.dataform.v1beta1.CompilationResult.Builder,
            com.google.cloud.dataform.v1beta1.CompilationResultOrBuilder>
        compilationResultBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the compilationResult field is set.
     */
    public boolean hasCompilationResult() {
      return compilationResultBuilder_ != null || compilationResult_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The compilationResult.
     */
    public com.google.cloud.dataform.v1beta1.CompilationResult getCompilationResult() {
      if (compilationResultBuilder_ == null) {
        return compilationResult_ == null
            ? com.google.cloud.dataform.v1beta1.CompilationResult.getDefaultInstance()
            : compilationResult_;
      } else {
        return compilationResultBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCompilationResult(com.google.cloud.dataform.v1beta1.CompilationResult value) {
      if (compilationResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        compilationResult_ = value;
        onChanged();
      } else {
        compilationResultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCompilationResult(
        com.google.cloud.dataform.v1beta1.CompilationResult.Builder builderForValue) {
      if (compilationResultBuilder_ == null) {
        compilationResult_ = builderForValue.build();
        onChanged();
      } else {
        compilationResultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCompilationResult(
        com.google.cloud.dataform.v1beta1.CompilationResult value) {
      if (compilationResultBuilder_ == null) {
        if (compilationResult_ != null) {
          compilationResult_ =
              com.google.cloud.dataform.v1beta1.CompilationResult.newBuilder(compilationResult_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          compilationResult_ = value;
        }
        onChanged();
      } else {
        compilationResultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCompilationResult() {
      if (compilationResultBuilder_ == null) {
        compilationResult_ = null;
        onChanged();
      } else {
        compilationResult_ = null;
        compilationResultBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.CompilationResult.Builder
        getCompilationResultBuilder() {

      onChanged();
      return getCompilationResultFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dataform.v1beta1.CompilationResultOrBuilder
        getCompilationResultOrBuilder() {
      if (compilationResultBuilder_ != null) {
        return compilationResultBuilder_.getMessageOrBuilder();
      } else {
        return compilationResult_ == null
            ? com.google.cloud.dataform.v1beta1.CompilationResult.getDefaultInstance()
            : compilationResult_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The compilation result to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dataform.v1beta1.CompilationResult compilation_result = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1beta1.CompilationResult,
            com.google.cloud.dataform.v1beta1.CompilationResult.Builder,
            com.google.cloud.dataform.v1beta1.CompilationResultOrBuilder>
        getCompilationResultFieldBuilder() {
      if (compilationResultBuilder_ == null) {
        compilationResultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataform.v1beta1.CompilationResult,
                com.google.cloud.dataform.v1beta1.CompilationResult.Builder,
                com.google.cloud.dataform.v1beta1.CompilationResultOrBuilder>(
                getCompilationResult(), getParentForChildren(), isClean());
        compilationResult_ = null;
      }
      return compilationResultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.CreateCompilationResultRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.CreateCompilationResultRequest)
  private static final com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest();
  }

  public static com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCompilationResultRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCompilationResultRequest>() {
        @java.lang.Override
        public CreateCompilationResultRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCompilationResultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCompilationResultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.CreateCompilationResultRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
