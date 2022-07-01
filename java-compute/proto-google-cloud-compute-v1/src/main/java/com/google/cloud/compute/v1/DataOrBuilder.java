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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface DataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Data)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   *
   *
   * <pre>
   * [Output Only] A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * [Output Only] A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A warning data value corresponding to the key.
   * </pre>
   *
   * <code>optional string value = 111972721;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * [Output Only] A warning data value corresponding to the key.
   * </pre>
   *
   * <code>optional string value = 111972721;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();
  /**
   *
   *
   * <pre>
   * [Output Only] A warning data value corresponding to the key.
   * </pre>
   *
   * <code>optional string value = 111972721;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();
}
