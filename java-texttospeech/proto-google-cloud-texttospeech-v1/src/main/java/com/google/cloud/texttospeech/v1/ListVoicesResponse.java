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
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

/**
 *
 *
 * <pre>
 * The message returned to the client by the `ListVoices` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1.ListVoicesResponse}
 */
public final class ListVoicesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1.ListVoicesResponse)
    ListVoicesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListVoicesResponse.newBuilder() to construct.
  private ListVoicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListVoicesResponse() {
    voices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListVoicesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.texttospeech.v1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1.TextToSpeechProto
        .internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1.ListVoicesResponse.class,
            com.google.cloud.texttospeech.v1.ListVoicesResponse.Builder.class);
  }

  public static final int VOICES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.texttospeech.v1.Voice> voices_;
  /**
   *
   *
   * <pre>
   * The list of voices.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.texttospeech.v1.Voice> getVoicesList() {
    return voices_;
  }
  /**
   *
   *
   * <pre>
   * The list of voices.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.texttospeech.v1.VoiceOrBuilder>
      getVoicesOrBuilderList() {
    return voices_;
  }
  /**
   *
   *
   * <pre>
   * The list of voices.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
   */
  @java.lang.Override
  public int getVoicesCount() {
    return voices_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of voices.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.texttospeech.v1.Voice getVoices(int index) {
    return voices_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of voices.
   * </pre>
   *
   * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.texttospeech.v1.VoiceOrBuilder getVoicesOrBuilder(int index) {
    return voices_.get(index);
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
    for (int i = 0; i < voices_.size(); i++) {
      output.writeMessage(1, voices_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < voices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, voices_.get(i));
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1.ListVoicesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1.ListVoicesResponse other =
        (com.google.cloud.texttospeech.v1.ListVoicesResponse) obj;

    if (!getVoicesList().equals(other.getVoicesList())) return false;
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
    if (getVoicesCount() > 0) {
      hash = (37 * hash) + VOICES_FIELD_NUMBER;
      hash = (53 * hash) + getVoicesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.texttospeech.v1.ListVoicesResponse prototype) {
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
   * The message returned to the client by the `ListVoices` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1.ListVoicesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1.ListVoicesResponse)
      com.google.cloud.texttospeech.v1.ListVoicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1.ListVoicesResponse.class,
              com.google.cloud.texttospeech.v1.ListVoicesResponse.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1.ListVoicesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (voicesBuilder_ == null) {
        voices_ = java.util.Collections.emptyList();
      } else {
        voices_ = null;
        voicesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto
          .internal_static_google_cloud_texttospeech_v1_ListVoicesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.ListVoicesResponse getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1.ListVoicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.ListVoicesResponse build() {
      com.google.cloud.texttospeech.v1.ListVoicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1.ListVoicesResponse buildPartial() {
      com.google.cloud.texttospeech.v1.ListVoicesResponse result =
          new com.google.cloud.texttospeech.v1.ListVoicesResponse(this);
      int from_bitField0_ = bitField0_;
      if (voicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          voices_ = java.util.Collections.unmodifiableList(voices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.voices_ = voices_;
      } else {
        result.voices_ = voicesBuilder_.build();
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
      if (other instanceof com.google.cloud.texttospeech.v1.ListVoicesResponse) {
        return mergeFrom((com.google.cloud.texttospeech.v1.ListVoicesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1.ListVoicesResponse other) {
      if (other == com.google.cloud.texttospeech.v1.ListVoicesResponse.getDefaultInstance())
        return this;
      if (voicesBuilder_ == null) {
        if (!other.voices_.isEmpty()) {
          if (voices_.isEmpty()) {
            voices_ = other.voices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVoicesIsMutable();
            voices_.addAll(other.voices_);
          }
          onChanged();
        }
      } else {
        if (!other.voices_.isEmpty()) {
          if (voicesBuilder_.isEmpty()) {
            voicesBuilder_.dispose();
            voicesBuilder_ = null;
            voices_ = other.voices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            voicesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getVoicesFieldBuilder()
                    : null;
          } else {
            voicesBuilder_.addAllMessages(other.voices_);
          }
        }
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
                com.google.cloud.texttospeech.v1.Voice m =
                    input.readMessage(
                        com.google.cloud.texttospeech.v1.Voice.parser(), extensionRegistry);
                if (voicesBuilder_ == null) {
                  ensureVoicesIsMutable();
                  voices_.add(m);
                } else {
                  voicesBuilder_.addMessage(m);
                }
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

    private int bitField0_;

    private java.util.List<com.google.cloud.texttospeech.v1.Voice> voices_ =
        java.util.Collections.emptyList();

    private void ensureVoicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        voices_ = new java.util.ArrayList<com.google.cloud.texttospeech.v1.Voice>(voices_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.texttospeech.v1.Voice,
            com.google.cloud.texttospeech.v1.Voice.Builder,
            com.google.cloud.texttospeech.v1.VoiceOrBuilder>
        voicesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public java.util.List<com.google.cloud.texttospeech.v1.Voice> getVoicesList() {
      if (voicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(voices_);
      } else {
        return voicesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public int getVoicesCount() {
      if (voicesBuilder_ == null) {
        return voices_.size();
      } else {
        return voicesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.Voice getVoices(int index) {
      if (voicesBuilder_ == null) {
        return voices_.get(index);
      } else {
        return voicesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder setVoices(int index, com.google.cloud.texttospeech.v1.Voice value) {
      if (voicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVoicesIsMutable();
        voices_.set(index, value);
        onChanged();
      } else {
        voicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder setVoices(
        int index, com.google.cloud.texttospeech.v1.Voice.Builder builderForValue) {
      if (voicesBuilder_ == null) {
        ensureVoicesIsMutable();
        voices_.set(index, builderForValue.build());
        onChanged();
      } else {
        voicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder addVoices(com.google.cloud.texttospeech.v1.Voice value) {
      if (voicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVoicesIsMutable();
        voices_.add(value);
        onChanged();
      } else {
        voicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder addVoices(int index, com.google.cloud.texttospeech.v1.Voice value) {
      if (voicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVoicesIsMutable();
        voices_.add(index, value);
        onChanged();
      } else {
        voicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder addVoices(com.google.cloud.texttospeech.v1.Voice.Builder builderForValue) {
      if (voicesBuilder_ == null) {
        ensureVoicesIsMutable();
        voices_.add(builderForValue.build());
        onChanged();
      } else {
        voicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder addVoices(
        int index, com.google.cloud.texttospeech.v1.Voice.Builder builderForValue) {
      if (voicesBuilder_ == null) {
        ensureVoicesIsMutable();
        voices_.add(index, builderForValue.build());
        onChanged();
      } else {
        voicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder addAllVoices(
        java.lang.Iterable<? extends com.google.cloud.texttospeech.v1.Voice> values) {
      if (voicesBuilder_ == null) {
        ensureVoicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, voices_);
        onChanged();
      } else {
        voicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder clearVoices() {
      if (voicesBuilder_ == null) {
        voices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        voicesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public Builder removeVoices(int index) {
      if (voicesBuilder_ == null) {
        ensureVoicesIsMutable();
        voices_.remove(index);
        onChanged();
      } else {
        voicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.Voice.Builder getVoicesBuilder(int index) {
      return getVoicesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.VoiceOrBuilder getVoicesOrBuilder(int index) {
      if (voicesBuilder_ == null) {
        return voices_.get(index);
      } else {
        return voicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.texttospeech.v1.VoiceOrBuilder>
        getVoicesOrBuilderList() {
      if (voicesBuilder_ != null) {
        return voicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(voices_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.Voice.Builder addVoicesBuilder() {
      return getVoicesFieldBuilder()
          .addBuilder(com.google.cloud.texttospeech.v1.Voice.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public com.google.cloud.texttospeech.v1.Voice.Builder addVoicesBuilder(int index) {
      return getVoicesFieldBuilder()
          .addBuilder(index, com.google.cloud.texttospeech.v1.Voice.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of voices.
     * </pre>
     *
     * <code>repeated .google.cloud.texttospeech.v1.Voice voices = 1;</code>
     */
    public java.util.List<com.google.cloud.texttospeech.v1.Voice.Builder> getVoicesBuilderList() {
      return getVoicesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.texttospeech.v1.Voice,
            com.google.cloud.texttospeech.v1.Voice.Builder,
            com.google.cloud.texttospeech.v1.VoiceOrBuilder>
        getVoicesFieldBuilder() {
      if (voicesBuilder_ == null) {
        voicesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.texttospeech.v1.Voice,
                com.google.cloud.texttospeech.v1.Voice.Builder,
                com.google.cloud.texttospeech.v1.VoiceOrBuilder>(
                voices_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        voices_ = null;
      }
      return voicesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1.ListVoicesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1.ListVoicesResponse)
  private static final com.google.cloud.texttospeech.v1.ListVoicesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1.ListVoicesResponse();
  }

  public static com.google.cloud.texttospeech.v1.ListVoicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVoicesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListVoicesResponse>() {
        @java.lang.Override
        public ListVoicesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListVoicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVoicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.texttospeech.v1.ListVoicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
