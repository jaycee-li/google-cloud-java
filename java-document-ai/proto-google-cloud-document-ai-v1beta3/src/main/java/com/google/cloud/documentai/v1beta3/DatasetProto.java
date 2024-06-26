/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/documentai/v1beta3/dataset.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1beta3;

public final class DatasetProto {
  private DatasetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Dataset_GCSManagedConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Dataset_GCSManagedConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Dataset_DocumentWarehouseConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Dataset_DocumentWarehouseConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Dataset_UnmanagedDatasetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Dataset_UnmanagedDatasetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Dataset_SpannerIndexingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Dataset_SpannerIndexingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_DocumentId_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_DocumentId_GCSManagedDocumentId_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentId_GCSManagedDocumentId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_DocumentId_UnmanagedDocumentId_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentId_UnmanagedDocumentId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_DatasetSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DatasetSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_IndividualDocumentIds_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_IndividualDocumentIds_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/documentai/v1beta3/datase"
          + "t.proto\022\037google.cloud.documentai.v1beta3"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032.google/cloud/docum"
          + "entai/v1beta3/document.proto\0321google/clo"
          + "ud/documentai/v1beta3/document_io.proto\032"
          + "5google/cloud/documentai/v1beta3/documen"
          + "t_schema.proto\"\344\007\n\007Dataset\022\\\n\022gcs_manage"
          + "d_config\030\003 \001(\01329.google.cloud.documentai"
          + ".v1beta3.Dataset.GCSManagedConfigB\003\340A\001H\000"
          + "\022l\n\031document_warehouse_config\030\005 \001(\0132@.go"
          + "ogle.cloud.documentai.v1beta3.Dataset.Do"
          + "cumentWarehouseConfigB\005\030\001\340A\001H\000\022h\n\030unmana"
          + "ged_dataset_config\030\006 \001(\0132?.google.cloud."
          + "documentai.v1beta3.Dataset.UnmanagedData"
          + "setConfigB\003\340A\001H\000\022f\n\027spanner_indexing_con"
          + "fig\030\004 \001(\0132>.google.cloud.documentai.v1be"
          + "ta3.Dataset.SpannerIndexingConfigB\003\340A\001H\001"
          + "\022\014\n\004name\030\001 \001(\t\022B\n\005state\030\002 \001(\0162..google.c"
          + "loud.documentai.v1beta3.Dataset.StateB\003\340"
          + "A\002\032W\n\020GCSManagedConfig\022C\n\ngcs_prefix\030\001 \001"
          + "(\0132*.google.cloud.documentai.v1beta3.Gcs"
          + "PrefixB\003\340A\002\032r\n\027DocumentWarehouseConfig\022\027"
          + "\n\ncollection\030\001 \001(\tB\003\340A\003\022>\n\006schema\030\002 \001(\tB"
          + ".\340A\003\372A(\n&contentwarehouse.googleapis.com"
          + "/Schema\032\030\n\026UnmanagedDatasetConfig\032\027\n\025Spa"
          + "nnerIndexingConfig\"T\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\021\n\rUNINITIALIZED\020\001\022\020\n\014INITIAL"
          + "IZING\020\002\022\017\n\013INITIALIZED\020\003:n\352Ak\n!documenta"
          + "i.googleapis.com/Dataset\022Fprojects/{proj"
          + "ect}/locations/{location}/processors/{pr"
          + "ocessor}/datasetB\020\n\016storage_sourceB\021\n\017in"
          + "dexing_source\"\206\003\n\nDocumentId\022^\n\022gcs_mana"
          + "ged_doc_id\030\001 \001(\0132@.google.cloud.document"
          + "ai.v1beta3.DocumentId.GCSManagedDocument"
          + "IdH\000\022[\n\020unmanaged_doc_id\030\004 \001(\0132?.google."
          + "cloud.documentai.v1beta3.DocumentId.Unma"
          + "nagedDocumentIdH\000\022B\n\014revision_ref\030\003 \001(\0132"
          + ",.google.cloud.documentai.v1beta3.Revisi"
          + "onRef\032C\n\024GCSManagedDocumentId\022\024\n\007gcs_uri"
          + "\030\001 \001(\tB\003\340A\002\022\025\n\tcw_doc_id\030\002 \001(\tB\002\030\001\032*\n\023Un"
          + "managedDocumentId\022\023\n\006doc_id\030\001 \001(\tB\003\340A\002B\006"
          + "\n\004type\"\361\001\n\rDatasetSchema\022\014\n\004name\030\001 \001(\t\022M"
          + "\n\017document_schema\030\003 \001(\0132/.google.cloud.d"
          + "ocumentai.v1beta3.DocumentSchemaB\003\340A\001:\202\001"
          + "\352A\177\n\'documentai.googleapis.com/DatasetSc"
          + "hema\022Tprojects/{project}/locations/{loca"
          + "tion}/processors/{processor}/dataset/dat"
          + "asetSchema\"\207\002\n\025BatchDatasetDocuments\022o\n\027"
          + "individual_document_ids\030\001 \001(\0132L.google.c"
          + "loud.documentai.v1beta3.BatchDatasetDocu"
          + "ments.IndividualDocumentIdsH\000\022\020\n\006filter\030"
          + "\002 \001(\tH\000\032_\n\025IndividualDocumentIds\022F\n\014docu"
          + "ment_ids\030\001 \003(\0132+.google.cloud.documentai"
          + ".v1beta3.DocumentIdB\003\340A\002B\n\n\010criteriaB\310\002\n"
          + "#com.google.cloud.documentai.v1beta3B\014Da"
          + "tasetProtoP\001ZCcloud.google.com/go/docume"
          + "ntai/apiv1beta3/documentaipb;documentaip"
          + "b\252\002\037Google.Cloud.DocumentAI.V1Beta3\312\002\037Go"
          + "ogle\\Cloud\\DocumentAI\\V1beta3\352\002\"Google::"
          + "Cloud::DocumentAI::V1beta3\352Ab\n&contentwa"
          + "rehouse.googleapis.com/Schema\0228projects/"
          + "{project}/locations/{location}/schemas/{"
          + "schema}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.documentai.v1beta3.DocumentProto.getDescriptor(),
              com.google.cloud.documentai.v1beta3.DocumentIoProto.getDescriptor(),
              com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta3_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Dataset_descriptor,
            new java.lang.String[] {
              "GcsManagedConfig",
              "DocumentWarehouseConfig",
              "UnmanagedDatasetConfig",
              "SpannerIndexingConfig",
              "Name",
              "State",
              "StorageSource",
              "IndexingSource",
            });
    internal_static_google_cloud_documentai_v1beta3_Dataset_GCSManagedConfig_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Dataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_Dataset_GCSManagedConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Dataset_GCSManagedConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix",
            });
    internal_static_google_cloud_documentai_v1beta3_Dataset_DocumentWarehouseConfig_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Dataset_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_Dataset_DocumentWarehouseConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Dataset_DocumentWarehouseConfig_descriptor,
            new java.lang.String[] {
              "Collection", "Schema",
            });
    internal_static_google_cloud_documentai_v1beta3_Dataset_UnmanagedDatasetConfig_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Dataset_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_Dataset_UnmanagedDatasetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Dataset_UnmanagedDatasetConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_documentai_v1beta3_Dataset_SpannerIndexingConfig_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Dataset_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_documentai_v1beta3_Dataset_SpannerIndexingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Dataset_SpannerIndexingConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_documentai_v1beta3_DocumentId_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_DocumentId_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_DocumentId_descriptor,
            new java.lang.String[] {
              "GcsManagedDocId", "UnmanagedDocId", "RevisionRef", "Type",
            });
    internal_static_google_cloud_documentai_v1beta3_DocumentId_GCSManagedDocumentId_descriptor =
        internal_static_google_cloud_documentai_v1beta3_DocumentId_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_DocumentId_GCSManagedDocumentId_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_DocumentId_GCSManagedDocumentId_descriptor,
            new java.lang.String[] {
              "GcsUri", "CwDocId",
            });
    internal_static_google_cloud_documentai_v1beta3_DocumentId_UnmanagedDocumentId_descriptor =
        internal_static_google_cloud_documentai_v1beta3_DocumentId_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1beta3_DocumentId_UnmanagedDocumentId_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_DocumentId_UnmanagedDocumentId_descriptor,
            new java.lang.String[] {
              "DocId",
            });
    internal_static_google_cloud_documentai_v1beta3_DatasetSchema_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_DatasetSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_DatasetSchema_descriptor,
            new java.lang.String[] {
              "Name", "DocumentSchema",
            });
    internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_descriptor,
            new java.lang.String[] {
              "IndividualDocumentIds", "Filter", "Criteria",
            });
    internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_IndividualDocumentIds_descriptor =
        internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_IndividualDocumentIds_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_BatchDatasetDocuments_IndividualDocumentIds_descriptor,
            new java.lang.String[] {
              "DocumentIds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentProto.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentIoProto.getDescriptor();
    com.google.cloud.documentai.v1beta3.DocumentAiDocumentSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
