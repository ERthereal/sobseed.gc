// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ICEDOFNJPDC.proto

package emu.grasscutter.net.proto;

public final class ICEDOFNJPDCOuterClass {
  private ICEDOFNJPDCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ICEDOFNJPDCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ICEDOFNJPDC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
     * @return A list containing the iEKHFNCBNBC.
     */
    java.util.List<java.lang.Long> getIEKHFNCBNBCList();
    /**
     * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
     * @return The count of iEKHFNCBNBC.
     */
    int getIEKHFNCBNBCCount();
    /**
     * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
     * @param index The index of the element to return.
     * @return The iEKHFNCBNBC at the given index.
     */
    long getIEKHFNCBNBC(int index);
  }
  /**
   * <pre>
   * Name: ICEDOFNJPDC
   * CmdId: 22260
   * </pre>
   *
   * Protobuf type {@code ICEDOFNJPDC}
   */
  public static final class ICEDOFNJPDC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ICEDOFNJPDC)
      ICEDOFNJPDCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ICEDOFNJPDC.newBuilder() to construct.
    private ICEDOFNJPDC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ICEDOFNJPDC() {
      iEKHFNCBNBC_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ICEDOFNJPDC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ICEDOFNJPDC(
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
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                iEKHFNCBNBC_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              iEKHFNCBNBC_.addLong(input.readUInt64());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                iEKHFNCBNBC_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                iEKHFNCBNBC_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
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
          iEKHFNCBNBC_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.internal_static_ICEDOFNJPDC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.internal_static_ICEDOFNJPDC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC.class, emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC.Builder.class);
    }

    public static final int IEKHFNCBNBC_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.LongList iEKHFNCBNBC_;
    /**
     * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
     * @return A list containing the iEKHFNCBNBC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getIEKHFNCBNBCList() {
      return iEKHFNCBNBC_;
    }
    /**
     * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
     * @return The count of iEKHFNCBNBC.
     */
    public int getIEKHFNCBNBCCount() {
      return iEKHFNCBNBC_.size();
    }
    /**
     * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
     * @param index The index of the element to return.
     * @return The iEKHFNCBNBC at the given index.
     */
    public long getIEKHFNCBNBC(int index) {
      return iEKHFNCBNBC_.getLong(index);
    }
    private int iEKHFNCBNBCMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getIEKHFNCBNBCList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(iEKHFNCBNBCMemoizedSerializedSize);
      }
      for (int i = 0; i < iEKHFNCBNBC_.size(); i++) {
        output.writeUInt64NoTag(iEKHFNCBNBC_.getLong(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < iEKHFNCBNBC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(iEKHFNCBNBC_.getLong(i));
        }
        size += dataSize;
        if (!getIEKHFNCBNBCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        iEKHFNCBNBCMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC other = (emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC) obj;

      if (!getIEKHFNCBNBCList()
          .equals(other.getIEKHFNCBNBCList())) return false;
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
      if (getIEKHFNCBNBCCount() > 0) {
        hash = (37 * hash) + IEKHFNCBNBC_FIELD_NUMBER;
        hash = (53 * hash) + getIEKHFNCBNBCList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC prototype) {
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
     * Name: ICEDOFNJPDC
     * CmdId: 22260
     * </pre>
     *
     * Protobuf type {@code ICEDOFNJPDC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ICEDOFNJPDC)
        emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.internal_static_ICEDOFNJPDC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.internal_static_ICEDOFNJPDC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC.class, emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        iEKHFNCBNBC_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.internal_static_ICEDOFNJPDC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC build() {
        emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC buildPartial() {
        emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC result = new emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          iEKHFNCBNBC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.iEKHFNCBNBC_ = iEKHFNCBNBC_;
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
        if (other instanceof emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC) {
          return mergeFrom((emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC other) {
        if (other == emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC.getDefaultInstance()) return this;
        if (!other.iEKHFNCBNBC_.isEmpty()) {
          if (iEKHFNCBNBC_.isEmpty()) {
            iEKHFNCBNBC_ = other.iEKHFNCBNBC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIEKHFNCBNBCIsMutable();
            iEKHFNCBNBC_.addAll(other.iEKHFNCBNBC_);
          }
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
        emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.LongList iEKHFNCBNBC_ = emptyLongList();
      private void ensureIEKHFNCBNBCIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          iEKHFNCBNBC_ = mutableCopy(iEKHFNCBNBC_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
       * @return A list containing the iEKHFNCBNBC.
       */
      public java.util.List<java.lang.Long>
          getIEKHFNCBNBCList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(iEKHFNCBNBC_) : iEKHFNCBNBC_;
      }
      /**
       * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
       * @return The count of iEKHFNCBNBC.
       */
      public int getIEKHFNCBNBCCount() {
        return iEKHFNCBNBC_.size();
      }
      /**
       * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
       * @param index The index of the element to return.
       * @return The iEKHFNCBNBC at the given index.
       */
      public long getIEKHFNCBNBC(int index) {
        return iEKHFNCBNBC_.getLong(index);
      }
      /**
       * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
       * @param index The index to set the value at.
       * @param value The iEKHFNCBNBC to set.
       * @return This builder for chaining.
       */
      public Builder setIEKHFNCBNBC(
          int index, long value) {
        ensureIEKHFNCBNBCIsMutable();
        iEKHFNCBNBC_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
       * @param value The iEKHFNCBNBC to add.
       * @return This builder for chaining.
       */
      public Builder addIEKHFNCBNBC(long value) {
        ensureIEKHFNCBNBCIsMutable();
        iEKHFNCBNBC_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
       * @param values The iEKHFNCBNBC to add.
       * @return This builder for chaining.
       */
      public Builder addAllIEKHFNCBNBC(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureIEKHFNCBNBCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, iEKHFNCBNBC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 IEKHFNCBNBC = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIEKHFNCBNBC() {
        iEKHFNCBNBC_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:ICEDOFNJPDC)
    }

    // @@protoc_insertion_point(class_scope:ICEDOFNJPDC)
    private static final emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC();
    }

    public static emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ICEDOFNJPDC>
        PARSER = new com.google.protobuf.AbstractParser<ICEDOFNJPDC>() {
      @java.lang.Override
      public ICEDOFNJPDC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ICEDOFNJPDC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ICEDOFNJPDC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ICEDOFNJPDC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ICEDOFNJPDCOuterClass.ICEDOFNJPDC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ICEDOFNJPDC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ICEDOFNJPDC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ICEDOFNJPDC.proto\"\"\n\013ICEDOFNJPDC\022\023\n\013IE" +
      "KHFNCBNBC\030\n \003(\004B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ICEDOFNJPDC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ICEDOFNJPDC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ICEDOFNJPDC_descriptor,
        new java.lang.String[] { "IEKHFNCBNBC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}