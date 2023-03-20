// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MainCoopFailNotify.proto

package emu.grasscutter.net.proto;

public final class MainCoopFailNotifyOuterClass {
  private MainCoopFailNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MainCoopFailNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MainCoopFailNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string textmap_id = 15;</code>
     * @return The textmapId.
     */
    java.lang.String getTextmapId();
    /**
     * <code>string textmap_id = 15;</code>
     * @return The bytes for textmapId.
     */
    com.google.protobuf.ByteString
        getTextmapIdBytes();

    /**
     * <code>uint32 chapter_id = 6;</code>
     * @return The chapterId.
     */
    int getChapterId();
  }
  /**
   * <pre>
   * Name: KLEPHMMFBPB
   * CmdId: 1987
   * </pre>
   *
   * Protobuf type {@code MainCoopFailNotify}
   */
  public static final class MainCoopFailNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MainCoopFailNotify)
      MainCoopFailNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MainCoopFailNotify.newBuilder() to construct.
    private MainCoopFailNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MainCoopFailNotify() {
      textmapId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MainCoopFailNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MainCoopFailNotify(
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
            case 48: {

              chapterId_ = input.readUInt32();
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              textmapId_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.internal_static_MainCoopFailNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.internal_static_MainCoopFailNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify.class, emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify.Builder.class);
    }

    public static final int TEXTMAP_ID_FIELD_NUMBER = 15;
    private volatile java.lang.Object textmapId_;
    /**
     * <code>string textmap_id = 15;</code>
     * @return The textmapId.
     */
    @java.lang.Override
    public java.lang.String getTextmapId() {
      java.lang.Object ref = textmapId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        textmapId_ = s;
        return s;
      }
    }
    /**
     * <code>string textmap_id = 15;</code>
     * @return The bytes for textmapId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextmapIdBytes() {
      java.lang.Object ref = textmapId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        textmapId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 6;
    private int chapterId_;
    /**
     * <code>uint32 chapter_id = 6;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapterId_;
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
      if (chapterId_ != 0) {
        output.writeUInt32(6, chapterId_);
      }
      if (!getTextmapIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, textmapId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chapterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, chapterId_);
      }
      if (!getTextmapIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, textmapId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify other = (emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify) obj;

      if (!getTextmapId()
          .equals(other.getTextmapId())) return false;
      if (getChapterId()
          != other.getChapterId()) return false;
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
      hash = (37 * hash) + TEXTMAP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTextmapId().hashCode();
      hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChapterId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify prototype) {
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
     * Name: KLEPHMMFBPB
     * CmdId: 1987
     * </pre>
     *
     * Protobuf type {@code MainCoopFailNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MainCoopFailNotify)
        emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.internal_static_MainCoopFailNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.internal_static_MainCoopFailNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify.class, emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify.newBuilder()
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
        textmapId_ = "";

        chapterId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.internal_static_MainCoopFailNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify build() {
        emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify buildPartial() {
        emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify result = new emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify(this);
        result.textmapId_ = textmapId_;
        result.chapterId_ = chapterId_;
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
        if (other instanceof emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify other) {
        if (other == emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify.getDefaultInstance()) return this;
        if (!other.getTextmapId().isEmpty()) {
          textmapId_ = other.textmapId_;
          onChanged();
        }
        if (other.getChapterId() != 0) {
          setChapterId(other.getChapterId());
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
        emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object textmapId_ = "";
      /**
       * <code>string textmap_id = 15;</code>
       * @return The textmapId.
       */
      public java.lang.String getTextmapId() {
        java.lang.Object ref = textmapId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          textmapId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string textmap_id = 15;</code>
       * @return The bytes for textmapId.
       */
      public com.google.protobuf.ByteString
          getTextmapIdBytes() {
        java.lang.Object ref = textmapId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          textmapId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string textmap_id = 15;</code>
       * @param value The textmapId to set.
       * @return This builder for chaining.
       */
      public Builder setTextmapId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        textmapId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string textmap_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTextmapId() {
        
        textmapId_ = getDefaultInstance().getTextmapId();
        onChanged();
        return this;
      }
      /**
       * <code>string textmap_id = 15;</code>
       * @param value The bytes for textmapId to set.
       * @return This builder for chaining.
       */
      public Builder setTextmapIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        textmapId_ = value;
        onChanged();
        return this;
      }

      private int chapterId_ ;
      /**
       * <code>uint32 chapter_id = 6;</code>
       * @return The chapterId.
       */
      @java.lang.Override
      public int getChapterId() {
        return chapterId_;
      }
      /**
       * <code>uint32 chapter_id = 6;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        chapterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        
        chapterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MainCoopFailNotify)
    }

    // @@protoc_insertion_point(class_scope:MainCoopFailNotify)
    private static final emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify();
    }

    public static emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MainCoopFailNotify>
        PARSER = new com.google.protobuf.AbstractParser<MainCoopFailNotify>() {
      @java.lang.Override
      public MainCoopFailNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MainCoopFailNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MainCoopFailNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MainCoopFailNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MainCoopFailNotifyOuterClass.MainCoopFailNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MainCoopFailNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MainCoopFailNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MainCoopFailNotify.proto\"<\n\022MainCoopFa" +
      "ilNotify\022\022\n\ntextmap_id\030\017 \001(\t\022\022\n\nchapter_" +
      "id\030\006 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MainCoopFailNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MainCoopFailNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MainCoopFailNotify_descriptor,
        new java.lang.String[] { "TextmapId", "ChapterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}