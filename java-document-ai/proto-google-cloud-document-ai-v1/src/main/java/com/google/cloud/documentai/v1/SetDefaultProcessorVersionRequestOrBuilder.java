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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1;

public interface SetDefaultProcessorVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.SetDefaultProcessorVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1.Processor] to change default
   * version.
   * </pre>
   *
   * <code>
   * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The processor.
   */
  java.lang.String getProcessor();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1.Processor] to change default
   * version.
   * </pre>
   *
   * <code>
   * string processor = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for processor.
   */
  com.google.protobuf.ByteString getProcessorBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource name of child
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
   * default. Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
   * </pre>
   *
   * <code>
   * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The defaultProcessorVersion.
   */
  java.lang.String getDefaultProcessorVersion();
  /**
   *
   *
   * <pre>
   * Required. The resource name of child
   * [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to use as
   * default. Format:
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{version}`
   * </pre>
   *
   * <code>
   * string default_processor_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for defaultProcessorVersion.
   */
  com.google.protobuf.ByteString getDefaultProcessorVersionBytes();
}
