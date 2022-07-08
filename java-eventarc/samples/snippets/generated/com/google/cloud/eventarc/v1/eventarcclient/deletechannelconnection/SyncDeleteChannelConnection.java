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

package com.google.cloud.eventarc.v1.samples;

// [START eventarc_v1_generated_eventarcclient_deletechannelconnection_sync]
import com.google.cloud.eventarc.v1.ChannelConnection;
import com.google.cloud.eventarc.v1.ChannelConnectionName;
import com.google.cloud.eventarc.v1.DeleteChannelConnectionRequest;
import com.google.cloud.eventarc.v1.EventarcClient;

public class SyncDeleteChannelConnection {

  public static void main(String[] args) throws Exception {
    syncDeleteChannelConnection();
  }

  public static void syncDeleteChannelConnection() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EventarcClient eventarcClient = EventarcClient.create()) {
      DeleteChannelConnectionRequest request =
          DeleteChannelConnectionRequest.newBuilder()
              .setName(
                  ChannelConnectionName.of("[PROJECT]", "[LOCATION]", "[CHANNEL_CONNECTION]")
                      .toString())
              .build();
      ChannelConnection response = eventarcClient.deleteChannelConnectionAsync(request).get();
    }
  }
}
// [END eventarc_v1_generated_eventarcclient_deletechannelconnection_sync]