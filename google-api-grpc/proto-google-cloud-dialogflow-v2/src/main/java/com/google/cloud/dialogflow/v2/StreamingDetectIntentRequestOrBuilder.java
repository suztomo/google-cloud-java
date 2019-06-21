// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface StreamingDetectIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.StreamingDetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the session the query is sent to.
   * Format of the session name:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`. It's up to the API
   * caller to choose an appropriate `Session ID`. It can be a random number or
   * some type of user identifier (preferably hashed). The length of the session
   * ID must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The name of the session the query is sent to.
   * Format of the session name:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`. It's up to the API
   * caller to choose an appropriate `Session ID`. It can be a random number or
   * some type of user identifier (preferably hashed). The length of the session
   * ID must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryParameters query_params = 2;</code>
   */
  boolean hasQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2.QueryParameters getQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryInput query_input = 3;</code>
   */
  boolean hasQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryInput query_input = 3;</code>
   */
  com.google.cloud.dialogflow.v2.QueryInput getQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config which instructs the speech recognizer how to process
   *     the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryInput query_input = 3;</code>
   */
  com.google.cloud.dialogflow.v2.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If `false` (default), recognition does not cease until the
   * client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input
   * audio. Recognition ceases when it detects the audio's voice has
   * stopped or paused. In this case, once a detected intent is received, the
   * client should close the stream and start a new request with a new stream as
   * needed.
   * This setting is ignored when `query_input` is a piece of text or an event.
   * </pre>
   *
   * <code>bool single_utterance = 4;</code>
   */
  boolean getSingleUtterance();

  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig output_audio_config = 5;</code>
   */
  boolean hasOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig output_audio_config = 5;</code>
   */
  com.google.cloud.dialogflow.v2.OutputAudioConfig getOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig output_audio_config = 5;</code>
   */
  com.google.cloud.dialogflow.v2.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The input audio content to be recognized. Must be sent if
   * `query_input` was set to a streaming input audio config. The complete audio
   * over all streaming messages must not exceed 1 minute.
   * </pre>
   *
   * <code>bytes input_audio = 6;</code>
   */
  com.google.protobuf.ByteString getInputAudio();
}
