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
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

public final class TraceProto {
  private TraceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Link_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Link_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Span_Links_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Span_Links_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_AttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_StackTrace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudtrace_v2_TruncatableString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/devtools/cloudtrace/v2/trace.pr"
          + "oto\022\035google.devtools.cloudtrace.v2\032\034goog"
          + "le/api/annotations.proto\032\037google/protobu"
          + "f/timestamp.proto\032\036google/protobuf/wrapp"
          + "ers.proto\032\027google/rpc/status.proto\"\305\017\n\004S"
          + "pan\022\014\n\004name\030\001 \001(\t\022\017\n\007span_id\030\002 \001(\t\022\026\n\016pa"
          + "rent_span_id\030\003 \001(\t\022F\n\014display_name\030\004 \001(\013"
          + "20.google.devtools.cloudtrace.v2.Truncat"
          + "ableString\022.\n\nstart_time\030\005 \001(\0132\032.google."
          + "protobuf.Timestamp\022,\n\010end_time\030\006 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\022B\n\nattributes\030\007"
          + " \001(\0132..google.devtools.cloudtrace.v2.Spa"
          + "n.Attributes\022>\n\013stack_trace\030\010 \001(\0132).goog"
          + "le.devtools.cloudtrace.v2.StackTrace\022C\n\013"
          + "time_events\030\t \001(\0132..google.devtools.clou"
          + "dtrace.v2.Span.TimeEvents\0228\n\005links\030\n \001(\013"
          + "2).google.devtools.cloudtrace.v2.Span.Li"
          + "nks\022\"\n\006status\030\013 \001(\0132\022.google.rpc.Status\022"
          + "?\n\033same_process_as_parent_span\030\014 \001(\0132\032.g"
          + "oogle.protobuf.BoolValue\0225\n\020child_span_c"
          + "ount\030\r \001(\0132\033.google.protobuf.Int32Value\032"
          + "\353\001\n\nAttributes\022W\n\rattribute_map\030\001 \003(\0132@."
          + "google.devtools.cloudtrace.v2.Span.Attri"
          + "butes.AttributeMapEntry\022 \n\030dropped_attri"
          + "butes_count\030\002 \001(\005\032b\n\021AttributeMapEntry\022\013"
          + "\n\003key\030\001 \001(\t\022<\n\005value\030\002 \001(\0132-.google.devt"
          + "ools.cloudtrace.v2.AttributeValue:\0028\001\032\337\004"
          + "\n\tTimeEvent\022(\n\004time\030\001 \001(\0132\032.google.proto"
          + "buf.Timestamp\022N\n\nannotation\030\002 \001(\01328.goog"
          + "le.devtools.cloudtrace.v2.Span.TimeEvent"
          + ".AnnotationH\000\022S\n\rmessage_event\030\003 \001(\0132:.g"
          + "oogle.devtools.cloudtrace.v2.Span.TimeEv"
          + "ent.MessageEventH\000\032\227\001\n\nAnnotation\022E\n\013des"
          + "cription\030\001 \001(\01320.google.devtools.cloudtr"
          + "ace.v2.TruncatableString\022B\n\nattributes\030\002"
          + " \001(\0132..google.devtools.cloudtrace.v2.Spa"
          + "n.Attributes\032\337\001\n\014MessageEvent\022M\n\004type\030\001 "
          + "\001(\0162?.google.devtools.cloudtrace.v2.Span"
          + ".TimeEvent.MessageEvent.Type\022\n\n\002id\030\002 \001(\003"
          + "\022\037\n\027uncompressed_size_bytes\030\003 \001(\003\022\035\n\025com"
          + "pressed_size_bytes\030\004 \001(\003\"4\n\004Type\022\024\n\020TYPE"
          + "_UNSPECIFIED\020\000\022\010\n\004SENT\020\001\022\014\n\010RECEIVED\020\002B\007"
          + "\n\005value\032\230\001\n\nTimeEvents\022A\n\ntime_event\030\001 \003"
          + "(\0132-.google.devtools.cloudtrace.v2.Span."
          + "TimeEvent\022!\n\031dropped_annotations_count\030\002"
          + " \001(\005\022$\n\034dropped_message_events_count\030\003 \001"
          + "(\005\032\367\001\n\004Link\022\020\n\010trace_id\030\001 \001(\t\022\017\n\007span_id"
          + "\030\002 \001(\t\022;\n\004type\030\003 \001(\0162-.google.devtools.c"
          + "loudtrace.v2.Span.Link.Type\022B\n\nattribute"
          + "s\030\004 \001(\0132..google.devtools.cloudtrace.v2."
          + "Span.Attributes\"K\n\004Type\022\024\n\020TYPE_UNSPECIF"
          + "IED\020\000\022\025\n\021CHILD_LINKED_SPAN\020\001\022\026\n\022PARENT_L"
          + "INKED_SPAN\020\002\032\\\n\005Links\0226\n\004link\030\001 \003(\0132(.go"
          + "ogle.devtools.cloudtrace.v2.Span.Link\022\033\n"
          + "\023dropped_links_count\030\002 \001(\005\"\216\001\n\016Attribute"
          + "Value\022H\n\014string_value\030\001 \001(\01320.google.dev"
          + "tools.cloudtrace.v2.TruncatableStringH\000\022"
          + "\023\n\tint_value\030\002 \001(\003H\000\022\024\n\nbool_value\030\003 \001(\010"
          + "H\000B\007\n\005value\"\211\005\n\nStackTrace\022K\n\014stack_fram"
          + "es\030\001 \001(\01325.google.devtools.cloudtrace.v2"
          + ".StackTrace.StackFrames\022\033\n\023stack_trace_h"
          + "ash_id\030\002 \001(\003\032\236\003\n\nStackFrame\022G\n\rfunction_"
          + "name\030\001 \001(\01320.google.devtools.cloudtrace."
          + "v2.TruncatableString\022P\n\026original_functio"
          + "n_name\030\002 \001(\01320.google.devtools.cloudtrac"
          + "e.v2.TruncatableString\022C\n\tfile_name\030\003 \001("
          + "\01320.google.devtools.cloudtrace.v2.Trunca"
          + "tableString\022\023\n\013line_number\030\004 \001(\003\022\025\n\rcolu"
          + "mn_number\030\005 \001(\003\022:\n\013load_module\030\006 \001(\0132%.g"
          + "oogle.devtools.cloudtrace.v2.Module\022H\n\016s"
          + "ource_version\030\007 \001(\01320.google.devtools.cl"
          + "oudtrace.v2.TruncatableString\032p\n\013StackFr"
          + "ames\022C\n\005frame\030\001 \003(\01324.google.devtools.cl"
          + "oudtrace.v2.StackTrace.StackFrame\022\034\n\024dro"
          + "pped_frames_count\030\002 \001(\005\"\216\001\n\006Module\022@\n\006mo"
          + "dule\030\001 \001(\01320.google.devtools.cloudtrace."
          + "v2.TruncatableString\022B\n\010build_id\030\002 \001(\01320"
          + ".google.devtools.cloudtrace.v2.Truncatab"
          + "leString\"@\n\021TruncatableString\022\r\n\005value\030\001"
          + " \001(\t\022\034\n\024truncated_byte_count\030\002 \001(\005B\252\001\n!c"
          + "om.google.devtools.cloudtrace.v2B\nTraceP"
          + "rotoP\001ZGgoogle.golang.org/genproto/googl"
          + "eapis/devtools/cloudtrace/v2;cloudtrace\252"
          + "\002\025Google.Cloud.Trace.V2\312\002\025Google\\Cloud\\T"
          + "race\\V2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        },
        assigner);
    internal_static_google_devtools_cloudtrace_v2_Span_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_descriptor,
            new java.lang.String[] {
              "Name",
              "SpanId",
              "ParentSpanId",
              "DisplayName",
              "StartTime",
              "EndTime",
              "Attributes",
              "StackTrace",
              "TimeEvents",
              "Links",
              "Status",
              "SameProcessAsParentSpan",
              "ChildSpanCount",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor,
            new java.lang.String[] {
              "AttributeMap", "DroppedAttributesCount",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_Attributes_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Attributes_AttributeMapEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(1);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor,
            new java.lang.String[] {
              "Time", "Annotation", "MessageEvent", "Value",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_Annotation_descriptor,
            new java.lang.String[] {
              "Description", "Attributes",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvent_MessageEvent_descriptor,
            new java.lang.String[] {
              "Type", "Id", "UncompressedSizeBytes", "CompressedSizeBytes",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(2);
    internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_TimeEvents_descriptor,
            new java.lang.String[] {
              "TimeEvent", "DroppedAnnotationsCount", "DroppedMessageEventsCount",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Link_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(3);
    internal_static_google_devtools_cloudtrace_v2_Span_Link_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Link_descriptor,
            new java.lang.String[] {
              "TraceId", "SpanId", "Type", "Attributes",
            });
    internal_static_google_devtools_cloudtrace_v2_Span_Links_descriptor =
        internal_static_google_devtools_cloudtrace_v2_Span_descriptor.getNestedTypes().get(4);
    internal_static_google_devtools_cloudtrace_v2_Span_Links_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Span_Links_descriptor,
            new java.lang.String[] {
              "Link", "DroppedLinksCount",
            });
    internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_cloudtrace_v2_AttributeValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_AttributeValue_descriptor,
            new java.lang.String[] {
              "StringValue", "IntValue", "BoolValue", "Value",
            });
    internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_cloudtrace_v2_StackTrace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor,
            new java.lang.String[] {
              "StackFrames", "StackTraceHashId",
            });
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_descriptor =
        internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrame_descriptor,
            new java.lang.String[] {
              "FunctionName",
              "OriginalFunctionName",
              "FileName",
              "LineNumber",
              "ColumnNumber",
              "LoadModule",
              "SourceVersion",
            });
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_descriptor =
        internal_static_google_devtools_cloudtrace_v2_StackTrace_descriptor.getNestedTypes().get(1);
    internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_StackTrace_StackFrames_descriptor,
            new java.lang.String[] {
              "Frame", "DroppedFramesCount",
            });
    internal_static_google_devtools_cloudtrace_v2_Module_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_Module_descriptor,
            new java.lang.String[] {
              "Module", "BuildId",
            });
    internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_cloudtrace_v2_TruncatableString_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudtrace_v2_TruncatableString_descriptor,
            new java.lang.String[] {
              "Value", "TruncatedByteCount",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
