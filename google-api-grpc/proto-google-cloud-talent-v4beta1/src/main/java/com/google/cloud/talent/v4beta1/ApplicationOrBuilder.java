// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/application.proto

package com.google.cloud.talent.v4beta1;

public interface ApplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Application)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required during application update.
   * Resource name assigned to an application by the API.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}/applications/{application_id}",
   * for example,
   * "projects/api-test-project/tenants/foo/profiles/bar/applications/baz".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required during application update.
   * Resource name assigned to an application by the API.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}/applications/{application_id}",
   * for example,
   * "projects/api-test-project/tenants/foo/profiles/bar/applications/baz".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required.
   * Client side application identifier, used to uniquely identify the
   * application.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string external_id = 31;</code>
   */
  java.lang.String getExternalId();
  /**
   *
   *
   * <pre>
   * Required.
   * Client side application identifier, used to uniquely identify the
   * application.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string external_id = 31;</code>
   */
  com.google.protobuf.ByteString getExternalIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the candidate of this application.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/api-test-project/tenants/foo/profiles/bar".
   * </pre>
   *
   * <code>string profile = 2;</code>
   */
  java.lang.String getProfile();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of the candidate of this application.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}",
   * for example, "projects/api-test-project/tenants/foo/profiles/bar".
   * </pre>
   *
   * <code>string profile = 2;</code>
   */
  com.google.protobuf.ByteString getProfileBytes();

  /**
   *
   *
   * <pre>
   * One of either a job or a company is required.
   * Resource name of the job which the candidate applied for.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}",
   * for example, "projects/api-test-project/tenants/foo/jobs/bar".
   * </pre>
   *
   * <code>string job = 4;</code>
   */
  java.lang.String getJob();
  /**
   *
   *
   * <pre>
   * One of either a job or a company is required.
   * Resource name of the job which the candidate applied for.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}",
   * for example, "projects/api-test-project/tenants/foo/jobs/bar".
   * </pre>
   *
   * <code>string job = 4;</code>
   */
  com.google.protobuf.ByteString getJobBytes();

  /**
   *
   *
   * <pre>
   * One of either a job or a company is required.
   * Resource name of the company which the candidate applied for.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}",
   * for example, "projects/api-test-project/tenants/foo/companies/bar".
   * </pre>
   *
   * <code>string company = 5;</code>
   */
  java.lang.String getCompany();
  /**
   *
   *
   * <pre>
   * One of either a job or a company is required.
   * Resource name of the company which the candidate applied for.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}",
   * for example, "projects/api-test-project/tenants/foo/companies/bar".
   * </pre>
   *
   * <code>string company = 5;</code>
   */
  com.google.protobuf.ByteString getCompanyBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * The application date.
   * </pre>
   *
   * <code>.google.type.Date application_date = 7;</code>
   */
  boolean hasApplicationDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The application date.
   * </pre>
   *
   * <code>.google.type.Date application_date = 7;</code>
   */
  com.google.type.Date getApplicationDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The application date.
   * </pre>
   *
   * <code>.google.type.Date application_date = 7;</code>
   */
  com.google.type.DateOrBuilder getApplicationDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Required.
   * What is the most recent stage of the application (that is, new, screen,
   * send cv, hired, finished work)?  This field is intentionally not
   * comprehensive of every possible status, but instead, represents statuses
   * that would be used to indicate to the ML models good / bad matches.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application.ApplicationStage stage = 11;</code>
   */
  int getStageValue();
  /**
   *
   *
   * <pre>
   * Required.
   * What is the most recent stage of the application (that is, new, screen,
   * send cv, hired, finished work)?  This field is intentionally not
   * comprehensive of every possible status, but instead, represents statuses
   * that would be used to indicate to the ML models good / bad matches.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application.ApplicationStage stage = 11;</code>
   */
  com.google.cloud.talent.v4beta1.Application.ApplicationStage getStage();

  /**
   *
   *
   * <pre>
   * Optional.
   * The application state.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application.ApplicationState state = 13;</code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Optional.
   * The application state.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application.ApplicationState state = 13;</code>
   */
  com.google.cloud.talent.v4beta1.Application.ApplicationState getState();

  /**
   *
   *
   * <pre>
   * Optional.
   * All interviews (screen, onsite, and so on) conducted as part of this
   * application (includes details such as user conducting the interview,
   * timestamp, feedback, and so on).
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Interview interviews = 16;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Interview> getInterviewsList();
  /**
   *
   *
   * <pre>
   * Optional.
   * All interviews (screen, onsite, and so on) conducted as part of this
   * application (includes details such as user conducting the interview,
   * timestamp, feedback, and so on).
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Interview interviews = 16;</code>
   */
  com.google.cloud.talent.v4beta1.Interview getInterviews(int index);
  /**
   *
   *
   * <pre>
   * Optional.
   * All interviews (screen, onsite, and so on) conducted as part of this
   * application (includes details such as user conducting the interview,
   * timestamp, feedback, and so on).
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Interview interviews = 16;</code>
   */
  int getInterviewsCount();
  /**
   *
   *
   * <pre>
   * Optional.
   * All interviews (screen, onsite, and so on) conducted as part of this
   * application (includes details such as user conducting the interview,
   * timestamp, feedback, and so on).
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Interview interviews = 16;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.InterviewOrBuilder>
      getInterviewsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional.
   * All interviews (screen, onsite, and so on) conducted as part of this
   * application (includes details such as user conducting the interview,
   * timestamp, feedback, and so on).
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Interview interviews = 16;</code>
   */
  com.google.cloud.talent.v4beta1.InterviewOrBuilder getInterviewsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional.
   * If the candidate is referred by a employee.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue referral = 18;</code>
   */
  boolean hasReferral();
  /**
   *
   *
   * <pre>
   * Optional.
   * If the candidate is referred by a employee.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue referral = 18;</code>
   */
  com.google.protobuf.BoolValue getReferral();
  /**
   *
   *
   * <pre>
   * Optional.
   * If the candidate is referred by a employee.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue referral = 18;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getReferralOrBuilder();

  /**
   *
   *
   * <pre>
   * Required.
   * Reflects the time that the application was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 19;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Required.
   * Reflects the time that the application was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 19;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Required.
   * Reflects the time that the application was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 19;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * The last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 20;</code>
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Optional.
   * The last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 20;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Optional.
   * The last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 20;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * Free text reason behind the recruitement outcome (for example, reason for
   * withdraw / reject, reason for an unsuccessful finish, and so on).
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string outcome_notes = 21;</code>
   */
  java.lang.String getOutcomeNotes();
  /**
   *
   *
   * <pre>
   * Optional.
   * Free text reason behind the recruitement outcome (for example, reason for
   * withdraw / reject, reason for an unsuccessful finish, and so on).
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string outcome_notes = 21;</code>
   */
  com.google.protobuf.ByteString getOutcomeNotesBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * Outcome positiveness shows how positive the outcome is.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Outcome outcome = 22;</code>
   */
  int getOutcomeValue();
  /**
   *
   *
   * <pre>
   * Optional.
   * Outcome positiveness shows how positive the outcome is.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Outcome outcome = 22;</code>
   */
  com.google.cloud.talent.v4beta1.Outcome getOutcome();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this job application is a match to
   * application related filters. This value is only applicable in profile
   * search response.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_match = 28;</code>
   */
  boolean hasIsMatch();
  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this job application is a match to
   * application related filters. This value is only applicable in profile
   * search response.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_match = 28;</code>
   */
  com.google.protobuf.BoolValue getIsMatch();
  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this job application is a match to
   * application related filters. This value is only applicable in profile
   * search response.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_match = 28;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsMatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Job title snippet shows how the job title is related to a
   * search query. It's empty if the job title isn't related to the search
   * query.
   * </pre>
   *
   * <code>string job_title_snippet = 29;</code>
   */
  java.lang.String getJobTitleSnippet();
  /**
   *
   *
   * <pre>
   * Output only. Job title snippet shows how the job title is related to a
   * search query. It's empty if the job title isn't related to the search
   * query.
   * </pre>
   *
   * <code>string job_title_snippet = 29;</code>
   */
  com.google.protobuf.ByteString getJobTitleSnippetBytes();
}
