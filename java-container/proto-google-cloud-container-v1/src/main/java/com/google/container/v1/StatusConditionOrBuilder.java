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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface StatusConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.StatusCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Machine-friendly representation of the condition
   * Deprecated. Use canonical_code instead.
   * </pre>
   *
   * <code>.google.container.v1.StatusCondition.Code code = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StatusCondition.code is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3327
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Deprecated
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * Machine-friendly representation of the condition
   * Deprecated. Use canonical_code instead.
   * </pre>
   *
   * <code>.google.container.v1.StatusCondition.Code code = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.StatusCondition.code is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3327
   * @return The code.
   */
  @java.lang.Deprecated
  com.google.container.v1.StatusCondition.Code getCode();

  /**
   *
   *
   * <pre>
   * Human-friendly representation of the condition
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * Human-friendly representation of the condition
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * Canonical code of the condition.
   * </pre>
   *
   * <code>.google.rpc.Code canonical_code = 3;</code>
   *
   * @return The enum numeric value on the wire for canonicalCode.
   */
  int getCanonicalCodeValue();
  /**
   *
   *
   * <pre>
   * Canonical code of the condition.
   * </pre>
   *
   * <code>.google.rpc.Code canonical_code = 3;</code>
   *
   * @return The canonicalCode.
   */
  com.google.rpc.Code getCanonicalCode();
}
