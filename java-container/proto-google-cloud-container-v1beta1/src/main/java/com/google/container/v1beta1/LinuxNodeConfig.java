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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Parameters that can be configured on Linux nodes.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.LinuxNodeConfig}
 */
public final class LinuxNodeConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.LinuxNodeConfig)
    LinuxNodeConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LinuxNodeConfig.newBuilder() to construct.
  private LinuxNodeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LinuxNodeConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LinuxNodeConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LinuxNodeConfig(
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
                sysctls_ =
                    com.google.protobuf.MapField.newMapField(
                        SysctlsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String> sysctls__ =
                  input.readMessage(
                      SysctlsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              sysctls_.getMutableMap().put(sysctls__.getKey(), sysctls__.getValue());
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
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LinuxNodeConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetSysctls();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LinuxNodeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.LinuxNodeConfig.class,
            com.google.container.v1beta1.LinuxNodeConfig.Builder.class);
  }

  public static final int SYSCTLS_FIELD_NUMBER = 1;

  private static final class SysctlsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.container.v1beta1.ClusterServiceProto
                .internal_static_google_container_v1beta1_LinuxNodeConfig_SysctlsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> sysctls_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetSysctls() {
    if (sysctls_ == null) {
      return com.google.protobuf.MapField.emptyMapField(SysctlsDefaultEntryHolder.defaultEntry);
    }
    return sysctls_;
  }

  public int getSysctlsCount() {
    return internalGetSysctls().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public boolean containsSysctls(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetSysctls().getMap().containsKey(key);
  }
  /** Use {@link #getSysctlsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getSysctls() {
    return getSysctlsMap();
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getSysctlsMap() {
    return internalGetSysctls().getMap();
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getSysctlsOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   * The following parameters are supported.
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getSysctlsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetSysctls(), SysctlsDefaultEntryHolder.defaultEntry, 1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetSysctls().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> sysctls__ =
          SysctlsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, sysctls__);
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
    if (!(obj instanceof com.google.container.v1beta1.LinuxNodeConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.LinuxNodeConfig other =
        (com.google.container.v1beta1.LinuxNodeConfig) obj;

    if (!internalGetSysctls().equals(other.internalGetSysctls())) return false;
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
    if (!internalGetSysctls().getMap().isEmpty()) {
      hash = (37 * hash) + SYSCTLS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSysctls().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.LinuxNodeConfig prototype) {
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
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.LinuxNodeConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.LinuxNodeConfig)
      com.google.container.v1beta1.LinuxNodeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LinuxNodeConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetSysctls();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableSysctls();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LinuxNodeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.LinuxNodeConfig.class,
              com.google.container.v1beta1.LinuxNodeConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.LinuxNodeConfig.newBuilder()
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
      internalGetMutableSysctls().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LinuxNodeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LinuxNodeConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.LinuxNodeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.LinuxNodeConfig build() {
      com.google.container.v1beta1.LinuxNodeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LinuxNodeConfig buildPartial() {
      com.google.container.v1beta1.LinuxNodeConfig result =
          new com.google.container.v1beta1.LinuxNodeConfig(this);
      int from_bitField0_ = bitField0_;
      result.sysctls_ = internalGetSysctls();
      result.sysctls_.makeImmutable();
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
      if (other instanceof com.google.container.v1beta1.LinuxNodeConfig) {
        return mergeFrom((com.google.container.v1beta1.LinuxNodeConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.LinuxNodeConfig other) {
      if (other == com.google.container.v1beta1.LinuxNodeConfig.getDefaultInstance()) return this;
      internalGetMutableSysctls().mergeFrom(other.internalGetSysctls());
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
      com.google.container.v1beta1.LinuxNodeConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1beta1.LinuxNodeConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> sysctls_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetSysctls() {
      if (sysctls_ == null) {
        return com.google.protobuf.MapField.emptyMapField(SysctlsDefaultEntryHolder.defaultEntry);
      }
      return sysctls_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableSysctls() {
      onChanged();
      ;
      if (sysctls_ == null) {
        sysctls_ = com.google.protobuf.MapField.newMapField(SysctlsDefaultEntryHolder.defaultEntry);
      }
      if (!sysctls_.isMutable()) {
        sysctls_ = sysctls_.copy();
      }
      return sysctls_;
    }

    public int getSysctlsCount() {
      return internalGetSysctls().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     * The following parameters are supported.
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public boolean containsSysctls(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetSysctls().getMap().containsKey(key);
    }
    /** Use {@link #getSysctlsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getSysctls() {
      return getSysctlsMap();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     * The following parameters are supported.
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getSysctlsMap() {
      return internalGetSysctls().getMap();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     * The following parameters are supported.
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getSysctlsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     * The following parameters are supported.
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getSysctlsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearSysctls() {
      internalGetMutableSysctls().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     * The following parameters are supported.
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    public Builder removeSysctls(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableSysctls().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableSysctls() {
      return internalGetMutableSysctls().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     * The following parameters are supported.
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    public Builder putSysctls(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableSysctls().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     * The following parameters are supported.
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    public Builder putAllSysctls(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableSysctls().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.LinuxNodeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.LinuxNodeConfig)
  private static final com.google.container.v1beta1.LinuxNodeConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.LinuxNodeConfig();
  }

  public static com.google.container.v1beta1.LinuxNodeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinuxNodeConfig> PARSER =
      new com.google.protobuf.AbstractParser<LinuxNodeConfig>() {
        @java.lang.Override
        public LinuxNodeConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LinuxNodeConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LinuxNodeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinuxNodeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.LinuxNodeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
