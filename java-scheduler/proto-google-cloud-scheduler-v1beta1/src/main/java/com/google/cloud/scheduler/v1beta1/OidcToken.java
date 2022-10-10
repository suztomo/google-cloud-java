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
// source: google/cloud/scheduler/v1beta1/target.proto

package com.google.cloud.scheduler.v1beta1;

/**
 *
 *
 * <pre>
 * Contains information needed for generating an
 * [OpenID Connect
 * token](https://developers.google.com/identity/protocols/OpenIDConnect).
 * This type of authorization can be used for many scenarios, including
 * calling Cloud Run, or endpoints where you intend to validate the token
 * yourself.
 * </pre>
 *
 * Protobuf type {@code google.cloud.scheduler.v1beta1.OidcToken}
 */
public final class OidcToken extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.scheduler.v1beta1.OidcToken)
    OidcTokenOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OidcToken.newBuilder() to construct.
  private OidcToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OidcToken() {
    serviceAccountEmail_ = "";
    audience_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OidcToken();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.scheduler.v1beta1.TargetProto
        .internal_static_google_cloud_scheduler_v1beta1_OidcToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.scheduler.v1beta1.TargetProto
        .internal_static_google_cloud_scheduler_v1beta1_OidcToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.scheduler.v1beta1.OidcToken.class,
            com.google.cloud.scheduler.v1beta1.OidcToken.Builder.class);
  }

  public static final int SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceAccountEmail_;
  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OIDC token.
   * The service account must be within the same project as the job. The caller
   * must have iam.serviceAccounts.actAs permission for the service account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The serviceAccountEmail.
   */
  @java.lang.Override
  public java.lang.String getServiceAccountEmail() {
    java.lang.Object ref = serviceAccountEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccountEmail_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OIDC token.
   * The service account must be within the same project as the job. The caller
   * must have iam.serviceAccounts.actAs permission for the service account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceAccountEmailBytes() {
    java.lang.Object ref = serviceAccountEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceAccountEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIENCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object audience_;
  /**
   *
   *
   * <pre>
   * Audience to be used when generating OIDC token. If not specified, the URI
   * specified in target will be used.
   * </pre>
   *
   * <code>string audience = 2;</code>
   *
   * @return The audience.
   */
  @java.lang.Override
  public java.lang.String getAudience() {
    java.lang.Object ref = audience_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audience_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Audience to be used when generating OIDC token. If not specified, the URI
   * specified in target will be used.
   * </pre>
   *
   * <code>string audience = 2;</code>
   *
   * @return The bytes for audience.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudienceBytes() {
    java.lang.Object ref = audience_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      audience_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccountEmail_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceAccountEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audience_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audience_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceAccountEmail_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceAccountEmail_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audience_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, audience_);
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
    if (!(obj instanceof com.google.cloud.scheduler.v1beta1.OidcToken)) {
      return super.equals(obj);
    }
    com.google.cloud.scheduler.v1beta1.OidcToken other =
        (com.google.cloud.scheduler.v1beta1.OidcToken) obj;

    if (!getServiceAccountEmail().equals(other.getServiceAccountEmail())) return false;
    if (!getAudience().equals(other.getAudience())) return false;
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
    hash = (37 * hash) + SERVICE_ACCOUNT_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccountEmail().hashCode();
    hash = (37 * hash) + AUDIENCE_FIELD_NUMBER;
    hash = (53 * hash) + getAudience().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken parseFrom(
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

  public static Builder newBuilder(com.google.cloud.scheduler.v1beta1.OidcToken prototype) {
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
   * Contains information needed for generating an
   * [OpenID Connect
   * token](https://developers.google.com/identity/protocols/OpenIDConnect).
   * This type of authorization can be used for many scenarios, including
   * calling Cloud Run, or endpoints where you intend to validate the token
   * yourself.
   * </pre>
   *
   * Protobuf type {@code google.cloud.scheduler.v1beta1.OidcToken}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.scheduler.v1beta1.OidcToken)
      com.google.cloud.scheduler.v1beta1.OidcTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.scheduler.v1beta1.TargetProto
          .internal_static_google_cloud_scheduler_v1beta1_OidcToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.scheduler.v1beta1.TargetProto
          .internal_static_google_cloud_scheduler_v1beta1_OidcToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.scheduler.v1beta1.OidcToken.class,
              com.google.cloud.scheduler.v1beta1.OidcToken.Builder.class);
    }

    // Construct using com.google.cloud.scheduler.v1beta1.OidcToken.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      serviceAccountEmail_ = "";

      audience_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.scheduler.v1beta1.TargetProto
          .internal_static_google_cloud_scheduler_v1beta1_OidcToken_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.OidcToken getDefaultInstanceForType() {
      return com.google.cloud.scheduler.v1beta1.OidcToken.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.OidcToken build() {
      com.google.cloud.scheduler.v1beta1.OidcToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.scheduler.v1beta1.OidcToken buildPartial() {
      com.google.cloud.scheduler.v1beta1.OidcToken result =
          new com.google.cloud.scheduler.v1beta1.OidcToken(this);
      result.serviceAccountEmail_ = serviceAccountEmail_;
      result.audience_ = audience_;
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
      if (other instanceof com.google.cloud.scheduler.v1beta1.OidcToken) {
        return mergeFrom((com.google.cloud.scheduler.v1beta1.OidcToken) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.scheduler.v1beta1.OidcToken other) {
      if (other == com.google.cloud.scheduler.v1beta1.OidcToken.getDefaultInstance()) return this;
      if (!other.getServiceAccountEmail().isEmpty()) {
        serviceAccountEmail_ = other.serviceAccountEmail_;
        onChanged();
      }
      if (!other.getAudience().isEmpty()) {
        audience_ = other.audience_;
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
                serviceAccountEmail_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                audience_ = input.readStringRequireUtf8();

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

    private java.lang.Object serviceAccountEmail_ = "";
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @return The serviceAccountEmail.
     */
    public java.lang.String getServiceAccountEmail() {
      java.lang.Object ref = serviceAccountEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccountEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @return The bytes for serviceAccountEmail.
     */
    public com.google.protobuf.ByteString getServiceAccountEmailBytes() {
      java.lang.Object ref = serviceAccountEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceAccountEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @param value The serviceAccountEmail to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceAccountEmail_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceAccountEmail() {

      serviceAccountEmail_ = getDefaultInstance().getServiceAccountEmail();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
     * to be used for generating OIDC token.
     * The service account must be within the same project as the job. The caller
     * must have iam.serviceAccounts.actAs permission for the service account.
     * </pre>
     *
     * <code>string service_account_email = 1;</code>
     *
     * @param value The bytes for serviceAccountEmail to set.
     * @return This builder for chaining.
     */
    public Builder setServiceAccountEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceAccountEmail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object audience_ = "";
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     *
     * @return The audience.
     */
    public java.lang.String getAudience() {
      java.lang.Object ref = audience_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audience_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     *
     * @return The bytes for audience.
     */
    public com.google.protobuf.ByteString getAudienceBytes() {
      java.lang.Object ref = audience_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        audience_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     *
     * @param value The audience to set.
     * @return This builder for chaining.
     */
    public Builder setAudience(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      audience_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAudience() {

      audience_ = getDefaultInstance().getAudience();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Audience to be used when generating OIDC token. If not specified, the URI
     * specified in target will be used.
     * </pre>
     *
     * <code>string audience = 2;</code>
     *
     * @param value The bytes for audience to set.
     * @return This builder for chaining.
     */
    public Builder setAudienceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      audience_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.scheduler.v1beta1.OidcToken)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.scheduler.v1beta1.OidcToken)
  private static final com.google.cloud.scheduler.v1beta1.OidcToken DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.scheduler.v1beta1.OidcToken();
  }

  public static com.google.cloud.scheduler.v1beta1.OidcToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OidcToken> PARSER =
      new com.google.protobuf.AbstractParser<OidcToken>() {
        @java.lang.Override
        public OidcToken parsePartialFrom(
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

  public static com.google.protobuf.Parser<OidcToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OidcToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.scheduler.v1beta1.OidcToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
