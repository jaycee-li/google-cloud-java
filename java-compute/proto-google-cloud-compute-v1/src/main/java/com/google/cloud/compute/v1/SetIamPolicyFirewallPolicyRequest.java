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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * A request message for FirewallPolicies.SetIamPolicy. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest}
 */
public final class SetIamPolicyFirewallPolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest)
    SetIamPolicyFirewallPolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SetIamPolicyFirewallPolicyRequest.newBuilder() to construct.
  private SetIamPolicyFirewallPolicyRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetIamPolicyFirewallPolicyRequest() {
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetIamPolicyFirewallPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SetIamPolicyFirewallPolicyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 1419268850:
            {
              com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.Builder subBuilder =
                  null;
              if (globalOrganizationSetPolicyRequestResource_ != null) {
                subBuilder = globalOrganizationSetPolicyRequestResource_.toBuilder();
              }
              globalOrganizationSetPolicyRequestResource_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(globalOrganizationSetPolicyRequestResource_);
                globalOrganizationSetPolicyRequestResource_ = subBuilder.buildPartial();
              }

              break;
            }
          case 1566449778:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resource_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SetIamPolicyFirewallPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SetIamPolicyFirewallPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest.class,
            com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest.Builder.class);
  }

  public static final int GLOBAL_ORGANIZATION_SET_POLICY_REQUEST_RESOURCE_FIELD_NUMBER = 177408606;
  private com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest
      globalOrganizationSetPolicyRequestResource_;
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the globalOrganizationSetPolicyRequestResource field is set.
   */
  @java.lang.Override
  public boolean hasGlobalOrganizationSetPolicyRequestResource() {
    return globalOrganizationSetPolicyRequestResource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The globalOrganizationSetPolicyRequestResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest
      getGlobalOrganizationSetPolicyRequestResource() {
    return globalOrganizationSetPolicyRequestResource_ == null
        ? com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.getDefaultInstance()
        : globalOrganizationSetPolicyRequestResource_;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequestOrBuilder
      getGlobalOrganizationSetPolicyRequestResourceOrBuilder() {
    return getGlobalOrganizationSetPolicyRequestResource();
  }

  public static final int RESOURCE_FIELD_NUMBER = 195806222;
  private volatile java.lang.Object resource_;
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (globalOrganizationSetPolicyRequestResource_ != null) {
      output.writeMessage(177408606, getGlobalOrganizationSetPolicyRequestResource());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (globalOrganizationSetPolicyRequestResource_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              177408606, getGlobalOrganizationSetPolicyRequestResource());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest other =
        (com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest) obj;

    if (hasGlobalOrganizationSetPolicyRequestResource()
        != other.hasGlobalOrganizationSetPolicyRequestResource()) return false;
    if (hasGlobalOrganizationSetPolicyRequestResource()) {
      if (!getGlobalOrganizationSetPolicyRequestResource()
          .equals(other.getGlobalOrganizationSetPolicyRequestResource())) return false;
    }
    if (!getResource().equals(other.getResource())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGlobalOrganizationSetPolicyRequestResource()) {
      hash = (37 * hash) + GLOBAL_ORGANIZATION_SET_POLICY_REQUEST_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGlobalOrganizationSetPolicyRequestResource().hashCode();
    }
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A request message for FirewallPolicies.SetIamPolicy. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest)
      com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SetIamPolicyFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SetIamPolicyFirewallPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest.class,
              com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        globalOrganizationSetPolicyRequestResource_ = null;
      } else {
        globalOrganizationSetPolicyRequestResource_ = null;
        globalOrganizationSetPolicyRequestResourceBuilder_ = null;
      }
      resource_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SetIamPolicyFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest build() {
      com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest buildPartial() {
      com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest result =
          new com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest(this);
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        result.globalOrganizationSetPolicyRequestResource_ =
            globalOrganizationSetPolicyRequestResource_;
      } else {
        result.globalOrganizationSetPolicyRequestResource_ =
            globalOrganizationSetPolicyRequestResourceBuilder_.build();
      }
      result.resource_ = resource_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest) {
        return mergeFrom((com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest other) {
      if (other
          == com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest.getDefaultInstance())
        return this;
      if (other.hasGlobalOrganizationSetPolicyRequestResource()) {
        mergeGlobalOrganizationSetPolicyRequestResource(
            other.getGlobalOrganizationSetPolicyRequestResource());
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest
        globalOrganizationSetPolicyRequestResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest,
            com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.Builder,
            com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequestOrBuilder>
        globalOrganizationSetPolicyRequestResourceBuilder_;
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the globalOrganizationSetPolicyRequestResource field is set.
     */
    public boolean hasGlobalOrganizationSetPolicyRequestResource() {
      return globalOrganizationSetPolicyRequestResourceBuilder_ != null
          || globalOrganizationSetPolicyRequestResource_ != null;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The globalOrganizationSetPolicyRequestResource.
     */
    public com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest
        getGlobalOrganizationSetPolicyRequestResource() {
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        return globalOrganizationSetPolicyRequestResource_ == null
            ? com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.getDefaultInstance()
            : globalOrganizationSetPolicyRequestResource_;
      } else {
        return globalOrganizationSetPolicyRequestResourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGlobalOrganizationSetPolicyRequestResource(
        com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest value) {
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        globalOrganizationSetPolicyRequestResource_ = value;
        onChanged();
      } else {
        globalOrganizationSetPolicyRequestResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGlobalOrganizationSetPolicyRequestResource(
        com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.Builder builderForValue) {
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        globalOrganizationSetPolicyRequestResource_ = builderForValue.build();
        onChanged();
      } else {
        globalOrganizationSetPolicyRequestResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGlobalOrganizationSetPolicyRequestResource(
        com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest value) {
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        if (globalOrganizationSetPolicyRequestResource_ != null) {
          globalOrganizationSetPolicyRequestResource_ =
              com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.newBuilder(
                      globalOrganizationSetPolicyRequestResource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          globalOrganizationSetPolicyRequestResource_ = value;
        }
        onChanged();
      } else {
        globalOrganizationSetPolicyRequestResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGlobalOrganizationSetPolicyRequestResource() {
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        globalOrganizationSetPolicyRequestResource_ = null;
        onChanged();
      } else {
        globalOrganizationSetPolicyRequestResource_ = null;
        globalOrganizationSetPolicyRequestResourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.Builder
        getGlobalOrganizationSetPolicyRequestResourceBuilder() {

      onChanged();
      return getGlobalOrganizationSetPolicyRequestResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequestOrBuilder
        getGlobalOrganizationSetPolicyRequestResourceOrBuilder() {
      if (globalOrganizationSetPolicyRequestResourceBuilder_ != null) {
        return globalOrganizationSetPolicyRequestResourceBuilder_.getMessageOrBuilder();
      } else {
        return globalOrganizationSetPolicyRequestResource_ == null
            ? com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.getDefaultInstance()
            : globalOrganizationSetPolicyRequestResource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest,
            com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.Builder,
            com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequestOrBuilder>
        getGlobalOrganizationSetPolicyRequestResourceFieldBuilder() {
      if (globalOrganizationSetPolicyRequestResourceBuilder_ == null) {
        globalOrganizationSetPolicyRequestResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest,
                com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest.Builder,
                com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequestOrBuilder>(
                getGlobalOrganizationSetPolicyRequestResource(), getParentForChildren(), isClean());
        globalOrganizationSetPolicyRequestResource_ = null;
      }
      return globalOrganizationSetPolicyRequestResourceBuilder_;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {

      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resource_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest)
  private static final com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest();
  }

  public static com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetIamPolicyFirewallPolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<SetIamPolicyFirewallPolicyRequest>() {
        @java.lang.Override
        public SetIamPolicyFirewallPolicyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SetIamPolicyFirewallPolicyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SetIamPolicyFirewallPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetIamPolicyFirewallPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}