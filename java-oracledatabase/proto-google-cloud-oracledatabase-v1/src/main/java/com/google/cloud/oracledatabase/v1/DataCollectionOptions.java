/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/oracledatabase/v1/vm_cluster.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.oracledatabase.v1;

/**
 *
 *
 * <pre>
 * Data collection options for diagnostics.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oracledatabase.v1.DataCollectionOptions}
 */
public final class DataCollectionOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oracledatabase.v1.DataCollectionOptions)
    DataCollectionOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataCollectionOptions.newBuilder() to construct.
  private DataCollectionOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataCollectionOptions() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataCollectionOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oracledatabase.v1.CloudVmClusterProto
        .internal_static_google_cloud_oracledatabase_v1_DataCollectionOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oracledatabase.v1.CloudVmClusterProto
        .internal_static_google_cloud_oracledatabase_v1_DataCollectionOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oracledatabase.v1.DataCollectionOptions.class,
            com.google.cloud.oracledatabase.v1.DataCollectionOptions.Builder.class);
  }

  public static final int DIAGNOSTICS_EVENTS_ENABLED_FIELD_NUMBER = 1;
  private boolean diagnosticsEventsEnabled_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Indicates whether diagnostic collection is enabled for the VM
   * cluster
   * </pre>
   *
   * <code>bool diagnostics_events_enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The diagnosticsEventsEnabled.
   */
  @java.lang.Override
  public boolean getDiagnosticsEventsEnabled() {
    return diagnosticsEventsEnabled_;
  }

  public static final int HEALTH_MONITORING_ENABLED_FIELD_NUMBER = 2;
  private boolean healthMonitoringEnabled_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Indicates whether health monitoring is enabled for the VM cluster
   * </pre>
   *
   * <code>bool health_monitoring_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The healthMonitoringEnabled.
   */
  @java.lang.Override
  public boolean getHealthMonitoringEnabled() {
    return healthMonitoringEnabled_;
  }

  public static final int INCIDENT_LOGS_ENABLED_FIELD_NUMBER = 3;
  private boolean incidentLogsEnabled_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Indicates whether incident logs and trace collection are enabled
   * for the VM cluster
   * </pre>
   *
   * <code>bool incident_logs_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The incidentLogsEnabled.
   */
  @java.lang.Override
  public boolean getIncidentLogsEnabled() {
    return incidentLogsEnabled_;
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
    if (diagnosticsEventsEnabled_ != false) {
      output.writeBool(1, diagnosticsEventsEnabled_);
    }
    if (healthMonitoringEnabled_ != false) {
      output.writeBool(2, healthMonitoringEnabled_);
    }
    if (incidentLogsEnabled_ != false) {
      output.writeBool(3, incidentLogsEnabled_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (diagnosticsEventsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, diagnosticsEventsEnabled_);
    }
    if (healthMonitoringEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, healthMonitoringEnabled_);
    }
    if (incidentLogsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, incidentLogsEnabled_);
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
    if (!(obj instanceof com.google.cloud.oracledatabase.v1.DataCollectionOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.oracledatabase.v1.DataCollectionOptions other =
        (com.google.cloud.oracledatabase.v1.DataCollectionOptions) obj;

    if (getDiagnosticsEventsEnabled() != other.getDiagnosticsEventsEnabled()) return false;
    if (getHealthMonitoringEnabled() != other.getHealthMonitoringEnabled()) return false;
    if (getIncidentLogsEnabled() != other.getIncidentLogsEnabled()) return false;
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
    hash = (37 * hash) + DIAGNOSTICS_EVENTS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDiagnosticsEventsEnabled());
    hash = (37 * hash) + HEALTH_MONITORING_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHealthMonitoringEnabled());
    hash = (37 * hash) + INCIDENT_LOGS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIncidentLogsEnabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions parseFrom(
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
      com.google.cloud.oracledatabase.v1.DataCollectionOptions prototype) {
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
   * Data collection options for diagnostics.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oracledatabase.v1.DataCollectionOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oracledatabase.v1.DataCollectionOptions)
      com.google.cloud.oracledatabase.v1.DataCollectionOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oracledatabase.v1.CloudVmClusterProto
          .internal_static_google_cloud_oracledatabase_v1_DataCollectionOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oracledatabase.v1.CloudVmClusterProto
          .internal_static_google_cloud_oracledatabase_v1_DataCollectionOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oracledatabase.v1.DataCollectionOptions.class,
              com.google.cloud.oracledatabase.v1.DataCollectionOptions.Builder.class);
    }

    // Construct using com.google.cloud.oracledatabase.v1.DataCollectionOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      diagnosticsEventsEnabled_ = false;
      healthMonitoringEnabled_ = false;
      incidentLogsEnabled_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oracledatabase.v1.CloudVmClusterProto
          .internal_static_google_cloud_oracledatabase_v1_DataCollectionOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.DataCollectionOptions getDefaultInstanceForType() {
      return com.google.cloud.oracledatabase.v1.DataCollectionOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.DataCollectionOptions build() {
      com.google.cloud.oracledatabase.v1.DataCollectionOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.DataCollectionOptions buildPartial() {
      com.google.cloud.oracledatabase.v1.DataCollectionOptions result =
          new com.google.cloud.oracledatabase.v1.DataCollectionOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.oracledatabase.v1.DataCollectionOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.diagnosticsEventsEnabled_ = diagnosticsEventsEnabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.healthMonitoringEnabled_ = healthMonitoringEnabled_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.incidentLogsEnabled_ = incidentLogsEnabled_;
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
      if (other instanceof com.google.cloud.oracledatabase.v1.DataCollectionOptions) {
        return mergeFrom((com.google.cloud.oracledatabase.v1.DataCollectionOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oracledatabase.v1.DataCollectionOptions other) {
      if (other == com.google.cloud.oracledatabase.v1.DataCollectionOptions.getDefaultInstance())
        return this;
      if (other.getDiagnosticsEventsEnabled() != false) {
        setDiagnosticsEventsEnabled(other.getDiagnosticsEventsEnabled());
      }
      if (other.getHealthMonitoringEnabled() != false) {
        setHealthMonitoringEnabled(other.getHealthMonitoringEnabled());
      }
      if (other.getIncidentLogsEnabled() != false) {
        setIncidentLogsEnabled(other.getIncidentLogsEnabled());
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
            case 8:
              {
                diagnosticsEventsEnabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                healthMonitoringEnabled_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                incidentLogsEnabled_ = input.readBool();
                bitField0_ |= 0x00000004;
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

    private int bitField0_;

    private boolean diagnosticsEventsEnabled_;
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether diagnostic collection is enabled for the VM
     * cluster
     * </pre>
     *
     * <code>bool diagnostics_events_enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The diagnosticsEventsEnabled.
     */
    @java.lang.Override
    public boolean getDiagnosticsEventsEnabled() {
      return diagnosticsEventsEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether diagnostic collection is enabled for the VM
     * cluster
     * </pre>
     *
     * <code>bool diagnostics_events_enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The diagnosticsEventsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setDiagnosticsEventsEnabled(boolean value) {

      diagnosticsEventsEnabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether diagnostic collection is enabled for the VM
     * cluster
     * </pre>
     *
     * <code>bool diagnostics_events_enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDiagnosticsEventsEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      diagnosticsEventsEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean healthMonitoringEnabled_;
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether health monitoring is enabled for the VM cluster
     * </pre>
     *
     * <code>bool health_monitoring_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The healthMonitoringEnabled.
     */
    @java.lang.Override
    public boolean getHealthMonitoringEnabled() {
      return healthMonitoringEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether health monitoring is enabled for the VM cluster
     * </pre>
     *
     * <code>bool health_monitoring_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The healthMonitoringEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setHealthMonitoringEnabled(boolean value) {

      healthMonitoringEnabled_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether health monitoring is enabled for the VM cluster
     * </pre>
     *
     * <code>bool health_monitoring_enabled = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHealthMonitoringEnabled() {
      bitField0_ = (bitField0_ & ~0x00000002);
      healthMonitoringEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean incidentLogsEnabled_;
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether incident logs and trace collection are enabled
     * for the VM cluster
     * </pre>
     *
     * <code>bool incident_logs_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The incidentLogsEnabled.
     */
    @java.lang.Override
    public boolean getIncidentLogsEnabled() {
      return incidentLogsEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether incident logs and trace collection are enabled
     * for the VM cluster
     * </pre>
     *
     * <code>bool incident_logs_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The incidentLogsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setIncidentLogsEnabled(boolean value) {

      incidentLogsEnabled_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Indicates whether incident logs and trace collection are enabled
     * for the VM cluster
     * </pre>
     *
     * <code>bool incident_logs_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIncidentLogsEnabled() {
      bitField0_ = (bitField0_ & ~0x00000004);
      incidentLogsEnabled_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oracledatabase.v1.DataCollectionOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oracledatabase.v1.DataCollectionOptions)
  private static final com.google.cloud.oracledatabase.v1.DataCollectionOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.oracledatabase.v1.DataCollectionOptions();
  }

  public static com.google.cloud.oracledatabase.v1.DataCollectionOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataCollectionOptions> PARSER =
      new com.google.protobuf.AbstractParser<DataCollectionOptions>() {
        @java.lang.Override
        public DataCollectionOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataCollectionOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataCollectionOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.DataCollectionOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
