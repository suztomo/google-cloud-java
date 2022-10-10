/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/image.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Basis describes the base image portion (Note) of the DockerImage
 * relationship. Linked occurrences are derived from this or an equivalent image
 * via:
 *   FROM &lt;Basis.resource_url&gt;
 * Or an equivalent reference, e.g., a tag of the resource_url.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.ImageNote}
 */
public final class ImageNote extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.ImageNote)
    ImageNoteOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageNote.newBuilder() to construct.
  private ImageNote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageNote() {
    resourceUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageNote();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Image.internal_static_grafeas_v1_ImageNote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Image.internal_static_grafeas_v1_ImageNote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.ImageNote.class, io.grafeas.v1.ImageNote.Builder.class);
  }

  public static final int RESOURCE_URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceUrl_;
  /**
   *
   *
   * <pre>
   * Required. Immutable. The resource_url for the resource representing the
   * basis of associated occurrence images.
   * </pre>
   *
   * <code>string resource_url = 1;</code>
   *
   * @return The resourceUrl.
   */
  @java.lang.Override
  public java.lang.String getResourceUrl() {
    java.lang.Object ref = resourceUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Immutable. The resource_url for the resource representing the
   * basis of associated occurrence images.
   * </pre>
   *
   * <code>string resource_url = 1;</code>
   *
   * @return The bytes for resourceUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceUrlBytes() {
    java.lang.Object ref = resourceUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FINGERPRINT_FIELD_NUMBER = 2;
  private io.grafeas.v1.Fingerprint fingerprint_;
  /**
   *
   *
   * <pre>
   * Required. Immutable. The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  @java.lang.Override
  public boolean hasFingerprint() {
    return fingerprint_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Immutable. The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
   *
   * @return The fingerprint.
   */
  @java.lang.Override
  public io.grafeas.v1.Fingerprint getFingerprint() {
    return fingerprint_ == null ? io.grafeas.v1.Fingerprint.getDefaultInstance() : fingerprint_;
  }
  /**
   *
   *
   * <pre>
   * Required. Immutable. The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.FingerprintOrBuilder getFingerprintOrBuilder() {
    return getFingerprint();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceUrl_);
    }
    if (fingerprint_ != null) {
      output.writeMessage(2, getFingerprint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceUrl_);
    }
    if (fingerprint_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFingerprint());
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
    if (!(obj instanceof io.grafeas.v1.ImageNote)) {
      return super.equals(obj);
    }
    io.grafeas.v1.ImageNote other = (io.grafeas.v1.ImageNote) obj;

    if (!getResourceUrl().equals(other.getResourceUrl())) return false;
    if (hasFingerprint() != other.hasFingerprint()) return false;
    if (hasFingerprint()) {
      if (!getFingerprint().equals(other.getFingerprint())) return false;
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
    hash = (37 * hash) + RESOURCE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getResourceUrl().hashCode();
    if (hasFingerprint()) {
      hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getFingerprint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.ImageNote parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ImageNote parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ImageNote parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ImageNote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ImageNote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ImageNote parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ImageNote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ImageNote parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ImageNote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ImageNote parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ImageNote parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ImageNote parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.ImageNote prototype) {
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
   * Basis describes the base image portion (Note) of the DockerImage
   * relationship. Linked occurrences are derived from this or an equivalent image
   * via:
   *   FROM &lt;Basis.resource_url&gt;
   * Or an equivalent reference, e.g., a tag of the resource_url.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.ImageNote}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.ImageNote)
      io.grafeas.v1.ImageNoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_ImageNote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_ImageNote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.ImageNote.class, io.grafeas.v1.ImageNote.Builder.class);
    }

    // Construct using io.grafeas.v1.ImageNote.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceUrl_ = "";

      if (fingerprintBuilder_ == null) {
        fingerprint_ = null;
      } else {
        fingerprint_ = null;
        fingerprintBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_ImageNote_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.ImageNote getDefaultInstanceForType() {
      return io.grafeas.v1.ImageNote.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.ImageNote build() {
      io.grafeas.v1.ImageNote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.ImageNote buildPartial() {
      io.grafeas.v1.ImageNote result = new io.grafeas.v1.ImageNote(this);
      result.resourceUrl_ = resourceUrl_;
      if (fingerprintBuilder_ == null) {
        result.fingerprint_ = fingerprint_;
      } else {
        result.fingerprint_ = fingerprintBuilder_.build();
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
      if (other instanceof io.grafeas.v1.ImageNote) {
        return mergeFrom((io.grafeas.v1.ImageNote) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.ImageNote other) {
      if (other == io.grafeas.v1.ImageNote.getDefaultInstance()) return this;
      if (!other.getResourceUrl().isEmpty()) {
        resourceUrl_ = other.resourceUrl_;
        onChanged();
      }
      if (other.hasFingerprint()) {
        mergeFingerprint(other.getFingerprint());
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
                resourceUrl_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getFingerprintFieldBuilder().getBuilder(), extensionRegistry);

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

    private java.lang.Object resourceUrl_ = "";
    /**
     *
     *
     * <pre>
     * Required. Immutable. The resource_url for the resource representing the
     * basis of associated occurrence images.
     * </pre>
     *
     * <code>string resource_url = 1;</code>
     *
     * @return The resourceUrl.
     */
    public java.lang.String getResourceUrl() {
      java.lang.Object ref = resourceUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The resource_url for the resource representing the
     * basis of associated occurrence images.
     * </pre>
     *
     * <code>string resource_url = 1;</code>
     *
     * @return The bytes for resourceUrl.
     */
    public com.google.protobuf.ByteString getResourceUrlBytes() {
      java.lang.Object ref = resourceUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The resource_url for the resource representing the
     * basis of associated occurrence images.
     * </pre>
     *
     * <code>string resource_url = 1;</code>
     *
     * @param value The resourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resourceUrl_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The resource_url for the resource representing the
     * basis of associated occurrence images.
     * </pre>
     *
     * <code>string resource_url = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceUrl() {

      resourceUrl_ = getDefaultInstance().getResourceUrl();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The resource_url for the resource representing the
     * basis of associated occurrence images.
     * </pre>
     *
     * <code>string resource_url = 1;</code>
     *
     * @param value The bytes for resourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resourceUrl_ = value;
      onChanged();
      return this;
    }

    private io.grafeas.v1.Fingerprint fingerprint_;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Fingerprint,
            io.grafeas.v1.Fingerprint.Builder,
            io.grafeas.v1.FingerprintOrBuilder>
        fingerprintBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     *
     * @return Whether the fingerprint field is set.
     */
    public boolean hasFingerprint() {
      return fingerprintBuilder_ != null || fingerprint_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     *
     * @return The fingerprint.
     */
    public io.grafeas.v1.Fingerprint getFingerprint() {
      if (fingerprintBuilder_ == null) {
        return fingerprint_ == null ? io.grafeas.v1.Fingerprint.getDefaultInstance() : fingerprint_;
      } else {
        return fingerprintBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     */
    public Builder setFingerprint(io.grafeas.v1.Fingerprint value) {
      if (fingerprintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fingerprint_ = value;
        onChanged();
      } else {
        fingerprintBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     */
    public Builder setFingerprint(io.grafeas.v1.Fingerprint.Builder builderForValue) {
      if (fingerprintBuilder_ == null) {
        fingerprint_ = builderForValue.build();
        onChanged();
      } else {
        fingerprintBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     */
    public Builder mergeFingerprint(io.grafeas.v1.Fingerprint value) {
      if (fingerprintBuilder_ == null) {
        if (fingerprint_ != null) {
          fingerprint_ =
              io.grafeas.v1.Fingerprint.newBuilder(fingerprint_).mergeFrom(value).buildPartial();
        } else {
          fingerprint_ = value;
        }
        onChanged();
      } else {
        fingerprintBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     */
    public Builder clearFingerprint() {
      if (fingerprintBuilder_ == null) {
        fingerprint_ = null;
        onChanged();
      } else {
        fingerprint_ = null;
        fingerprintBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     */
    public io.grafeas.v1.Fingerprint.Builder getFingerprintBuilder() {

      onChanged();
      return getFingerprintFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     */
    public io.grafeas.v1.FingerprintOrBuilder getFingerprintOrBuilder() {
      if (fingerprintBuilder_ != null) {
        return fingerprintBuilder_.getMessageOrBuilder();
      } else {
        return fingerprint_ == null ? io.grafeas.v1.Fingerprint.getDefaultInstance() : fingerprint_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The fingerprint of the base image.
     * </pre>
     *
     * <code>.grafeas.v1.Fingerprint fingerprint = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Fingerprint,
            io.grafeas.v1.Fingerprint.Builder,
            io.grafeas.v1.FingerprintOrBuilder>
        getFingerprintFieldBuilder() {
      if (fingerprintBuilder_ == null) {
        fingerprintBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1.Fingerprint,
                io.grafeas.v1.Fingerprint.Builder,
                io.grafeas.v1.FingerprintOrBuilder>(
                getFingerprint(), getParentForChildren(), isClean());
        fingerprint_ = null;
      }
      return fingerprintBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.ImageNote)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.ImageNote)
  private static final io.grafeas.v1.ImageNote DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.ImageNote();
  }

  public static io.grafeas.v1.ImageNote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageNote> PARSER =
      new com.google.protobuf.AbstractParser<ImageNote>() {
        @java.lang.Override
        public ImageNote parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageNote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageNote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.ImageNote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
