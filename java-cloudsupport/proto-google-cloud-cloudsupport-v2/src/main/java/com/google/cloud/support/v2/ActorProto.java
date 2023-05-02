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
// source: google/cloud/support/v2/actor.proto

package com.google.cloud.support.v2;

public final class ActorProto {
  private ActorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_support_v2_Actor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_support_v2_Actor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/support/v2/actor.proto\022\027g"
          + "oogle.cloud.support.v2\032\037google/api/field"
          + "_behavior.proto\"I\n\005Actor\022\024\n\014display_name"
          + "\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022\033\n\016google_support\030"
          + "\004 \001(\010B\003\340A\003B\263\001\n\033com.google.cloud.support."
          + "v2B\nActorProtoP\001Z5cloud.google.com/go/su"
          + "pport/apiv2/supportpb;supportpb\252\002\027Google"
          + ".Cloud.Support.V2\312\002\027Google\\Cloud\\Support"
          + "\\V2\352\002\032Google::Cloud::Support::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_support_v2_Actor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_support_v2_Actor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_support_v2_Actor_descriptor,
            new java.lang.String[] {
              "DisplayName", "Email", "GoogleSupport",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
