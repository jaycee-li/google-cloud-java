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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface TableLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TableLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The zero-based index of the row where the finding is located. Only
   * populated for resources that have a natural ordering, not BigQuery. In
   * BigQuery, to identify the row a finding came from, populate
   * BigQueryOptions.identifying_fields with your primary key column names and
   * when you store the findings the value of those columns will be stored
   * inside of Finding.
   * </pre>
   *
   * <code>int64 row_index = 1;</code>
   *
   * @return The rowIndex.
   */
  long getRowIndex();
}