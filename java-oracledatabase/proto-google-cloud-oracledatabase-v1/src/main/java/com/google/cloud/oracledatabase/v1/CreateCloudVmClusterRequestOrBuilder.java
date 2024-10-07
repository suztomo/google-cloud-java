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

public interface CreateCloudVmClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oracledatabase.v1.CreateCloudVmClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent in the following format:
   * projects/{project}/locations/{location}.
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
   * Required. The name of the parent in the following format:
   * projects/{project}/locations/{location}.
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
   * Required. The ID of the VM Cluster to create. This value is restricted
   * to (^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$) and must be a maximum of 63
   * characters in length. The value must start with a letter and end with
   * a letter or a number.
   * </pre>
   *
   * <code>string cloud_vm_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The cloudVmClusterId.
   */
  java.lang.String getCloudVmClusterId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the VM Cluster to create. This value is restricted
   * to (^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$) and must be a maximum of 63
   * characters in length. The value must start with a letter and end with
   * a letter or a number.
   * </pre>
   *
   * <code>string cloud_vm_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for cloudVmClusterId.
   */
  com.google.protobuf.ByteString getCloudVmClusterIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cloudVmCluster field is set.
   */
  boolean hasCloudVmCluster();
  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cloudVmCluster.
   */
  com.google.cloud.oracledatabase.v1.CloudVmCluster getCloudVmCluster();
  /**
   *
   *
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudVmCluster cloud_vm_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.oracledatabase.v1.CloudVmClusterOrBuilder getCloudVmClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional ID to identify the request. This value is used to
   * identify duplicate requests. If you make a request with the same request ID
   * and the original request is still in progress or completed, the server
   * ignores the second request. This prevents clients from
   * accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional ID to identify the request. This value is used to
   * identify duplicate requests. If you make a request with the same request ID
   * and the original request is still in progress or completed, the server
   * ignores the second request. This prevents clients from
   * accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>
   * string request_id = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
