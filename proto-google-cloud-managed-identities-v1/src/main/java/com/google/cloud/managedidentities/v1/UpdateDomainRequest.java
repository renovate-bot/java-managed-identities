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
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdateDomain][google.cloud.managedidentities.v1.UpdateDomain]
 * </pre>
 *
 * Protobuf type {@code google.cloud.managedidentities.v1.UpdateDomainRequest}
 */
public final class UpdateDomainRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.managedidentities.v1.UpdateDomainRequest)
    UpdateDomainRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateDomainRequest.newBuilder() to construct.
  private UpdateDomainRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDomainRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDomainRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
        .internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
        .internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.managedidentities.v1.UpdateDomainRequest.class,
            com.google.cloud.managedidentities.v1.UpdateDomainRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in this
   * field. The elements of the repeated paths field may only include
   * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
   *  * `labels`
   *  * `locations`
   *  * `authorized_networks`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in this
   * field. The elements of the repeated paths field may only include
   * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
   *  * `labels`
   *  * `locations`
   *  * `authorized_networks`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in this
   * field. The elements of the repeated paths field may only include
   * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
   *  * `labels`
   *  * `locations`
   *  * `authorized_networks`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int DOMAIN_FIELD_NUMBER = 2;
  private com.google.cloud.managedidentities.v1.Domain domain_;
  /**
   *
   *
   * <pre>
   * Required. Domain message with updated fields. Only supported fields specified in
   * update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the domain field is set.
   */
  @java.lang.Override
  public boolean hasDomain() {
    return domain_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Domain message with updated fields. Only supported fields specified in
   * update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The domain.
   */
  @java.lang.Override
  public com.google.cloud.managedidentities.v1.Domain getDomain() {
    return domain_ == null
        ? com.google.cloud.managedidentities.v1.Domain.getDefaultInstance()
        : domain_;
  }
  /**
   *
   *
   * <pre>
   * Required. Domain message with updated fields. Only supported fields specified in
   * update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.managedidentities.v1.DomainOrBuilder getDomainOrBuilder() {
    return getDomain();
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (domain_ != null) {
      output.writeMessage(2, getDomain());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (domain_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDomain());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.managedidentities.v1.UpdateDomainRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.managedidentities.v1.UpdateDomainRequest other =
        (com.google.cloud.managedidentities.v1.UpdateDomainRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasDomain() != other.hasDomain()) return false;
    if (hasDomain()) {
      if (!getDomain().equals(other.getDomain())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasDomain()) {
      hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
      hash = (53 * hash) + getDomain().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest parseFrom(
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
      com.google.cloud.managedidentities.v1.UpdateDomainRequest prototype) {
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
   * Request message for
   * [UpdateDomain][google.cloud.managedidentities.v1.UpdateDomain]
   * </pre>
   *
   * Protobuf type {@code google.cloud.managedidentities.v1.UpdateDomainRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.managedidentities.v1.UpdateDomainRequest)
      com.google.cloud.managedidentities.v1.UpdateDomainRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
          .internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
          .internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.managedidentities.v1.UpdateDomainRequest.class,
              com.google.cloud.managedidentities.v1.UpdateDomainRequest.Builder.class);
    }

    // Construct using com.google.cloud.managedidentities.v1.UpdateDomainRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      if (domainBuilder_ == null) {
        domain_ = null;
      } else {
        domain_ = null;
        domainBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
          .internal_static_google_cloud_managedidentities_v1_UpdateDomainRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.UpdateDomainRequest getDefaultInstanceForType() {
      return com.google.cloud.managedidentities.v1.UpdateDomainRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.UpdateDomainRequest build() {
      com.google.cloud.managedidentities.v1.UpdateDomainRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.UpdateDomainRequest buildPartial() {
      com.google.cloud.managedidentities.v1.UpdateDomainRequest result =
          new com.google.cloud.managedidentities.v1.UpdateDomainRequest(this);
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      if (domainBuilder_ == null) {
        result.domain_ = domain_;
      } else {
        result.domain_ = domainBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.managedidentities.v1.UpdateDomainRequest) {
        return mergeFrom((com.google.cloud.managedidentities.v1.UpdateDomainRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.managedidentities.v1.UpdateDomainRequest other) {
      if (other == com.google.cloud.managedidentities.v1.UpdateDomainRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasDomain()) {
        mergeDomain(other.getDomain());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getDomainFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in this
     * field. The elements of the repeated paths field may only include
     * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
     *  * `labels`
     *  * `locations`
     *  * `authorized_networks`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.managedidentities.v1.Domain domain_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.managedidentities.v1.Domain,
            com.google.cloud.managedidentities.v1.Domain.Builder,
            com.google.cloud.managedidentities.v1.DomainOrBuilder>
        domainBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the domain field is set.
     */
    public boolean hasDomain() {
      return domainBuilder_ != null || domain_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The domain.
     */
    public com.google.cloud.managedidentities.v1.Domain getDomain() {
      if (domainBuilder_ == null) {
        return domain_ == null
            ? com.google.cloud.managedidentities.v1.Domain.getDefaultInstance()
            : domain_;
      } else {
        return domainBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDomain(com.google.cloud.managedidentities.v1.Domain value) {
      if (domainBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        domain_ = value;
        onChanged();
      } else {
        domainBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDomain(com.google.cloud.managedidentities.v1.Domain.Builder builderForValue) {
      if (domainBuilder_ == null) {
        domain_ = builderForValue.build();
        onChanged();
      } else {
        domainBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDomain(com.google.cloud.managedidentities.v1.Domain value) {
      if (domainBuilder_ == null) {
        if (domain_ != null) {
          domain_ =
              com.google.cloud.managedidentities.v1.Domain.newBuilder(domain_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          domain_ = value;
        }
        onChanged();
      } else {
        domainBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDomain() {
      if (domainBuilder_ == null) {
        domain_ = null;
        onChanged();
      } else {
        domain_ = null;
        domainBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedidentities.v1.Domain.Builder getDomainBuilder() {

      onChanged();
      return getDomainFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedidentities.v1.DomainOrBuilder getDomainOrBuilder() {
      if (domainBuilder_ != null) {
        return domainBuilder_.getMessageOrBuilder();
      } else {
        return domain_ == null
            ? com.google.cloud.managedidentities.v1.Domain.getDefaultInstance()
            : domain_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Domain message with updated fields. Only supported fields specified in
     * update_mask are updated.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.managedidentities.v1.Domain,
            com.google.cloud.managedidentities.v1.Domain.Builder,
            com.google.cloud.managedidentities.v1.DomainOrBuilder>
        getDomainFieldBuilder() {
      if (domainBuilder_ == null) {
        domainBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.managedidentities.v1.Domain,
                com.google.cloud.managedidentities.v1.Domain.Builder,
                com.google.cloud.managedidentities.v1.DomainOrBuilder>(
                getDomain(), getParentForChildren(), isClean());
        domain_ = null;
      }
      return domainBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.managedidentities.v1.UpdateDomainRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.managedidentities.v1.UpdateDomainRequest)
  private static final com.google.cloud.managedidentities.v1.UpdateDomainRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.managedidentities.v1.UpdateDomainRequest();
  }

  public static com.google.cloud.managedidentities.v1.UpdateDomainRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDomainRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDomainRequest>() {
        @java.lang.Override
        public UpdateDomainRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateDomainRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDomainRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.managedidentities.v1.UpdateDomainRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
