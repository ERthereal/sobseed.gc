// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OJEEKAIOFBO.proto

package emu.grasscutter.net.proto;

public final class OJEEKAIOFBOOuterClass {
  private OJEEKAIOFBOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OJEEKAIOFBOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OJEEKAIOFBO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trader_id = 9;</code>
     * @return The traderId.
     */
    int getTraderId();

    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getMEKHDALGJJLList();
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getMEKHDALGJJL(int index);
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    int getMEKHDALGJJLCount();
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getMEKHDALGJJLOrBuilderList();
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getMEKHDALGJJLOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: OJEEKAIOFBO
   * </pre>
   *
   * Protobuf type {@code OJEEKAIOFBO}
   */
  public static final class OJEEKAIOFBO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OJEEKAIOFBO)
      OJEEKAIOFBOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OJEEKAIOFBO.newBuilder() to construct.
    private OJEEKAIOFBO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OJEEKAIOFBO() {
      mEKHDALGJJL_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OJEEKAIOFBO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OJEEKAIOFBO(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mEKHDALGJJL_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              mEKHDALGJJL_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
              break;
            }
            case 72: {

              traderId_ = input.readUInt32();
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
          mEKHDALGJJL_ = java.util.Collections.unmodifiableList(mEKHDALGJJL_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.internal_static_OJEEKAIOFBO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.internal_static_OJEEKAIOFBO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.class, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.Builder.class);
    }

    public static final int TRADER_ID_FIELD_NUMBER = 9;
    private int traderId_;
    /**
     * <code>uint32 trader_id = 9;</code>
     * @return The traderId.
     */
    @java.lang.Override
    public int getTraderId() {
      return traderId_;
    }

    public static final int MEKHDALGJJL_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> mEKHDALGJJL_;
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getMEKHDALGJJLList() {
      return mEKHDALGJJL_;
    }
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getMEKHDALGJJLOrBuilderList() {
      return mEKHDALGJJL_;
    }
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    @java.lang.Override
    public int getMEKHDALGJJLCount() {
      return mEKHDALGJJL_.size();
    }
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getMEKHDALGJJL(int index) {
      return mEKHDALGJJL_.get(index);
    }
    /**
     * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getMEKHDALGJJLOrBuilder(
        int index) {
      return mEKHDALGJJL_.get(index);
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
      for (int i = 0; i < mEKHDALGJJL_.size(); i++) {
        output.writeMessage(3, mEKHDALGJJL_.get(i));
      }
      if (traderId_ != 0) {
        output.writeUInt32(9, traderId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < mEKHDALGJJL_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, mEKHDALGJJL_.get(i));
      }
      if (traderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, traderId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO other = (emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO) obj;

      if (getTraderId()
          != other.getTraderId()) return false;
      if (!getMEKHDALGJJLList()
          .equals(other.getMEKHDALGJJLList())) return false;
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
      hash = (37 * hash) + TRADER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTraderId();
      if (getMEKHDALGJJLCount() > 0) {
        hash = (37 * hash) + MEKHDALGJJL_FIELD_NUMBER;
        hash = (53 * hash) + getMEKHDALGJJLList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO prototype) {
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
     * Name: OJEEKAIOFBO
     * </pre>
     *
     * Protobuf type {@code OJEEKAIOFBO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OJEEKAIOFBO)
        emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.internal_static_OJEEKAIOFBO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.internal_static_OJEEKAIOFBO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.class, emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.newBuilder()
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
          getMEKHDALGJJLFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        traderId_ = 0;

        if (mEKHDALGJJLBuilder_ == null) {
          mEKHDALGJJL_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          mEKHDALGJJLBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.internal_static_OJEEKAIOFBO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO build() {
        emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO buildPartial() {
        emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO result = new emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO(this);
        int from_bitField0_ = bitField0_;
        result.traderId_ = traderId_;
        if (mEKHDALGJJLBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            mEKHDALGJJL_ = java.util.Collections.unmodifiableList(mEKHDALGJJL_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.mEKHDALGJJL_ = mEKHDALGJJL_;
        } else {
          result.mEKHDALGJJL_ = mEKHDALGJJLBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO) {
          return mergeFrom((emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO other) {
        if (other == emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO.getDefaultInstance()) return this;
        if (other.getTraderId() != 0) {
          setTraderId(other.getTraderId());
        }
        if (mEKHDALGJJLBuilder_ == null) {
          if (!other.mEKHDALGJJL_.isEmpty()) {
            if (mEKHDALGJJL_.isEmpty()) {
              mEKHDALGJJL_ = other.mEKHDALGJJL_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMEKHDALGJJLIsMutable();
              mEKHDALGJJL_.addAll(other.mEKHDALGJJL_);
            }
            onChanged();
          }
        } else {
          if (!other.mEKHDALGJJL_.isEmpty()) {
            if (mEKHDALGJJLBuilder_.isEmpty()) {
              mEKHDALGJJLBuilder_.dispose();
              mEKHDALGJJLBuilder_ = null;
              mEKHDALGJJL_ = other.mEKHDALGJJL_;
              bitField0_ = (bitField0_ & ~0x00000001);
              mEKHDALGJJLBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMEKHDALGJJLFieldBuilder() : null;
            } else {
              mEKHDALGJJLBuilder_.addAllMessages(other.mEKHDALGJJL_);
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
        emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int traderId_ ;
      /**
       * <code>uint32 trader_id = 9;</code>
       * @return The traderId.
       */
      @java.lang.Override
      public int getTraderId() {
        return traderId_;
      }
      /**
       * <code>uint32 trader_id = 9;</code>
       * @param value The traderId to set.
       * @return This builder for chaining.
       */
      public Builder setTraderId(int value) {
        
        traderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trader_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTraderId() {
        
        traderId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> mEKHDALGJJL_ =
        java.util.Collections.emptyList();
      private void ensureMEKHDALGJJLIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mEKHDALGJJL_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(mEKHDALGJJL_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> mEKHDALGJJLBuilder_;

      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getMEKHDALGJJLList() {
        if (mEKHDALGJJLBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mEKHDALGJJL_);
        } else {
          return mEKHDALGJJLBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public int getMEKHDALGJJLCount() {
        if (mEKHDALGJJLBuilder_ == null) {
          return mEKHDALGJJL_.size();
        } else {
          return mEKHDALGJJLBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getMEKHDALGJJL(int index) {
        if (mEKHDALGJJLBuilder_ == null) {
          return mEKHDALGJJL_.get(index);
        } else {
          return mEKHDALGJJLBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder setMEKHDALGJJL(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (mEKHDALGJJLBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMEKHDALGJJLIsMutable();
          mEKHDALGJJL_.set(index, value);
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder setMEKHDALGJJL(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (mEKHDALGJJLBuilder_ == null) {
          ensureMEKHDALGJJLIsMutable();
          mEKHDALGJJL_.set(index, builderForValue.build());
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder addMEKHDALGJJL(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (mEKHDALGJJLBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMEKHDALGJJLIsMutable();
          mEKHDALGJJL_.add(value);
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder addMEKHDALGJJL(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (mEKHDALGJJLBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMEKHDALGJJLIsMutable();
          mEKHDALGJJL_.add(index, value);
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder addMEKHDALGJJL(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (mEKHDALGJJLBuilder_ == null) {
          ensureMEKHDALGJJLIsMutable();
          mEKHDALGJJL_.add(builderForValue.build());
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder addMEKHDALGJJL(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (mEKHDALGJJLBuilder_ == null) {
          ensureMEKHDALGJJLIsMutable();
          mEKHDALGJJL_.add(index, builderForValue.build());
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder addAllMEKHDALGJJL(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (mEKHDALGJJLBuilder_ == null) {
          ensureMEKHDALGJJLIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mEKHDALGJJL_);
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder clearMEKHDALGJJL() {
        if (mEKHDALGJJLBuilder_ == null) {
          mEKHDALGJJL_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public Builder removeMEKHDALGJJL(int index) {
        if (mEKHDALGJJLBuilder_ == null) {
          ensureMEKHDALGJJLIsMutable();
          mEKHDALGJJL_.remove(index);
          onChanged();
        } else {
          mEKHDALGJJLBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getMEKHDALGJJLBuilder(
          int index) {
        return getMEKHDALGJJLFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getMEKHDALGJJLOrBuilder(
          int index) {
        if (mEKHDALGJJLBuilder_ == null) {
          return mEKHDALGJJL_.get(index);  } else {
          return mEKHDALGJJLBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getMEKHDALGJJLOrBuilderList() {
        if (mEKHDALGJJLBuilder_ != null) {
          return mEKHDALGJJLBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mEKHDALGJJL_);
        }
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addMEKHDALGJJLBuilder() {
        return getMEKHDALGJJLFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addMEKHDALGJJLBuilder(
          int index) {
        return getMEKHDALGJJLFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam MEKHDALGJJL = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getMEKHDALGJJLBuilderList() {
        return getMEKHDALGJJLFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getMEKHDALGJJLFieldBuilder() {
        if (mEKHDALGJJLBuilder_ == null) {
          mEKHDALGJJLBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  mEKHDALGJJL_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          mEKHDALGJJL_ = null;
        }
        return mEKHDALGJJLBuilder_;
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


      // @@protoc_insertion_point(builder_scope:OJEEKAIOFBO)
    }

    // @@protoc_insertion_point(class_scope:OJEEKAIOFBO)
    private static final emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO();
    }

    public static emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OJEEKAIOFBO>
        PARSER = new com.google.protobuf.AbstractParser<OJEEKAIOFBO>() {
      @java.lang.Override
      public OJEEKAIOFBO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OJEEKAIOFBO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OJEEKAIOFBO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OJEEKAIOFBO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OJEEKAIOFBOOuterClass.OJEEKAIOFBO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OJEEKAIOFBO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OJEEKAIOFBO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OJEEKAIOFBO.proto\032\017ItemParam.proto\"A\n\013" +
      "OJEEKAIOFBO\022\021\n\ttrader_id\030\t \001(\r\022\037\n\013MEKHDA" +
      "LGJJL\030\003 \003(\0132\n.ItemParamB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_OJEEKAIOFBO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OJEEKAIOFBO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OJEEKAIOFBO_descriptor,
        new java.lang.String[] { "TraderId", "MEKHDALGJJL", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}