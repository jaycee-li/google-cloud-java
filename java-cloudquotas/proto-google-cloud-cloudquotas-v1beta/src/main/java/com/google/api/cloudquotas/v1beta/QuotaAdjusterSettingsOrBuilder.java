/*
 * Copyright 2025 Google LLC
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
// source: google/api/cloudquotas/v1beta/quota_adjuster_settings.proto

// Protobuf Java Version: 3.25.8
package com.google.api.cloudquotas.v1beta;

public interface QuotaAdjusterSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1beta.QuotaAdjusterSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of the config would be of the format:
   *   projects/PROJECT_NUMBER/locations/global/quotaAdjusterSettings
   *   folders/FOLDER_NUMBER/locations/global/quotaAdjusterSettings
   *   organizations/ORGANIZATION_NUMBER/locations/global/quotaAdjusterSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. Name of the config would be of the format:
   *   projects/PROJECT_NUMBER/locations/global/quotaAdjusterSettings
   *   folders/FOLDER_NUMBER/locations/global/quotaAdjusterSettings
   *   organizations/ORGANIZATION_NUMBER/locations/global/quotaAdjusterSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The configured value of the enablement at the given resource.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Enablement enablement = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for enablement.
   */
  int getEnablementValue();

  /**
   *
   *
   * <pre>
   * Optional. The configured value of the enablement at the given resource.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Enablement enablement = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enablement.
   */
  com.google.api.cloudquotas.v1beta.QuotaAdjusterSettings.Enablement getEnablement();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the QuotaAdjusterSettings resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the QuotaAdjusterSettings resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the QuotaAdjusterSettings resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The current ETag of the QuotaAdjusterSettings. If an ETag is
   * provided on update and does not match the current server's ETag in the
   * QuotaAdjusterSettings, the request is blocked and returns an ABORTED error.
   * See https://google.aip.dev/134#etags for more details on ETags.
   * </pre>
   *
   * <code>string etag = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. The current ETag of the QuotaAdjusterSettings. If an ETag is
   * provided on update and does not match the current server's ETag in the
   * QuotaAdjusterSettings, the request is blocked and returns an ABORTED error.
   * See https://google.aip.dev/134#etags for more details on ETags.
   * </pre>
   *
   * <code>string etag = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the setting is inherited or explicitly
   * specified.
   * </pre>
   *
   * <code>bool inherited = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The inherited.
   */
  boolean getInherited();

  /**
   *
   *
   * <pre>
   * Output only. The resource container from which the setting is inherited.
   * This refers to the  nearest ancestor with enablement set (either ENABLED or
   * DISABLED). The value can be an organizations/{organization_id},
   * folders/{folder_id}, or can be 'default' if no ancestor exists with
   * enablement set. The value will be empty when enablement is directly set on
   * this container.
   * </pre>
   *
   * <code>string inherited_from = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The inheritedFrom.
   */
  java.lang.String getInheritedFrom();

  /**
   *
   *
   * <pre>
   * Output only. The resource container from which the setting is inherited.
   * This refers to the  nearest ancestor with enablement set (either ENABLED or
   * DISABLED). The value can be an organizations/{organization_id},
   * folders/{folder_id}, or can be 'default' if no ancestor exists with
   * enablement set. The value will be empty when enablement is directly set on
   * this container.
   * </pre>
   *
   * <code>string inherited_from = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for inheritedFrom.
   */
  com.google.protobuf.ByteString getInheritedFromBytes();
}
