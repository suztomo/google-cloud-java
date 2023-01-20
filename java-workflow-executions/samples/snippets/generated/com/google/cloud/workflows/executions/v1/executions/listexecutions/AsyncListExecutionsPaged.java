/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.workflows.executions.v1.samples;

// [START workflowexecutions_v1_generated_Executions_ListExecutions_Paged_async]
import com.google.cloud.workflows.executions.v1.Execution;
import com.google.cloud.workflows.executions.v1.ExecutionView;
import com.google.cloud.workflows.executions.v1.ExecutionsClient;
import com.google.cloud.workflows.executions.v1.ListExecutionsRequest;
import com.google.cloud.workflows.executions.v1.ListExecutionsResponse;
import com.google.cloud.workflows.executions.v1.WorkflowName;
import com.google.common.base.Strings;

public class AsyncListExecutionsPaged {

  public static void main(String[] args) throws Exception {
    asyncListExecutionsPaged();
  }

  public static void asyncListExecutionsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ExecutionsClient executionsClient = ExecutionsClient.create()) {
      ListExecutionsRequest request =
          ListExecutionsRequest.newBuilder()
              .setParent(WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setView(ExecutionView.forNumber(0))
              .build();
      while (true) {
        ListExecutionsResponse response = executionsClient.listExecutionsCallable().call(request);
        for (Execution element : response.getExecutionsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END workflowexecutions_v1_generated_Executions_ListExecutions_Paged_async]
