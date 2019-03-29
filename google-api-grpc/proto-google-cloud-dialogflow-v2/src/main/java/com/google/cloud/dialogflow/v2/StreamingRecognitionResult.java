// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Contains a speech recognition result corresponding to a portion of the audio
 * that is currently being processed or an indication that this is the end
 * of the single requested utterance.
 * Example:
 * 1.  transcript: "tube"
 * 2.  transcript: "to be a"
 * 3.  transcript: "to be"
 * 4.  transcript: "to be or not to be"
 *     is_final: true
 * 5.  transcript: " that's"
 * 6.  transcript: " that is"
 * 7.  recognition_event_type: `RECOGNITION_EVENT_END_OF_SINGLE_UTTERANCE`
 * 8.  transcript: " that is the question"
 *     is_final: true
 * Only two of the responses contain final results (#4 and #8 indicated by
 * `is_final: true`). Concatenating these generates the full transcript: "to be
 * or not to be that is the question".
 * In each response we populate:
 * *  for `MESSAGE_TYPE_TRANSCRIPT`: `transcript` and possibly `is_final`.
 * *  for `MESSAGE_TYPE_END_OF_SINGLE_UTTERANCE`: only `event_type`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.StreamingRecognitionResult}
 */
public final class StreamingRecognitionResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.StreamingRecognitionResult)
    StreamingRecognitionResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingRecognitionResult.newBuilder() to construct.
  private StreamingRecognitionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingRecognitionResult() {
    messageType_ = 0;
    transcript_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StreamingRecognitionResult(
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
          case 8:
            {
              int rawValue = input.readEnum();

              messageType_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              transcript_ = s;
              break;
            }
          case 24:
            {
              isFinal_ = input.readBool();
              break;
            }
          case 37:
            {
              confidence_ = input.readFloat();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.StreamingRecognitionResult.class,
            com.google.cloud.dialogflow.v2.StreamingRecognitionResult.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Type of the response message.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType}
   */
  public enum MessageType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not specified. Should never be used.
     * </pre>
     *
     * <code>MESSAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    MESSAGE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Message contains a (possibly partial) transcript.
     * </pre>
     *
     * <code>TRANSCRIPT = 1;</code>
     */
    TRANSCRIPT(1),
    /**
     *
     *
     * <pre>
     * Event indicates that the server has detected the end of the user's speech
     * utterance and expects no additional speech. Therefore, the server will
     * not process additional audio (although it may subsequently return
     * additional results). The client should stop sending additional audio
     * data, half-close the gRPC connection, and wait for any additional results
     * until the server closes the gRPC connection. This message is only sent if
     * `single_utterance` was set to `true`, and is not used otherwise.
     * </pre>
     *
     * <code>END_OF_SINGLE_UTTERANCE = 2;</code>
     */
    END_OF_SINGLE_UTTERANCE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not specified. Should never be used.
     * </pre>
     *
     * <code>MESSAGE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MESSAGE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Message contains a (possibly partial) transcript.
     * </pre>
     *
     * <code>TRANSCRIPT = 1;</code>
     */
    public static final int TRANSCRIPT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Event indicates that the server has detected the end of the user's speech
     * utterance and expects no additional speech. Therefore, the server will
     * not process additional audio (although it may subsequently return
     * additional results). The client should stop sending additional audio
     * data, half-close the gRPC connection, and wait for any additional results
     * until the server closes the gRPC connection. This message is only sent if
     * `single_utterance` was set to `true`, and is not used otherwise.
     * </pre>
     *
     * <code>END_OF_SINGLE_UTTERANCE = 2;</code>
     */
    public static final int END_OF_SINGLE_UTTERANCE_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static MessageType valueOf(int value) {
      return forNumber(value);
    }

    public static MessageType forNumber(int value) {
      switch (value) {
        case 0:
          return MESSAGE_TYPE_UNSPECIFIED;
        case 1:
          return TRANSCRIPT;
        case 2:
          return END_OF_SINGLE_UTTERANCE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<MessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
          public MessageType findValueByNumber(int number) {
            return MessageType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.StreamingRecognitionResult.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final MessageType[] VALUES = values();

    public static MessageType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MessageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType)
  }

  public static final int MESSAGE_TYPE_FIELD_NUMBER = 1;
  private int messageType_;
  /**
   *
   *
   * <pre>
   * Type of the result message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
   * </code>
   */
  public int getMessageTypeValue() {
    return messageType_;
  }
  /**
   *
   *
   * <pre>
   * Type of the result message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
   * </code>
   */
  public com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType getMessageType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType result =
        com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.valueOf(messageType_);
    return result == null
        ? com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.UNRECOGNIZED
        : result;
  }

  public static final int TRANSCRIPT_FIELD_NUMBER = 2;
  private volatile java.lang.Object transcript_;
  /**
   *
   *
   * <pre>
   * Transcript text representing the words that the user spoke.
   * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
   * </pre>
   *
   * <code>string transcript = 2;</code>
   */
  public java.lang.String getTranscript() {
    java.lang.Object ref = transcript_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transcript_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Transcript text representing the words that the user spoke.
   * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
   * </pre>
   *
   * <code>string transcript = 2;</code>
   */
  public com.google.protobuf.ByteString getTranscriptBytes() {
    java.lang.Object ref = transcript_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      transcript_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_FINAL_FIELD_NUMBER = 3;
  private boolean isFinal_;
  /**
   *
   *
   * <pre>
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * If `false`, the `StreamingRecognitionResult` represents an
   * interim result that may change. If `true`, the recognizer will not return
   * any further hypotheses about this piece of the audio. May only be populated
   * for `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
   * </pre>
   *
   * <code>bool is_final = 3;</code>
   */
  public boolean getIsFinal() {
    return isFinal_;
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 4;
  private float confidence_;
  /**
   *
   *
   * <pre>
   * The Speech confidence between 0.0 and 1.0 for the current portion of audio.
   * A higher number indicates an estimated greater likelihood that the
   * recognized words are correct. The default of 0.0 is a sentinel value
   * indicating that confidence was not set.
   * This field is typically only provided if `is_final` is true and you should
   * not rely on it being accurate or even set.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   */
  public float getConfidence() {
    return confidence_;
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
    if (messageType_
        != com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
            .MESSAGE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, messageType_);
    }
    if (!getTranscriptBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, transcript_);
    }
    if (isFinal_ != false) {
      output.writeBool(3, isFinal_);
    }
    if (confidence_ != 0F) {
      output.writeFloat(4, confidence_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageType_
        != com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
            .MESSAGE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, messageType_);
    }
    if (!getTranscriptBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, transcript_);
    }
    if (isFinal_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isFinal_);
    }
    if (confidence_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(4, confidence_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.StreamingRecognitionResult)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.StreamingRecognitionResult other =
        (com.google.cloud.dialogflow.v2.StreamingRecognitionResult) obj;

    if (messageType_ != other.messageType_) return false;
    if (!getTranscript().equals(other.getTranscript())) return false;
    if (getIsFinal() != other.getIsFinal()) return false;
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(other.getConfidence())) return false;
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
    hash = (37 * hash) + MESSAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + messageType_;
    hash = (37 * hash) + TRANSCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getTranscript().hashCode();
    hash = (37 * hash) + IS_FINAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinal());
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult parseFrom(
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
      com.google.cloud.dialogflow.v2.StreamingRecognitionResult prototype) {
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
   * Contains a speech recognition result corresponding to a portion of the audio
   * that is currently being processed or an indication that this is the end
   * of the single requested utterance.
   * Example:
   * 1.  transcript: "tube"
   * 2.  transcript: "to be a"
   * 3.  transcript: "to be"
   * 4.  transcript: "to be or not to be"
   *     is_final: true
   * 5.  transcript: " that's"
   * 6.  transcript: " that is"
   * 7.  recognition_event_type: `RECOGNITION_EVENT_END_OF_SINGLE_UTTERANCE`
   * 8.  transcript: " that is the question"
   *     is_final: true
   * Only two of the responses contain final results (#4 and #8 indicated by
   * `is_final: true`). Concatenating these generates the full transcript: "to be
   * or not to be that is the question".
   * In each response we populate:
   * *  for `MESSAGE_TYPE_TRANSCRIPT`: `transcript` and possibly `is_final`.
   * *  for `MESSAGE_TYPE_END_OF_SINGLE_UTTERANCE`: only `event_type`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.StreamingRecognitionResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.StreamingRecognitionResult)
      com.google.cloud.dialogflow.v2.StreamingRecognitionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.StreamingRecognitionResult.class,
              com.google.cloud.dialogflow.v2.StreamingRecognitionResult.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.StreamingRecognitionResult.newBuilder()
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
      messageType_ = 0;

      transcript_ = "";

      isFinal_ = false;

      confidence_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.StreamingRecognitionResult getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.StreamingRecognitionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.StreamingRecognitionResult build() {
      com.google.cloud.dialogflow.v2.StreamingRecognitionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.StreamingRecognitionResult buildPartial() {
      com.google.cloud.dialogflow.v2.StreamingRecognitionResult result =
          new com.google.cloud.dialogflow.v2.StreamingRecognitionResult(this);
      result.messageType_ = messageType_;
      result.transcript_ = transcript_;
      result.isFinal_ = isFinal_;
      result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.StreamingRecognitionResult) {
        return mergeFrom((com.google.cloud.dialogflow.v2.StreamingRecognitionResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.StreamingRecognitionResult other) {
      if (other == com.google.cloud.dialogflow.v2.StreamingRecognitionResult.getDefaultInstance())
        return this;
      if (other.messageType_ != 0) {
        setMessageTypeValue(other.getMessageTypeValue());
      }
      if (!other.getTranscript().isEmpty()) {
        transcript_ = other.transcript_;
        onChanged();
      }
      if (other.getIsFinal() != false) {
        setIsFinal(other.getIsFinal());
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
      com.google.cloud.dialogflow.v2.StreamingRecognitionResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.StreamingRecognitionResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int messageType_ = 0;
    /**
     *
     *
     * <pre>
     * Type of the result message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
     * </code>
     */
    public int getMessageTypeValue() {
      return messageType_;
    }
    /**
     *
     *
     * <pre>
     * Type of the result message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
     * </code>
     */
    public Builder setMessageTypeValue(int value) {
      messageType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the result message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
     * </code>
     */
    public com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType getMessageType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType result =
          com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.valueOf(
              messageType_);
      return result == null
          ? com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Type of the result message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
     * </code>
     */
    public Builder setMessageType(
        com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      messageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the result message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
     * </code>
     */
    public Builder clearMessageType() {

      messageType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object transcript_ = "";
    /**
     *
     *
     * <pre>
     * Transcript text representing the words that the user spoke.
     * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>string transcript = 2;</code>
     */
    public java.lang.String getTranscript() {
      java.lang.Object ref = transcript_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transcript_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Transcript text representing the words that the user spoke.
     * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>string transcript = 2;</code>
     */
    public com.google.protobuf.ByteString getTranscriptBytes() {
      java.lang.Object ref = transcript_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        transcript_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Transcript text representing the words that the user spoke.
     * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>string transcript = 2;</code>
     */
    public Builder setTranscript(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      transcript_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Transcript text representing the words that the user spoke.
     * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>string transcript = 2;</code>
     */
    public Builder clearTranscript() {

      transcript_ = getDefaultInstance().getTranscript();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Transcript text representing the words that the user spoke.
     * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>string transcript = 2;</code>
     */
    public Builder setTranscriptBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      transcript_ = value;
      onChanged();
      return this;
    }

    private boolean isFinal_;
    /**
     *
     *
     * <pre>
     * The default of 0.0 is a sentinel value indicating `confidence` was not set.
     * If `false`, the `StreamingRecognitionResult` represents an
     * interim result that may change. If `true`, the recognizer will not return
     * any further hypotheses about this piece of the audio. May only be populated
     * for `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>bool is_final = 3;</code>
     */
    public boolean getIsFinal() {
      return isFinal_;
    }
    /**
     *
     *
     * <pre>
     * The default of 0.0 is a sentinel value indicating `confidence` was not set.
     * If `false`, the `StreamingRecognitionResult` represents an
     * interim result that may change. If `true`, the recognizer will not return
     * any further hypotheses about this piece of the audio. May only be populated
     * for `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>bool is_final = 3;</code>
     */
    public Builder setIsFinal(boolean value) {

      isFinal_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The default of 0.0 is a sentinel value indicating `confidence` was not set.
     * If `false`, the `StreamingRecognitionResult` represents an
     * interim result that may change. If `true`, the recognizer will not return
     * any further hypotheses about this piece of the audio. May only be populated
     * for `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
     * </pre>
     *
     * <code>bool is_final = 3;</code>
     */
    public Builder clearIsFinal() {

      isFinal_ = false;
      onChanged();
      return this;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * The Speech confidence between 0.0 and 1.0 for the current portion of audio.
     * A higher number indicates an estimated greater likelihood that the
     * recognized words are correct. The default of 0.0 is a sentinel value
     * indicating that confidence was not set.
     * This field is typically only provided if `is_final` is true and you should
     * not rely on it being accurate or even set.
     * </pre>
     *
     * <code>float confidence = 4;</code>
     */
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * The Speech confidence between 0.0 and 1.0 for the current portion of audio.
     * A higher number indicates an estimated greater likelihood that the
     * recognized words are correct. The default of 0.0 is a sentinel value
     * indicating that confidence was not set.
     * This field is typically only provided if `is_final` is true and you should
     * not rely on it being accurate or even set.
     * </pre>
     *
     * <code>float confidence = 4;</code>
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Speech confidence between 0.0 and 1.0 for the current portion of audio.
     * A higher number indicates an estimated greater likelihood that the
     * recognized words are correct. The default of 0.0 is a sentinel value
     * indicating that confidence was not set.
     * This field is typically only provided if `is_final` is true and you should
     * not rely on it being accurate or even set.
     * </pre>
     *
     * <code>float confidence = 4;</code>
     */
    public Builder clearConfidence() {

      confidence_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.StreamingRecognitionResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.StreamingRecognitionResult)
  private static final com.google.cloud.dialogflow.v2.StreamingRecognitionResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.StreamingRecognitionResult();
  }

  public static com.google.cloud.dialogflow.v2.StreamingRecognitionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingRecognitionResult> PARSER =
      new com.google.protobuf.AbstractParser<StreamingRecognitionResult>() {
        @java.lang.Override
        public StreamingRecognitionResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StreamingRecognitionResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StreamingRecognitionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingRecognitionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.StreamingRecognitionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
