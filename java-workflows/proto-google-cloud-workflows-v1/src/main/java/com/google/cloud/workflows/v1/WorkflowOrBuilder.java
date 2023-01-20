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
// source: google/cloud/workflows/v1/workflows.proto

package com.google.cloud.workflows.v1;

public interface WorkflowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workflows.v1.Workflow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the workflow.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the workflow.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Description of the workflow provided by the user.
   * Must be at most 1000 unicode characters long.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the workflow provided by the user.
   * Must be at most 1000 unicode characters long.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the workflow deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the workflow deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.workflows.v1.Workflow.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The revision of the workflow.
   * A new revision of a workflow is created as a result of updating the
   * following properties of a workflow:
   * - [Service account][google.cloud.workflows.v1.Workflow.service_account]
   * - [Workflow code to be executed][google.cloud.workflows.v1.Workflow.source_contents]
   * The format is "000001-a4d", where the first 6 characters define
   * the zero-padded revision ordinal number. They are followed by a hyphen and
   * 3 hexadecimal random characters.
   * </pre>
   *
   * <code>string revision_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * Output only. The revision of the workflow.
   * A new revision of a workflow is created as a result of updating the
   * following properties of a workflow:
   * - [Service account][google.cloud.workflows.v1.Workflow.service_account]
   * - [Workflow code to be executed][google.cloud.workflows.v1.Workflow.source_contents]
   * The format is "000001-a4d", where the first 6 characters define
   * the zero-padded revision ordinal number. They are followed by a hyphen and
   * 3 hexadecimal random characters.
   * </pre>
   *
   * <code>string revision_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of when the workflow was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of when the workflow was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of when the workflow was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the workflow.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the workflow.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the workflow.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the latest revision of the workflow
   * was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the revisionCreateTime field is set.
   */
  boolean hasRevisionCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the latest revision of the workflow
   * was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionCreateTime.
   */
  com.google.protobuf.Timestamp getRevisionCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the latest revision of the workflow
   * was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels associated with this workflow.
   * Labels can contain at most 64 entries. Keys and values can be no longer
   * than 63 characters and can only contain lowercase letters, numeric
   * characters, underscores and dashes. Label keys must start with a letter.
   * International characters are allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this workflow.
   * Labels can contain at most 64 entries. Keys and values can be no longer
   * than 63 characters and can only contain lowercase letters, numeric
   * characters, underscores and dashes. Label keys must start with a letter.
   * International characters are allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this workflow.
   * Labels can contain at most 64 entries. Keys and values can be no longer
   * than 63 characters and can only contain lowercase letters, numeric
   * characters, underscores and dashes. Label keys must start with a letter.
   * International characters are allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this workflow.
   * Labels can contain at most 64 entries. Keys and values can be no longer
   * than 63 characters and can only contain lowercase letters, numeric
   * characters, underscores and dashes. Label keys must start with a letter.
   * International characters are allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this workflow.
   * Labels can contain at most 64 entries. Keys and values can be no longer
   * than 63 characters and can only contain lowercase letters, numeric
   * characters, underscores and dashes. Label keys must start with a letter.
   * International characters are allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The service account associated with the latest workflow version.
   * This service account represents the identity of the workflow and determines
   * what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} or {account}
   * Using `-` as a wildcard for the `{project}` or not providing one at all
   * will infer the project from the account. The `{account}` value can be the
   * `email` address or the `unique_id` of the service account.
   * If not provided, workflow will use the project's default service account.
   * Modifying this field for an existing workflow results in a new workflow
   * revision.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account associated with the latest workflow version.
   * This service account represents the identity of the workflow and determines
   * what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} or {account}
   * Using `-` as a wildcard for the `{project}` or not providing one at all
   * will infer the project from the account. The `{account}` value can be the
   * `email` address or the `unique_id` of the service account.
   * If not provided, workflow will use the project's default service account.
   * Modifying this field for an existing workflow results in a new workflow
   * revision.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Workflow code to be executed. The size limit is 128KB.
   * </pre>
   *
   * <code>string source_contents = 10;</code>
   *
   * @return Whether the sourceContents field is set.
   */
  boolean hasSourceContents();
  /**
   *
   *
   * <pre>
   * Workflow code to be executed. The size limit is 128KB.
   * </pre>
   *
   * <code>string source_contents = 10;</code>
   *
   * @return The sourceContents.
   */
  java.lang.String getSourceContents();
  /**
   *
   *
   * <pre>
   * Workflow code to be executed. The size limit is 128KB.
   * </pre>
   *
   * <code>string source_contents = 10;</code>
   *
   * @return The bytes for sourceContents.
   */
  com.google.protobuf.ByteString getSourceContentsBytes();

  public com.google.cloud.workflows.v1.Workflow.SourceCodeCase getSourceCodeCase();
}
