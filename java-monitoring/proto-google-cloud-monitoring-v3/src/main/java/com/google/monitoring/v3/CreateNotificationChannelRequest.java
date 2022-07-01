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
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `CreateNotificationChannel` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateNotificationChannelRequest}
 */
public final class CreateNotificationChannelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateNotificationChannelRequest)
    CreateNotificationChannelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateNotificationChannelRequest.newBuilder() to construct.
  private CreateNotificationChannelRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateNotificationChannelRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateNotificationChannelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateNotificationChannelRequest(
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
          case 18:
            {
              com.google.monitoring.v3.NotificationChannel.Builder subBuilder = null;
              if (notificationChannel_ != null) {
                subBuilder = notificationChannel_.toBuilder();
              }
              notificationChannel_ =
                  input.readMessage(
                      com.google.monitoring.v3.NotificationChannel.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(notificationChannel_);
                notificationChannel_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
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
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateNotificationChannelRequest.class,
            com.google.monitoring.v3.CreateNotificationChannelRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * This names the container into which the channel will be
   * written, this does not name the newly created channel. The resulting
   * channel's name will have a normalized version of this field as a prefix,
   * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
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
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * This names the container into which the channel will be
   * written, this does not name the newly created channel. The resulting
   * channel's name will have a normalized version of this field as a prefix,
   * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int NOTIFICATION_CHANNEL_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.NotificationChannel notificationChannel_;
  /**
   *
   *
   * <pre>
   * Required. The definition of the `NotificationChannel` to create.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the notificationChannel field is set.
   */
  @java.lang.Override
  public boolean hasNotificationChannel() {
    return notificationChannel_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The definition of the `NotificationChannel` to create.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The notificationChannel.
   */
  @java.lang.Override
  public com.google.monitoring.v3.NotificationChannel getNotificationChannel() {
    return notificationChannel_ == null
        ? com.google.monitoring.v3.NotificationChannel.getDefaultInstance()
        : notificationChannel_;
  }
  /**
   *
   *
   * <pre>
   * Required. The definition of the `NotificationChannel` to create.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.NotificationChannelOrBuilder getNotificationChannelOrBuilder() {
    return getNotificationChannel();
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
    if (notificationChannel_ != null) {
      output.writeMessage(2, getNotificationChannel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (notificationChannel_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNotificationChannel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof com.google.monitoring.v3.CreateNotificationChannelRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateNotificationChannelRequest other =
        (com.google.monitoring.v3.CreateNotificationChannelRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasNotificationChannel() != other.hasNotificationChannel()) return false;
    if (hasNotificationChannel()) {
      if (!getNotificationChannel().equals(other.getNotificationChannel())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasNotificationChannel()) {
      hash = (37 * hash) + NOTIFICATION_CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getNotificationChannel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest parseFrom(
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
      com.google.monitoring.v3.CreateNotificationChannelRequest prototype) {
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
   * The `CreateNotificationChannel` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateNotificationChannelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateNotificationChannelRequest)
      com.google.monitoring.v3.CreateNotificationChannelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateNotificationChannelRequest.class,
              com.google.monitoring.v3.CreateNotificationChannelRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateNotificationChannelRequest.newBuilder()
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
      name_ = "";

      if (notificationChannelBuilder_ == null) {
        notificationChannel_ = null;
      } else {
        notificationChannel_ = null;
        notificationChannelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateNotificationChannelRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateNotificationChannelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateNotificationChannelRequest build() {
      com.google.monitoring.v3.CreateNotificationChannelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateNotificationChannelRequest buildPartial() {
      com.google.monitoring.v3.CreateNotificationChannelRequest result =
          new com.google.monitoring.v3.CreateNotificationChannelRequest(this);
      result.name_ = name_;
      if (notificationChannelBuilder_ == null) {
        result.notificationChannel_ = notificationChannel_;
      } else {
        result.notificationChannel_ = notificationChannelBuilder_.build();
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
      if (other instanceof com.google.monitoring.v3.CreateNotificationChannelRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateNotificationChannelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateNotificationChannelRequest other) {
      if (other == com.google.monitoring.v3.CreateNotificationChannelRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasNotificationChannel()) {
        mergeNotificationChannel(other.getNotificationChannel());
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
      com.google.monitoring.v3.CreateNotificationChannelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.monitoring.v3.CreateNotificationChannelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * This names the container into which the channel will be
     * written, this does not name the newly created channel. The resulting
     * channel's name will have a normalized version of this field as a prefix,
     * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * This names the container into which the channel will be
     * written, this does not name the newly created channel. The resulting
     * channel's name will have a normalized version of this field as a prefix,
     * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * This names the container into which the channel will be
     * written, this does not name the newly created channel. The resulting
     * channel's name will have a normalized version of this field as a prefix,
     * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * This names the container into which the channel will be
     * written, this does not name the newly created channel. The resulting
     * channel's name will have a normalized version of this field as a prefix,
     * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * This names the container into which the channel will be
     * written, this does not name the newly created channel. The resulting
     * channel's name will have a normalized version of this field as a prefix,
     * but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel.
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private com.google.monitoring.v3.NotificationChannel notificationChannel_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.NotificationChannel,
            com.google.monitoring.v3.NotificationChannel.Builder,
            com.google.monitoring.v3.NotificationChannelOrBuilder>
        notificationChannelBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the notificationChannel field is set.
     */
    public boolean hasNotificationChannel() {
      return notificationChannelBuilder_ != null || notificationChannel_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The notificationChannel.
     */
    public com.google.monitoring.v3.NotificationChannel getNotificationChannel() {
      if (notificationChannelBuilder_ == null) {
        return notificationChannel_ == null
            ? com.google.monitoring.v3.NotificationChannel.getDefaultInstance()
            : notificationChannel_;
      } else {
        return notificationChannelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNotificationChannel(com.google.monitoring.v3.NotificationChannel value) {
      if (notificationChannelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        notificationChannel_ = value;
        onChanged();
      } else {
        notificationChannelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNotificationChannel(
        com.google.monitoring.v3.NotificationChannel.Builder builderForValue) {
      if (notificationChannelBuilder_ == null) {
        notificationChannel_ = builderForValue.build();
        onChanged();
      } else {
        notificationChannelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeNotificationChannel(com.google.monitoring.v3.NotificationChannel value) {
      if (notificationChannelBuilder_ == null) {
        if (notificationChannel_ != null) {
          notificationChannel_ =
              com.google.monitoring.v3.NotificationChannel.newBuilder(notificationChannel_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          notificationChannel_ = value;
        }
        onChanged();
      } else {
        notificationChannelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearNotificationChannel() {
      if (notificationChannelBuilder_ == null) {
        notificationChannel_ = null;
        onChanged();
      } else {
        notificationChannel_ = null;
        notificationChannelBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.v3.NotificationChannel.Builder getNotificationChannelBuilder() {

      onChanged();
      return getNotificationChannelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.v3.NotificationChannelOrBuilder getNotificationChannelOrBuilder() {
      if (notificationChannelBuilder_ != null) {
        return notificationChannelBuilder_.getMessageOrBuilder();
      } else {
        return notificationChannel_ == null
            ? com.google.monitoring.v3.NotificationChannel.getDefaultInstance()
            : notificationChannel_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The definition of the `NotificationChannel` to create.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.NotificationChannel,
            com.google.monitoring.v3.NotificationChannel.Builder,
            com.google.monitoring.v3.NotificationChannelOrBuilder>
        getNotificationChannelFieldBuilder() {
      if (notificationChannelBuilder_ == null) {
        notificationChannelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.NotificationChannel,
                com.google.monitoring.v3.NotificationChannel.Builder,
                com.google.monitoring.v3.NotificationChannelOrBuilder>(
                getNotificationChannel(), getParentForChildren(), isClean());
        notificationChannel_ = null;
      }
      return notificationChannelBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateNotificationChannelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateNotificationChannelRequest)
  private static final com.google.monitoring.v3.CreateNotificationChannelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateNotificationChannelRequest();
  }

  public static com.google.monitoring.v3.CreateNotificationChannelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNotificationChannelRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateNotificationChannelRequest>() {
        @java.lang.Override
        public CreateNotificationChannelRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateNotificationChannelRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateNotificationChannelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNotificationChannelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateNotificationChannelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
