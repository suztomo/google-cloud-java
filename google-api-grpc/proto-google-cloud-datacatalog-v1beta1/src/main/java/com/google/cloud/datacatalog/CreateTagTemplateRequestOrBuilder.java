// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface CreateTagTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.CreateTagTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project and the location this template is in.
   * Example: "projects/{project_id}/locations/{location}". Note that this
   * TagTemplate and its child resources may not actually be stored in the
   * location in this name.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project and the location this template is in.
   * Example: "projects/{project_id}/locations/{location}". Note that this
   * TagTemplate and its child resources may not actually be stored in the
   * location in this name.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3;</code>
   */
  java.lang.String getTagTemplateId();
  /**
   *
   *
   * <pre>
   * Required. The id of the tag template to create.
   * </pre>
   *
   * <code>string tag_template_id = 3;</code>
   */
  com.google.protobuf.ByteString getTagTemplateIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
   */
  boolean hasTagTemplate();
  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
   */
  com.google.cloud.datacatalog.TagTemplate getTagTemplate();
  /**
   *
   *
   * <pre>
   * Required. The tag template to create.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TagTemplate tag_template = 2;</code>
   */
  com.google.cloud.datacatalog.TagTemplateOrBuilder getTagTemplateOrBuilder();
}
