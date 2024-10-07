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
// source: google/cloud/oracledatabase/v1/exadata_infra.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.oracledatabase.v1;

public interface CloudExadataInfrastructurePropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oracledatabase.v1.CloudExadataInfrastructureProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. OCID of created infra.
   * https://docs.oracle.com/en-us/iaas/Content/General/Concepts/identifiers.htm#Oracle
   * </pre>
   *
   * <code>string ocid = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ocid.
   */
  java.lang.String getOcid();
  /**
   *
   *
   * <pre>
   * Output only. OCID of created infra.
   * https://docs.oracle.com/en-us/iaas/Content/General/Concepts/identifiers.htm#Oracle
   * </pre>
   *
   * <code>string ocid = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ocid.
   */
  com.google.protobuf.ByteString getOcidBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of compute servers for the Exadata Infrastructure.
   * </pre>
   *
   * <code>int32 compute_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The computeCount.
   */
  int getComputeCount();

  /**
   *
   *
   * <pre>
   * Optional. The number of Cloud Exadata storage servers for the Exadata
   * Infrastructure.
   * </pre>
   *
   * <code>int32 storage_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The storageCount.
   */
  int getStorageCount();

  /**
   *
   *
   * <pre>
   * Optional. The total storage allocated to the Exadata Infrastructure
   * resource, in gigabytes (GB).
   * </pre>
   *
   * <code>int32 total_storage_size_gb = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The totalStorageSizeGb.
   */
  int getTotalStorageSizeGb();

  /**
   *
   *
   * <pre>
   * Output only. The available storage can be allocated to the Exadata
   * Infrastructure resource, in gigabytes (GB).
   * </pre>
   *
   * <code>int32 available_storage_size_gb = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The availableStorageSizeGb.
   */
  int getAvailableStorageSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. Maintenance window for repair.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.MaintenanceWindow maintenance_window = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maintenanceWindow field is set.
   */
  boolean hasMaintenanceWindow();
  /**
   *
   *
   * <pre>
   * Optional. Maintenance window for repair.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.MaintenanceWindow maintenance_window = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maintenanceWindow.
   */
  com.google.cloud.oracledatabase.v1.MaintenanceWindow getMaintenanceWindow();
  /**
   *
   *
   * <pre>
   * Optional. Maintenance window for repair.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.MaintenanceWindow maintenance_window = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.oracledatabase.v1.MaintenanceWindowOrBuilder getMaintenanceWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current lifecycle state of the Exadata Infrastructure.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudExadataInfrastructureProperties.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current lifecycle state of the Exadata Infrastructure.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.CloudExadataInfrastructureProperties.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.oracledatabase.v1.CloudExadataInfrastructureProperties.State getState();

  /**
   *
   *
   * <pre>
   * Required. The shape of the Exadata Infrastructure. The shape determines the
   * amount of CPU, storage, and memory resources allocated to the instance.
   * </pre>
   *
   * <code>string shape = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The shape.
   */
  java.lang.String getShape();
  /**
   *
   *
   * <pre>
   * Required. The shape of the Exadata Infrastructure. The shape determines the
   * amount of CPU, storage, and memory resources allocated to the instance.
   * </pre>
   *
   * <code>string shape = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for shape.
   */
  com.google.protobuf.ByteString getShapeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Deep link to the OCI console to view this resource.
   * </pre>
   *
   * <code>string oci_url = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ociUrl.
   */
  java.lang.String getOciUrl();
  /**
   *
   *
   * <pre>
   * Output only. Deep link to the OCI console to view this resource.
   * </pre>
   *
   * <code>string oci_url = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ociUrl.
   */
  com.google.protobuf.ByteString getOciUrlBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of enabled CPU cores.
   * </pre>
   *
   * <code>int32 cpu_count = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The cpuCount.
   */
  int getCpuCount();

  /**
   *
   *
   * <pre>
   * Output only. The total number of CPU cores available.
   * </pre>
   *
   * <code>int32 max_cpu_count = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The maxCpuCount.
   */
  int getMaxCpuCount();

  /**
   *
   *
   * <pre>
   * Optional. The memory allocated in GBs.
   * </pre>
   *
   * <code>int32 memory_size_gb = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The memorySizeGb.
   */
  int getMemorySizeGb();

  /**
   *
   *
   * <pre>
   * Output only. The total memory available in GBs.
   * </pre>
   *
   * <code>int32 max_memory_gb = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The maxMemoryGb.
   */
  int getMaxMemoryGb();

  /**
   *
   *
   * <pre>
   * Optional. The local node storage allocated in GBs.
   * </pre>
   *
   * <code>int32 db_node_storage_size_gb = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dbNodeStorageSizeGb.
   */
  int getDbNodeStorageSizeGb();

  /**
   *
   *
   * <pre>
   * Output only. The total local node storage available in GBs.
   * </pre>
   *
   * <code>int32 max_db_node_storage_size_gb = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The maxDbNodeStorageSizeGb.
   */
  int getMaxDbNodeStorageSizeGb();

  /**
   *
   *
   * <pre>
   * Output only. Size, in terabytes, of the DATA disk group.
   * </pre>
   *
   * <code>double data_storage_size_tb = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dataStorageSizeTb.
   */
  double getDataStorageSizeTb();

  /**
   *
   *
   * <pre>
   * Output only. The total available DATA disk group size.
   * </pre>
   *
   * <code>double max_data_storage_tb = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The maxDataStorageTb.
   */
  double getMaxDataStorageTb();

  /**
   *
   *
   * <pre>
   * Output only. The requested number of additional storage servers activated
   * for the Exadata Infrastructure.
   * </pre>
   *
   * <code>int32 activated_storage_count = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The activatedStorageCount.
   */
  int getActivatedStorageCount();

  /**
   *
   *
   * <pre>
   * Output only. The requested number of additional storage servers for the
   * Exadata Infrastructure.
   * </pre>
   *
   * <code>int32 additional_storage_count = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The additionalStorageCount.
   */
  int getAdditionalStorageCount();

  /**
   *
   *
   * <pre>
   * Output only. The software version of the database servers (dom0) in the
   * Exadata Infrastructure.
   * </pre>
   *
   * <code>string db_server_version = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The dbServerVersion.
   */
  java.lang.String getDbServerVersion();
  /**
   *
   *
   * <pre>
   * Output only. The software version of the database servers (dom0) in the
   * Exadata Infrastructure.
   * </pre>
   *
   * <code>string db_server_version = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for dbServerVersion.
   */
  com.google.protobuf.ByteString getDbServerVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The software version of the storage servers (cells) in the
   * Exadata Infrastructure.
   * </pre>
   *
   * <code>string storage_server_version = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The storageServerVersion.
   */
  java.lang.String getStorageServerVersion();
  /**
   *
   *
   * <pre>
   * Output only. The software version of the storage servers (cells) in the
   * Exadata Infrastructure.
   * </pre>
   *
   * <code>string storage_server_version = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for storageServerVersion.
   */
  com.google.protobuf.ByteString getStorageServerVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The OCID of the next maintenance run.
   * </pre>
   *
   * <code>string next_maintenance_run_id = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nextMaintenanceRunId.
   */
  java.lang.String getNextMaintenanceRunId();
  /**
   *
   *
   * <pre>
   * Output only. The OCID of the next maintenance run.
   * </pre>
   *
   * <code>string next_maintenance_run_id = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nextMaintenanceRunId.
   */
  com.google.protobuf.ByteString getNextMaintenanceRunIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the next maintenance run will occur.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_maintenance_run_time = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the nextMaintenanceRunTime field is set.
   */
  boolean hasNextMaintenanceRunTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the next maintenance run will occur.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_maintenance_run_time = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The nextMaintenanceRunTime.
   */
  com.google.protobuf.Timestamp getNextMaintenanceRunTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the next maintenance run will occur.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_maintenance_run_time = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getNextMaintenanceRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the next security maintenance run will occur.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_security_maintenance_run_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the nextSecurityMaintenanceRunTime field is set.
   */
  boolean hasNextSecurityMaintenanceRunTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the next security maintenance run will occur.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_security_maintenance_run_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The nextSecurityMaintenanceRunTime.
   */
  com.google.protobuf.Timestamp getNextSecurityMaintenanceRunTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the next security maintenance run will occur.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_security_maintenance_run_time = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getNextSecurityMaintenanceRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The list of customer contacts.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.oracledatabase.v1.CustomerContact customer_contacts = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.oracledatabase.v1.CustomerContact> getCustomerContactsList();
  /**
   *
   *
   * <pre>
   * Optional. The list of customer contacts.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.oracledatabase.v1.CustomerContact customer_contacts = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.oracledatabase.v1.CustomerContact getCustomerContacts(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of customer contacts.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.oracledatabase.v1.CustomerContact customer_contacts = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getCustomerContactsCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of customer contacts.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.oracledatabase.v1.CustomerContact customer_contacts = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.oracledatabase.v1.CustomerContactOrBuilder>
      getCustomerContactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The list of customer contacts.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.oracledatabase.v1.CustomerContact customer_contacts = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.oracledatabase.v1.CustomerContactOrBuilder getCustomerContactsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The monthly software version of the storage servers (cells)
   * in the Exadata Infrastructure. Example: 20.1.15
   * </pre>
   *
   * <code>string monthly_storage_server_version = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The monthlyStorageServerVersion.
   */
  java.lang.String getMonthlyStorageServerVersion();
  /**
   *
   *
   * <pre>
   * Output only. The monthly software version of the storage servers (cells)
   * in the Exadata Infrastructure. Example: 20.1.15
   * </pre>
   *
   * <code>string monthly_storage_server_version = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for monthlyStorageServerVersion.
   */
  com.google.protobuf.ByteString getMonthlyStorageServerVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The monthly software version of the database servers (dom0)
   * in the Exadata Infrastructure. Example: 20.1.15
   * </pre>
   *
   * <code>string monthly_db_server_version = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The monthlyDbServerVersion.
   */
  java.lang.String getMonthlyDbServerVersion();
  /**
   *
   *
   * <pre>
   * Output only. The monthly software version of the database servers (dom0)
   * in the Exadata Infrastructure. Example: 20.1.15
   * </pre>
   *
   * <code>string monthly_db_server_version = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for monthlyDbServerVersion.
   */
  com.google.protobuf.ByteString getMonthlyDbServerVersionBytes();
}
