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
// source: google/appengine/v1/app_yaml.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * [Google Cloud Endpoints](https://cloud.google.com/appengine/docs/python/endpoints/)
 * configuration for API handlers.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ApiConfigHandler}
 */
public final class ApiConfigHandler extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ApiConfigHandler)
    ApiConfigHandlerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApiConfigHandler.newBuilder() to construct.
  private ApiConfigHandler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApiConfigHandler() {
    authFailAction_ = 0;
    login_ = 0;
    script_ = "";
    securityLevel_ = 0;
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ApiConfigHandler();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.AppYamlProto
        .internal_static_google_appengine_v1_ApiConfigHandler_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppYamlProto
        .internal_static_google_appengine_v1_ApiConfigHandler_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ApiConfigHandler.class,
            com.google.appengine.v1.ApiConfigHandler.Builder.class);
  }

  public static final int AUTH_FAIL_ACTION_FIELD_NUMBER = 1;
  private int authFailAction_;
  /**
   *
   *
   * <pre>
   * Action to take when users access resources that require
   * authentication. Defaults to `redirect`.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
   *
   * @return The enum numeric value on the wire for authFailAction.
   */
  @java.lang.Override
  public int getAuthFailActionValue() {
    return authFailAction_;
  }
  /**
   *
   *
   * <pre>
   * Action to take when users access resources that require
   * authentication. Defaults to `redirect`.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
   *
   * @return The authFailAction.
   */
  @java.lang.Override
  public com.google.appengine.v1.AuthFailAction getAuthFailAction() {
    @SuppressWarnings("deprecation")
    com.google.appengine.v1.AuthFailAction result =
        com.google.appengine.v1.AuthFailAction.valueOf(authFailAction_);
    return result == null ? com.google.appengine.v1.AuthFailAction.UNRECOGNIZED : result;
  }

  public static final int LOGIN_FIELD_NUMBER = 2;
  private int login_;
  /**
   *
   *
   * <pre>
   * Level of login required to access this resource. Defaults to
   * `optional`.
   * </pre>
   *
   * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
   *
   * @return The enum numeric value on the wire for login.
   */
  @java.lang.Override
  public int getLoginValue() {
    return login_;
  }
  /**
   *
   *
   * <pre>
   * Level of login required to access this resource. Defaults to
   * `optional`.
   * </pre>
   *
   * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
   *
   * @return The login.
   */
  @java.lang.Override
  public com.google.appengine.v1.LoginRequirement getLogin() {
    @SuppressWarnings("deprecation")
    com.google.appengine.v1.LoginRequirement result =
        com.google.appengine.v1.LoginRequirement.valueOf(login_);
    return result == null ? com.google.appengine.v1.LoginRequirement.UNRECOGNIZED : result;
  }

  public static final int SCRIPT_FIELD_NUMBER = 3;
  private volatile java.lang.Object script_;
  /**
   *
   *
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script = 3;</code>
   *
   * @return The script.
   */
  @java.lang.Override
  public java.lang.String getScript() {
    java.lang.Object ref = script_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      script_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script = 3;</code>
   *
   * @return The bytes for script.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScriptBytes() {
    java.lang.Object ref = script_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      script_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITY_LEVEL_FIELD_NUMBER = 4;
  private int securityLevel_;
  /**
   *
   *
   * <pre>
   * Security (HTTPS) enforcement for this URL.
   * </pre>
   *
   * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
   *
   * @return The enum numeric value on the wire for securityLevel.
   */
  @java.lang.Override
  public int getSecurityLevelValue() {
    return securityLevel_;
  }
  /**
   *
   *
   * <pre>
   * Security (HTTPS) enforcement for this URL.
   * </pre>
   *
   * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
   *
   * @return The securityLevel.
   */
  @java.lang.Override
  public com.google.appengine.v1.SecurityLevel getSecurityLevel() {
    @SuppressWarnings("deprecation")
    com.google.appengine.v1.SecurityLevel result =
        com.google.appengine.v1.SecurityLevel.valueOf(securityLevel_);
    return result == null ? com.google.appengine.v1.SecurityLevel.UNRECOGNIZED : result;
  }

  public static final int URL_FIELD_NUMBER = 5;
  private volatile java.lang.Object url_;
  /**
   *
   *
   * <pre>
   * URL to serve the endpoint at.
   * </pre>
   *
   * <code>string url = 5;</code>
   *
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL to serve the endpoint at.
   * </pre>
   *
   * <code>string url = 5;</code>
   *
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      url_ = b;
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
    if (authFailAction_
        != com.google.appengine.v1.AuthFailAction.AUTH_FAIL_ACTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, authFailAction_);
    }
    if (login_ != com.google.appengine.v1.LoginRequirement.LOGIN_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, login_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(script_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, script_);
    }
    if (securityLevel_ != com.google.appengine.v1.SecurityLevel.SECURE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, securityLevel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, url_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authFailAction_
        != com.google.appengine.v1.AuthFailAction.AUTH_FAIL_ACTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, authFailAction_);
    }
    if (login_ != com.google.appengine.v1.LoginRequirement.LOGIN_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, login_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(script_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, script_);
    }
    if (securityLevel_ != com.google.appengine.v1.SecurityLevel.SECURE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, securityLevel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, url_);
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
    if (!(obj instanceof com.google.appengine.v1.ApiConfigHandler)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ApiConfigHandler other = (com.google.appengine.v1.ApiConfigHandler) obj;

    if (authFailAction_ != other.authFailAction_) return false;
    if (login_ != other.login_) return false;
    if (!getScript().equals(other.getScript())) return false;
    if (securityLevel_ != other.securityLevel_) return false;
    if (!getUrl().equals(other.getUrl())) return false;
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
    hash = (37 * hash) + AUTH_FAIL_ACTION_FIELD_NUMBER;
    hash = (53 * hash) + authFailAction_;
    hash = (37 * hash) + LOGIN_FIELD_NUMBER;
    hash = (53 * hash) + login_;
    hash = (37 * hash) + SCRIPT_FIELD_NUMBER;
    hash = (53 * hash) + getScript().hashCode();
    hash = (37 * hash) + SECURITY_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + securityLevel_;
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ApiConfigHandler parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.ApiConfigHandler prototype) {
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
   * [Google Cloud Endpoints](https://cloud.google.com/appengine/docs/python/endpoints/)
   * configuration for API handlers.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ApiConfigHandler}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ApiConfigHandler)
      com.google.appengine.v1.ApiConfigHandlerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.AppYamlProto
          .internal_static_google_appengine_v1_ApiConfigHandler_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppYamlProto
          .internal_static_google_appengine_v1_ApiConfigHandler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ApiConfigHandler.class,
              com.google.appengine.v1.ApiConfigHandler.Builder.class);
    }

    // Construct using com.google.appengine.v1.ApiConfigHandler.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      authFailAction_ = 0;

      login_ = 0;

      script_ = "";

      securityLevel_ = 0;

      url_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.AppYamlProto
          .internal_static_google_appengine_v1_ApiConfigHandler_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.ApiConfigHandler getDefaultInstanceForType() {
      return com.google.appengine.v1.ApiConfigHandler.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.ApiConfigHandler build() {
      com.google.appengine.v1.ApiConfigHandler result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.ApiConfigHandler buildPartial() {
      com.google.appengine.v1.ApiConfigHandler result =
          new com.google.appengine.v1.ApiConfigHandler(this);
      result.authFailAction_ = authFailAction_;
      result.login_ = login_;
      result.script_ = script_;
      result.securityLevel_ = securityLevel_;
      result.url_ = url_;
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
      if (other instanceof com.google.appengine.v1.ApiConfigHandler) {
        return mergeFrom((com.google.appengine.v1.ApiConfigHandler) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ApiConfigHandler other) {
      if (other == com.google.appengine.v1.ApiConfigHandler.getDefaultInstance()) return this;
      if (other.authFailAction_ != 0) {
        setAuthFailActionValue(other.getAuthFailActionValue());
      }
      if (other.login_ != 0) {
        setLoginValue(other.getLoginValue());
      }
      if (!other.getScript().isEmpty()) {
        script_ = other.script_;
        onChanged();
      }
      if (other.securityLevel_ != 0) {
        setSecurityLevelValue(other.getSecurityLevelValue());
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
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
                authFailAction_ = input.readEnum();

                break;
              } // case 8
            case 16:
              {
                login_ = input.readEnum();

                break;
              } // case 16
            case 26:
              {
                script_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 32:
              {
                securityLevel_ = input.readEnum();

                break;
              } // case 32
            case 42:
              {
                url_ = input.readStringRequireUtf8();

                break;
              } // case 42
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

    private int authFailAction_ = 0;
    /**
     *
     *
     * <pre>
     * Action to take when users access resources that require
     * authentication. Defaults to `redirect`.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
     *
     * @return The enum numeric value on the wire for authFailAction.
     */
    @java.lang.Override
    public int getAuthFailActionValue() {
      return authFailAction_;
    }
    /**
     *
     *
     * <pre>
     * Action to take when users access resources that require
     * authentication. Defaults to `redirect`.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
     *
     * @param value The enum numeric value on the wire for authFailAction to set.
     * @return This builder for chaining.
     */
    public Builder setAuthFailActionValue(int value) {

      authFailAction_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action to take when users access resources that require
     * authentication. Defaults to `redirect`.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
     *
     * @return The authFailAction.
     */
    @java.lang.Override
    public com.google.appengine.v1.AuthFailAction getAuthFailAction() {
      @SuppressWarnings("deprecation")
      com.google.appengine.v1.AuthFailAction result =
          com.google.appengine.v1.AuthFailAction.valueOf(authFailAction_);
      return result == null ? com.google.appengine.v1.AuthFailAction.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Action to take when users access resources that require
     * authentication. Defaults to `redirect`.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
     *
     * @param value The authFailAction to set.
     * @return This builder for chaining.
     */
    public Builder setAuthFailAction(com.google.appengine.v1.AuthFailAction value) {
      if (value == null) {
        throw new NullPointerException();
      }

      authFailAction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action to take when users access resources that require
     * authentication. Defaults to `redirect`.
     * </pre>
     *
     * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAuthFailAction() {

      authFailAction_ = 0;
      onChanged();
      return this;
    }

    private int login_ = 0;
    /**
     *
     *
     * <pre>
     * Level of login required to access this resource. Defaults to
     * `optional`.
     * </pre>
     *
     * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
     *
     * @return The enum numeric value on the wire for login.
     */
    @java.lang.Override
    public int getLoginValue() {
      return login_;
    }
    /**
     *
     *
     * <pre>
     * Level of login required to access this resource. Defaults to
     * `optional`.
     * </pre>
     *
     * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
     *
     * @param value The enum numeric value on the wire for login to set.
     * @return This builder for chaining.
     */
    public Builder setLoginValue(int value) {

      login_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Level of login required to access this resource. Defaults to
     * `optional`.
     * </pre>
     *
     * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
     *
     * @return The login.
     */
    @java.lang.Override
    public com.google.appengine.v1.LoginRequirement getLogin() {
      @SuppressWarnings("deprecation")
      com.google.appengine.v1.LoginRequirement result =
          com.google.appengine.v1.LoginRequirement.valueOf(login_);
      return result == null ? com.google.appengine.v1.LoginRequirement.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Level of login required to access this resource. Defaults to
     * `optional`.
     * </pre>
     *
     * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
     *
     * @param value The login to set.
     * @return This builder for chaining.
     */
    public Builder setLogin(com.google.appengine.v1.LoginRequirement value) {
      if (value == null) {
        throw new NullPointerException();
      }

      login_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Level of login required to access this resource. Defaults to
     * `optional`.
     * </pre>
     *
     * <code>.google.appengine.v1.LoginRequirement login = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLogin() {

      login_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object script_ = "";
    /**
     *
     *
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script = 3;</code>
     *
     * @return The script.
     */
    public java.lang.String getScript() {
      java.lang.Object ref = script_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        script_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script = 3;</code>
     *
     * @return The bytes for script.
     */
    public com.google.protobuf.ByteString getScriptBytes() {
      java.lang.Object ref = script_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        script_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script = 3;</code>
     *
     * @param value The script to set.
     * @return This builder for chaining.
     */
    public Builder setScript(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      script_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScript() {

      script_ = getDefaultInstance().getScript();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script = 3;</code>
     *
     * @param value The bytes for script to set.
     * @return This builder for chaining.
     */
    public Builder setScriptBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      script_ = value;
      onChanged();
      return this;
    }

    private int securityLevel_ = 0;
    /**
     *
     *
     * <pre>
     * Security (HTTPS) enforcement for this URL.
     * </pre>
     *
     * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
     *
     * @return The enum numeric value on the wire for securityLevel.
     */
    @java.lang.Override
    public int getSecurityLevelValue() {
      return securityLevel_;
    }
    /**
     *
     *
     * <pre>
     * Security (HTTPS) enforcement for this URL.
     * </pre>
     *
     * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
     *
     * @param value The enum numeric value on the wire for securityLevel to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityLevelValue(int value) {

      securityLevel_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Security (HTTPS) enforcement for this URL.
     * </pre>
     *
     * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
     *
     * @return The securityLevel.
     */
    @java.lang.Override
    public com.google.appengine.v1.SecurityLevel getSecurityLevel() {
      @SuppressWarnings("deprecation")
      com.google.appengine.v1.SecurityLevel result =
          com.google.appengine.v1.SecurityLevel.valueOf(securityLevel_);
      return result == null ? com.google.appengine.v1.SecurityLevel.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Security (HTTPS) enforcement for this URL.
     * </pre>
     *
     * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
     *
     * @param value The securityLevel to set.
     * @return This builder for chaining.
     */
    public Builder setSecurityLevel(com.google.appengine.v1.SecurityLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }

      securityLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Security (HTTPS) enforcement for this URL.
     * </pre>
     *
     * <code>.google.appengine.v1.SecurityLevel security_level = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecurityLevel() {

      securityLevel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     *
     *
     * <pre>
     * URL to serve the endpoint at.
     * </pre>
     *
     * <code>string url = 5;</code>
     *
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL to serve the endpoint at.
     * </pre>
     *
     * <code>string url = 5;</code>
     *
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL to serve the endpoint at.
     * </pre>
     *
     * <code>string url = 5;</code>
     *
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      url_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL to serve the endpoint at.
     * </pre>
     *
     * <code>string url = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrl() {

      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL to serve the endpoint at.
     * </pre>
     *
     * <code>string url = 5;</code>
     *
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      url_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ApiConfigHandler)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ApiConfigHandler)
  private static final com.google.appengine.v1.ApiConfigHandler DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ApiConfigHandler();
  }

  public static com.google.appengine.v1.ApiConfigHandler getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiConfigHandler> PARSER =
      new com.google.protobuf.AbstractParser<ApiConfigHandler>() {
        @java.lang.Override
        public ApiConfigHandler parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApiConfigHandler> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiConfigHandler> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.ApiConfigHandler getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
