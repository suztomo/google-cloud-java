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
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface ReviewDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ReviewDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   *
   * @return Whether the inlineDocument field is set.
   */
  boolean hasInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   *
   * @return The inlineDocument.
   */
  com.google.cloud.documentai.v1beta3.Document getInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentOrBuilder getInlineDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the HumanReviewConfig that the document will be
   * reviewed with.
   * </pre>
   *
   * <code>
   * string human_review_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The humanReviewConfig.
   */
  java.lang.String getHumanReviewConfig();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the HumanReviewConfig that the document will be
   * reviewed with.
   * </pre>
   *
   * <code>
   * string human_review_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for humanReviewConfig.
   */
  com.google.protobuf.ByteString getHumanReviewConfigBytes();

  /**
   *
   *
   * <pre>
   * The document that needs human review.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   *
   * @return Whether the document field is set.
   */
  @java.lang.Deprecated
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * The document that needs human review.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   *
   * @return The document.
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.Document getDocument();
  /**
   *
   *
   * <pre>
   * The document that needs human review.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.DocumentOrBuilder getDocumentOrBuilder();

  public com.google.cloud.documentai.v1beta3.ReviewDocumentRequest.SourceCase getSourceCase();
}
