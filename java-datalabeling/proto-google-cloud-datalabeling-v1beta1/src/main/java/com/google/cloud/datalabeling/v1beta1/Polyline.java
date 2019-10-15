/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * A line with multiple line segments.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.Polyline}
 */
public final class Polyline extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.Polyline)
    PolylineOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Polyline.newBuilder() to construct.
  private Polyline(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Polyline() {
    vertices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Polyline(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                vertices_ = new java.util.ArrayList<com.google.cloud.datalabeling.v1beta1.Vertex>();
                mutable_bitField0_ |= 0x00000001;
              }
              vertices_.add(
                  input.readMessage(
                      com.google.cloud.datalabeling.v1beta1.Vertex.parser(), extensionRegistry));
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        vertices_ = java.util.Collections.unmodifiableList(vertices_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_Polyline_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_Polyline_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.Polyline.class,
            com.google.cloud.datalabeling.v1beta1.Polyline.Builder.class);
  }

  public static final int VERTICES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datalabeling.v1beta1.Vertex> vertices_;
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  public java.util.List<com.google.cloud.datalabeling.v1beta1.Vertex> getVerticesList() {
    return vertices_;
  }
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.VertexOrBuilder>
      getVerticesOrBuilderList() {
    return vertices_;
  }
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  public int getVerticesCount() {
    return vertices_.size();
  }
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  public com.google.cloud.datalabeling.v1beta1.Vertex getVertices(int index) {
    return vertices_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  public com.google.cloud.datalabeling.v1beta1.VertexOrBuilder getVerticesOrBuilder(int index) {
    return vertices_.get(index);
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
    for (int i = 0; i < vertices_.size(); i++) {
      output.writeMessage(1, vertices_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vertices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, vertices_.get(i));
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.Polyline)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.Polyline other =
        (com.google.cloud.datalabeling.v1beta1.Polyline) obj;

    if (!getVerticesList().equals(other.getVerticesList())) return false;
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
    if (getVerticesCount() > 0) {
      hash = (37 * hash) + VERTICES_FIELD_NUMBER;
      hash = (53 * hash) + getVerticesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.Polyline prototype) {
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
   * A line with multiple line segments.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.Polyline}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.Polyline)
      com.google.cloud.datalabeling.v1beta1.PolylineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_Polyline_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_Polyline_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.Polyline.class,
              com.google.cloud.datalabeling.v1beta1.Polyline.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.Polyline.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getVerticesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        verticesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_Polyline_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Polyline getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.Polyline.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Polyline build() {
      com.google.cloud.datalabeling.v1beta1.Polyline result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Polyline buildPartial() {
      com.google.cloud.datalabeling.v1beta1.Polyline result =
          new com.google.cloud.datalabeling.v1beta1.Polyline(this);
      int from_bitField0_ = bitField0_;
      if (verticesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vertices_ = java.util.Collections.unmodifiableList(vertices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vertices_ = vertices_;
      } else {
        result.vertices_ = verticesBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.Polyline) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.Polyline) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.Polyline other) {
      if (other == com.google.cloud.datalabeling.v1beta1.Polyline.getDefaultInstance()) return this;
      if (verticesBuilder_ == null) {
        if (!other.vertices_.isEmpty()) {
          if (vertices_.isEmpty()) {
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerticesIsMutable();
            vertices_.addAll(other.vertices_);
          }
          onChanged();
        }
      } else {
        if (!other.vertices_.isEmpty()) {
          if (verticesBuilder_.isEmpty()) {
            verticesBuilder_.dispose();
            verticesBuilder_ = null;
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            verticesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getVerticesFieldBuilder()
                    : null;
          } else {
            verticesBuilder_.addAllMessages(other.vertices_);
          }
        }
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
      com.google.cloud.datalabeling.v1beta1.Polyline parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datalabeling.v1beta1.Polyline) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.datalabeling.v1beta1.Vertex> vertices_ =
        java.util.Collections.emptyList();

    private void ensureVerticesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vertices_ =
            new java.util.ArrayList<com.google.cloud.datalabeling.v1beta1.Vertex>(vertices_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.Vertex,
            com.google.cloud.datalabeling.v1beta1.Vertex.Builder,
            com.google.cloud.datalabeling.v1beta1.VertexOrBuilder>
        verticesBuilder_;

    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.Vertex> getVerticesList() {
      if (verticesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vertices_);
      } else {
        return verticesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public int getVerticesCount() {
      if (verticesBuilder_ == null) {
        return vertices_.size();
      } else {
        return verticesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Vertex getVertices(int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);
      } else {
        return verticesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder setVertices(int index, com.google.cloud.datalabeling.v1beta1.Vertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.set(index, value);
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder setVertices(
        int index, com.google.cloud.datalabeling.v1beta1.Vertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.set(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder addVertices(com.google.cloud.datalabeling.v1beta1.Vertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder addVertices(int index, com.google.cloud.datalabeling.v1beta1.Vertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(index, value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder addVertices(
        com.google.cloud.datalabeling.v1beta1.Vertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder addVertices(
        int index, com.google.cloud.datalabeling.v1beta1.Vertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder addAllVertices(
        java.lang.Iterable<? extends com.google.cloud.datalabeling.v1beta1.Vertex> values) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, vertices_);
        onChanged();
      } else {
        verticesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder clearVertices() {
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        verticesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public Builder removeVertices(int index) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.remove(index);
        onChanged();
      } else {
        verticesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Vertex.Builder getVerticesBuilder(int index) {
      return getVerticesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.VertexOrBuilder getVerticesOrBuilder(int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);
      } else {
        return verticesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.VertexOrBuilder>
        getVerticesOrBuilderList() {
      if (verticesBuilder_ != null) {
        return verticesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vertices_);
      }
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Vertex.Builder addVerticesBuilder() {
      return getVerticesFieldBuilder()
          .addBuilder(com.google.cloud.datalabeling.v1beta1.Vertex.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.Vertex.Builder addVerticesBuilder(int index) {
      return getVerticesFieldBuilder()
          .addBuilder(index, com.google.cloud.datalabeling.v1beta1.Vertex.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The polyline vertices.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.Vertex.Builder>
        getVerticesBuilderList() {
      return getVerticesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.Vertex,
            com.google.cloud.datalabeling.v1beta1.Vertex.Builder,
            com.google.cloud.datalabeling.v1beta1.VertexOrBuilder>
        getVerticesFieldBuilder() {
      if (verticesBuilder_ == null) {
        verticesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.Vertex,
                com.google.cloud.datalabeling.v1beta1.Vertex.Builder,
                com.google.cloud.datalabeling.v1beta1.VertexOrBuilder>(
                vertices_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        vertices_ = null;
      }
      return verticesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.Polyline)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.Polyline)
  private static final com.google.cloud.datalabeling.v1beta1.Polyline DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.Polyline();
  }

  public static com.google.cloud.datalabeling.v1beta1.Polyline getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Polyline> PARSER =
      new com.google.protobuf.AbstractParser<Polyline>() {
        @java.lang.Override
        public Polyline parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Polyline(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Polyline> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Polyline> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.Polyline getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
