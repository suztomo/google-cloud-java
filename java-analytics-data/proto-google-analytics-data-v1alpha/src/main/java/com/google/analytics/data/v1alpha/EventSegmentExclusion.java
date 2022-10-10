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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * Specifies which events are excluded in this segment.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.EventSegmentExclusion}
 */
public final class EventSegmentExclusion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.EventSegmentExclusion)
    EventSegmentExclusionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventSegmentExclusion.newBuilder() to construct.
  private EventSegmentExclusion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventSegmentExclusion() {
    eventExclusionDuration_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EventSegmentExclusion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_EventSegmentExclusion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_EventSegmentExclusion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.EventSegmentExclusion.class,
            com.google.analytics.data.v1alpha.EventSegmentExclusion.Builder.class);
  }

  public static final int EVENT_EXCLUSION_DURATION_FIELD_NUMBER = 1;
  private int eventExclusionDuration_;
  /**
   *
   *
   * <pre>
   * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
   * Optional. If unspecified, an `eventExclusionDuration` of
   * `EVENT_EXCLUSION_PERMANENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for eventExclusionDuration.
   */
  @java.lang.Override
  public int getEventExclusionDurationValue() {
    return eventExclusionDuration_;
  }
  /**
   *
   *
   * <pre>
   * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
   * Optional. If unspecified, an `eventExclusionDuration` of
   * `EVENT_EXCLUSION_PERMANENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
   * </code>
   *
   * @return The eventExclusionDuration.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventExclusionDuration getEventExclusionDuration() {
    @SuppressWarnings("deprecation")
    com.google.analytics.data.v1alpha.EventExclusionDuration result =
        com.google.analytics.data.v1alpha.EventExclusionDuration.valueOf(eventExclusionDuration_);
    return result == null
        ? com.google.analytics.data.v1alpha.EventExclusionDuration.UNRECOGNIZED
        : result;
  }

  public static final int EVENT_EXCLUSION_CRITERIA_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.EventSegmentCriteria eventExclusionCriteria_;
  /**
   *
   *
   * <pre>
   * If an event meets this condition, the event is excluded from membership
   * in the segment for the `eventExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;</code>
   *
   * @return Whether the eventExclusionCriteria field is set.
   */
  @java.lang.Override
  public boolean hasEventExclusionCriteria() {
    return eventExclusionCriteria_ != null;
  }
  /**
   *
   *
   * <pre>
   * If an event meets this condition, the event is excluded from membership
   * in the segment for the `eventExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;</code>
   *
   * @return The eventExclusionCriteria.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventSegmentCriteria getEventExclusionCriteria() {
    return eventExclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.EventSegmentCriteria.getDefaultInstance()
        : eventExclusionCriteria_;
  }
  /**
   *
   *
   * <pre>
   * If an event meets this condition, the event is excluded from membership
   * in the segment for the `eventExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventSegmentCriteriaOrBuilder
      getEventExclusionCriteriaOrBuilder() {
    return getEventExclusionCriteria();
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
    if (eventExclusionDuration_
        != com.google.analytics.data.v1alpha.EventExclusionDuration
            .EVENT_EXCLUSION_DURATION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, eventExclusionDuration_);
    }
    if (eventExclusionCriteria_ != null) {
      output.writeMessage(2, getEventExclusionCriteria());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventExclusionDuration_
        != com.google.analytics.data.v1alpha.EventExclusionDuration
            .EVENT_EXCLUSION_DURATION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, eventExclusionDuration_);
    }
    if (eventExclusionCriteria_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEventExclusionCriteria());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.EventSegmentExclusion)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.EventSegmentExclusion other =
        (com.google.analytics.data.v1alpha.EventSegmentExclusion) obj;

    if (eventExclusionDuration_ != other.eventExclusionDuration_) return false;
    if (hasEventExclusionCriteria() != other.hasEventExclusionCriteria()) return false;
    if (hasEventExclusionCriteria()) {
      if (!getEventExclusionCriteria().equals(other.getEventExclusionCriteria())) return false;
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
    hash = (37 * hash) + EVENT_EXCLUSION_DURATION_FIELD_NUMBER;
    hash = (53 * hash) + eventExclusionDuration_;
    if (hasEventExclusionCriteria()) {
      hash = (37 * hash) + EVENT_EXCLUSION_CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + getEventExclusionCriteria().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion parseFrom(
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
      com.google.analytics.data.v1alpha.EventSegmentExclusion prototype) {
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
   * Specifies which events are excluded in this segment.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.EventSegmentExclusion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.EventSegmentExclusion)
      com.google.analytics.data.v1alpha.EventSegmentExclusionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_EventSegmentExclusion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_EventSegmentExclusion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.EventSegmentExclusion.class,
              com.google.analytics.data.v1alpha.EventSegmentExclusion.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.EventSegmentExclusion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      eventExclusionDuration_ = 0;

      if (eventExclusionCriteriaBuilder_ == null) {
        eventExclusionCriteria_ = null;
      } else {
        eventExclusionCriteria_ = null;
        eventExclusionCriteriaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_EventSegmentExclusion_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentExclusion getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.EventSegmentExclusion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentExclusion build() {
      com.google.analytics.data.v1alpha.EventSegmentExclusion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentExclusion buildPartial() {
      com.google.analytics.data.v1alpha.EventSegmentExclusion result =
          new com.google.analytics.data.v1alpha.EventSegmentExclusion(this);
      result.eventExclusionDuration_ = eventExclusionDuration_;
      if (eventExclusionCriteriaBuilder_ == null) {
        result.eventExclusionCriteria_ = eventExclusionCriteria_;
      } else {
        result.eventExclusionCriteria_ = eventExclusionCriteriaBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.EventSegmentExclusion) {
        return mergeFrom((com.google.analytics.data.v1alpha.EventSegmentExclusion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.EventSegmentExclusion other) {
      if (other == com.google.analytics.data.v1alpha.EventSegmentExclusion.getDefaultInstance())
        return this;
      if (other.eventExclusionDuration_ != 0) {
        setEventExclusionDurationValue(other.getEventExclusionDurationValue());
      }
      if (other.hasEventExclusionCriteria()) {
        mergeEventExclusionCriteria(other.getEventExclusionCriteria());
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
                eventExclusionDuration_ = input.readEnum();

                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getEventExclusionCriteriaFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
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

    private int eventExclusionDuration_ = 0;
    /**
     *
     *
     * <pre>
     * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
     * Optional. If unspecified, an `eventExclusionDuration` of
     * `EVENT_EXCLUSION_PERMANENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for eventExclusionDuration.
     */
    @java.lang.Override
    public int getEventExclusionDurationValue() {
      return eventExclusionDuration_;
    }
    /**
     *
     *
     * <pre>
     * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
     * Optional. If unspecified, an `eventExclusionDuration` of
     * `EVENT_EXCLUSION_PERMANENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for eventExclusionDuration to set.
     * @return This builder for chaining.
     */
    public Builder setEventExclusionDurationValue(int value) {

      eventExclusionDuration_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
     * Optional. If unspecified, an `eventExclusionDuration` of
     * `EVENT_EXCLUSION_PERMANENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
     * </code>
     *
     * @return The eventExclusionDuration.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventExclusionDuration getEventExclusionDuration() {
      @SuppressWarnings("deprecation")
      com.google.analytics.data.v1alpha.EventExclusionDuration result =
          com.google.analytics.data.v1alpha.EventExclusionDuration.valueOf(eventExclusionDuration_);
      return result == null
          ? com.google.analytics.data.v1alpha.EventExclusionDuration.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
     * Optional. If unspecified, an `eventExclusionDuration` of
     * `EVENT_EXCLUSION_PERMANENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
     * </code>
     *
     * @param value The eventExclusionDuration to set.
     * @return This builder for chaining.
     */
    public Builder setEventExclusionDuration(
        com.google.analytics.data.v1alpha.EventExclusionDuration value) {
      if (value == null) {
        throw new NullPointerException();
      }

      eventExclusionDuration_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
     * Optional. If unspecified, an `eventExclusionDuration` of
     * `EVENT_EXCLUSION_PERMANENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEventExclusionDuration() {

      eventExclusionDuration_ = 0;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.EventSegmentCriteria eventExclusionCriteria_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.EventSegmentCriteria,
            com.google.analytics.data.v1alpha.EventSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.EventSegmentCriteriaOrBuilder>
        eventExclusionCriteriaBuilder_;
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     *
     * @return Whether the eventExclusionCriteria field is set.
     */
    public boolean hasEventExclusionCriteria() {
      return eventExclusionCriteriaBuilder_ != null || eventExclusionCriteria_ != null;
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     *
     * @return The eventExclusionCriteria.
     */
    public com.google.analytics.data.v1alpha.EventSegmentCriteria getEventExclusionCriteria() {
      if (eventExclusionCriteriaBuilder_ == null) {
        return eventExclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.EventSegmentCriteria.getDefaultInstance()
            : eventExclusionCriteria_;
      } else {
        return eventExclusionCriteriaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     */
    public Builder setEventExclusionCriteria(
        com.google.analytics.data.v1alpha.EventSegmentCriteria value) {
      if (eventExclusionCriteriaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eventExclusionCriteria_ = value;
        onChanged();
      } else {
        eventExclusionCriteriaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     */
    public Builder setEventExclusionCriteria(
        com.google.analytics.data.v1alpha.EventSegmentCriteria.Builder builderForValue) {
      if (eventExclusionCriteriaBuilder_ == null) {
        eventExclusionCriteria_ = builderForValue.build();
        onChanged();
      } else {
        eventExclusionCriteriaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     */
    public Builder mergeEventExclusionCriteria(
        com.google.analytics.data.v1alpha.EventSegmentCriteria value) {
      if (eventExclusionCriteriaBuilder_ == null) {
        if (eventExclusionCriteria_ != null) {
          eventExclusionCriteria_ =
              com.google.analytics.data.v1alpha.EventSegmentCriteria.newBuilder(
                      eventExclusionCriteria_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          eventExclusionCriteria_ = value;
        }
        onChanged();
      } else {
        eventExclusionCriteriaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     */
    public Builder clearEventExclusionCriteria() {
      if (eventExclusionCriteriaBuilder_ == null) {
        eventExclusionCriteria_ = null;
        onChanged();
      } else {
        eventExclusionCriteria_ = null;
        eventExclusionCriteriaBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.EventSegmentCriteria.Builder
        getEventExclusionCriteriaBuilder() {

      onChanged();
      return getEventExclusionCriteriaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.EventSegmentCriteriaOrBuilder
        getEventExclusionCriteriaOrBuilder() {
      if (eventExclusionCriteriaBuilder_ != null) {
        return eventExclusionCriteriaBuilder_.getMessageOrBuilder();
      } else {
        return eventExclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.EventSegmentCriteria.getDefaultInstance()
            : eventExclusionCriteria_;
      }
    }
    /**
     *
     *
     * <pre>
     * If an event meets this condition, the event is excluded from membership
     * in the segment for the `eventExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.EventSegmentCriteria,
            com.google.analytics.data.v1alpha.EventSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.EventSegmentCriteriaOrBuilder>
        getEventExclusionCriteriaFieldBuilder() {
      if (eventExclusionCriteriaBuilder_ == null) {
        eventExclusionCriteriaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.EventSegmentCriteria,
                com.google.analytics.data.v1alpha.EventSegmentCriteria.Builder,
                com.google.analytics.data.v1alpha.EventSegmentCriteriaOrBuilder>(
                getEventExclusionCriteria(), getParentForChildren(), isClean());
        eventExclusionCriteria_ = null;
      }
      return eventExclusionCriteriaBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.EventSegmentExclusion)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.EventSegmentExclusion)
  private static final com.google.analytics.data.v1alpha.EventSegmentExclusion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.EventSegmentExclusion();
  }

  public static com.google.analytics.data.v1alpha.EventSegmentExclusion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventSegmentExclusion> PARSER =
      new com.google.protobuf.AbstractParser<EventSegmentExclusion>() {
        @java.lang.Override
        public EventSegmentExclusion parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventSegmentExclusion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventSegmentExclusion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventSegmentExclusion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
