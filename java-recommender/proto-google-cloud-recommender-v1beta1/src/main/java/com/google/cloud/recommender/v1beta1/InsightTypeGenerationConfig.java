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
// source: google/cloud/recommender/v1beta1/insight_type_config.proto

package com.google.cloud.recommender.v1beta1;

/**
 *
 *
 * <pre>
 * A configuration to customize the generation of insights.
 * Eg, customizing the lookback period considered when generating a
 * insight.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.InsightTypeGenerationConfig}
 */
public final class InsightTypeGenerationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.InsightTypeGenerationConfig)
    InsightTypeGenerationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InsightTypeGenerationConfig.newBuilder() to construct.
  private InsightTypeGenerationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InsightTypeGenerationConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InsightTypeGenerationConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1beta1.InsightTypeConfigProto
        .internal_static_google_cloud_recommender_v1beta1_InsightTypeGenerationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.InsightTypeConfigProto
        .internal_static_google_cloud_recommender_v1beta1_InsightTypeGenerationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig.class,
            com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.google.protobuf.Struct params_;
  /**
   *
   *
   * <pre>
   * Parameters for this InsightTypeGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   *
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   *
   *
   * <pre>
   * Parameters for this InsightTypeGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   *
   * @return The params.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getParams() {
    return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
  }
  /**
   *
   *
   * <pre>
   * Parameters for this InsightTypeGenerationConfig. These configs can be used
   * by or are applied to all subtypes.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getParamsOrBuilder() {
    return getParams();
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
    if (params_ != null) {
      output.writeMessage(1, getParams());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getParams());
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
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig other =
        (com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams().equals(other.getParams())) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig parseFrom(
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
      com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig prototype) {
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
   * A configuration to customize the generation of insights.
   * Eg, customizing the lookback period considered when generating a
   * insight.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.InsightTypeGenerationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.InsightTypeGenerationConfig)
      com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.InsightTypeConfigProto
          .internal_static_google_cloud_recommender_v1beta1_InsightTypeGenerationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.InsightTypeConfigProto
          .internal_static_google_cloud_recommender_v1beta1_InsightTypeGenerationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig.class,
              com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (paramsBuilder_ == null) {
        params_ = null;
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.InsightTypeConfigProto
          .internal_static_google_cloud_recommender_v1beta1_InsightTypeGenerationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig
        getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig build() {
      com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig buildPartial() {
      com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig result =
          new com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig(this);
      if (paramsBuilder_ == null) {
        result.params_ = params_;
      } else {
        result.params_ = paramsBuilder_.build();
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
      if (other instanceof com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig other) {
      if (other
          == com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig.getDefaultInstance())
        return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
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
                input.readMessage(getParamsFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
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

    private com.google.protobuf.Struct params_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        paramsBuilder_;
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     *
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return paramsBuilder_ != null || params_ != null;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     *
     * @return The params.
     */
    public com.google.protobuf.Struct getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder setParams(com.google.protobuf.Struct value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
        onChanged();
      } else {
        paramsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder setParams(com.google.protobuf.Struct.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
        onChanged();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder mergeParams(com.google.protobuf.Struct value) {
      if (paramsBuilder_ == null) {
        if (params_ != null) {
          params_ = com.google.protobuf.Struct.newBuilder(params_).mergeFrom(value).buildPartial();
        } else {
          params_ = value;
        }
        onChanged();
      } else {
        paramsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public Builder clearParams() {
      if (paramsBuilder_ == null) {
        params_ = null;
        onChanged();
      } else {
        params_ = null;
        paramsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public com.google.protobuf.Struct.Builder getParamsBuilder() {

      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    public com.google.protobuf.StructOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ? com.google.protobuf.Struct.getDefaultInstance() : params_;
      }
    }
    /**
     *
     *
     * <pre>
     * Parameters for this InsightTypeGenerationConfig. These configs can be used
     * by or are applied to all subtypes.
     * </pre>
     *
     * <code>.google.protobuf.Struct params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getParams(), getParentForChildren(), isClean());
        params_ = null;
      }
      return paramsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.InsightTypeGenerationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.InsightTypeGenerationConfig)
  private static final com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig();
  }

  public static com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InsightTypeGenerationConfig> PARSER =
      new com.google.protobuf.AbstractParser<InsightTypeGenerationConfig>() {
        @java.lang.Override
        public InsightTypeGenerationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<InsightTypeGenerationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InsightTypeGenerationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
