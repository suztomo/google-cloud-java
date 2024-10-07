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
// source: google/cloud/oracledatabase/v1/entitlement.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.oracledatabase.v1;

public final class EntitlementProto {
  private EntitlementProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oracledatabase_v1_Entitlement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oracledatabase_v1_Entitlement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oracledatabase_v1_CloudAccountDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oracledatabase_v1_CloudAccountDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/oracledatabase/v1/entitle"
          + "ment.proto\022\036google.cloud.oracledatabase."
          + "v1\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\"\305\003\n\013Entitlement\022\021"
          + "\n\004name\030\001 \001(\tB\003\340A\010\022R\n\025cloud_account_detai"
          + "ls\030\002 \001(\01323.google.cloud.oracledatabase.v"
          + "1.CloudAccountDetails\022\033\n\016entitlement_id\030"
          + "\003 \001(\tB\003\340A\003\022E\n\005state\030\004 \001(\01621.google.cloud"
          + ".oracledatabase.v1.Entitlement.StateB\003\340A"
          + "\003\"Z\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\026\n\022ACC"
          + "OUNT_NOT_LINKED\020\001\022\026\n\022ACCOUNT_NOT_ACTIVE\020"
          + "\002\022\n\n\006ACTIVE\020\003:\216\001\352A\212\001\n)oracledatabase.goo"
          + "gleapis.com/Entitlement\022Bprojects/{proje"
          + "ct}/locations/{location}/entitlements/{e"
          + "ntitlement}*\014entitlements2\013entitlement\"\345"
          + "\001\n\023CloudAccountDetails\022\032\n\rcloud_account\030"
          + "\001 \001(\tB\003\340A\003\022&\n\031cloud_account_home_region\030"
          + "\002 \001(\tB\003\340A\003\022+\n\031link_existing_account_uri\030"
          + "\003 \001(\tB\003\340A\003H\000\210\001\001\022&\n\024account_creation_uri\030"
          + "\004 \001(\tB\003\340A\003H\001\210\001\001B\034\n\032_link_existing_accoun"
          + "t_uriB\027\n\025_account_creation_uriB\352\001\n\"com.g"
          + "oogle.cloud.oracledatabase.v1B\020Entitleme"
          + "ntProtoP\001ZJcloud.google.com/go/oracledat"
          + "abase/apiv1/oracledatabasepb;oracledatab"
          + "asepb\252\002\036Google.Cloud.OracleDatabase.V1\312\002"
          + "\036Google\\Cloud\\OracleDatabase\\V1\352\002!Google"
          + "::Cloud::OracleDatabase::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_oracledatabase_v1_Entitlement_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_oracledatabase_v1_Entitlement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oracledatabase_v1_Entitlement_descriptor,
            new java.lang.String[] {
              "Name", "CloudAccountDetails", "EntitlementId", "State",
            });
    internal_static_google_cloud_oracledatabase_v1_CloudAccountDetails_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_oracledatabase_v1_CloudAccountDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oracledatabase_v1_CloudAccountDetails_descriptor,
            new java.lang.String[] {
              "CloudAccount",
              "CloudAccountHomeRegion",
              "LinkExistingAccountUri",
              "AccountCreationUri",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
