/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

public interface AttributeValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v2.AttributeValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   */
  com.google.devtools.cloudtrace.v2.TruncatableString getStringValue();
  /**
   *
   *
   * <pre>
   * A string up to 256 bytes long.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString string_value = 1;</code>
   */
  com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getStringValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A 64-bit signed integer.
   * </pre>
   *
   * <code>int64 int_value = 2;</code>
   */
  long getIntValue();

  /**
   *
   *
   * <pre>
   * A Boolean value represented by `true` or `false`.
   * </pre>
   *
   * <code>bool bool_value = 3;</code>
   */
  boolean getBoolValue();

  public com.google.devtools.cloudtrace.v2.AttributeValue.ValueCase getValueCase();
}
