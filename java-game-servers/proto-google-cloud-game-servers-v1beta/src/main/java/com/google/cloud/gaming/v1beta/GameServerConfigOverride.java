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
// source: google/cloud/gaming/v1beta/game_server_deployments.proto

package com.google.cloud.gaming.v1beta;

/**
 *
 *
 * <pre>
 * A game server config override.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1beta.GameServerConfigOverride}
 */
public final class GameServerConfigOverride extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1beta.GameServerConfigOverride)
    GameServerConfigOverrideOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GameServerConfigOverride.newBuilder() to construct.
  private GameServerConfigOverride(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GameServerConfigOverride() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GameServerConfigOverride();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments
        .internal_static_google_cloud_gaming_v1beta_GameServerConfigOverride_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1beta.GameServerDeployments
        .internal_static_google_cloud_gaming_v1beta_GameServerConfigOverride_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1beta.GameServerConfigOverride.class,
            com.google.cloud.gaming.v1beta.GameServerConfigOverride.Builder.class);
  }

  private int selectorCase_ = 0;
  private java.lang.Object selector_;

  public enum SelectorCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    REALMS_SELECTOR(1),
    SELECTOR_NOT_SET(0);
    private final int value;

    private SelectorCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SelectorCase valueOf(int value) {
      return forNumber(value);
    }

    public static SelectorCase forNumber(int value) {
      switch (value) {
        case 1:
          return REALMS_SELECTOR;
        case 0:
          return SELECTOR_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SelectorCase getSelectorCase() {
    return SelectorCase.forNumber(selectorCase_);
  }

  private int changeCase_ = 0;
  private java.lang.Object change_;

  public enum ChangeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONFIG_VERSION(100),
    CHANGE_NOT_SET(0);
    private final int value;

    private ChangeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ChangeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ChangeCase forNumber(int value) {
      switch (value) {
        case 100:
          return CONFIG_VERSION;
        case 0:
          return CHANGE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ChangeCase getChangeCase() {
    return ChangeCase.forNumber(changeCase_);
  }

  public static final int REALMS_SELECTOR_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Selector for choosing applicable realms.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
   *
   * @return Whether the realmsSelector field is set.
   */
  @java.lang.Override
  public boolean hasRealmsSelector() {
    return selectorCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Selector for choosing applicable realms.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
   *
   * @return The realmsSelector.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.RealmSelector getRealmsSelector() {
    if (selectorCase_ == 1) {
      return (com.google.cloud.gaming.v1beta.RealmSelector) selector_;
    }
    return com.google.cloud.gaming.v1beta.RealmSelector.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Selector for choosing applicable realms.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.RealmSelectorOrBuilder getRealmsSelectorOrBuilder() {
    if (selectorCase_ == 1) {
      return (com.google.cloud.gaming.v1beta.RealmSelector) selector_;
    }
    return com.google.cloud.gaming.v1beta.RealmSelector.getDefaultInstance();
  }

  public static final int CONFIG_VERSION_FIELD_NUMBER = 100;
  /**
   *
   *
   * <pre>
   * The game server config for this override.
   * </pre>
   *
   * <code>string config_version = 100;</code>
   *
   * @return Whether the configVersion field is set.
   */
  public boolean hasConfigVersion() {
    return changeCase_ == 100;
  }
  /**
   *
   *
   * <pre>
   * The game server config for this override.
   * </pre>
   *
   * <code>string config_version = 100;</code>
   *
   * @return The configVersion.
   */
  public java.lang.String getConfigVersion() {
    java.lang.Object ref = "";
    if (changeCase_ == 100) {
      ref = change_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (changeCase_ == 100) {
        change_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The game server config for this override.
   * </pre>
   *
   * <code>string config_version = 100;</code>
   *
   * @return The bytes for configVersion.
   */
  public com.google.protobuf.ByteString getConfigVersionBytes() {
    java.lang.Object ref = "";
    if (changeCase_ == 100) {
      ref = change_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (changeCase_ == 100) {
        change_ = b;
      }
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
    if (selectorCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.gaming.v1beta.RealmSelector) selector_);
    }
    if (changeCase_ == 100) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 100, change_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (selectorCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.gaming.v1beta.RealmSelector) selector_);
    }
    if (changeCase_ == 100) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(100, change_);
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
    if (!(obj instanceof com.google.cloud.gaming.v1beta.GameServerConfigOverride)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1beta.GameServerConfigOverride other =
        (com.google.cloud.gaming.v1beta.GameServerConfigOverride) obj;

    if (!getSelectorCase().equals(other.getSelectorCase())) return false;
    switch (selectorCase_) {
      case 1:
        if (!getRealmsSelector().equals(other.getRealmsSelector())) return false;
        break;
      case 0:
      default:
    }
    if (!getChangeCase().equals(other.getChangeCase())) return false;
    switch (changeCase_) {
      case 100:
        if (!getConfigVersion().equals(other.getConfigVersion())) return false;
        break;
      case 0:
      default:
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
    switch (selectorCase_) {
      case 1:
        hash = (37 * hash) + REALMS_SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getRealmsSelector().hashCode();
        break;
      case 0:
      default:
    }
    switch (changeCase_) {
      case 100:
        hash = (37 * hash) + CONFIG_VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getConfigVersion().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride parseFrom(
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
      com.google.cloud.gaming.v1beta.GameServerConfigOverride prototype) {
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
   * A game server config override.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1beta.GameServerConfigOverride}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1beta.GameServerConfigOverride)
      com.google.cloud.gaming.v1beta.GameServerConfigOverrideOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments
          .internal_static_google_cloud_gaming_v1beta_GameServerConfigOverride_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments
          .internal_static_google_cloud_gaming_v1beta_GameServerConfigOverride_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1beta.GameServerConfigOverride.class,
              com.google.cloud.gaming.v1beta.GameServerConfigOverride.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1beta.GameServerConfigOverride.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (realmsSelectorBuilder_ != null) {
        realmsSelectorBuilder_.clear();
      }
      selectorCase_ = 0;
      selector_ = null;
      changeCase_ = 0;
      change_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1beta.GameServerDeployments
          .internal_static_google_cloud_gaming_v1beta_GameServerConfigOverride_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.GameServerConfigOverride getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1beta.GameServerConfigOverride.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.GameServerConfigOverride build() {
      com.google.cloud.gaming.v1beta.GameServerConfigOverride result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.GameServerConfigOverride buildPartial() {
      com.google.cloud.gaming.v1beta.GameServerConfigOverride result =
          new com.google.cloud.gaming.v1beta.GameServerConfigOverride(this);
      if (selectorCase_ == 1) {
        if (realmsSelectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = realmsSelectorBuilder_.build();
        }
      }
      if (changeCase_ == 100) {
        result.change_ = change_;
      }
      result.selectorCase_ = selectorCase_;
      result.changeCase_ = changeCase_;
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
      if (other instanceof com.google.cloud.gaming.v1beta.GameServerConfigOverride) {
        return mergeFrom((com.google.cloud.gaming.v1beta.GameServerConfigOverride) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1beta.GameServerConfigOverride other) {
      if (other == com.google.cloud.gaming.v1beta.GameServerConfigOverride.getDefaultInstance())
        return this;
      switch (other.getSelectorCase()) {
        case REALMS_SELECTOR:
          {
            mergeRealmsSelector(other.getRealmsSelector());
            break;
          }
        case SELECTOR_NOT_SET:
          {
            break;
          }
      }
      switch (other.getChangeCase()) {
        case CONFIG_VERSION:
          {
            changeCase_ = 100;
            change_ = other.change_;
            onChanged();
            break;
          }
        case CHANGE_NOT_SET:
          {
            break;
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
                input.readMessage(getRealmsSelectorFieldBuilder().getBuilder(), extensionRegistry);
                selectorCase_ = 1;
                break;
              } // case 10
            case 802:
              {
                java.lang.String s = input.readStringRequireUtf8();
                changeCase_ = 100;
                change_ = s;
                break;
              } // case 802
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

    private int selectorCase_ = 0;
    private java.lang.Object selector_;

    public SelectorCase getSelectorCase() {
      return SelectorCase.forNumber(selectorCase_);
    }

    public Builder clearSelector() {
      selectorCase_ = 0;
      selector_ = null;
      onChanged();
      return this;
    }

    private int changeCase_ = 0;
    private java.lang.Object change_;

    public ChangeCase getChangeCase() {
      return ChangeCase.forNumber(changeCase_);
    }

    public Builder clearChange() {
      changeCase_ = 0;
      change_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.RealmSelector,
            com.google.cloud.gaming.v1beta.RealmSelector.Builder,
            com.google.cloud.gaming.v1beta.RealmSelectorOrBuilder>
        realmsSelectorBuilder_;
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     *
     * @return Whether the realmsSelector field is set.
     */
    @java.lang.Override
    public boolean hasRealmsSelector() {
      return selectorCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     *
     * @return The realmsSelector.
     */
    @java.lang.Override
    public com.google.cloud.gaming.v1beta.RealmSelector getRealmsSelector() {
      if (realmsSelectorBuilder_ == null) {
        if (selectorCase_ == 1) {
          return (com.google.cloud.gaming.v1beta.RealmSelector) selector_;
        }
        return com.google.cloud.gaming.v1beta.RealmSelector.getDefaultInstance();
      } else {
        if (selectorCase_ == 1) {
          return realmsSelectorBuilder_.getMessage();
        }
        return com.google.cloud.gaming.v1beta.RealmSelector.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     */
    public Builder setRealmsSelector(com.google.cloud.gaming.v1beta.RealmSelector value) {
      if (realmsSelectorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        selector_ = value;
        onChanged();
      } else {
        realmsSelectorBuilder_.setMessage(value);
      }
      selectorCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     */
    public Builder setRealmsSelector(
        com.google.cloud.gaming.v1beta.RealmSelector.Builder builderForValue) {
      if (realmsSelectorBuilder_ == null) {
        selector_ = builderForValue.build();
        onChanged();
      } else {
        realmsSelectorBuilder_.setMessage(builderForValue.build());
      }
      selectorCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     */
    public Builder mergeRealmsSelector(com.google.cloud.gaming.v1beta.RealmSelector value) {
      if (realmsSelectorBuilder_ == null) {
        if (selectorCase_ == 1
            && selector_ != com.google.cloud.gaming.v1beta.RealmSelector.getDefaultInstance()) {
          selector_ =
              com.google.cloud.gaming.v1beta.RealmSelector.newBuilder(
                      (com.google.cloud.gaming.v1beta.RealmSelector) selector_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          selector_ = value;
        }
        onChanged();
      } else {
        if (selectorCase_ == 1) {
          realmsSelectorBuilder_.mergeFrom(value);
        } else {
          realmsSelectorBuilder_.setMessage(value);
        }
      }
      selectorCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     */
    public Builder clearRealmsSelector() {
      if (realmsSelectorBuilder_ == null) {
        if (selectorCase_ == 1) {
          selectorCase_ = 0;
          selector_ = null;
          onChanged();
        }
      } else {
        if (selectorCase_ == 1) {
          selectorCase_ = 0;
          selector_ = null;
        }
        realmsSelectorBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     */
    public com.google.cloud.gaming.v1beta.RealmSelector.Builder getRealmsSelectorBuilder() {
      return getRealmsSelectorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.gaming.v1beta.RealmSelectorOrBuilder getRealmsSelectorOrBuilder() {
      if ((selectorCase_ == 1) && (realmsSelectorBuilder_ != null)) {
        return realmsSelectorBuilder_.getMessageOrBuilder();
      } else {
        if (selectorCase_ == 1) {
          return (com.google.cloud.gaming.v1beta.RealmSelector) selector_;
        }
        return com.google.cloud.gaming.v1beta.RealmSelector.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Selector for choosing applicable realms.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.RealmSelector realms_selector = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.RealmSelector,
            com.google.cloud.gaming.v1beta.RealmSelector.Builder,
            com.google.cloud.gaming.v1beta.RealmSelectorOrBuilder>
        getRealmsSelectorFieldBuilder() {
      if (realmsSelectorBuilder_ == null) {
        if (!(selectorCase_ == 1)) {
          selector_ = com.google.cloud.gaming.v1beta.RealmSelector.getDefaultInstance();
        }
        realmsSelectorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1beta.RealmSelector,
                com.google.cloud.gaming.v1beta.RealmSelector.Builder,
                com.google.cloud.gaming.v1beta.RealmSelectorOrBuilder>(
                (com.google.cloud.gaming.v1beta.RealmSelector) selector_,
                getParentForChildren(),
                isClean());
        selector_ = null;
      }
      selectorCase_ = 1;
      onChanged();
      ;
      return realmsSelectorBuilder_;
    }

    /**
     *
     *
     * <pre>
     * The game server config for this override.
     * </pre>
     *
     * <code>string config_version = 100;</code>
     *
     * @return Whether the configVersion field is set.
     */
    @java.lang.Override
    public boolean hasConfigVersion() {
      return changeCase_ == 100;
    }
    /**
     *
     *
     * <pre>
     * The game server config for this override.
     * </pre>
     *
     * <code>string config_version = 100;</code>
     *
     * @return The configVersion.
     */
    @java.lang.Override
    public java.lang.String getConfigVersion() {
      java.lang.Object ref = "";
      if (changeCase_ == 100) {
        ref = change_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (changeCase_ == 100) {
          change_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The game server config for this override.
     * </pre>
     *
     * <code>string config_version = 100;</code>
     *
     * @return The bytes for configVersion.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getConfigVersionBytes() {
      java.lang.Object ref = "";
      if (changeCase_ == 100) {
        ref = change_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (changeCase_ == 100) {
          change_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The game server config for this override.
     * </pre>
     *
     * <code>string config_version = 100;</code>
     *
     * @param value The configVersion to set.
     * @return This builder for chaining.
     */
    public Builder setConfigVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      changeCase_ = 100;
      change_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The game server config for this override.
     * </pre>
     *
     * <code>string config_version = 100;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfigVersion() {
      if (changeCase_ == 100) {
        changeCase_ = 0;
        change_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The game server config for this override.
     * </pre>
     *
     * <code>string config_version = 100;</code>
     *
     * @param value The bytes for configVersion to set.
     * @return This builder for chaining.
     */
    public Builder setConfigVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      changeCase_ = 100;
      change_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1beta.GameServerConfigOverride)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1beta.GameServerConfigOverride)
  private static final com.google.cloud.gaming.v1beta.GameServerConfigOverride DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1beta.GameServerConfigOverride();
  }

  public static com.google.cloud.gaming.v1beta.GameServerConfigOverride getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameServerConfigOverride> PARSER =
      new com.google.protobuf.AbstractParser<GameServerConfigOverride>() {
        @java.lang.Override
        public GameServerConfigOverride parsePartialFrom(
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

  public static com.google.protobuf.Parser<GameServerConfigOverride> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameServerConfigOverride> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerConfigOverride getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
