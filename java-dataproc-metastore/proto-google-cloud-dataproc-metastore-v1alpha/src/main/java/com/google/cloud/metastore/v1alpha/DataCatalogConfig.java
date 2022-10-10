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
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

/**
 *
 *
 * <pre>
 * Specifies how metastore metadata should be integrated with the Data Catalog
 * service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1alpha.DataCatalogConfig}
 */
public final class DataCatalogConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1alpha.DataCatalogConfig)
    DataCatalogConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataCatalogConfig.newBuilder() to construct.
  private DataCatalogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataCatalogConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataCatalogConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto
        .internal_static_google_cloud_metastore_v1alpha_DataCatalogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1alpha.MetastoreProto
        .internal_static_google_cloud_metastore_v1alpha_DataCatalogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1alpha.DataCatalogConfig.class,
            com.google.cloud.metastore.v1alpha.DataCatalogConfig.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 2;
  private boolean enabled_;
  /**
   *
   *
   * <pre>
   * Defines whether the metastore metadata should be synced to Data Catalog.
   * The default value is to disable syncing metastore metadata to Data Catalog.
   * </pre>
   *
   * <code>bool enabled = 2;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
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
    if (enabled_ != false) {
      output.writeBool(2, enabled_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, enabled_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1alpha.DataCatalogConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1alpha.DataCatalogConfig other =
        (com.google.cloud.metastore.v1alpha.DataCatalogConfig) obj;

    if (getEnabled() != other.getEnabled()) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.metastore.v1alpha.DataCatalogConfig prototype) {
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
   * Specifies how metastore metadata should be integrated with the Data Catalog
   * service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1alpha.DataCatalogConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1alpha.DataCatalogConfig)
      com.google.cloud.metastore.v1alpha.DataCatalogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_DataCatalogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_DataCatalogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1alpha.DataCatalogConfig.class,
              com.google.cloud.metastore.v1alpha.DataCatalogConfig.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1alpha.DataCatalogConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1alpha.MetastoreProto
          .internal_static_google_cloud_metastore_v1alpha_DataCatalogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.DataCatalogConfig getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1alpha.DataCatalogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.DataCatalogConfig build() {
      com.google.cloud.metastore.v1alpha.DataCatalogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1alpha.DataCatalogConfig buildPartial() {
      com.google.cloud.metastore.v1alpha.DataCatalogConfig result =
          new com.google.cloud.metastore.v1alpha.DataCatalogConfig(this);
      result.enabled_ = enabled_;
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
      if (other instanceof com.google.cloud.metastore.v1alpha.DataCatalogConfig) {
        return mergeFrom((com.google.cloud.metastore.v1alpha.DataCatalogConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1alpha.DataCatalogConfig other) {
      if (other == com.google.cloud.metastore.v1alpha.DataCatalogConfig.getDefaultInstance())
        return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
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
            case 16:
              {
                enabled_ = input.readBool();

                break;
              } // case 16
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

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * Defines whether the metastore metadata should be synced to Data Catalog.
     * The default value is to disable syncing metastore metadata to Data Catalog.
     * </pre>
     *
     * <code>bool enabled = 2;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the metastore metadata should be synced to Data Catalog.
     * The default value is to disable syncing metastore metadata to Data Catalog.
     * </pre>
     *
     * <code>bool enabled = 2;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the metastore metadata should be synced to Data Catalog.
     * The default value is to disable syncing metastore metadata to Data Catalog.
     * </pre>
     *
     * <code>bool enabled = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {

      enabled_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1alpha.DataCatalogConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1alpha.DataCatalogConfig)
  private static final com.google.cloud.metastore.v1alpha.DataCatalogConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1alpha.DataCatalogConfig();
  }

  public static com.google.cloud.metastore.v1alpha.DataCatalogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataCatalogConfig> PARSER =
      new com.google.protobuf.AbstractParser<DataCatalogConfig>() {
        @java.lang.Override
        public DataCatalogConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataCatalogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataCatalogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1alpha.DataCatalogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
