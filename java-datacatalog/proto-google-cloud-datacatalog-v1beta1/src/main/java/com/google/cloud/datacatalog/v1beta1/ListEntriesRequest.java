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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [ListEntries][google.cloud.datacatalog.v1beta1.DataCatalog.ListEntries].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListEntriesRequest}
 */
public final class ListEntriesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.ListEntriesRequest)
    ListEntriesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEntriesRequest.newBuilder() to construct.
  private ListEntriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEntriesRequest() {
    parent_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEntriesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_ListEntriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_ListEntriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.ListEntriesRequest.class,
            com.google.cloud.datacatalog.v1beta1.ListEntriesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The name of the entry group that contains the entries, which can
   * be provided in URL format. Example:
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the entry group that contains the entries, which can
   * be provided in URL format. Example:
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   *
   *
   * <pre>
   * The maximum number of items to return. Default is 10. Max limit is 1000.
   * Throws an invalid argument for `page_size &gt; 1000`.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object pageToken_;
  /**
   *
   *
   * <pre>
   * Token that specifies which page is requested. If empty, the first page is
   * returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token that specifies which page is requested. If empty, the first page is
   * returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_MASK_FIELD_NUMBER = 4;
  private com.google.protobuf.FieldMask readMask_;
  /**
   *
   *
   * <pre>
   * The fields to return for each Entry. If not set or empty, all
   * fields are returned.
   * For example, setting read_mask to contain only one path "name" will cause
   * ListEntries to return a list of Entries with only "name" field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   *
   * @return Whether the readMask field is set.
   */
  @java.lang.Override
  public boolean hasReadMask() {
    return readMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The fields to return for each Entry. If not set or empty, all
   * fields are returned.
   * For example, setting read_mask to contain only one path "name" will cause
   * ListEntries to return a list of Entries with only "name" field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   *
   * @return The readMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getReadMask() {
    return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
  }
  /**
   *
   *
   * <pre>
   * The fields to return for each Entry. If not set or empty, all
   * fields are returned.
   * For example, setting read_mask to contain only one path "name" will cause
   * ListEntries to return a list of Entries with only "name" field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
    return getReadMask();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pageToken_);
    }
    if (readMask_ != null) {
      output.writeMessage(4, getReadMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pageToken_);
    }
    if (readMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getReadMask());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.ListEntriesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.ListEntriesRequest other =
        (com.google.cloud.datacatalog.v1beta1.ListEntriesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
    if (hasReadMask() != other.hasReadMask()) return false;
    if (hasReadMask()) {
      if (!getReadMask().equals(other.getReadMask())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    if (hasReadMask()) {
      hash = (37 * hash) + READ_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getReadMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest parseFrom(
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
      com.google.cloud.datacatalog.v1beta1.ListEntriesRequest prototype) {
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
   * Request message for
   * [ListEntries][google.cloud.datacatalog.v1beta1.DataCatalog.ListEntries].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListEntriesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.ListEntriesRequest)
      com.google.cloud.datacatalog.v1beta1.ListEntriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_ListEntriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_ListEntriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.ListEntriesRequest.class,
              com.google.cloud.datacatalog.v1beta1.ListEntriesRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.ListEntriesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      if (readMaskBuilder_ == null) {
        readMask_ = null;
      } else {
        readMask_ = null;
        readMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_ListEntriesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListEntriesRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.ListEntriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListEntriesRequest build() {
      com.google.cloud.datacatalog.v1beta1.ListEntriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListEntriesRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.ListEntriesRequest result =
          new com.google.cloud.datacatalog.v1beta1.ListEntriesRequest(this);
      result.parent_ = parent_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      if (readMaskBuilder_ == null) {
        result.readMask_ = readMask_;
      } else {
        result.readMask_ = readMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.ListEntriesRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.ListEntriesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.ListEntriesRequest other) {
      if (other == com.google.cloud.datacatalog.v1beta1.ListEntriesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (other.hasReadMask()) {
        mergeReadMask(other.getReadMask());
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
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 16:
              {
                pageSize_ = input.readInt32();

                break;
              } // case 16
            case 26:
              {
                pageToken_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 34:
              {
                input.readMessage(getReadMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 34
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the entry group that contains the entries, which can
     * be provided in URL format. Example:
     * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entry group that contains the entries, which can
     * be provided in URL format. Example:
     * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entry group that contains the entries, which can
     * be provided in URL format. Example:
     * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entry group that contains the entries, which can
     * be provided in URL format. Example:
     * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the entry group that contains the entries, which can
     * be provided in URL format. Example:
     * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * The maximum number of items to return. Default is 10. Max limit is 1000.
     * Throws an invalid argument for `page_size &gt; 1000`.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of items to return. Default is 10. Max limit is 1000.
     * Throws an invalid argument for `page_size &gt; 1000`.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of items to return. Default is 10. Max limit is 1000.
     * Throws an invalid argument for `page_size &gt; 1000`.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {

      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token that specifies which page is requested. If empty, the first page is
     * returned.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token that specifies which page is requested. If empty, the first page is
     * returned.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token that specifies which page is requested. If empty, the first page is
     * returned.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token that specifies which page is requested. If empty, the first page is
     * returned.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {

      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token that specifies which page is requested. If empty, the first page is
     * returned.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      pageToken_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask readMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        readMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     *
     * @return Whether the readMask field is set.
     */
    public boolean hasReadMask() {
      return readMaskBuilder_ != null || readMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     *
     * @return The readMask.
     */
    public com.google.protobuf.FieldMask getReadMask() {
      if (readMaskBuilder_ == null) {
        return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      } else {
        return readMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder setReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readMask_ = value;
        onChanged();
      } else {
        readMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder setReadMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (readMaskBuilder_ == null) {
        readMask_ = builderForValue.build();
        onChanged();
      } else {
        readMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder mergeReadMask(com.google.protobuf.FieldMask value) {
      if (readMaskBuilder_ == null) {
        if (readMask_ != null) {
          readMask_ =
              com.google.protobuf.FieldMask.newBuilder(readMask_).mergeFrom(value).buildPartial();
        } else {
          readMask_ = value;
        }
        onChanged();
      } else {
        readMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public Builder clearReadMask() {
      if (readMaskBuilder_ == null) {
        readMask_ = null;
        onChanged();
      } else {
        readMask_ = null;
        readMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public com.google.protobuf.FieldMask.Builder getReadMaskBuilder() {

      onChanged();
      return getReadMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder() {
      if (readMaskBuilder_ != null) {
        return readMaskBuilder_.getMessageOrBuilder();
      } else {
        return readMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : readMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to return for each Entry. If not set or empty, all
     * fields are returned.
     * For example, setting read_mask to contain only one path "name" will cause
     * ListEntries to return a list of Entries with only "name" field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask read_mask = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getReadMaskFieldBuilder() {
      if (readMaskBuilder_ == null) {
        readMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getReadMask(), getParentForChildren(), isClean());
        readMask_ = null;
      }
      return readMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.ListEntriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.ListEntriesRequest)
  private static final com.google.cloud.datacatalog.v1beta1.ListEntriesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.ListEntriesRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.ListEntriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEntriesRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListEntriesRequest>() {
        @java.lang.Override
        public ListEntriesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListEntriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEntriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.ListEntriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
