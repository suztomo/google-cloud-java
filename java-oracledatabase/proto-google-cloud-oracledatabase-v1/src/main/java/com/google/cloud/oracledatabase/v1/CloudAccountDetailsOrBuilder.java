/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/oracledatabase/v1/entitlement.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.oracledatabase.v1;

public interface CloudAccountDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oracledatabase.v1.CloudAccountDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. OCI account name.
   * </pre>
   *
   * <code>string cloud_account = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The cloudAccount.
   */
  java.lang.String getCloudAccount();
  /**
   *
   *
   * <pre>
   * Output only. OCI account name.
   * </pre>
   *
   * <code>string cloud_account = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for cloudAccount.
   */
  com.google.protobuf.ByteString getCloudAccountBytes();

  /**
   *
   *
   * <pre>
   * Output only. OCI account home region.
   * </pre>
   *
   * <code>string cloud_account_home_region = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The cloudAccountHomeRegion.
   */
  java.lang.String getCloudAccountHomeRegion();
  /**
   *
   *
   * <pre>
   * Output only. OCI account home region.
   * </pre>
   *
   * <code>string cloud_account_home_region = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for cloudAccountHomeRegion.
   */
  com.google.protobuf.ByteString getCloudAccountHomeRegionBytes();

  /**
   *
   *
   * <pre>
   * Output only. URL to link an existing account.
   * </pre>
   *
   * <code>
   * optional string link_existing_account_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the linkExistingAccountUri field is set.
   */
  boolean hasLinkExistingAccountUri();
  /**
   *
   *
   * <pre>
   * Output only. URL to link an existing account.
   * </pre>
   *
   * <code>
   * optional string link_existing_account_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The linkExistingAccountUri.
   */
  java.lang.String getLinkExistingAccountUri();
  /**
   *
   *
   * <pre>
   * Output only. URL to link an existing account.
   * </pre>
   *
   * <code>
   * optional string link_existing_account_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for linkExistingAccountUri.
   */
  com.google.protobuf.ByteString getLinkExistingAccountUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. URL to create a new account and link.
   * </pre>
   *
   * <code>optional string account_creation_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the accountCreationUri field is set.
   */
  boolean hasAccountCreationUri();
  /**
   *
   *
   * <pre>
   * Output only. URL to create a new account and link.
   * </pre>
   *
   * <code>optional string account_creation_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The accountCreationUri.
   */
  java.lang.String getAccountCreationUri();
  /**
   *
   *
   * <pre>
   * Output only. URL to create a new account and link.
   * </pre>
   *
   * <code>optional string account_creation_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for accountCreationUri.
   */
  com.google.protobuf.ByteString getAccountCreationUriBytes();
}
