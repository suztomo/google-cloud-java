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
// source: google/cloud/retail/v2beta/catalog_service.proto

package com.google.cloud.retail.v2beta;

/**
 *
 *
 * <pre>
 * Response of the
 * [CatalogService.BatchRemoveCatalogAttributes][google.cloud.retail.v2beta.CatalogService.BatchRemoveCatalogAttributes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse}
 */
public final class BatchRemoveCatalogAttributesResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse)
    BatchRemoveCatalogAttributesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRemoveCatalogAttributesResponse.newBuilder() to construct.
  private BatchRemoveCatalogAttributesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRemoveCatalogAttributesResponse() {
    deletedCatalogAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    resetCatalogAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRemoveCatalogAttributesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2beta.CatalogServiceProto
        .internal_static_google_cloud_retail_v2beta_BatchRemoveCatalogAttributesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2beta.CatalogServiceProto
        .internal_static_google_cloud_retail_v2beta_BatchRemoveCatalogAttributesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse.class,
            com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse.Builder.class);
  }

  public static final int DELETED_CATALOG_ATTRIBUTES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList deletedCatalogAttributes_;
  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only attributes that are not [in
   * use][CatalogAttribute.in_use] by products can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @return A list containing the deletedCatalogAttributes.
   */
  public com.google.protobuf.ProtocolStringList getDeletedCatalogAttributesList() {
    return deletedCatalogAttributes_;
  }
  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only attributes that are not [in
   * use][CatalogAttribute.in_use] by products can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @return The count of deletedCatalogAttributes.
   */
  public int getDeletedCatalogAttributesCount() {
    return deletedCatalogAttributes_.size();
  }
  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only attributes that are not [in
   * use][CatalogAttribute.in_use] by products can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The deletedCatalogAttributes at the given index.
   */
  public java.lang.String getDeletedCatalogAttributes(int index) {
    return deletedCatalogAttributes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Catalog attributes that were deleted. Only attributes that are not [in
   * use][CatalogAttribute.in_use] by products can be deleted.
   * </pre>
   *
   * <code>repeated string deleted_catalog_attributes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the deletedCatalogAttributes at the given index.
   */
  public com.google.protobuf.ByteString getDeletedCatalogAttributesBytes(int index) {
    return deletedCatalogAttributes_.getByteString(index);
  }

  public static final int RESET_CATALOG_ATTRIBUTES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList resetCatalogAttributes_;
  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. Attributes that are [in
   * use][CatalogAttribute.in_use] by products cannot be deleted, however their
   * configuration properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @return A list containing the resetCatalogAttributes.
   */
  public com.google.protobuf.ProtocolStringList getResetCatalogAttributesList() {
    return resetCatalogAttributes_;
  }
  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. Attributes that are [in
   * use][CatalogAttribute.in_use] by products cannot be deleted, however their
   * configuration properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @return The count of resetCatalogAttributes.
   */
  public int getResetCatalogAttributesCount() {
    return resetCatalogAttributes_.size();
  }
  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. Attributes that are [in
   * use][CatalogAttribute.in_use] by products cannot be deleted, however their
   * configuration properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The resetCatalogAttributes at the given index.
   */
  public java.lang.String getResetCatalogAttributes(int index) {
    return resetCatalogAttributes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Catalog attributes that were reset. Attributes that are [in
   * use][CatalogAttribute.in_use] by products cannot be deleted, however their
   * configuration properties will reset to default values upon removal request.
   * </pre>
   *
   * <code>repeated string reset_catalog_attributes = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resetCatalogAttributes at the given index.
   */
  public com.google.protobuf.ByteString getResetCatalogAttributesBytes(int index) {
    return resetCatalogAttributes_.getByteString(index);
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
    for (int i = 0; i < deletedCatalogAttributes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 1, deletedCatalogAttributes_.getRaw(i));
    }
    for (int i = 0; i < resetCatalogAttributes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 2, resetCatalogAttributes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < deletedCatalogAttributes_.size(); i++) {
        dataSize += computeStringSizeNoTag(deletedCatalogAttributes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDeletedCatalogAttributesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < resetCatalogAttributes_.size(); i++) {
        dataSize += computeStringSizeNoTag(resetCatalogAttributes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResetCatalogAttributesList().size();
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
    if (!(obj instanceof com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse other =
        (com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse) obj;

    if (!getDeletedCatalogAttributesList().equals(other.getDeletedCatalogAttributesList()))
      return false;
    if (!getResetCatalogAttributesList().equals(other.getResetCatalogAttributesList()))
      return false;
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
    if (getDeletedCatalogAttributesCount() > 0) {
      hash = (37 * hash) + DELETED_CATALOG_ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getDeletedCatalogAttributesList().hashCode();
    }
    if (getResetCatalogAttributesCount() > 0) {
      hash = (37 * hash) + RESET_CATALOG_ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getResetCatalogAttributesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse parseFrom(
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
      com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse prototype) {
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
   * Response of the
   * [CatalogService.BatchRemoveCatalogAttributes][google.cloud.retail.v2beta.CatalogService.BatchRemoveCatalogAttributes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse)
      com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2beta.CatalogServiceProto
          .internal_static_google_cloud_retail_v2beta_BatchRemoveCatalogAttributesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2beta.CatalogServiceProto
          .internal_static_google_cloud_retail_v2beta_BatchRemoveCatalogAttributesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse.class,
              com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      deletedCatalogAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      resetCatalogAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2beta.CatalogServiceProto
          .internal_static_google_cloud_retail_v2beta_BatchRemoveCatalogAttributesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse build() {
      com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse buildPartial() {
      com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse result =
          new com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        deletedCatalogAttributes_ = deletedCatalogAttributes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.deletedCatalogAttributes_ = deletedCatalogAttributes_;
      if (((bitField0_ & 0x00000002) != 0)) {
        resetCatalogAttributes_ = resetCatalogAttributes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.resetCatalogAttributes_ = resetCatalogAttributes_;
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
      if (other instanceof com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse) {
        return mergeFrom(
            (com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse other) {
      if (other
          == com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
              .getDefaultInstance()) return this;
      if (!other.deletedCatalogAttributes_.isEmpty()) {
        if (deletedCatalogAttributes_.isEmpty()) {
          deletedCatalogAttributes_ = other.deletedCatalogAttributes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDeletedCatalogAttributesIsMutable();
          deletedCatalogAttributes_.addAll(other.deletedCatalogAttributes_);
        }
        onChanged();
      }
      if (!other.resetCatalogAttributes_.isEmpty()) {
        if (resetCatalogAttributes_.isEmpty()) {
          resetCatalogAttributes_ = other.resetCatalogAttributes_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureResetCatalogAttributesIsMutable();
          resetCatalogAttributes_.addAll(other.resetCatalogAttributes_);
        }
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureDeletedCatalogAttributesIsMutable();
                deletedCatalogAttributes_.add(s);
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureResetCatalogAttributesIsMutable();
                resetCatalogAttributes_.add(s);
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

    private int bitField0_;

    private com.google.protobuf.LazyStringList deletedCatalogAttributes_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureDeletedCatalogAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deletedCatalogAttributes_ =
            new com.google.protobuf.LazyStringArrayList(deletedCatalogAttributes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @return A list containing the deletedCatalogAttributes.
     */
    public com.google.protobuf.ProtocolStringList getDeletedCatalogAttributesList() {
      return deletedCatalogAttributes_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @return The count of deletedCatalogAttributes.
     */
    public int getDeletedCatalogAttributesCount() {
      return deletedCatalogAttributes_.size();
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The deletedCatalogAttributes at the given index.
     */
    public java.lang.String getDeletedCatalogAttributes(int index) {
      return deletedCatalogAttributes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the deletedCatalogAttributes at the given index.
     */
    public com.google.protobuf.ByteString getDeletedCatalogAttributesBytes(int index) {
      return deletedCatalogAttributes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The deletedCatalogAttributes to set.
     * @return This builder for chaining.
     */
    public Builder setDeletedCatalogAttributes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDeletedCatalogAttributesIsMutable();
      deletedCatalogAttributes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @param value The deletedCatalogAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addDeletedCatalogAttributes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDeletedCatalogAttributesIsMutable();
      deletedCatalogAttributes_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @param values The deletedCatalogAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addAllDeletedCatalogAttributes(java.lang.Iterable<java.lang.String> values) {
      ensureDeletedCatalogAttributesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, deletedCatalogAttributes_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeletedCatalogAttributes() {
      deletedCatalogAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were deleted. Only attributes that are not [in
     * use][CatalogAttribute.in_use] by products can be deleted.
     * </pre>
     *
     * <code>repeated string deleted_catalog_attributes = 1;</code>
     *
     * @param value The bytes of the deletedCatalogAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addDeletedCatalogAttributesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureDeletedCatalogAttributesIsMutable();
      deletedCatalogAttributes_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList resetCatalogAttributes_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureResetCatalogAttributesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        resetCatalogAttributes_ =
            new com.google.protobuf.LazyStringArrayList(resetCatalogAttributes_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @return A list containing the resetCatalogAttributes.
     */
    public com.google.protobuf.ProtocolStringList getResetCatalogAttributesList() {
      return resetCatalogAttributes_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @return The count of resetCatalogAttributes.
     */
    public int getResetCatalogAttributesCount() {
      return resetCatalogAttributes_.size();
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The resetCatalogAttributes at the given index.
     */
    public java.lang.String getResetCatalogAttributes(int index) {
      return resetCatalogAttributes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the resetCatalogAttributes at the given index.
     */
    public com.google.protobuf.ByteString getResetCatalogAttributesBytes(int index) {
      return resetCatalogAttributes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The resetCatalogAttributes to set.
     * @return This builder for chaining.
     */
    public Builder setResetCatalogAttributes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResetCatalogAttributesIsMutable();
      resetCatalogAttributes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @param value The resetCatalogAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addResetCatalogAttributes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResetCatalogAttributesIsMutable();
      resetCatalogAttributes_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @param values The resetCatalogAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addAllResetCatalogAttributes(java.lang.Iterable<java.lang.String> values) {
      ensureResetCatalogAttributesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resetCatalogAttributes_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResetCatalogAttributes() {
      resetCatalogAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Catalog attributes that were reset. Attributes that are [in
     * use][CatalogAttribute.in_use] by products cannot be deleted, however their
     * configuration properties will reset to default values upon removal request.
     * </pre>
     *
     * <code>repeated string reset_catalog_attributes = 2;</code>
     *
     * @param value The bytes of the resetCatalogAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addResetCatalogAttributesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureResetCatalogAttributesIsMutable();
      resetCatalogAttributes_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse)
  private static final com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse();
  }

  public static com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRemoveCatalogAttributesResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchRemoveCatalogAttributesResponse>() {
        @java.lang.Override
        public BatchRemoveCatalogAttributesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchRemoveCatalogAttributesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRemoveCatalogAttributesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2beta.BatchRemoveCatalogAttributesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
