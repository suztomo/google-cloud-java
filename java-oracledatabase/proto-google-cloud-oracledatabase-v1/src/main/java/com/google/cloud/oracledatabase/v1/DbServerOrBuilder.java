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
// source: google/cloud/oracledatabase/v1/db_server.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.oracledatabase.v1;

public interface DbServerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oracledatabase.v1.DbServer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the database server resource with the format:
   * projects/{project}/locations/{location}/cloudExadataInfrastructures/{cloud_exadata_infrastructure}/dbServers/{db_server}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The name of the database server resource with the format:
   * projects/{project}/locations/{location}/cloudExadataInfrastructures/{cloud_exadata_infrastructure}/dbServers/{db_server}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. User friendly name for this resource.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. User friendly name for this resource.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Various properties of the database server.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DbServerProperties properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   *
   *
   * <pre>
   * Optional. Various properties of the database server.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DbServerProperties properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The properties.
   */
  com.google.cloud.oracledatabase.v1.DbServerProperties getProperties();
  /**
   *
   *
   * <pre>
   * Optional. Various properties of the database server.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DbServerProperties properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.oracledatabase.v1.DbServerPropertiesOrBuilder getPropertiesOrBuilder();
}
