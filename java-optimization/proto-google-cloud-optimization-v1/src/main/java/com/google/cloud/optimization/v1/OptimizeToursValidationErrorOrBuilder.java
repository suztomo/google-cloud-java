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

public interface OptimizeToursValidationErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.OptimizeToursValidationError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A validation error is defined by the pair (`code`, `display_name`) which
   * are always present.
   *
   * Other fields (below) provide more context about the error.
   *
   * *MULTIPLE ERRORS*:
   * When there are multiple errors, the validation process tries to output
   * several of them. Much like a compiler, this is an imperfect process. Some
   * validation errors will be "fatal", meaning that they stop the entire
   * validation process. This is the case for `display_name="UNSPECIFIED"`
   * errors, among others. Some may cause the validation process to skip other
   * errors.
   *
   * *STABILITY*:
   * `code` and `display_name` should be very stable. But new codes and
   * display names may appear over time, which may cause a given (invalid)
   * request to yield a different (`code`, `display_name`) pair because the new
   * error hid the old one (see "MULTIPLE ERRORS").
   *
   * *REFERENCE*: A list of all (code, name) pairs:
   *
   * * UNSPECIFIED = 0;
   * * VALIDATION_TIMEOUT_ERROR = 10; Validation couldn't be completed within
   * the deadline.
   *
   * * REQUEST_OPTIONS_ERROR = 12;
   *     * REQUEST_OPTIONS_INVALID_SOLVING_MODE = 1201;
   *     * REQUEST_OPTIONS_INVALID_MAX_VALIDATION_ERRORS = 1203;
   *     * REQUEST_OPTIONS_INVALID_GEODESIC_METERS_PER_SECOND = 1204;
   *     * REQUEST_OPTIONS_GEODESIC_METERS_PER_SECOND_TOO_SMALL = 1205;
   *     * REQUEST_OPTIONS_MISSING_GEODESIC_METERS_PER_SECOND = 1206;
   *     * REQUEST_OPTIONS_POPULATE_PATHFINDER_TRIPS_AND_GEODESIC_DISTANCE
   *       = 1207;
   *     * REQUEST_OPTIONS_COST_MODEL_OPTIONS_AND_GEODESIC_DISTANCE = 1208;
   *     * REQUEST_OPTIONS_TRAVEL_MODE_INCOMPATIBLE_WITH_TRAFFIC = 1211;
   *     * REQUEST_OPTIONS_MULTIPLE_TRAFFIC_FLAVORS = 1212;
   *     * REQUEST_OPTIONS_INVALID_TRAFFIC_FLAVOR = 1213;
   *     * REQUEST_OPTIONS_TRAFFIC_ENABLED_WITHOUT_GLOBAL_START_TIME = 1214;
   *     * REQUEST_OPTIONS_TRAFFIC_ENABLED_WITH_PRECEDENCES = 1215;
   *     * REQUEST_OPTIONS_TRAFFIC_PREFILL_MODE_INVALID = 1216;
   *     * REQUEST_OPTIONS_TRAFFIC_PREFILL_ENABLED_WITHOUT_TRAFFIC = 1217;
   * * INJECTED_SOLUTION_ERROR = 20;
   *     * INJECTED_SOLUTION_MISSING_LABEL = 2000;
   *     * INJECTED_SOLUTION_DUPLICATE_LABEL = 2001;
   *     * INJECTED_SOLUTION_AMBIGUOUS_INDEX = 2002;
   *     * INJECTED_SOLUTION_INFEASIBLE_AFTER_GETTING_TRAVEL_TIMES = 2003;
   *     * INJECTED_SOLUTION_TRANSITION_INCONSISTENT_WITH_ACTUAL_TRAVEL = 2004;
   *     * INJECTED_SOLUTION_CONCURRENT_SOLUTION_TYPES = 2005;
   *     * INJECTED_SOLUTION_MORE_THAN_ONE_PER_TYPE = 2006;
   *     * INJECTED_SOLUTION_REFRESH_WITHOUT_POPULATE = 2008;
   *     * INJECTED_SOLUTION_CONSTRAINED_ROUTE_PORTION_INFEASIBLE = 2010;
   * * SHIPMENT_MODEL_ERROR = 22;
   *     * SHIPMENT_MODEL_TOO_LARGE = 2200;
   *     * SHIPMENT_MODEL_TOO_MANY_CAPACITY_TYPES = 2201;
   *     * SHIPMENT_MODEL_GLOBAL_START_TIME_NEGATIVE_OR_NAN = 2202;
   *     * SHIPMENT_MODEL_GLOBAL_END_TIME_TOO_LARGE_OR_NAN = 2203;
   *     * SHIPMENT_MODEL_GLOBAL_START_TIME_AFTER_GLOBAL_END_TIME = 2204;
   *     * SHIPMENT_MODEL_GLOBAL_DURATION_TOO_LONG = 2205;
   *     * SHIPMENT_MODEL_MAX_ACTIVE_VEHICLES_NOT_POSITIVE = 2206;
   *     * SHIPMENT_MODEL_DURATION_MATRIX_TOO_LARGE = 2207;
   * * INDEX_ERROR = 24;
   * * TAG_ERROR = 26;
   * * TIME_WINDOW_ERROR = 28;
   *     * TIME_WINDOW_INVALID_START_TIME = 2800;
   *     * TIME_WINDOW_INVALID_END_TIME = 2801;
   *     * TIME_WINDOW_INVALID_SOFT_START_TIME = 2802;
   *     * TIME_WINDOW_INVALID_SOFT_END_TIME = 2803;
   *     * TIME_WINDOW_OUTSIDE_GLOBAL_TIME_WINDOW = 2804;
   *     * TIME_WINDOW_START_TIME_AFTER_END_TIME = 2805;
   *     * TIME_WINDOW_INVALID_COST_PER_HOUR_BEFORE_SOFT_START_TIME = 2806;
   *     * TIME_WINDOW_INVALID_COST_PER_HOUR_AFTER_SOFT_END_TIME = 2807;
   *     * TIME_WINDOW_COST_BEFORE_SOFT_START_TIME_WITHOUT_SOFT_START_TIME
   *       = 2808;
   *     * TIME_WINDOW_COST_AFTER_SOFT_END_TIME_WITHOUT_SOFT_END_TIME = 2809;
   *     * TIME_WINDOW_SOFT_START_TIME_WITHOUT_COST_BEFORE_SOFT_START_TIME
   *       = 2810;
   *     * TIME_WINDOW_SOFT_END_TIME_WITHOUT_COST_AFTER_SOFT_END_TIME = 2811;
   *     * TIME_WINDOW_OVERLAPPING_ADJACENT_OR_EARLIER_THAN_PREVIOUS = 2812;
   *     * TIME_WINDOW_START_TIME_AFTER_SOFT_START_TIME = 2813;
   *     * TIME_WINDOW_SOFT_START_TIME_AFTER_END_TIME = 2814;
   *     * TIME_WINDOW_START_TIME_AFTER_SOFT_END_TIME = 2815;
   *     * TIME_WINDOW_SOFT_END_TIME_AFTER_END_TIME = 2816;
   *     * TIME_WINDOW_COST_BEFORE_SOFT_START_TIME_SET_AND_MULTIPLE_WINDOWS
   *       = 2817;
   *     * TIME_WINDOW_COST_AFTER_SOFT_END_TIME_SET_AND_MULTIPLE_WINDOWS = 2818;
   *     * TRANSITION_ATTRIBUTES_ERROR = 30;
   *     * TRANSITION_ATTRIBUTES_INVALID_COST = 3000;
   *     * TRANSITION_ATTRIBUTES_INVALID_COST_PER_KILOMETER = 3001;
   *     * TRANSITION_ATTRIBUTES_DUPLICATE_TAG_PAIR = 3002;
   *     * TRANSITION_ATTRIBUTES_DISTANCE_LIMIT_MAX_METERS_UNSUPPORTED = 3003;
   *     * TRANSITION_ATTRIBUTES_UNSPECIFIED_SOURCE_TAGS = 3004;
   *     * TRANSITION_ATTRIBUTES_CONFLICTING_SOURCE_TAGS_FIELDS = 3005;
   *     * TRANSITION_ATTRIBUTES_UNSPECIFIED_DESTINATION_TAGS = 3006;
   *     * TRANSITION_ATTRIBUTES_CONFLICTING_DESTINATION_TAGS_FIELDS = 3007;
   *     * TRANSITION_ATTRIBUTES_DELAY_DURATION_NEGATIVE_OR_NAN = 3008;
   *     * TRANSITION_ATTRIBUTES_DELAY_DURATION_EXCEEDS_GLOBAL_DURATION = 3009;
   * * AMOUNT_ERROR = 31;
   *     * AMOUNT_NEGATIVE_VALUE = 3100;
   * * LOAD_LIMIT_ERROR = 33;
   *     * LOAD_LIMIT_INVALID_COST_ABOVE_SOFT_MAX = 3303;
   *     * LOAD_LIMIT_SOFT_MAX_WITHOUT_COST_ABOVE_SOFT_MAX = 3304;
   *     * LOAD_LIMIT_COST_ABOVE_SOFT_MAX_WITHOUT_SOFT_MAX = 3305;
   *     * LOAD_LIMIT_NEGATIVE_SOFT_MAX = 3306;
   *     * LOAD_LIMIT_MIXED_DEMAND_TYPE = 3307;
   *     * LOAD_LIMIT_MAX_LOAD_NEGATIVE_VALUE = 3308;
   *     * LOAD_LIMIT_SOFT_MAX_ABOVE_MAX = 3309;
   * * INTERVAL_ERROR = 34;
   *     * INTERVAL_MIN_EXCEEDS_MAX = 3401;
   *     * INTERVAL_NEGATIVE_MIN = 3402;
   *     * INTERVAL_NEGATIVE_MAX = 3403;
   *     * INTERVAL_MIN_EXCEEDS_CAPACITY = 3404;
   *     * INTERVAL_MAX_EXCEEDS_CAPACITY = 3405;
   * * DISTANCE_LIMIT_ERROR = 36;
   *     * DISTANCE_LIMIT_INVALID_COST_AFTER_SOFT_MAX = 3601;
   *     * DISTANCE_LIMIT_SOFT_MAX_WITHOUT_COST_AFTER_SOFT_MAX = 3602;
   *     * DISTANCE_LIMIT_COST_AFTER_SOFT_MAX_WITHOUT_SOFT_MAX = 3603;
   *     * DISTANCE_LIMIT_NEGATIVE_MAX = 3604;
   *     * DISTANCE_LIMIT_NEGATIVE_SOFT_MAX = 3605;
   *     * DISTANCE_LIMIT_SOFT_MAX_LARGER_THAN_MAX = 3606;
   * * DURATION_LIMIT_ERROR = 38;
   *     * DURATION_LIMIT_MAX_DURATION_NEGATIVE_OR_NAN = 3800;
   *     * DURATION_LIMIT_SOFT_MAX_DURATION_NEGATIVE_OR_NAN = 3801;
   *     * DURATION_LIMIT_INVALID_COST_PER_HOUR_AFTER_SOFT_MAX = 3802;
   *     * DURATION_LIMIT_SOFT_MAX_WITHOUT_COST_AFTER_SOFT_MAX = 3803;
   *     * DURATION_LIMIT_COST_AFTER_SOFT_MAX_WITHOUT_SOFT_MAX = 3804;
   *     * DURATION_LIMIT_QUADRATIC_SOFT_MAX_DURATION_NEGATIVE_OR_NAN = 3805;
   *     * DURATION_LIMIT_INVALID_COST_AFTER_QUADRATIC_SOFT_MAX = 3806;
   *     * DURATION_LIMIT_QUADRATIC_SOFT_MAX_WITHOUT_COST_PER_SQUARE_HOUR
   *       = 3807;
   *     * DURATION_LIMIT_COST_PER_SQUARE_HOUR_WITHOUT_QUADRATIC_SOFT_MAX
   *       = 3808;
   *     * DURATION_LIMIT_QUADRATIC_SOFT_MAX_WITHOUT_MAX = 3809;
   *     * DURATION_LIMIT_SOFT_MAX_LARGER_THAN_MAX = 3810;
   *     * DURATION_LIMIT_QUADRATIC_SOFT_MAX_LARGER_THAN_MAX = 3811;
   *     * DURATION_LIMIT_DIFF_BETWEEN_MAX_AND_QUADRATIC_SOFT_MAX_TOO_LARGE
   *       = 3812;
   *     * DURATION_LIMIT_MAX_DURATION_EXCEEDS_GLOBAL_DURATION = 3813;
   *     * DURATION_LIMIT_SOFT_MAX_DURATION_EXCEEDS_GLOBAL_DURATION = 3814;
   *     * DURATION_LIMIT_QUADRATIC_SOFT_MAX_DURATION_EXCEEDS_GLOBAL_DURATION
   *       = 3815;
   * * SHIPMENT_ERROR = 40;
   *     * SHIPMENT_PD_LIMIT_WITHOUT_PICKUP_AND_DELIVERY = 4014;
   *     * SHIPMENT_PD_ABSOLUTE_DETOUR_LIMIT_DURATION_NEGATIVE_OR_NAN = 4000;
   *     * SHIPMENT_PD_ABSOLUTE_DETOUR_LIMIT_DURATION_EXCEEDS_GLOBAL_DURATION
   *       = 4001;
   *     * SHIPMENT_PD_RELATIVE_DETOUR_LIMIT_INVALID = 4015;
   *     * SHIPMENT_PD_DETOUR_LIMIT_AND_EXTRA_VISIT_DURATION = 4016;
   *     * SHIPMENT_PD_TIME_LIMIT_DURATION_NEGATIVE_OR_NAN = 4002;
   *     * SHIPMENT_PD_TIME_LIMIT_DURATION_EXCEEDS_GLOBAL_DURATION = 4003;
   *     * SHIPMENT_EMPTY_SHIPMENT_TYPE = 4004;
   *     * SHIPMENT_NO_PICKUP_NO_DELIVERY = 4005;
   *     * SHIPMENT_INVALID_PENALTY_COST = 4006;
   *     * SHIPMENT_ALLOWED_VEHICLE_INDEX_OUT_OF_BOUNDS = 4007;
   *     * SHIPMENT_DUPLICATE_ALLOWED_VEHICLE_INDEX = 4008;
   *     * SHIPMENT_INCONSISTENT_COST_FOR_VEHICLE_SIZE_WITHOUT_INDEX = 4009;
   *     * SHIPMENT_INCONSISTENT_COST_FOR_VEHICLE_SIZE_WITH_INDEX = 4010;
   *     * SHIPMENT_INVALID_COST_FOR_VEHICLE = 4011;
   *     * SHIPMENT_COST_FOR_VEHICLE_INDEX_OUT_OF_BOUNDS = 4012;
   *     * SHIPMENT_DUPLICATE_COST_FOR_VEHICLE_INDEX = 4013;
   * * VEHICLE_ERROR = 42;
   *     * VEHICLE_EMPTY_REQUIRED_OPERATOR_TYPE = 4200;
   *     * VEHICLE_DUPLICATE_REQUIRED_OPERATOR_TYPE = 4201;
   *     * VEHICLE_NO_OPERATOR_WITH_REQUIRED_OPERATOR_TYPE = 4202;
   *     * VEHICLE_EMPTY_START_TAG = 4203;
   *     * VEHICLE_DUPLICATE_START_TAG = 4204;
   *     * VEHICLE_EMPTY_END_TAG = 4205;
   *     * VEHICLE_DUPLICATE_END_TAG = 4206;
   *     * VEHICLE_EXTRA_VISIT_DURATION_NEGATIVE_OR_NAN = 4207;
   *     * VEHICLE_EXTRA_VISIT_DURATION_EXCEEDS_GLOBAL_DURATION = 4208;
   *     * VEHICLE_EXTRA_VISIT_DURATION_EMPTY_KEY = 4209;
   *     * VEHICLE_FIRST_SHIPMENT_INDEX_OUT_OF_BOUNDS = 4210;
   *     * VEHICLE_FIRST_SHIPMENT_IGNORED = 4211;
   *     * VEHICLE_FIRST_SHIPMENT_NOT_BOUND = 4212;
   *     * VEHICLE_LAST_SHIPMENT_INDEX_OUT_OF_BOUNDS = 4213;
   *     * VEHICLE_LAST_SHIPMENT_IGNORED = 4214;
   *     * VEHICLE_LAST_SHIPMENT_NOT_BOUND = 4215;
   *     * VEHICLE_IGNORED_WITH_USED_IF_ROUTE_IS_EMPTY = 4216;
   *     * VEHICLE_INVALID_COST_PER_KILOMETER = 4217;
   *     * VEHICLE_INVALID_COST_PER_HOUR = 4218;
   *     * VEHICLE_INVALID_COST_PER_TRAVELED_HOUR = 4219;
   *     * VEHICLE_INVALID_FIXED_COST = 4220;
   *     * VEHICLE_INVALID_TRAVEL_DURATION_MULTIPLE = 4221;
   *     * VEHICLE_TRAVEL_DURATION_MULTIPLE_WITH_SHIPMENT_PD_DETOUR_LIMITS
   *       = 4223;
   *     * VEHICLE_MATRIX_INDEX_WITH_SHIPMENT_PD_DETOUR_LIMITS = 4224;
   *     * VEHICLE_MINIMUM_DURATION_LONGER_THAN_DURATION_LIMIT = 4222;
   * * VISIT_REQUEST_ERROR = 44;
   *     * VISIT_REQUEST_EMPTY_TAG = 4400;
   *     * VISIT_REQUEST_DUPLICATE_TAG = 4401;
   *     * VISIT_REQUEST_DURATION_NEGATIVE_OR_NAN = 4404;
   *     * VISIT_REQUEST_DURATION_EXCEEDS_GLOBAL_DURATION = 4405;
   * * PRECEDENCE_ERROR = 46;
   * * BREAK_ERROR = 48;
   *     * BREAK_RULE_EMPTY = 4800;
   *     * BREAK_REQUEST_UNSPECIFIED_DURATION = 4801;
   *     * BREAK_REQUEST_UNSPECIFIED_EARLIEST_START_TIME = 4802;
   *     * BREAK_REQUEST_UNSPECIFIED_LATEST_START_TIME = 4803;
   *     * BREAK_REQUEST_DURATION_NEGATIVE_OR_NAN = 4804; = 4804;
   *     * BREAK_REQUEST_LATEST_START_TIME_BEFORE_EARLIEST_START_TIME = 4805;
   *     * BREAK_REQUEST_EARLIEST_START_TIME_BEFORE_GLOBAL_START_TIME = 4806;
   *     * BREAK_REQUEST_LATEST_END_TIME_AFTER_GLOBAL_END_TIME = 4807;
   *     * BREAK_REQUEST_NON_SCHEDULABLE = 4808;
   *     * BREAK_FREQUENCY_MAX_INTER_BREAK_DURATION_NEGATIVE_OR_NAN = 4809;
   *     * BREAK_FREQUENCY_MIN_BREAK_DURATION_NEGATIVE_OR_NAN = 4810;
   *     * BREAK_FREQUENCY_MIN_BREAK_DURATION_EXCEEDS_GLOBAL_DURATION = 4811;
   *     * BREAK_FREQUENCY_MAX_INTER_BREAK_DURATION_EXCEEDS_GLOBAL_DURATION
   *       = 4812;
   *     * BREAK_REQUEST_DURATION_EXCEEDS_GLOBAL_DURATION = 4813;
   *     * BREAK_FREQUENCY_MISSING_MAX_INTER_BREAK_DURATION = 4814;
   *     * BREAK_FREQUENCY_MISSING_MIN_BREAK_DURATION = 4815;
   * * SHIPMENT_TYPE_INCOMPATIBILITY_ERROR = 50;
   *     * SHIPMENT_TYPE_INCOMPATIBILITY_EMPTY_TYPE = 5001;
   *     * SHIPMENT_TYPE_INCOMPATIBILITY_LESS_THAN_TWO_TYPES = 5002;
   *     * SHIPMENT_TYPE_INCOMPATIBILITY_DUPLICATE_TYPE = 5003;
   *     * SHIPMENT_TYPE_INCOMPATIBILITY_INVALID_INCOMPATIBILITY_MODE = 5004;
   *     * SHIPMENT_TYPE_INCOMPATIBILITY_TOO_MANY_INCOMPATIBILITIES = 5005;
   * * SHIPMENT_TYPE_REQUIREMENT_ERROR = 52;
   *     * SHIPMENT_TYPE_REQUIREMENT_NO_REQUIRED_TYPE = 52001;
   *     * SHIPMENT_TYPE_REQUIREMENT_NO_DEPENDENT_TYPE = 52002;
   *     * SHIPMENT_TYPE_REQUIREMENT_INVALID_REQUIREMENT_MODE = 52003;
   *     * SHIPMENT_TYPE_REQUIREMENT_TOO_MANY_REQUIREMENTS = 52004;
   *     * SHIPMENT_TYPE_REQUIREMENT_EMPTY_REQUIRED_TYPE = 52005;
   *     * SHIPMENT_TYPE_REQUIREMENT_DUPLICATE_REQUIRED_TYPE = 52006;
   *     * SHIPMENT_TYPE_REQUIREMENT_NO_REQUIRED_TYPE_FOUND = 52007;
   *     * SHIPMENT_TYPE_REQUIREMENT_EMPTY_DEPENDENT_TYPE = 52008;
   *     * SHIPMENT_TYPE_REQUIREMENT_DUPLICATE_DEPENDENT_TYPE = 52009;
   *     * SHIPMENT_TYPE_REQUIREMENT_SELF_DEPENDENT_TYPE = 52010;
   *     * SHIPMENT_TYPE_REQUIREMENT_GRAPH_HAS_CYCLES = 52011;
   * * VEHICLE_OPERATOR_ERROR = 54;
   *     * VEHICLE_OPERATOR_EMPTY_TYPE = 5400;
   *     * VEHICLE_OPERATOR_MULTIPLE_START_TIME_WINDOWS = 5401;
   *     * VEHICLE_OPERATOR_SOFT_START_TIME_WINDOW = 5402;
   *     * VEHICLE_OPERATOR_MULTIPLE_END_TIME_WINDOWS = 5403;
   *     * VEHICLE_OPERATOR_SOFT_END_TIME_WINDOW = 5404;
   * * DURATION_SECONDS_MATRIX_ERROR = 56;
   *     * DURATION_SECONDS_MATRIX_DURATION_NEGATIVE_OR_NAN = 5600;
   *     * DURATION_SECONDS_MATRIX_DURATION_EXCEEDS_GLOBAL_DURATION = 5601;
   * </pre>
   *
   * <code>int32 code = 1;</code>
   *
   * @return The code.
   */
  int getCode();

  /**
   *
   *
   * <pre>
   * The error display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The error display name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * An error context may involve 0, 1 (most of the time) or more fields. For
   * example, referring to vehicle #4 and shipment #2's first pickup can be
   * done as follows:
   * ```
   * fields { name: "vehicles" index: 4}
   * fields { name: "shipments" index: 2 sub_field {name: "pickups" index: 0} }
   * ```
   * Note, however, that the cardinality of `fields` should not change for a
   * given error code.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError.FieldReference fields = 3;
   * </code>
   */
  java.util.List<com.google.cloud.optimization.v1.OptimizeToursValidationError.FieldReference>
      getFieldsList();
  /**
   *
   *
   * <pre>
   * An error context may involve 0, 1 (most of the time) or more fields. For
   * example, referring to vehicle #4 and shipment #2's first pickup can be
   * done as follows:
   * ```
   * fields { name: "vehicles" index: 4}
   * fields { name: "shipments" index: 2 sub_field {name: "pickups" index: 0} }
   * ```
   * Note, however, that the cardinality of `fields` should not change for a
   * given error code.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError.FieldReference fields = 3;
   * </code>
   */
  com.google.cloud.optimization.v1.OptimizeToursValidationError.FieldReference getFields(int index);
  /**
   *
   *
   * <pre>
   * An error context may involve 0, 1 (most of the time) or more fields. For
   * example, referring to vehicle #4 and shipment #2's first pickup can be
   * done as follows:
   * ```
   * fields { name: "vehicles" index: 4}
   * fields { name: "shipments" index: 2 sub_field {name: "pickups" index: 0} }
   * ```
   * Note, however, that the cardinality of `fields` should not change for a
   * given error code.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError.FieldReference fields = 3;
   * </code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * An error context may involve 0, 1 (most of the time) or more fields. For
   * example, referring to vehicle #4 and shipment #2's first pickup can be
   * done as follows:
   * ```
   * fields { name: "vehicles" index: 4}
   * fields { name: "shipments" index: 2 sub_field {name: "pickups" index: 0} }
   * ```
   * Note, however, that the cardinality of `fields` should not change for a
   * given error code.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError.FieldReference fields = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.optimization.v1.OptimizeToursValidationError.FieldReferenceOrBuilder>
      getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * An error context may involve 0, 1 (most of the time) or more fields. For
   * example, referring to vehicle #4 and shipment #2's first pickup can be
   * done as follows:
   * ```
   * fields { name: "vehicles" index: 4}
   * fields { name: "shipments" index: 2 sub_field {name: "pickups" index: 0} }
   * ```
   * Note, however, that the cardinality of `fields` should not change for a
   * given error code.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError.FieldReference fields = 3;
   * </code>
   */
  com.google.cloud.optimization.v1.OptimizeToursValidationError.FieldReferenceOrBuilder
      getFieldsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Human-readable string describing the error. There is a 1:1 mapping
   * between `code` and `error_message` (when code != "UNSPECIFIED").
   *
   * *STABILITY*: Not stable: the error message associated to a given `code` may
   * change (hopefully to clarify it) over time. Please rely on the
   * `display_name` and `code` instead.
   * </pre>
   *
   * <code>string error_message = 4;</code>
   *
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   *
   *
   * <pre>
   * Human-readable string describing the error. There is a 1:1 mapping
   * between `code` and `error_message` (when code != "UNSPECIFIED").
   *
   * *STABILITY*: Not stable: the error message associated to a given `code` may
   * change (hopefully to clarify it) over time. Please rely on the
   * `display_name` and `code` instead.
   * </pre>
   *
   * <code>string error_message = 4;</code>
   *
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString getErrorMessageBytes();

  /**
   *
   *
   * <pre>
   * May contain the value(s) of the field(s). This is not always available. You
   * should absolutely not rely on it and use it only for manual model
   * debugging.
   * </pre>
   *
   * <code>string offending_values = 5;</code>
   *
   * @return The offendingValues.
   */
  java.lang.String getOffendingValues();
  /**
   *
   *
   * <pre>
   * May contain the value(s) of the field(s). This is not always available. You
   * should absolutely not rely on it and use it only for manual model
   * debugging.
   * </pre>
   *
   * <code>string offending_values = 5;</code>
   *
   * @return The bytes for offendingValues.
   */
  com.google.protobuf.ByteString getOffendingValuesBytes();
}
