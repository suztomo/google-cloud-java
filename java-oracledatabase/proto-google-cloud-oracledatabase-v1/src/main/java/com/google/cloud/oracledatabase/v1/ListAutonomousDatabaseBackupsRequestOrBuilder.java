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
// source: google/cloud/oracledatabase/v1/oracledatabase.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.oracledatabase.v1;

public interface ListAutonomousDatabaseBackupsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oracledatabase.v1.ListAutonomousDatabaseBackupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent value for ListAutonomousDatabaseBackups in the
   * following format: projects/{project}/locations/{location}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent value for ListAutonomousDatabaseBackups in the
   * following format: projects/{project}/locations/{location}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the request. Only the
   * **autonomous_database_id** field is supported in the following format:
   * `autonomous_database_id="{autonomous_database_id}"`. The accepted values
   * must be a valid Autonomous Database ID, limited to the naming
   * restrictions of the ID: ^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$).
   * The ID must start with a letter, end with a letter or a number, and be
   * a maximum of 63 characters.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the request. Only the
   * **autonomous_database_id** field is supported in the following format:
   * `autonomous_database_id="{autonomous_database_id}"`. The accepted values
   * must be a valid Autonomous Database ID, limited to the naming
   * restrictions of the ID: ^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$).
   * The ID must start with a letter, end with a letter or a number, and be
   * a maximum of 63 characters.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of items to return.
   * If unspecified, at most 50 Autonomous DB Backups will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
