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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * DeleteClusterRequest deletes a cluster.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.DeleteClusterRequest}
 */
public final class DeleteClusterRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.DeleteClusterRequest)
    DeleteClusterRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteClusterRequest.newBuilder() to construct.
  private DeleteClusterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteClusterRequest() {
    projectId_ = "";
    zone_ = "";
    clusterId_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteClusterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DeleteClusterRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              java.lang.String s = input.readStringRequireUtf8();

              projectId_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              zone_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              clusterId_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_DeleteClusterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_DeleteClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.DeleteClusterRequest.class,
            com.google.container.v1.DeleteClusterRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The projectId.
   */
  @java.lang.Deprecated
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object zone_;
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The zone.
   */
  @java.lang.Deprecated
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object clusterId_;
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the cluster to delete.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The clusterId.
   */
  @java.lang.Deprecated
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Deprecated. The name of the cluster to delete.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster) of the cluster to delete.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The name.
   */
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
   * The name (project, location, cluster) of the cluster to delete.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 4;</code>
   *
   * @return The bytes for name.
   */
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clusterId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clusterId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
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
    if (!(obj instanceof com.google.container.v1.DeleteClusterRequest)) {
      return super.equals(obj);
    }
    com.google.container.v1.DeleteClusterRequest other =
        (com.google.container.v1.DeleteClusterRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getZone().equals(other.getZone())) return false;
    if (!getClusterId().equals(other.getClusterId())) return false;
    if (!getName().equals(other.getName())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.DeleteClusterRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.DeleteClusterRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.DeleteClusterRequest parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.DeleteClusterRequest prototype) {
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
   * DeleteClusterRequest deletes a cluster.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.DeleteClusterRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.DeleteClusterRequest)
      com.google.container.v1.DeleteClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_DeleteClusterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_DeleteClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.DeleteClusterRequest.class,
              com.google.container.v1.DeleteClusterRequest.Builder.class);
    }

    // Construct using com.google.container.v1.DeleteClusterRequest.newBuilder()
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
      projectId_ = "";

      zone_ = "";

      clusterId_ = "";

      name_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_DeleteClusterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.DeleteClusterRequest getDefaultInstanceForType() {
      return com.google.container.v1.DeleteClusterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.DeleteClusterRequest build() {
      com.google.container.v1.DeleteClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.DeleteClusterRequest buildPartial() {
      com.google.container.v1.DeleteClusterRequest result =
          new com.google.container.v1.DeleteClusterRequest(this);
      result.projectId_ = projectId_;
      result.zone_ = zone_;
      result.clusterId_ = clusterId_;
      result.name_ = name_;
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
      if (other instanceof com.google.container.v1.DeleteClusterRequest) {
        return mergeFrom((com.google.container.v1.DeleteClusterRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.DeleteClusterRequest other) {
      if (other == com.google.container.v1.DeleteClusterRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
      com.google.container.v1.DeleteClusterRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.DeleteClusterRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The projectId.
     */
    @java.lang.Deprecated
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bytes for projectId.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string project_id = 1 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The zone.
     */
    @java.lang.Deprecated
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for zone.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      zone_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearZone() {

      zone_ = getDefaultInstance().getZone();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string zone = 2 [deprecated = true, (.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      zone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the cluster to delete.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The clusterId.
     */
    @java.lang.Deprecated
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the cluster to delete.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bytes for clusterId.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the cluster to delete.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The clusterId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setClusterId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the cluster to delete.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearClusterId() {

      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Deprecated. The name of the cluster to delete.
     * This field has been deprecated and replaced by the name field.
     * </pre>
     *
     * <code>string cluster_id = 3 [deprecated = true, (.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The bytes for clusterId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setClusterIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      clusterId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name (project, location, cluster) of the cluster to delete.
     * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
     * </pre>
     *
     * <code>string name = 4;</code>
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
     * The name (project, location, cluster) of the cluster to delete.
     * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
     * </pre>
     *
     * <code>string name = 4;</code>
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
     * The name (project, location, cluster) of the cluster to delete.
     * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
     * </pre>
     *
     * <code>string name = 4;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name (project, location, cluster) of the cluster to delete.
     * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
     * </pre>
     *
     * <code>string name = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name (project, location, cluster) of the cluster to delete.
     * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
     * </pre>
     *
     * <code>string name = 4;</code>
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.DeleteClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.DeleteClusterRequest)
  private static final com.google.container.v1.DeleteClusterRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.DeleteClusterRequest();
  }

  public static com.google.container.v1.DeleteClusterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteClusterRequest> PARSER =
      new com.google.protobuf.AbstractParser<DeleteClusterRequest>() {
        @java.lang.Override
        public DeleteClusterRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DeleteClusterRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DeleteClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteClusterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.DeleteClusterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
