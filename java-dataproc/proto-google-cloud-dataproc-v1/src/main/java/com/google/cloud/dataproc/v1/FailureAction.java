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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Actions in response to failure of a resource associated with a cluster.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dataproc.v1.FailureAction}
 */
public enum FailureAction implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * When FailureAction is unspecified, failure action defaults to NO_ACTION.
   * </pre>
   *
   * <code>FAILURE_ACTION_UNSPECIFIED = 0;</code>
   */
  FAILURE_ACTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Take no action on failure to create a cluster resource. NO_ACTION is the
   * default.
   * </pre>
   *
   * <code>NO_ACTION = 1;</code>
   */
  NO_ACTION(1),
  /**
   *
   *
   * <pre>
   * Delete the failed cluster resource.
   * </pre>
   *
   * <code>DELETE = 2;</code>
   */
  DELETE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * When FailureAction is unspecified, failure action defaults to NO_ACTION.
   * </pre>
   *
   * <code>FAILURE_ACTION_UNSPECIFIED = 0;</code>
   */
  public static final int FAILURE_ACTION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Take no action on failure to create a cluster resource. NO_ACTION is the
   * default.
   * </pre>
   *
   * <code>NO_ACTION = 1;</code>
   */
  public static final int NO_ACTION_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Delete the failed cluster resource.
   * </pre>
   *
   * <code>DELETE = 2;</code>
   */
  public static final int DELETE_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static FailureAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FailureAction forNumber(int value) {
    switch (value) {
      case 0:
        return FAILURE_ACTION_UNSPECIFIED;
      case 1:
        return NO_ACTION;
      case 2:
        return DELETE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FailureAction> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FailureAction> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<FailureAction>() {
        public FailureAction findValueByNumber(int number) {
          return FailureAction.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final FailureAction[] VALUES = values();

  public static FailureAction valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FailureAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.v1.FailureAction)
}