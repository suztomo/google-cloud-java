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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The description of differences between original and replayed agent output.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.TestRunDifference}
 */
public final class TestRunDifference extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.TestRunDifference)
    TestRunDifferenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TestRunDifference.newBuilder() to construct.
  private TestRunDifference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TestRunDifference() {
    type_ = 0;
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TestRunDifference();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_TestRunDifference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_TestRunDifference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.class,
            com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * What part of the message replay differs from the test case.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType}
   */
  public enum DiffType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should never be used.
     * </pre>
     *
     * <code>DIFF_TYPE_UNSPECIFIED = 0;</code>
     */
    DIFF_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The intent.
     * </pre>
     *
     * <code>INTENT = 1;</code>
     */
    INTENT(1),
    /**
     *
     *
     * <pre>
     * The page.
     * </pre>
     *
     * <code>PAGE = 2;</code>
     */
    PAGE(2),
    /**
     *
     *
     * <pre>
     * The parameters.
     * </pre>
     *
     * <code>PARAMETERS = 3;</code>
     */
    PARAMETERS(3),
    /**
     *
     *
     * <pre>
     * The message utterance.
     * </pre>
     *
     * <code>UTTERANCE = 4;</code>
     */
    UTTERANCE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should never be used.
     * </pre>
     *
     * <code>DIFF_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int DIFF_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The intent.
     * </pre>
     *
     * <code>INTENT = 1;</code>
     */
    public static final int INTENT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The page.
     * </pre>
     *
     * <code>PAGE = 2;</code>
     */
    public static final int PAGE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The parameters.
     * </pre>
     *
     * <code>PARAMETERS = 3;</code>
     */
    public static final int PARAMETERS_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The message utterance.
     * </pre>
     *
     * <code>UTTERANCE = 4;</code>
     */
    public static final int UTTERANCE_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DiffType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DiffType forNumber(int value) {
      switch (value) {
        case 0:
          return DIFF_TYPE_UNSPECIFIED;
        case 1:
          return INTENT;
        case 2:
          return PAGE;
        case 3:
          return PARAMETERS;
        case 4:
          return UTTERANCE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DiffType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<DiffType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiffType>() {
          public DiffType findValueByNumber(int number) {
            return DiffType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final DiffType[] VALUES = values();

    public static DiffType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DiffType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   *
   *
   * <pre>
   * The type of diff.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * The type of diff.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType result =
        com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType.valueOf(type_);
    return result == null
        ? com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType.UNRECOGNIZED
        : result;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * A description of the diff, showing the actual output vs expected output.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A description of the diff, showing the actual output vs expected output.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
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
    if (type_
        != com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType.DIFF_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType.DIFF_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference other =
        (com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference) obj;

    if (type_ != other.type_) return false;
    if (!getDescription().equals(other.getDescription())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference prototype) {
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
   * The description of differences between original and replayed agent output.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.TestRunDifference}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.TestRunDifference)
      com.google.cloud.dialogflow.cx.v3beta1.TestRunDifferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_TestRunDifference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_TestRunDifference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.class,
              com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_TestRunDifference_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference build() {
      com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference result =
          new com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference(this);
      result.type_ = type_;
      result.description_ = description_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.getDefaultInstance())
        return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
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
            case 8:
              {
                type_ = input.readEnum();

                break;
              } // case 8
            case 18:
              {
                description_ = input.readStringRequireUtf8();

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

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * The type of diff.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The type of diff.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {

      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of diff.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType result =
          com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType.valueOf(type_);
      return result == null
          ? com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of diff.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of diff.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.TestRunDifference.DiffType type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * A description of the diff, showing the actual output vs expected output.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A description of the diff, showing the actual output vs expected output.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A description of the diff, showing the actual output vs expected output.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A description of the diff, showing the actual output vs expected output.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A description of the diff, showing the actual output vs expected output.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.TestRunDifference)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.TestRunDifference)
  private static final com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestRunDifference> PARSER =
      new com.google.protobuf.AbstractParser<TestRunDifference>() {
        @java.lang.Override
        public TestRunDifference parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestRunDifference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestRunDifference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestRunDifference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
