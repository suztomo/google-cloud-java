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
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface PySparkJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.PySparkJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The HCFS URI of the main Python file to use as the driver. Must
   * be a .py file.
   * </pre>
   *
   * <code>string main_python_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mainPythonFileUri.
   */
  java.lang.String getMainPythonFileUri();
  /**
   *
   *
   * <pre>
   * Required. The HCFS URI of the main Python file to use as the driver. Must
   * be a .py file.
   * </pre>
   *
   * <code>string main_python_file_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mainPythonFileUri.
   */
  com.google.protobuf.ByteString getMainPythonFileUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the args.
   */
  java.util.List<java.lang.String> getArgsList();
  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of args.
   */
  int getArgsCount();
  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   *
   *
   * <pre>
   * Optional. The arguments to pass to the driver.  Do not include arguments,
   * such as `--conf`, that can be set as job properties, since a collision may
   * occur that causes an incorrect job submission.
   * </pre>
   *
   * <code>repeated string args = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString getArgsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. HCFS file URIs of Python files to pass to the PySpark
   * framework. Supported file types: .py, .egg, and .zip.
   * </pre>
   *
   * <code>repeated string python_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the pythonFileUris.
   */
  java.util.List<java.lang.String> getPythonFileUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS file URIs of Python files to pass to the PySpark
   * framework. Supported file types: .py, .egg, and .zip.
   * </pre>
   *
   * <code>repeated string python_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of pythonFileUris.
   */
  int getPythonFileUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS file URIs of Python files to pass to the PySpark
   * framework. Supported file types: .py, .egg, and .zip.
   * </pre>
   *
   * <code>repeated string python_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The pythonFileUris at the given index.
   */
  java.lang.String getPythonFileUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS file URIs of Python files to pass to the PySpark
   * framework. Supported file types: .py, .egg, and .zip.
   * </pre>
   *
   * <code>repeated string python_file_uris = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the pythonFileUris at the given index.
   */
  com.google.protobuf.ByteString getPythonFileUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Python driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the jarFileUris.
   */
  java.util.List<java.lang.String> getJarFileUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Python driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of jarFileUris.
   */
  int getJarFileUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Python driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The jarFileUris at the given index.
   */
  java.lang.String getJarFileUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the
   * Python driver and tasks.
   * </pre>
   *
   * <code>repeated string jar_file_uris = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the jarFileUris at the given index.
   */
  com.google.protobuf.ByteString getJarFileUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be placed in the working directory of
   * each executor. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the fileUris.
   */
  java.util.List<java.lang.String> getFileUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be placed in the working directory of
   * each executor. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of fileUris.
   */
  int getFileUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be placed in the working directory of
   * each executor. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The fileUris at the given index.
   */
  java.lang.String getFileUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of files to be placed in the working directory of
   * each executor. Useful for naively parallel tasks.
   * </pre>
   *
   * <code>repeated string file_uris = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the fileUris at the given index.
   */
  com.google.protobuf.ByteString getFileUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted into the working directory
   * of each executor. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the archiveUris.
   */
  java.util.List<java.lang.String> getArchiveUrisList();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted into the working directory
   * of each executor. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of archiveUris.
   */
  int getArchiveUrisCount();
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted into the working directory
   * of each executor. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The archiveUris at the given index.
   */
  java.lang.String getArchiveUris(int index);
  /**
   *
   *
   * <pre>
   * Optional. HCFS URIs of archives to be extracted into the working directory
   * of each executor. Supported file types:
   * .jar, .tar, .tar.gz, .tgz, and .zip.
   * </pre>
   *
   * <code>repeated string archive_uris = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the archiveUris at the given index.
   */
  com.google.protobuf.ByteString getArchiveUrisBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure PySpark.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure PySpark.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure PySpark.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure PySpark.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */

  /* nullable */
  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, used to configure PySpark.
   * Properties that conflict with values set by the Dataproc API may be
   * overwritten. Can include properties set in
   * /etc/spark/conf/spark-defaults.conf and classes in user code.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.LoggingConfig logging_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the loggingConfig field is set.
   */
  boolean hasLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.LoggingConfig logging_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The loggingConfig.
   */
  com.google.cloud.dataproc.v1.LoggingConfig getLoggingConfig();
  /**
   *
   *
   * <pre>
   * Optional. The runtime log config for job execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.LoggingConfig logging_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.LoggingConfigOrBuilder getLoggingConfigOrBuilder();
}
