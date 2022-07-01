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
// source: google/devtools/containeranalysis/v1beta1/containeranalysis.proto

package com.google.containeranalysis.v1beta1;

public interface ListScanConfigsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  java.util.List<com.google.containeranalysis.v1beta1.ScanConfig> getScanConfigsList();
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  com.google.containeranalysis.v1beta1.ScanConfig getScanConfigs(int index);
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  int getScanConfigsCount();
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  java.util.List<? extends com.google.containeranalysis.v1beta1.ScanConfigOrBuilder>
      getScanConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The scan configurations requested.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1beta1.ScanConfig scan_configs = 1;</code>
   */
  com.google.containeranalysis.v1beta1.ScanConfigOrBuilder getScanConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
