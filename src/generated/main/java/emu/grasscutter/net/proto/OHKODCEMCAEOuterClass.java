// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OHKODCEMCAE.proto

package emu.grasscutter.net.proto;

public final class OHKODCEMCAEOuterClass {
  private OHKODCEMCAEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OHKODCEMCAEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OHKODCEMCAE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL> 
        getStageInfoListList();
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL getStageInfoList(int index);
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    int getStageInfoListCount();
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder> 
        getStageInfoListOrBuilderList();
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder getStageInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: OHKODCEMCAE
   * </pre>
   *
   * Protobuf type {@code OHKODCEMCAE}
   */
  public static final class OHKODCEMCAE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OHKODCEMCAE)
      OHKODCEMCAEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OHKODCEMCAE.newBuilder() to construct.
    private OHKODCEMCAE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OHKODCEMCAE() {
      stageInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OHKODCEMCAE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OHKODCEMCAE(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                stageInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL>();
                mutable_bitField0_ |= 0x00000001;
              }
              stageInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.internal_static_OHKODCEMCAE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.internal_static_OHKODCEMCAE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE.class, emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE.Builder.class);
    }

    public static final int STAGE_INFO_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL> stageInfoList_;
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL> getStageInfoListList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder> 
        getStageInfoListOrBuilderList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    @java.lang.Override
    public int getStageInfoListCount() {
      return stageInfoList_.size();
    }
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL getStageInfoList(int index) {
      return stageInfoList_.get(index);
    }
    /**
     * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder getStageInfoListOrBuilder(
        int index) {
      return stageInfoList_.get(index);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < stageInfoList_.size(); i++) {
        output.writeMessage(15, stageInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, stageInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE other = (emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE) obj;

      if (!getStageInfoListList()
          .equals(other.getStageInfoListList())) return false;
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
      if (getStageInfoListCount() > 0) {
        hash = (37 * hash) + STAGE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: OHKODCEMCAE
     * </pre>
     *
     * Protobuf type {@code OHKODCEMCAE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OHKODCEMCAE)
        emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.internal_static_OHKODCEMCAE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.internal_static_OHKODCEMCAE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE.class, emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getStageInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          stageInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.internal_static_OHKODCEMCAE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE build() {
        emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE buildPartial() {
        emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE result = new emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE(this);
        int from_bitField0_ = bitField0_;
        if (stageInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageInfoList_ = stageInfoList_;
        } else {
          result.stageInfoList_ = stageInfoListBuilder_.build();
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
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE) {
          return mergeFrom((emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE other) {
        if (other == emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE.getDefaultInstance()) return this;
        if (stageInfoListBuilder_ == null) {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoList_.isEmpty()) {
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageInfoListIsMutable();
              stageInfoList_.addAll(other.stageInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoListBuilder_.isEmpty()) {
              stageInfoListBuilder_.dispose();
              stageInfoListBuilder_ = null;
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageInfoListFieldBuilder() : null;
            } else {
              stageInfoListBuilder_.addAllMessages(other.stageInfoList_);
            }
          }
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
        emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL> stageInfoList_ =
        java.util.Collections.emptyList();
      private void ensureStageInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL>(stageInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder> stageInfoListBuilder_;

      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL> getStageInfoListList() {
        if (stageInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        } else {
          return stageInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public int getStageInfoListCount() {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.size();
        } else {
          return stageInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL getStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);
        } else {
          return stageInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder setStageInfoList(
          int index, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder setStageInfoList(
          int index, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder addStageInfoList(emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder addStageInfoList(
          int index, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder addStageInfoList(
          emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder addStageInfoList(
          int index, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder addAllStageInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL> values) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageInfoList_);
          onChanged();
        } else {
          stageInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder clearStageInfoList() {
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public Builder removeStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.remove(index);
          onChanged();
        } else {
          stageInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder getStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder getStageInfoListOrBuilder(
          int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);  } else {
          return stageInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder> 
           getStageInfoListOrBuilderList() {
        if (stageInfoListBuilder_ != null) {
          return stageInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        }
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder addStageInfoListBuilder() {
        return getStageInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.getDefaultInstance());
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder addStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.getDefaultInstance());
      }
      /**
       * <code>repeated .ELEEFNHCAOL stage_info_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder> 
           getStageInfoListBuilderList() {
        return getStageInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder> 
          getStageInfoListFieldBuilder() {
        if (stageInfoListBuilder_ == null) {
          stageInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOL.Builder, emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.ELEEFNHCAOLOrBuilder>(
                  stageInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageInfoList_ = null;
        }
        return stageInfoListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:OHKODCEMCAE)
    }

    // @@protoc_insertion_point(class_scope:OHKODCEMCAE)
    private static final emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE();
    }

    public static emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OHKODCEMCAE>
        PARSER = new com.google.protobuf.AbstractParser<OHKODCEMCAE>() {
      @java.lang.Override
      public OHKODCEMCAE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OHKODCEMCAE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OHKODCEMCAE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OHKODCEMCAE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OHKODCEMCAEOuterClass.OHKODCEMCAE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OHKODCEMCAE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OHKODCEMCAE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OHKODCEMCAE.proto\032\021ELEEFNHCAOL.proto\"4" +
      "\n\013OHKODCEMCAE\022%\n\017stage_info_list\030\017 \003(\0132\014" +
      ".ELEEFNHCAOLB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.getDescriptor(),
        });
    internal_static_OHKODCEMCAE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OHKODCEMCAE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OHKODCEMCAE_descriptor,
        new java.lang.String[] { "StageInfoList", });
    emu.grasscutter.net.proto.ELEEFNHCAOLOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}