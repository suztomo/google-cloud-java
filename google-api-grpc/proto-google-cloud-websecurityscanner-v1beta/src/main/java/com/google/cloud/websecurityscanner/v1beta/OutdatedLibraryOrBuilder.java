// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/finding_addon.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface OutdatedLibraryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.OutdatedLibrary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   */
  java.lang.String getLibraryName();
  /**
   *
   *
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   */
  com.google.protobuf.ByteString getLibraryNameBytes();

  /**
   *
   *
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   */
  java.util.List<java.lang.String> getLearnMoreUrlsList();
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   */
  int getLearnMoreUrlsCount();
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   */
  java.lang.String getLearnMoreUrls(int index);
  /**
   *
   *
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   */
  com.google.protobuf.ByteString getLearnMoreUrlsBytes(int index);
}
