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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface PacketMirroringFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PacketMirroringFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string I_p_protocols = 98544854;</code>
   *
   * @return A list containing the iPProtocols.
   */
  java.util.List<java.lang.String> getIPProtocolsList();
  /**
   *
   *
   * <pre>
   * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string I_p_protocols = 98544854;</code>
   *
   * @return The count of iPProtocols.
   */
  int getIPProtocolsCount();
  /**
   *
   *
   * <pre>
   * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string I_p_protocols = 98544854;</code>
   *
   * @param index The index of the element to return.
   * @return The iPProtocols at the given index.
   */
  java.lang.String getIPProtocols(int index);
  /**
   *
   *
   * <pre>
   * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string I_p_protocols = 98544854;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the iPProtocols at the given index.
   */
  com.google.protobuf.ByteString getIPProtocolsBytes(int index);

  /**
   *
   *
   * <pre>
   * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string cidr_ranges = 487901697;</code>
   *
   * @return A list containing the cidrRanges.
   */
  java.util.List<java.lang.String> getCidrRangesList();
  /**
   *
   *
   * <pre>
   * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string cidr_ranges = 487901697;</code>
   *
   * @return The count of cidrRanges.
   */
  int getCidrRangesCount();
  /**
   *
   *
   * <pre>
   * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string cidr_ranges = 487901697;</code>
   *
   * @param index The index of the element to return.
   * @return The cidrRanges at the given index.
   */
  java.lang.String getCidrRanges(int index);
  /**
   *
   *
   * <pre>
   * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
   * </pre>
   *
   * <code>repeated string cidr_ranges = 487901697;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the cidrRanges at the given index.
   */
  com.google.protobuf.ByteString getCidrRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
   * Check the Direction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string direction = 111150975;</code>
   *
   * @return Whether the direction field is set.
   */
  boolean hasDirection();
  /**
   *
   *
   * <pre>
   * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
   * Check the Direction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string direction = 111150975;</code>
   *
   * @return The direction.
   */
  java.lang.String getDirection();
  /**
   *
   *
   * <pre>
   * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
   * Check the Direction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string direction = 111150975;</code>
   *
   * @return The bytes for direction.
   */
  com.google.protobuf.ByteString getDirectionBytes();
}
