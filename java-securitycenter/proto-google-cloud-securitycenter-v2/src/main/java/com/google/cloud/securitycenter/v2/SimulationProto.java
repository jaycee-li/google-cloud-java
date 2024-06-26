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
// source: google/cloud/securitycenter/v2/simulation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public final class SimulationProto {
  private SimulationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Simulation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Simulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/securitycenter/v2/simulat"
          + "ion.proto\022\036google.cloud.securitycenter.v"
          + "2\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\0324google/cloud/secu"
          + "ritycenter/v2/valued_resource.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\"\265\002\n\nSimulat"
          + "ion\022\014\n\004name\030\001 \001(\t\0224\n\013create_time\030\002 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\022d\n\037resou"
          + "rce_value_configs_metadata\030\003 \003(\0132;.googl"
          + "e.cloud.securitycenter.v2.ResourceValueC"
          + "onfigMetadata:}\352Az\n(securitycenter.googl"
          + "eapis.com/Simulation\0225organizations/{org"
          + "anization}/simulations/{simulation}*\013sim"
          + "ulations2\nsimulationB\351\001\n\"com.google.clou"
          + "d.securitycenter.v2B\017SimulationProtoP\001ZJ"
          + "cloud.google.com/go/securitycenter/apiv2"
          + "/securitycenterpb;securitycenterpb\252\002\036Goo"
          + "gle.Cloud.SecurityCenter.V2\312\002\036Google\\Clo"
          + "ud\\SecurityCenter\\V2\352\002!Google::Cloud::Se"
          + "curityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ValuedResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_Simulation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Simulation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Simulation_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "ResourceValueConfigsMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ValuedResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
