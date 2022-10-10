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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Location of a finding within a row or record.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.RecordLocation}
 */
public final class RecordLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.RecordLocation)
    RecordLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecordLocation.newBuilder() to construct.
  private RecordLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecordLocation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecordLocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_RecordLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_RecordLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.RecordLocation.class,
            com.google.privacy.dlp.v2.RecordLocation.Builder.class);
  }

  public static final int RECORD_KEY_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.RecordKey recordKey_;
  /**
   *
   *
   * <pre>
   * Key of the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
   *
   * @return Whether the recordKey field is set.
   */
  @java.lang.Override
  public boolean hasRecordKey() {
    return recordKey_ != null;
  }
  /**
   *
   *
   * <pre>
   * Key of the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
   *
   * @return The recordKey.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordKey getRecordKey() {
    return recordKey_ == null
        ? com.google.privacy.dlp.v2.RecordKey.getDefaultInstance()
        : recordKey_;
  }
  /**
   *
   *
   * <pre>
   * Key of the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordKeyOrBuilder getRecordKeyOrBuilder() {
    return getRecordKey();
  }

  public static final int FIELD_ID_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.FieldId fieldId_;
  /**
   *
   *
   * <pre>
   * Field id of the field containing the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
   *
   * @return Whether the fieldId field is set.
   */
  @java.lang.Override
  public boolean hasFieldId() {
    return fieldId_ != null;
  }
  /**
   *
   *
   * <pre>
   * Field id of the field containing the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
   *
   * @return The fieldId.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.FieldId getFieldId() {
    return fieldId_ == null ? com.google.privacy.dlp.v2.FieldId.getDefaultInstance() : fieldId_;
  }
  /**
   *
   *
   * <pre>
   * Field id of the field containing the finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldIdOrBuilder() {
    return getFieldId();
  }

  public static final int TABLE_LOCATION_FIELD_NUMBER = 3;
  private com.google.privacy.dlp.v2.TableLocation tableLocation_;
  /**
   *
   *
   * <pre>
   * Location within a `ContentItem.Table`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
   *
   * @return Whether the tableLocation field is set.
   */
  @java.lang.Override
  public boolean hasTableLocation() {
    return tableLocation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Location within a `ContentItem.Table`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
   *
   * @return The tableLocation.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.TableLocation getTableLocation() {
    return tableLocation_ == null
        ? com.google.privacy.dlp.v2.TableLocation.getDefaultInstance()
        : tableLocation_;
  }
  /**
   *
   *
   * <pre>
   * Location within a `ContentItem.Table`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.TableLocationOrBuilder getTableLocationOrBuilder() {
    return getTableLocation();
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
    if (recordKey_ != null) {
      output.writeMessage(1, getRecordKey());
    }
    if (fieldId_ != null) {
      output.writeMessage(2, getFieldId());
    }
    if (tableLocation_ != null) {
      output.writeMessage(3, getTableLocation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordKey_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRecordKey());
    }
    if (fieldId_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFieldId());
    }
    if (tableLocation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTableLocation());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.RecordLocation)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.RecordLocation other = (com.google.privacy.dlp.v2.RecordLocation) obj;

    if (hasRecordKey() != other.hasRecordKey()) return false;
    if (hasRecordKey()) {
      if (!getRecordKey().equals(other.getRecordKey())) return false;
    }
    if (hasFieldId() != other.hasFieldId()) return false;
    if (hasFieldId()) {
      if (!getFieldId().equals(other.getFieldId())) return false;
    }
    if (hasTableLocation() != other.hasTableLocation()) return false;
    if (hasTableLocation()) {
      if (!getTableLocation().equals(other.getTableLocation())) return false;
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
    if (hasRecordKey()) {
      hash = (37 * hash) + RECORD_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getRecordKey().hashCode();
    }
    if (hasFieldId()) {
      hash = (37 * hash) + FIELD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFieldId().hashCode();
    }
    if (hasTableLocation()) {
      hash = (37 * hash) + TABLE_LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getTableLocation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordLocation parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.RecordLocation prototype) {
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
   * Location of a finding within a row or record.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.RecordLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.RecordLocation)
      com.google.privacy.dlp.v2.RecordLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RecordLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RecordLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.RecordLocation.class,
              com.google.privacy.dlp.v2.RecordLocation.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.RecordLocation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (recordKeyBuilder_ == null) {
        recordKey_ = null;
      } else {
        recordKey_ = null;
        recordKeyBuilder_ = null;
      }
      if (fieldIdBuilder_ == null) {
        fieldId_ = null;
      } else {
        fieldId_ = null;
        fieldIdBuilder_ = null;
      }
      if (tableLocationBuilder_ == null) {
        tableLocation_ = null;
      } else {
        tableLocation_ = null;
        tableLocationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_RecordLocation_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordLocation getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.RecordLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordLocation build() {
      com.google.privacy.dlp.v2.RecordLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordLocation buildPartial() {
      com.google.privacy.dlp.v2.RecordLocation result =
          new com.google.privacy.dlp.v2.RecordLocation(this);
      if (recordKeyBuilder_ == null) {
        result.recordKey_ = recordKey_;
      } else {
        result.recordKey_ = recordKeyBuilder_.build();
      }
      if (fieldIdBuilder_ == null) {
        result.fieldId_ = fieldId_;
      } else {
        result.fieldId_ = fieldIdBuilder_.build();
      }
      if (tableLocationBuilder_ == null) {
        result.tableLocation_ = tableLocation_;
      } else {
        result.tableLocation_ = tableLocationBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.RecordLocation) {
        return mergeFrom((com.google.privacy.dlp.v2.RecordLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.RecordLocation other) {
      if (other == com.google.privacy.dlp.v2.RecordLocation.getDefaultInstance()) return this;
      if (other.hasRecordKey()) {
        mergeRecordKey(other.getRecordKey());
      }
      if (other.hasFieldId()) {
        mergeFieldId(other.getFieldId());
      }
      if (other.hasTableLocation()) {
        mergeTableLocation(other.getTableLocation());
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
                input.readMessage(getRecordKeyFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getFieldIdFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 26:
              {
                input.readMessage(getTableLocationFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 26
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

    private com.google.privacy.dlp.v2.RecordKey recordKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.RecordKey,
            com.google.privacy.dlp.v2.RecordKey.Builder,
            com.google.privacy.dlp.v2.RecordKeyOrBuilder>
        recordKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     *
     * @return Whether the recordKey field is set.
     */
    public boolean hasRecordKey() {
      return recordKeyBuilder_ != null || recordKey_ != null;
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     *
     * @return The recordKey.
     */
    public com.google.privacy.dlp.v2.RecordKey getRecordKey() {
      if (recordKeyBuilder_ == null) {
        return recordKey_ == null
            ? com.google.privacy.dlp.v2.RecordKey.getDefaultInstance()
            : recordKey_;
      } else {
        return recordKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     */
    public Builder setRecordKey(com.google.privacy.dlp.v2.RecordKey value) {
      if (recordKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recordKey_ = value;
        onChanged();
      } else {
        recordKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     */
    public Builder setRecordKey(com.google.privacy.dlp.v2.RecordKey.Builder builderForValue) {
      if (recordKeyBuilder_ == null) {
        recordKey_ = builderForValue.build();
        onChanged();
      } else {
        recordKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     */
    public Builder mergeRecordKey(com.google.privacy.dlp.v2.RecordKey value) {
      if (recordKeyBuilder_ == null) {
        if (recordKey_ != null) {
          recordKey_ =
              com.google.privacy.dlp.v2.RecordKey.newBuilder(recordKey_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          recordKey_ = value;
        }
        onChanged();
      } else {
        recordKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     */
    public Builder clearRecordKey() {
      if (recordKeyBuilder_ == null) {
        recordKey_ = null;
        onChanged();
      } else {
        recordKey_ = null;
        recordKeyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     */
    public com.google.privacy.dlp.v2.RecordKey.Builder getRecordKeyBuilder() {

      onChanged();
      return getRecordKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     */
    public com.google.privacy.dlp.v2.RecordKeyOrBuilder getRecordKeyOrBuilder() {
      if (recordKeyBuilder_ != null) {
        return recordKeyBuilder_.getMessageOrBuilder();
      } else {
        return recordKey_ == null
            ? com.google.privacy.dlp.v2.RecordKey.getDefaultInstance()
            : recordKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Key of the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.RecordKey record_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.RecordKey,
            com.google.privacy.dlp.v2.RecordKey.Builder,
            com.google.privacy.dlp.v2.RecordKeyOrBuilder>
        getRecordKeyFieldBuilder() {
      if (recordKeyBuilder_ == null) {
        recordKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.RecordKey,
                com.google.privacy.dlp.v2.RecordKey.Builder,
                com.google.privacy.dlp.v2.RecordKeyOrBuilder>(
                getRecordKey(), getParentForChildren(), isClean());
        recordKey_ = null;
      }
      return recordKeyBuilder_;
    }

    private com.google.privacy.dlp.v2.FieldId fieldId_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.FieldId,
            com.google.privacy.dlp.v2.FieldId.Builder,
            com.google.privacy.dlp.v2.FieldIdOrBuilder>
        fieldIdBuilder_;
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     *
     * @return Whether the fieldId field is set.
     */
    public boolean hasFieldId() {
      return fieldIdBuilder_ != null || fieldId_ != null;
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     *
     * @return The fieldId.
     */
    public com.google.privacy.dlp.v2.FieldId getFieldId() {
      if (fieldIdBuilder_ == null) {
        return fieldId_ == null ? com.google.privacy.dlp.v2.FieldId.getDefaultInstance() : fieldId_;
      } else {
        return fieldIdBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     */
    public Builder setFieldId(com.google.privacy.dlp.v2.FieldId value) {
      if (fieldIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldId_ = value;
        onChanged();
      } else {
        fieldIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     */
    public Builder setFieldId(com.google.privacy.dlp.v2.FieldId.Builder builderForValue) {
      if (fieldIdBuilder_ == null) {
        fieldId_ = builderForValue.build();
        onChanged();
      } else {
        fieldIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     */
    public Builder mergeFieldId(com.google.privacy.dlp.v2.FieldId value) {
      if (fieldIdBuilder_ == null) {
        if (fieldId_ != null) {
          fieldId_ =
              com.google.privacy.dlp.v2.FieldId.newBuilder(fieldId_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          fieldId_ = value;
        }
        onChanged();
      } else {
        fieldIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     */
    public Builder clearFieldId() {
      if (fieldIdBuilder_ == null) {
        fieldId_ = null;
        onChanged();
      } else {
        fieldId_ = null;
        fieldIdBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     */
    public com.google.privacy.dlp.v2.FieldId.Builder getFieldIdBuilder() {

      onChanged();
      return getFieldIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     */
    public com.google.privacy.dlp.v2.FieldIdOrBuilder getFieldIdOrBuilder() {
      if (fieldIdBuilder_ != null) {
        return fieldIdBuilder_.getMessageOrBuilder();
      } else {
        return fieldId_ == null ? com.google.privacy.dlp.v2.FieldId.getDefaultInstance() : fieldId_;
      }
    }
    /**
     *
     *
     * <pre>
     * Field id of the field containing the finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.FieldId field_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.FieldId,
            com.google.privacy.dlp.v2.FieldId.Builder,
            com.google.privacy.dlp.v2.FieldIdOrBuilder>
        getFieldIdFieldBuilder() {
      if (fieldIdBuilder_ == null) {
        fieldIdBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.FieldId,
                com.google.privacy.dlp.v2.FieldId.Builder,
                com.google.privacy.dlp.v2.FieldIdOrBuilder>(
                getFieldId(), getParentForChildren(), isClean());
        fieldId_ = null;
      }
      return fieldIdBuilder_;
    }

    private com.google.privacy.dlp.v2.TableLocation tableLocation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.TableLocation,
            com.google.privacy.dlp.v2.TableLocation.Builder,
            com.google.privacy.dlp.v2.TableLocationOrBuilder>
        tableLocationBuilder_;
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     *
     * @return Whether the tableLocation field is set.
     */
    public boolean hasTableLocation() {
      return tableLocationBuilder_ != null || tableLocation_ != null;
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     *
     * @return The tableLocation.
     */
    public com.google.privacy.dlp.v2.TableLocation getTableLocation() {
      if (tableLocationBuilder_ == null) {
        return tableLocation_ == null
            ? com.google.privacy.dlp.v2.TableLocation.getDefaultInstance()
            : tableLocation_;
      } else {
        return tableLocationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     */
    public Builder setTableLocation(com.google.privacy.dlp.v2.TableLocation value) {
      if (tableLocationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableLocation_ = value;
        onChanged();
      } else {
        tableLocationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     */
    public Builder setTableLocation(
        com.google.privacy.dlp.v2.TableLocation.Builder builderForValue) {
      if (tableLocationBuilder_ == null) {
        tableLocation_ = builderForValue.build();
        onChanged();
      } else {
        tableLocationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     */
    public Builder mergeTableLocation(com.google.privacy.dlp.v2.TableLocation value) {
      if (tableLocationBuilder_ == null) {
        if (tableLocation_ != null) {
          tableLocation_ =
              com.google.privacy.dlp.v2.TableLocation.newBuilder(tableLocation_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          tableLocation_ = value;
        }
        onChanged();
      } else {
        tableLocationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     */
    public Builder clearTableLocation() {
      if (tableLocationBuilder_ == null) {
        tableLocation_ = null;
        onChanged();
      } else {
        tableLocation_ = null;
        tableLocationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     */
    public com.google.privacy.dlp.v2.TableLocation.Builder getTableLocationBuilder() {

      onChanged();
      return getTableLocationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     */
    public com.google.privacy.dlp.v2.TableLocationOrBuilder getTableLocationOrBuilder() {
      if (tableLocationBuilder_ != null) {
        return tableLocationBuilder_.getMessageOrBuilder();
      } else {
        return tableLocation_ == null
            ? com.google.privacy.dlp.v2.TableLocation.getDefaultInstance()
            : tableLocation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Location within a `ContentItem.Table`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.TableLocation table_location = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.TableLocation,
            com.google.privacy.dlp.v2.TableLocation.Builder,
            com.google.privacy.dlp.v2.TableLocationOrBuilder>
        getTableLocationFieldBuilder() {
      if (tableLocationBuilder_ == null) {
        tableLocationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.TableLocation,
                com.google.privacy.dlp.v2.TableLocation.Builder,
                com.google.privacy.dlp.v2.TableLocationOrBuilder>(
                getTableLocation(), getParentForChildren(), isClean());
        tableLocation_ = null;
      }
      return tableLocationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.RecordLocation)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.RecordLocation)
  private static final com.google.privacy.dlp.v2.RecordLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.RecordLocation();
  }

  public static com.google.privacy.dlp.v2.RecordLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordLocation> PARSER =
      new com.google.protobuf.AbstractParser<RecordLocation>() {
        @java.lang.Override
        public RecordLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
