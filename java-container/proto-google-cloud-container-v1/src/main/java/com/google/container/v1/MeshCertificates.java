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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.MeshCertificates}
 */
public final class MeshCertificates extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.MeshCertificates)
    MeshCertificatesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MeshCertificates.newBuilder() to construct.
  private MeshCertificates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MeshCertificates() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MeshCertificates();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MeshCertificates(
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
              com.google.protobuf.BoolValue.Builder subBuilder = null;
              if (enableCertificates_ != null) {
                subBuilder = enableCertificates_.toBuilder();
              }
              enableCertificates_ =
                  input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(enableCertificates_);
                enableCertificates_ = subBuilder.buildPartial();
              }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_MeshCertificates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_MeshCertificates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.MeshCertificates.class,
            com.google.container.v1.MeshCertificates.Builder.class);
  }

  public static final int ENABLE_CERTIFICATES_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue enableCertificates_;
  /**
   *
   *
   * <pre>
   * enable_certificates controls issuance of workload mTLS certificates.
   * If set, the GKE Workload Identity Certificates controller and node agent
   * will be deployed in the cluster, which can then be configured by creating a
   * WorkloadCertificateConfig Custom Resource.
   * Requires Workload Identity
   * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
   *
   * @return Whether the enableCertificates field is set.
   */
  @java.lang.Override
  public boolean hasEnableCertificates() {
    return enableCertificates_ != null;
  }
  /**
   *
   *
   * <pre>
   * enable_certificates controls issuance of workload mTLS certificates.
   * If set, the GKE Workload Identity Certificates controller and node agent
   * will be deployed in the cluster, which can then be configured by creating a
   * WorkloadCertificateConfig Custom Resource.
   * Requires Workload Identity
   * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
   *
   * @return The enableCertificates.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getEnableCertificates() {
    return enableCertificates_ == null
        ? com.google.protobuf.BoolValue.getDefaultInstance()
        : enableCertificates_;
  }
  /**
   *
   *
   * <pre>
   * enable_certificates controls issuance of workload mTLS certificates.
   * If set, the GKE Workload Identity Certificates controller and node agent
   * will be deployed in the cluster, which can then be configured by creating a
   * WorkloadCertificateConfig Custom Resource.
   * Requires Workload Identity
   * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getEnableCertificatesOrBuilder() {
    return getEnableCertificates();
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
    if (enableCertificates_ != null) {
      output.writeMessage(1, getEnableCertificates());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableCertificates_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEnableCertificates());
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
    if (!(obj instanceof com.google.container.v1.MeshCertificates)) {
      return super.equals(obj);
    }
    com.google.container.v1.MeshCertificates other = (com.google.container.v1.MeshCertificates) obj;

    if (hasEnableCertificates() != other.hasEnableCertificates()) return false;
    if (hasEnableCertificates()) {
      if (!getEnableCertificates().equals(other.getEnableCertificates())) return false;
    }
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
    if (hasEnableCertificates()) {
      hash = (37 * hash) + ENABLE_CERTIFICATES_FIELD_NUMBER;
      hash = (53 * hash) + getEnableCertificates().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.MeshCertificates parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.MeshCertificates parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.MeshCertificates parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.MeshCertificates parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.MeshCertificates prototype) {
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
   * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.MeshCertificates}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.MeshCertificates)
      com.google.container.v1.MeshCertificatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_MeshCertificates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_MeshCertificates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.MeshCertificates.class,
              com.google.container.v1.MeshCertificates.Builder.class);
    }

    // Construct using com.google.container.v1.MeshCertificates.newBuilder()
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
      if (enableCertificatesBuilder_ == null) {
        enableCertificates_ = null;
      } else {
        enableCertificates_ = null;
        enableCertificatesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_MeshCertificates_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.MeshCertificates getDefaultInstanceForType() {
      return com.google.container.v1.MeshCertificates.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.MeshCertificates build() {
      com.google.container.v1.MeshCertificates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.MeshCertificates buildPartial() {
      com.google.container.v1.MeshCertificates result =
          new com.google.container.v1.MeshCertificates(this);
      if (enableCertificatesBuilder_ == null) {
        result.enableCertificates_ = enableCertificates_;
      } else {
        result.enableCertificates_ = enableCertificatesBuilder_.build();
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
      if (other instanceof com.google.container.v1.MeshCertificates) {
        return mergeFrom((com.google.container.v1.MeshCertificates) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.MeshCertificates other) {
      if (other == com.google.container.v1.MeshCertificates.getDefaultInstance()) return this;
      if (other.hasEnableCertificates()) {
        mergeEnableCertificates(other.getEnableCertificates());
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
      com.google.container.v1.MeshCertificates parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.MeshCertificates) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.BoolValue enableCertificates_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        enableCertificatesBuilder_;
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     *
     * @return Whether the enableCertificates field is set.
     */
    public boolean hasEnableCertificates() {
      return enableCertificatesBuilder_ != null || enableCertificates_ != null;
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     *
     * @return The enableCertificates.
     */
    public com.google.protobuf.BoolValue getEnableCertificates() {
      if (enableCertificatesBuilder_ == null) {
        return enableCertificates_ == null
            ? com.google.protobuf.BoolValue.getDefaultInstance()
            : enableCertificates_;
      } else {
        return enableCertificatesBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     */
    public Builder setEnableCertificates(com.google.protobuf.BoolValue value) {
      if (enableCertificatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        enableCertificates_ = value;
        onChanged();
      } else {
        enableCertificatesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     */
    public Builder setEnableCertificates(com.google.protobuf.BoolValue.Builder builderForValue) {
      if (enableCertificatesBuilder_ == null) {
        enableCertificates_ = builderForValue.build();
        onChanged();
      } else {
        enableCertificatesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     */
    public Builder mergeEnableCertificates(com.google.protobuf.BoolValue value) {
      if (enableCertificatesBuilder_ == null) {
        if (enableCertificates_ != null) {
          enableCertificates_ =
              com.google.protobuf.BoolValue.newBuilder(enableCertificates_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          enableCertificates_ = value;
        }
        onChanged();
      } else {
        enableCertificatesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     */
    public Builder clearEnableCertificates() {
      if (enableCertificatesBuilder_ == null) {
        enableCertificates_ = null;
        onChanged();
      } else {
        enableCertificates_ = null;
        enableCertificatesBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     */
    public com.google.protobuf.BoolValue.Builder getEnableCertificatesBuilder() {

      onChanged();
      return getEnableCertificatesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getEnableCertificatesOrBuilder() {
      if (enableCertificatesBuilder_ != null) {
        return enableCertificatesBuilder_.getMessageOrBuilder();
      } else {
        return enableCertificates_ == null
            ? com.google.protobuf.BoolValue.getDefaultInstance()
            : enableCertificates_;
      }
    }
    /**
     *
     *
     * <pre>
     * enable_certificates controls issuance of workload mTLS certificates.
     * If set, the GKE Workload Identity Certificates controller and node agent
     * will be deployed in the cluster, which can then be configured by creating a
     * WorkloadCertificateConfig Custom Resource.
     * Requires Workload Identity
     * ([workload_pool][google.container.v1.WorkloadIdentityConfig.workload_pool]
     * must be non-empty).
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        getEnableCertificatesFieldBuilder() {
      if (enableCertificatesBuilder_ == null) {
        enableCertificatesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.BoolValue,
                com.google.protobuf.BoolValue.Builder,
                com.google.protobuf.BoolValueOrBuilder>(
                getEnableCertificates(), getParentForChildren(), isClean());
        enableCertificates_ = null;
      }
      return enableCertificatesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.MeshCertificates)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.MeshCertificates)
  private static final com.google.container.v1.MeshCertificates DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.MeshCertificates();
  }

  public static com.google.container.v1.MeshCertificates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MeshCertificates> PARSER =
      new com.google.protobuf.AbstractParser<MeshCertificates>() {
        @java.lang.Override
        public MeshCertificates parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MeshCertificates(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MeshCertificates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MeshCertificates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.MeshCertificates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
