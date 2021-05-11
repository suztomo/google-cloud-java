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
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface WebhookOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Webhook)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the webhook.
   * Required for the [Webhooks.UpdateWebhook][google.cloud.dialogflow.cx.v3beta1.Webhooks.UpdateWebhook] method.
   * [Webhooks.CreateWebhook][google.cloud.dialogflow.cx.v3beta1.Webhooks.CreateWebhook] populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/webhooks/&lt;Webhook ID&gt;`.
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
   * The unique identifier of the webhook.
   * Required for the [Webhooks.UpdateWebhook][google.cloud.dialogflow.cx.v3beta1.Webhooks.UpdateWebhook] method.
   * [Webhooks.CreateWebhook][google.cloud.dialogflow.cx.v3beta1.Webhooks.CreateWebhook] populates the name automatically.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/webhooks/&lt;Webhook ID&gt;`.
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
   * Required. The human-readable name of the webhook, unique within the agent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the webhook, unique within the agent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Configuration for a generic web service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Webhook.GenericWebService generic_web_service = 4;
   * </code>
   *
   * @return Whether the genericWebService field is set.
   */
  boolean hasGenericWebService();
  /**
   *
   *
   * <pre>
   * Configuration for a generic web service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Webhook.GenericWebService generic_web_service = 4;
   * </code>
   *
   * @return The genericWebService.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Webhook.GenericWebService getGenericWebService();
  /**
   *
   *
   * <pre>
   * Configuration for a generic web service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Webhook.GenericWebService generic_web_service = 4;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Webhook.GenericWebServiceOrBuilder
      getGenericWebServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for a [Service
   * Directory](https://cloud.google.com/service-directory) service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Webhook.ServiceDirectoryConfig service_directory = 7;
   * </code>
   *
   * @return Whether the serviceDirectory field is set.
   */
  boolean hasServiceDirectory();
  /**
   *
   *
   * <pre>
   * Configuration for a [Service
   * Directory](https://cloud.google.com/service-directory) service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Webhook.ServiceDirectoryConfig service_directory = 7;
   * </code>
   *
   * @return The serviceDirectory.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Webhook.ServiceDirectoryConfig getServiceDirectory();
  /**
   *
   *
   * <pre>
   * Configuration for a [Service
   * Directory](https://cloud.google.com/service-directory) service.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Webhook.ServiceDirectoryConfig service_directory = 7;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Webhook.ServiceDirectoryConfigOrBuilder
      getServiceDirectoryOrBuilder();

  /**
   *
   *
   * <pre>
   * Webhook execution timeout. Execution is considered failed if Dialogflow
   * doesn't receive a response from webhook at the end of the timeout period.
   * Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 6;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Webhook execution timeout. Execution is considered failed if Dialogflow
   * doesn't receive a response from webhook at the end of the timeout period.
   * Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 6;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Webhook execution timeout. Execution is considered failed if Dialogflow
   * doesn't receive a response from webhook at the end of the timeout period.
   * Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether the webhook is disabled.
   * </pre>
   *
   * <code>bool disabled = 5;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  public com.google.cloud.dialogflow.cx.v3beta1.Webhook.WebhookCase getWebhookCase();
}
