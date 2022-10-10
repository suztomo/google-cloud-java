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
// source: google/dataflow/v1beta3/templates.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Response to the request to launch a template.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.LaunchTemplateResponse}
 */
public final class LaunchTemplateResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.LaunchTemplateResponse)
    LaunchTemplateResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LaunchTemplateResponse.newBuilder() to construct.
  private LaunchTemplateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LaunchTemplateResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LaunchTemplateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_LaunchTemplateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.TemplatesProto
        .internal_static_google_dataflow_v1beta3_LaunchTemplateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.LaunchTemplateResponse.class,
            com.google.dataflow.v1beta3.LaunchTemplateResponse.Builder.class);
  }

  public static final int JOB_FIELD_NUMBER = 1;
  private com.google.dataflow.v1beta3.Job job_;
  /**
   *
   *
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   *
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   *
   *
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   *
   * @return The job.
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.Job getJob() {
    return job_ == null ? com.google.dataflow.v1beta3.Job.getDefaultInstance() : job_;
  }
  /**
   *
   *
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.JobOrBuilder getJobOrBuilder() {
    return getJob();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (job_ != null) {
      output.writeMessage(1, getJob());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getJob());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.dataflow.v1beta3.LaunchTemplateResponse)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.LaunchTemplateResponse other =
        (com.google.dataflow.v1beta3.LaunchTemplateResponse) obj;

    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob().equals(other.getJob())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.dataflow.v1beta3.LaunchTemplateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response to the request to launch a template.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.LaunchTemplateResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.LaunchTemplateResponse)
      com.google.dataflow.v1beta3.LaunchTemplateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_LaunchTemplateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_LaunchTemplateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.LaunchTemplateResponse.class,
              com.google.dataflow.v1beta3.LaunchTemplateResponse.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.LaunchTemplateResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.TemplatesProto
          .internal_static_google_dataflow_v1beta3_LaunchTemplateResponse_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.LaunchTemplateResponse getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.LaunchTemplateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.LaunchTemplateResponse build() {
      com.google.dataflow.v1beta3.LaunchTemplateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.LaunchTemplateResponse buildPartial() {
      com.google.dataflow.v1beta3.LaunchTemplateResponse result =
          new com.google.dataflow.v1beta3.LaunchTemplateResponse(this);
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.dataflow.v1beta3.LaunchTemplateResponse) {
        return mergeFrom((com.google.dataflow.v1beta3.LaunchTemplateResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.LaunchTemplateResponse other) {
      if (other == com.google.dataflow.v1beta3.LaunchTemplateResponse.getDefaultInstance())
        return this;
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getJobFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.dataflow.v1beta3.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.dataflow.v1beta3.Job,
            com.google.dataflow.v1beta3.Job.Builder,
            com.google.dataflow.v1beta3.JobOrBuilder>
        jobBuilder_;
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     *
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     *
     * @return The job.
     */
    public com.google.dataflow.v1beta3.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.dataflow.v1beta3.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     */
    public Builder setJob(com.google.dataflow.v1beta3.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     */
    public Builder setJob(com.google.dataflow.v1beta3.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     */
    public Builder mergeJob(com.google.dataflow.v1beta3.Job value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ = com.google.dataflow.v1beta3.Job.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     */
    public com.google.dataflow.v1beta3.Job.Builder getJobBuilder() {

      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     */
    public com.google.dataflow.v1beta3.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ? com.google.dataflow.v1beta3.Job.getDefaultInstance() : job_;
      }
    }
    /**
     *
     *
     * <pre>
     * The job that was launched, if the request was not a dry run and
     * the job was successfully launched.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.dataflow.v1beta3.Job,
            com.google.dataflow.v1beta3.Job.Builder,
            com.google.dataflow.v1beta3.JobOrBuilder>
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.dataflow.v1beta3.Job,
                com.google.dataflow.v1beta3.Job.Builder,
                com.google.dataflow.v1beta3.JobOrBuilder>(
                getJob(), getParentForChildren(), isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.LaunchTemplateResponse)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.LaunchTemplateResponse)
  private static final com.google.dataflow.v1beta3.LaunchTemplateResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.LaunchTemplateResponse();
  }

  public static com.google.dataflow.v1beta3.LaunchTemplateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LaunchTemplateResponse> PARSER =
      new com.google.protobuf.AbstractParser<LaunchTemplateResponse>() {
        @java.lang.Override
        public LaunchTemplateResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<LaunchTemplateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LaunchTemplateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.LaunchTemplateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
