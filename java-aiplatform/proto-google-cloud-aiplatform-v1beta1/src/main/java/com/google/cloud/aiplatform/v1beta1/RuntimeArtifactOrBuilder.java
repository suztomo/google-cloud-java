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
// source: google/cloud/aiplatform/v1beta1/ui_pipeline_spec.proto

// Protobuf Java Version: 3.25.4
package com.google.cloud.aiplatform.v1beta1;

public interface RuntimeArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RuntimeArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of an artifact.
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
   * The name of an artifact.
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
   * The type of the artifact.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ArtifactTypeSchema type = 2;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * The type of the artifact.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ArtifactTypeSchema type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.aiplatform.v1beta1.ArtifactTypeSchema getType();
  /**
   *
   *
   * <pre>
   * The type of the artifact.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ArtifactTypeSchema type = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ArtifactTypeSchemaOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * The URI of the artifact.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The URI of the artifact.
   * </pre>
   *
   * <code>string uri = 3;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; properties = 4 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * The properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; properties = 4 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.Value> getProperties();
  /**
   *
   *
   * <pre>
   * The properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; properties = 4 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.Value> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * The properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; properties = 4 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated /* nullable */
  com.google.cloud.aiplatform.v1beta1.Value getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.aiplatform.v1beta1.Value defaultValue);
  /**
   *
   *
   * <pre>
   * The properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; properties = 4 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.Value getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The custom properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; custom_properties = 5 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getCustomPropertiesCount();
  /**
   *
   *
   * <pre>
   * The custom properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; custom_properties = 5 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  boolean containsCustomProperties(java.lang.String key);
  /** Use {@link #getCustomPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.Value> getCustomProperties();
  /**
   *
   *
   * <pre>
   * The custom properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; custom_properties = 5 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.aiplatform.v1beta1.Value>
      getCustomPropertiesMap();
  /**
   *
   *
   * <pre>
   * The custom properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; custom_properties = 5 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated /* nullable */
  com.google.cloud.aiplatform.v1beta1.Value getCustomPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.aiplatform.v1beta1.Value defaultValue);
  /**
   *
   *
   * <pre>
   * The custom properties of the artifact.
   * Deprecated. Use
   * [RuntimeArtifact.metadata][google.cloud.aiplatform.v1beta1.RuntimeArtifact.metadata]
   * instead.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.Value&gt; custom_properties = 5 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.Value getCustomPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Properties of the Artifact.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Properties of the Artifact.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   *
   *
   * <pre>
   * Properties of the Artifact.
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();
}
