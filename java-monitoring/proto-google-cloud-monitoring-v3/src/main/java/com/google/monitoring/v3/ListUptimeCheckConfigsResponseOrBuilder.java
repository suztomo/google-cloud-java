// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

public interface ListUptimeCheckConfigsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListUptimeCheckConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The returned uptime check configurations.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig uptime_check_configs = 1;</code>
   */
  java.util.List<com.google.monitoring.v3.UptimeCheckConfig> 
      getUptimeCheckConfigsList();
  /**
   * <pre>
   * The returned uptime check configurations.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig uptime_check_configs = 1;</code>
   */
  com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfigs(int index);
  /**
   * <pre>
   * The returned uptime check configurations.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig uptime_check_configs = 1;</code>
   */
  int getUptimeCheckConfigsCount();
  /**
   * <pre>
   * The returned uptime check configurations.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig uptime_check_configs = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.UptimeCheckConfigOrBuilder> 
      getUptimeCheckConfigsOrBuilderList();
  /**
   * <pre>
   * The returned uptime check configurations.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig uptime_check_configs = 1;</code>
   */
  com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * This field represents the pagination token to retrieve the next page of
   * results. If the value is empty, it means no further results for the
   * request. To retrieve the next page of results, the value of the
   * next_page_token is passed to the subsequent List method call (in the
   * request message's page_token field).
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * This field represents the pagination token to retrieve the next page of
   * results. If the value is empty, it means no further results for the
   * request. To retrieve the next page of results, the value of the
   * next_page_token is passed to the subsequent List method call (in the
   * request message's page_token field).
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
