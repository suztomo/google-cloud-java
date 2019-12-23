/*
 * Copyright 2019 Google LLC
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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NetworkPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NetworkPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The selected network policy provider.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicy.Provider provider = 1;</code>
   *
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   *
   *
   * <pre>
   * The selected network policy provider.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicy.Provider provider = 1;</code>
   *
   * @return The provider.
   */
  com.google.container.v1.NetworkPolicy.Provider getProvider();

  /**
   *
   *
   * <pre>
   * Whether network policy is enabled on the cluster.
   * </pre>
   *
   * <code>bool enabled = 2;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();
}
