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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The conversation source, which is a combination of transcript and audio.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.ConversationDataSource}
 */
public final class ConversationDataSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.ConversationDataSource)
    ConversationDataSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConversationDataSource.newBuilder() to construct.
  private ConversationDataSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConversationDataSource() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConversationDataSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ConversationDataSource(
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
              com.google.cloud.contactcenterinsights.v1.GcsSource.Builder subBuilder = null;
              if (sourceCase_ == 1) {
                subBuilder =
                    ((com.google.cloud.contactcenterinsights.v1.GcsSource) source_).toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloud.contactcenterinsights.v1.GcsSource.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.contactcenterinsights.v1.GcsSource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 1;
              break;
            }
          case 26:
            {
              com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder subBuilder = null;
              if (sourceCase_ == 3) {
                subBuilder =
                    ((com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_)
                        .toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloud.contactcenterinsights.v1.DialogflowSource.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 3;
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
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_ConversationDataSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_ConversationDataSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.ConversationDataSource.class,
            com.google.cloud.contactcenterinsights.v1.ConversationDataSource.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_SOURCE(1),
    DIALOGFLOW_SOURCE(3),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_SOURCE;
        case 3:
          return DIALOGFLOW_SOURCE;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A Cloud Storage location specification for the audio and transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return sourceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A Cloud Storage location specification for the audio and transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.GcsSource getGcsSource() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.contactcenterinsights.v1.GcsSource) source_;
    }
    return com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A Cloud Storage location specification for the audio and transcript.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.contactcenterinsights.v1.GcsSource) source_;
    }
    return com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance();
  }

  public static final int DIALOGFLOW_SOURCE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * The source when the conversation comes from Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
   *
   * @return Whether the dialogflowSource field is set.
   */
  @java.lang.Override
  public boolean hasDialogflowSource() {
    return sourceCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * The source when the conversation comes from Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
   *
   * @return The dialogflowSource.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.DialogflowSource getDialogflowSource() {
    if (sourceCase_ == 3) {
      return (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_;
    }
    return com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The source when the conversation comes from Dialogflow.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.DialogflowSourceOrBuilder
      getDialogflowSourceOrBuilder() {
    if (sourceCase_ == 3) {
      return (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_;
    }
    return com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.contactcenterinsights.v1.GcsSource) source_);
    }
    if (sourceCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.contactcenterinsights.v1.GcsSource) source_);
    }
    if (sourceCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.ConversationDataSource)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.ConversationDataSource other =
        (com.google.cloud.contactcenterinsights.v1.ConversationDataSource) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getGcsSource().equals(other.getGcsSource())) return false;
        break;
      case 3:
        if (!getDialogflowSource().equals(other.getDialogflowSource())) return false;
        break;
      case 0:
      default:
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 3:
        hash = (37 * hash) + DIALOGFLOW_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getDialogflowSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.ConversationDataSource prototype) {
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
   * The conversation source, which is a combination of transcript and audio.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.ConversationDataSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.ConversationDataSource)
      com.google.cloud.contactcenterinsights.v1.ConversationDataSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_ConversationDataSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_ConversationDataSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.ConversationDataSource.class,
              com.google.cloud.contactcenterinsights.v1.ConversationDataSource.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.ConversationDataSource.newBuilder()
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
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_ConversationDataSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ConversationDataSource
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.ConversationDataSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ConversationDataSource build() {
      com.google.cloud.contactcenterinsights.v1.ConversationDataSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ConversationDataSource buildPartial() {
      com.google.cloud.contactcenterinsights.v1.ConversationDataSource result =
          new com.google.cloud.contactcenterinsights.v1.ConversationDataSource(this);
      if (sourceCase_ == 1) {
        if (gcsSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = gcsSourceBuilder_.build();
        }
      }
      if (sourceCase_ == 3) {
        if (dialogflowSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = dialogflowSourceBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.ConversationDataSource) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.ConversationDataSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.ConversationDataSource other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.ConversationDataSource.getDefaultInstance())
        return this;
      switch (other.getSourceCase()) {
        case GCS_SOURCE:
          {
            mergeGcsSource(other.getGcsSource());
            break;
          }
        case DIALOGFLOW_SOURCE:
          {
            mergeDialogflowSource(other.getDialogflowSource());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
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
      com.google.cloud.contactcenterinsights.v1.ConversationDataSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.contactcenterinsights.v1.ConversationDataSource)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.GcsSource,
            com.google.cloud.contactcenterinsights.v1.GcsSource.Builder,
            com.google.cloud.contactcenterinsights.v1.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     *
     * @return Whether the gcsSource field is set.
     */
    @java.lang.Override
    public boolean hasGcsSource() {
      return sourceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     *
     * @return The gcsSource.
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.cloud.contactcenterinsights.v1.GcsSource) source_;
        }
        return com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.contactcenterinsights.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(
        com.google.cloud.contactcenterinsights.v1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.contactcenterinsights.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1
            && source_
                != com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance()) {
          source_ =
              com.google.cloud.contactcenterinsights.v1.GcsSource.newBuilder(
                      (com.google.cloud.contactcenterinsights.v1.GcsSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          gcsSourceBuilder_.mergeFrom(value);
        } else {
          gcsSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.GcsSource.Builder getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if ((sourceCase_ == 1) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.cloud.contactcenterinsights.v1.GcsSource) source_;
        }
        return com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Storage location specification for the audio and transcript.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.GcsSource,
            com.google.cloud.contactcenterinsights.v1.GcsSource.Builder,
            com.google.cloud.contactcenterinsights.v1.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance();
        }
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.GcsSource,
                com.google.cloud.contactcenterinsights.v1.GcsSource.Builder,
                com.google.cloud.contactcenterinsights.v1.GcsSourceOrBuilder>(
                (com.google.cloud.contactcenterinsights.v1.GcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();
      ;
      return gcsSourceBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.DialogflowSource,
            com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder,
            com.google.cloud.contactcenterinsights.v1.DialogflowSourceOrBuilder>
        dialogflowSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     *
     * @return Whether the dialogflowSource field is set.
     */
    @java.lang.Override
    public boolean hasDialogflowSource() {
      return sourceCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     *
     * @return The dialogflowSource.
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowSource getDialogflowSource() {
      if (dialogflowSourceBuilder_ == null) {
        if (sourceCase_ == 3) {
          return (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_;
        }
        return com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 3) {
          return dialogflowSourceBuilder_.getMessage();
        }
        return com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     */
    public Builder setDialogflowSource(
        com.google.cloud.contactcenterinsights.v1.DialogflowSource value) {
      if (dialogflowSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        dialogflowSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     */
    public Builder setDialogflowSource(
        com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder builderForValue) {
      if (dialogflowSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        dialogflowSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     */
    public Builder mergeDialogflowSource(
        com.google.cloud.contactcenterinsights.v1.DialogflowSource value) {
      if (dialogflowSourceBuilder_ == null) {
        if (sourceCase_ == 3
            && source_
                != com.google.cloud.contactcenterinsights.v1.DialogflowSource
                    .getDefaultInstance()) {
          source_ =
              com.google.cloud.contactcenterinsights.v1.DialogflowSource.newBuilder(
                      (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 3) {
          dialogflowSourceBuilder_.mergeFrom(value);
        } else {
          dialogflowSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     */
    public Builder clearDialogflowSource() {
      if (dialogflowSourceBuilder_ == null) {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
        }
        dialogflowSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder
        getDialogflowSourceBuilder() {
      return getDialogflowSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowSourceOrBuilder
        getDialogflowSourceOrBuilder() {
      if ((sourceCase_ == 3) && (dialogflowSourceBuilder_ != null)) {
        return dialogflowSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 3) {
          return (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_;
        }
        return com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The source when the conversation comes from Dialogflow.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DialogflowSource dialogflow_source = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.DialogflowSource,
            com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder,
            com.google.cloud.contactcenterinsights.v1.DialogflowSourceOrBuilder>
        getDialogflowSourceFieldBuilder() {
      if (dialogflowSourceBuilder_ == null) {
        if (!(sourceCase_ == 3)) {
          source_ = com.google.cloud.contactcenterinsights.v1.DialogflowSource.getDefaultInstance();
        }
        dialogflowSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.DialogflowSource,
                com.google.cloud.contactcenterinsights.v1.DialogflowSource.Builder,
                com.google.cloud.contactcenterinsights.v1.DialogflowSourceOrBuilder>(
                (com.google.cloud.contactcenterinsights.v1.DialogflowSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 3;
      onChanged();
      ;
      return dialogflowSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.ConversationDataSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.ConversationDataSource)
  private static final com.google.cloud.contactcenterinsights.v1.ConversationDataSource
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.ConversationDataSource();
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationDataSource
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversationDataSource> PARSER =
      new com.google.protobuf.AbstractParser<ConversationDataSource>() {
        @java.lang.Override
        public ConversationDataSource parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ConversationDataSource(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ConversationDataSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversationDataSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ConversationDataSource
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
