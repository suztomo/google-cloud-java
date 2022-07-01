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

package com.google.cloud.dataproc.v1.samples;

// [START dataproc_v1_generated_autoscalingpolicyserviceclient_updateautoscalingpolicy_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dataproc.v1.AutoscalingPolicy;
import com.google.cloud.dataproc.v1.AutoscalingPolicyServiceClient;
import com.google.cloud.dataproc.v1.UpdateAutoscalingPolicyRequest;

public class AsyncUpdateAutoscalingPolicy {

  public static void main(String[] args) throws Exception {
    asyncUpdateAutoscalingPolicy();
  }

  public static void asyncUpdateAutoscalingPolicy() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AutoscalingPolicyServiceClient autoscalingPolicyServiceClient =
        AutoscalingPolicyServiceClient.create()) {
      UpdateAutoscalingPolicyRequest request =
          UpdateAutoscalingPolicyRequest.newBuilder()
              .setPolicy(AutoscalingPolicy.newBuilder().build())
              .build();
      ApiFuture<AutoscalingPolicy> future =
          autoscalingPolicyServiceClient.updateAutoscalingPolicyCallable().futureCall(request);
      // Do something.
      AutoscalingPolicy response = future.get();
    }
  }
}
// [END dataproc_v1_generated_autoscalingpolicyserviceclient_updateautoscalingpolicy_async]
