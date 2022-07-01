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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface DataProfileConfigSnapshotOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DataProfileConfigSnapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return Whether the inspectConfig field is set.
   */
  boolean hasInspectConfig();
  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return The inspectConfig.
   */
  com.google.privacy.dlp.v2.InspectConfig getInspectConfig();
  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   *
   * @return Whether the dataProfileJob field is set.
   */
  boolean hasDataProfileJob();
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   *
   * @return The dataProfileJob.
   */
  com.google.privacy.dlp.v2.DataProfileJobConfig getDataProfileJob();
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   */
  com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder getDataProfileJobOrBuilder();
}
