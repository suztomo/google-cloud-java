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
// source: google/maps/places/v1/places_service.proto

// Protobuf Java Version: 3.25.4
package com.google.maps.places.v1;

public interface RoutingParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.RoutingParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. An explicit routing origin that overrides the origin defined in
   * the polyline. By default, the polyline origin is used.
   * </pre>
   *
   * <code>.google.type.LatLng origin = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the origin field is set.
   */
  boolean hasOrigin();
  /**
   *
   *
   * <pre>
   * Optional. An explicit routing origin that overrides the origin defined in
   * the polyline. By default, the polyline origin is used.
   * </pre>
   *
   * <code>.google.type.LatLng origin = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The origin.
   */
  com.google.type.LatLng getOrigin();
  /**
   *
   *
   * <pre>
   * Optional. An explicit routing origin that overrides the origin defined in
   * the polyline. By default, the polyline origin is used.
   * </pre>
   *
   * <code>.google.type.LatLng origin = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.type.LatLngOrBuilder getOriginOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The travel mode.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.TravelMode travel_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for travelMode.
   */
  int getTravelModeValue();
  /**
   *
   *
   * <pre>
   * Optional. The travel mode.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.TravelMode travel_mode = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The travelMode.
   */
  com.google.maps.places.v1.TravelMode getTravelMode();

  /**
   *
   *
   * <pre>
   * Optional. The route modifiers.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.RouteModifiers route_modifiers = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the routeModifiers field is set.
   */
  boolean hasRouteModifiers();
  /**
   *
   *
   * <pre>
   * Optional. The route modifiers.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.RouteModifiers route_modifiers = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The routeModifiers.
   */
  com.google.maps.places.v1.RouteModifiers getRouteModifiers();
  /**
   *
   *
   * <pre>
   * Optional. The route modifiers.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.RouteModifiers route_modifiers = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.places.v1.RouteModifiersOrBuilder getRouteModifiersOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specifies how to compute the routing summaries. The server
   * attempts to use the selected routing preference to compute the route. The
   * traffic aware routing preference is only available for the `DRIVE` or
   * `TWO_WHEELER` `travelMode`.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.RoutingPreference routing_preference = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for routingPreference.
   */
  int getRoutingPreferenceValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies how to compute the routing summaries. The server
   * attempts to use the selected routing preference to compute the route. The
   * traffic aware routing preference is only available for the `DRIVE` or
   * `TWO_WHEELER` `travelMode`.
   * </pre>
   *
   * <code>
   * .google.maps.places.v1.RoutingPreference routing_preference = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The routingPreference.
   */
  com.google.maps.places.v1.RoutingPreference getRoutingPreference();
}
