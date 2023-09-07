/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/optimization/v1/fleet_routing.proto

package com.google.cloud.optimization.v1;

public interface DistanceLimitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.DistanceLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A hard limit constraining the distance to be at most max_meters. The limit
   * must be nonnegative.
   * </pre>
   *
   * <code>optional int64 max_meters = 1;</code>
   *
   * @return Whether the maxMeters field is set.
   */
  boolean hasMaxMeters();
  /**
   *
   *
   * <pre>
   * A hard limit constraining the distance to be at most max_meters. The limit
   * must be nonnegative.
   * </pre>
   *
   * <code>optional int64 max_meters = 1;</code>
   *
   * @return The maxMeters.
   */
  long getMaxMeters();

  /**
   *
   *
   * <pre>
   * A soft limit not enforcing a maximum distance limit, but when violated
   * results in a cost which adds up to other costs defined in the model,
   * with the same unit.
   *
   * If defined soft_max_meters must be less than max_meters and must be
   * nonnegative.
   * </pre>
   *
   * <code>optional int64 soft_max_meters = 2;</code>
   *
   * @return Whether the softMaxMeters field is set.
   */
  boolean hasSoftMaxMeters();
  /**
   *
   *
   * <pre>
   * A soft limit not enforcing a maximum distance limit, but when violated
   * results in a cost which adds up to other costs defined in the model,
   * with the same unit.
   *
   * If defined soft_max_meters must be less than max_meters and must be
   * nonnegative.
   * </pre>
   *
   * <code>optional int64 soft_max_meters = 2;</code>
   *
   * @return The softMaxMeters.
   */
  long getSoftMaxMeters();

  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
   * formula:
   * ```
   *   min(distance_meters, soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_below_soft_max.
   * ```
   * This cost is not supported in `route_distance_limit`.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
   *
   * @return Whether the costPerKilometerBelowSoftMax field is set.
   */
  boolean hasCostPerKilometerBelowSoftMax();
  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
   * formula:
   * ```
   *   min(distance_meters, soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_below_soft_max.
   * ```
   * This cost is not supported in `route_distance_limit`.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
   *
   * @return The costPerKilometerBelowSoftMax.
   */
  double getCostPerKilometerBelowSoftMax();

  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
   * The additional cost is 0 if the distance is under the limit, otherwise the
   * formula used to compute the cost is the following:
   * ```
   *   (distance_meters - soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_above_soft_max.
   * ```
   * The cost must be nonnegative.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
   *
   * @return Whether the costPerKilometerAboveSoftMax field is set.
   */
  boolean hasCostPerKilometerAboveSoftMax();
  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
   * The additional cost is 0 if the distance is under the limit, otherwise the
   * formula used to compute the cost is the following:
   * ```
   *   (distance_meters - soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_above_soft_max.
   * ```
   * The cost must be nonnegative.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
   *
   * @return The costPerKilometerAboveSoftMax.
   */
  double getCostPerKilometerAboveSoftMax();
}
