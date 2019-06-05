// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

public final class InstanceProto {
  private InstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Cluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Cluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AppProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AppProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/bigtable/admin/v2/instance.prot"
          + "o\022\030google.bigtable.admin.v2\032\034google/api/"
          + "annotations.proto\032%google/bigtable/admin"
          + "/v2/common.proto\"\203\003\n\010Instance\022\014\n\004name\030\001 "
          + "\001(\t\022\024\n\014display_name\030\002 \001(\t\0227\n\005state\030\003 \001(\016"
          + "2(.google.bigtable.admin.v2.Instance.Sta"
          + "te\0225\n\004type\030\004 \001(\0162\'.google.bigtable.admin"
          + ".v2.Instance.Type\022>\n\006labels\030\005 \003(\0132..goog"
          + "le.bigtable.admin.v2.Instance.LabelsEntr"
          + "y\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"5\n\005State\022\023\n\017STATE_NOT_KNOWN\020\000\022\t"
          + "\n\005READY\020\001\022\014\n\010CREATING\020\002\"=\n\004Type\022\024\n\020TYPE_"
          + "UNSPECIFIED\020\000\022\016\n\nPRODUCTION\020\001\022\017\n\013DEVELOP"
          + "MENT\020\002\"\216\002\n\007Cluster\022\014\n\004name\030\001 \001(\t\022\020\n\010loca"
          + "tion\030\002 \001(\t\0226\n\005state\030\003 \001(\0162\'.google.bigta"
          + "ble.admin.v2.Cluster.State\022\023\n\013serve_node"
          + "s\030\004 \001(\005\022C\n\024default_storage_type\030\005 \001(\0162%."
          + "google.bigtable.admin.v2.StorageType\"Q\n\005"
          + "State\022\023\n\017STATE_NOT_KNOWN\020\000\022\t\n\005READY\020\001\022\014\n"
          + "\010CREATING\020\002\022\014\n\010RESIZING\020\003\022\014\n\010DISABLED\020\004\""
          + "\202\003\n\nAppProfile\022\014\n\004name\030\001 \001(\t\022\014\n\004etag\030\002 \001"
          + "(\t\022\023\n\013description\030\003 \001(\t\022g\n\035multi_cluster"
          + "_routing_use_any\030\005 \001(\0132>.google.bigtable"
          + ".admin.v2.AppProfile.MultiClusterRouting"
          + "UseAnyH\000\022[\n\026single_cluster_routing\030\006 \001(\013"
          + "29.google.bigtable.admin.v2.AppProfile.S"
          + "ingleClusterRoutingH\000\032\033\n\031MultiClusterRou"
          + "tingUseAny\032N\n\024SingleClusterRouting\022\022\n\ncl"
          + "uster_id\030\001 \001(\t\022\"\n\032allow_transactional_wr"
          + "ites\030\002 \001(\010B\020\n\016routing_policyB\260\001\n\034com.goo"
          + "gle.bigtable.admin.v2B\rInstanceProtoP\001Z="
          + "google.golang.org/genproto/googleapis/bi"
          + "gtable/admin/v2;admin\252\002\036Google.Cloud.Big"
          + "table.Admin.V2\312\002\036Google\\Cloud\\Bigtable\\A"
          + "dmin\\V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.bigtable.admin.v2.CommonProto.getDescriptor(),
            });
    internal_static_google_bigtable_admin_v2_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_v2_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Instance_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "State", "Type", "Labels",
            });
    internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_descriptor =
        internal_static_google_bigtable_admin_v2_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_bigtable_admin_v2_Cluster_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_v2_Cluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Cluster_descriptor,
            new java.lang.String[] {
              "Name", "Location", "State", "ServeNodes", "DefaultStorageType",
            });
    internal_static_google_bigtable_admin_v2_AppProfile_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_admin_v2_AppProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AppProfile_descriptor,
            new java.lang.String[] {
              "Name",
              "Etag",
              "Description",
              "MultiClusterRoutingUseAny",
              "SingleClusterRouting",
              "RoutingPolicy",
            });
    internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_descriptor =
        internal_static_google_bigtable_admin_v2_AppProfile_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AppProfile_MultiClusterRoutingUseAny_descriptor,
            new java.lang.String[] {});
    internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_descriptor =
        internal_static_google_bigtable_admin_v2_AppProfile_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AppProfile_SingleClusterRouting_descriptor,
            new java.lang.String[] {
              "ClusterId", "AllowTransactionalWrites",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.bigtable.admin.v2.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
