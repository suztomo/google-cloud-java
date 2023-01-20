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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * NetworkInterface represents a NIC of a VM.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.NetworkInterface}
 */
public final class NetworkInterface extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.NetworkInterface)
    NetworkInterfaceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkInterface.newBuilder() to construct.
  private NetworkInterface(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkInterface() {
    network_ = "";
    subnetwork_ = "";
    internalIp_ = "";
    externalIp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkInterface();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_NetworkInterface_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_NetworkInterface_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.NetworkInterface.class,
            com.google.cloud.vmmigration.v1.NetworkInterface.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object network_ = "";
  /**
   *
   *
   * <pre>
   * The network to connect the NIC to.
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  @java.lang.Override
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The network to connect the NIC to.
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBNETWORK_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subnetwork_ = "";
  /**
   *
   *
   * <pre>
   * The subnetwork to connect the NIC to.
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The subnetwork.
   */
  @java.lang.Override
  public java.lang.String getSubnetwork() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnetwork_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The subnetwork to connect the NIC to.
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The bytes for subnetwork.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubnetworkBytes() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subnetwork_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTERNAL_IP_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object internalIp_ = "";
  /**
   *
   *
   * <pre>
   * The internal IP to define in the NIC.
   * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
   * resource full path.
   * </pre>
   *
   * <code>string internal_ip = 3;</code>
   *
   * @return The internalIp.
   */
  @java.lang.Override
  public java.lang.String getInternalIp() {
    java.lang.Object ref = internalIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      internalIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The internal IP to define in the NIC.
   * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
   * resource full path.
   * </pre>
   *
   * <code>string internal_ip = 3;</code>
   *
   * @return The bytes for internalIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInternalIpBytes() {
    java.lang.Object ref = internalIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      internalIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTERNAL_IP_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object externalIp_ = "";
  /**
   *
   *
   * <pre>
   * The external IP to define in the NIC.
   * </pre>
   *
   * <code>string external_ip = 4;</code>
   *
   * @return The externalIp.
   */
  @java.lang.Override
  public java.lang.String getExternalIp() {
    java.lang.Object ref = externalIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The external IP to define in the NIC.
   * </pre>
   *
   * <code>string external_ip = 4;</code>
   *
   * @return The bytes for externalIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExternalIpBytes() {
    java.lang.Object ref = externalIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      externalIp_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetwork_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subnetwork_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(internalIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, internalIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, externalIp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetwork_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subnetwork_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(internalIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, internalIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, externalIp_);
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.NetworkInterface)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.NetworkInterface other =
        (com.google.cloud.vmmigration.v1.NetworkInterface) obj;

    if (!getNetwork().equals(other.getNetwork())) return false;
    if (!getSubnetwork().equals(other.getSubnetwork())) return false;
    if (!getInternalIp().equals(other.getInternalIp())) return false;
    if (!getExternalIp().equals(other.getExternalIp())) return false;
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
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + SUBNETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getSubnetwork().hashCode();
    hash = (37 * hash) + INTERNAL_IP_FIELD_NUMBER;
    hash = (53 * hash) + getInternalIp().hashCode();
    hash = (37 * hash) + EXTERNAL_IP_FIELD_NUMBER;
    hash = (53 * hash) + getExternalIp().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vmmigration.v1.NetworkInterface prototype) {
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
   * NetworkInterface represents a NIC of a VM.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.NetworkInterface}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.NetworkInterface)
      com.google.cloud.vmmigration.v1.NetworkInterfaceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_NetworkInterface_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_NetworkInterface_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.NetworkInterface.class,
              com.google.cloud.vmmigration.v1.NetworkInterface.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.NetworkInterface.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      network_ = "";
      subnetwork_ = "";
      internalIp_ = "";
      externalIp_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_NetworkInterface_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.NetworkInterface getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.NetworkInterface.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.NetworkInterface build() {
      com.google.cloud.vmmigration.v1.NetworkInterface result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.NetworkInterface buildPartial() {
      com.google.cloud.vmmigration.v1.NetworkInterface result =
          new com.google.cloud.vmmigration.v1.NetworkInterface(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmmigration.v1.NetworkInterface result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.network_ = network_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subnetwork_ = subnetwork_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.internalIp_ = internalIp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.externalIp_ = externalIp_;
      }
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
      if (other instanceof com.google.cloud.vmmigration.v1.NetworkInterface) {
        return mergeFrom((com.google.cloud.vmmigration.v1.NetworkInterface) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.NetworkInterface other) {
      if (other == com.google.cloud.vmmigration.v1.NetworkInterface.getDefaultInstance())
        return this;
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSubnetwork().isEmpty()) {
        subnetwork_ = other.subnetwork_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getInternalIp().isEmpty()) {
        internalIp_ = other.internalIp_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getExternalIp().isEmpty()) {
        externalIp_ = other.externalIp_;
        bitField0_ |= 0x00000008;
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
                network_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                subnetwork_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                internalIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                externalIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object network_ = "";
    /**
     *
     *
     * <pre>
     * The network to connect the NIC to.
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @return The network.
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The network to connect the NIC to.
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @return The bytes for network.
     */
    public com.google.protobuf.ByteString getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The network to connect the NIC to.
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      network_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network to connect the NIC to.
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      network_ = getDefaultInstance().getNetwork();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network to connect the NIC to.
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @param value The bytes for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      network_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object subnetwork_ = "";
    /**
     *
     *
     * <pre>
     * The subnetwork to connect the NIC to.
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     *
     * @return The subnetwork.
     */
    public java.lang.String getSubnetwork() {
      java.lang.Object ref = subnetwork_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnetwork_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The subnetwork to connect the NIC to.
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     *
     * @return The bytes for subnetwork.
     */
    public com.google.protobuf.ByteString getSubnetworkBytes() {
      java.lang.Object ref = subnetwork_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subnetwork_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The subnetwork to connect the NIC to.
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     *
     * @param value The subnetwork to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subnetwork_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The subnetwork to connect the NIC to.
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubnetwork() {
      subnetwork_ = getDefaultInstance().getSubnetwork();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The subnetwork to connect the NIC to.
     * </pre>
     *
     * <code>string subnetwork = 2;</code>
     *
     * @param value The bytes for subnetwork to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subnetwork_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object internalIp_ = "";
    /**
     *
     *
     * <pre>
     * The internal IP to define in the NIC.
     * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
     * resource full path.
     * </pre>
     *
     * <code>string internal_ip = 3;</code>
     *
     * @return The internalIp.
     */
    public java.lang.String getInternalIp() {
      java.lang.Object ref = internalIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        internalIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The internal IP to define in the NIC.
     * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
     * resource full path.
     * </pre>
     *
     * <code>string internal_ip = 3;</code>
     *
     * @return The bytes for internalIp.
     */
    public com.google.protobuf.ByteString getInternalIpBytes() {
      java.lang.Object ref = internalIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        internalIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The internal IP to define in the NIC.
     * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
     * resource full path.
     * </pre>
     *
     * <code>string internal_ip = 3;</code>
     *
     * @param value The internalIp to set.
     * @return This builder for chaining.
     */
    public Builder setInternalIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      internalIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The internal IP to define in the NIC.
     * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
     * resource full path.
     * </pre>
     *
     * <code>string internal_ip = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInternalIp() {
      internalIp_ = getDefaultInstance().getInternalIp();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The internal IP to define in the NIC.
     * The formats accepted are: `ephemeral` &#92; ipv4 address &#92; a named address
     * resource full path.
     * </pre>
     *
     * <code>string internal_ip = 3;</code>
     *
     * @param value The bytes for internalIp to set.
     * @return This builder for chaining.
     */
    public Builder setInternalIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      internalIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object externalIp_ = "";
    /**
     *
     *
     * <pre>
     * The external IP to define in the NIC.
     * </pre>
     *
     * <code>string external_ip = 4;</code>
     *
     * @return The externalIp.
     */
    public java.lang.String getExternalIp() {
      java.lang.Object ref = externalIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The external IP to define in the NIC.
     * </pre>
     *
     * <code>string external_ip = 4;</code>
     *
     * @return The bytes for externalIp.
     */
    public com.google.protobuf.ByteString getExternalIpBytes() {
      java.lang.Object ref = externalIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        externalIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The external IP to define in the NIC.
     * </pre>
     *
     * <code>string external_ip = 4;</code>
     *
     * @param value The externalIp to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      externalIp_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The external IP to define in the NIC.
     * </pre>
     *
     * <code>string external_ip = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExternalIp() {
      externalIp_ = getDefaultInstance().getExternalIp();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The external IP to define in the NIC.
     * </pre>
     *
     * <code>string external_ip = 4;</code>
     *
     * @param value The bytes for externalIp to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      externalIp_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.NetworkInterface)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.NetworkInterface)
  private static final com.google.cloud.vmmigration.v1.NetworkInterface DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.NetworkInterface();
  }

  public static com.google.cloud.vmmigration.v1.NetworkInterface getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkInterface> PARSER =
      new com.google.protobuf.AbstractParser<NetworkInterface>() {
        @java.lang.Override
        public NetworkInterface parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkInterface> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkInterface> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.NetworkInterface getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
