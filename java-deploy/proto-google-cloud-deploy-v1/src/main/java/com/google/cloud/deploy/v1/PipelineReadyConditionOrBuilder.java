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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface PipelineReadyConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.PipelineReadyCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * True if the Pipeline is in a valid state. Otherwise at least one condition
   * in `PipelineCondition` is in an invalid state. Iterate over those
   * conditions and see which condition(s) has status = false to find out what
   * is wrong with the Pipeline.
   * </pre>
   *
   * <code>bool status = 3;</code>
   *
   * @return The status.
   */
  boolean getStatus();

  /**
   *
   *
   * <pre>
   * Last time the condition was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Last time the condition was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Last time the condition was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
