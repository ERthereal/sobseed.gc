// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NMIPDNNMELF.proto

package emu.grasscutter.net.proto;

public final class NMIPDNNMELFOuterClass {
  private NMIPDNNMELFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NMIPDNNMELFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NMIPDNNMELF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IHIJMKGJJPC = 5;</code>
     * @return The iHIJMKGJJPC.
     */
    int getIHIJMKGJJPC();

    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>bool has_reward = 4;</code>
     * @return The hasReward.
     */
    boolean getHasReward();
  }
  /**
   * <pre>
   * Name: NMIPDNNMELF
   * </pre>
   *
   * Protobuf type {@code NMIPDNNMELF}
   */
  public static final class NMIPDNNMELF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NMIPDNNMELF)
      NMIPDNNMELFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NMIPDNNMELF.newBuilder() to construct.
    private NMIPDNNMELF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NMIPDNNMELF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NMIPDNNMELF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NMIPDNNMELF(
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
            case 32: {

              hasReward_ = input.readBool();
              break;
            }
            case 40: {

              iHIJMKGJJPC_ = input.readUInt32();
              break;
            }
            case 80: {

              isOpen_ = input.readBool();
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
      return emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.internal_static_NMIPDNNMELF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.internal_static_NMIPDNNMELF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF.class, emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF.Builder.class);
    }

    public static final int IHIJMKGJJPC_FIELD_NUMBER = 5;
    private int iHIJMKGJJPC_;
    /**
     * <code>uint32 IHIJMKGJJPC = 5;</code>
     * @return The iHIJMKGJJPC.
     */
    @java.lang.Override
    public int getIHIJMKGJJPC() {
      return iHIJMKGJJPC_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 10;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int HAS_REWARD_FIELD_NUMBER = 4;
    private boolean hasReward_;
    /**
     * <code>bool has_reward = 4;</code>
     * @return The hasReward.
     */
    @java.lang.Override
    public boolean getHasReward() {
      return hasReward_;
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
      if (hasReward_ != false) {
        output.writeBool(4, hasReward_);
      }
      if (iHIJMKGJJPC_ != 0) {
        output.writeUInt32(5, iHIJMKGJJPC_);
      }
      if (isOpen_ != false) {
        output.writeBool(10, isOpen_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hasReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, hasReward_);
      }
      if (iHIJMKGJJPC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, iHIJMKGJJPC_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF other = (emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF) obj;

      if (getIHIJMKGJJPC()
          != other.getIHIJMKGJJPC()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getHasReward()
          != other.getHasReward()) return false;
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
      hash = (37 * hash) + IHIJMKGJJPC_FIELD_NUMBER;
      hash = (53 * hash) + getIHIJMKGJJPC();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + HAS_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasReward());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF prototype) {
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
     * Name: NMIPDNNMELF
     * </pre>
     *
     * Protobuf type {@code NMIPDNNMELF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NMIPDNNMELF)
        emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.internal_static_NMIPDNNMELF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.internal_static_NMIPDNNMELF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF.class, emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF.newBuilder()
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
        iHIJMKGJJPC_ = 0;

        isOpen_ = false;

        hasReward_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.internal_static_NMIPDNNMELF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF build() {
        emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF buildPartial() {
        emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF result = new emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF(this);
        result.iHIJMKGJJPC_ = iHIJMKGJJPC_;
        result.isOpen_ = isOpen_;
        result.hasReward_ = hasReward_;
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
        if (other instanceof emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF) {
          return mergeFrom((emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF other) {
        if (other == emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF.getDefaultInstance()) return this;
        if (other.getIHIJMKGJJPC() != 0) {
          setIHIJMKGJJPC(other.getIHIJMKGJJPC());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getHasReward() != false) {
          setHasReward(other.getHasReward());
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
        emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iHIJMKGJJPC_ ;
      /**
       * <code>uint32 IHIJMKGJJPC = 5;</code>
       * @return The iHIJMKGJJPC.
       */
      @java.lang.Override
      public int getIHIJMKGJJPC() {
        return iHIJMKGJJPC_;
      }
      /**
       * <code>uint32 IHIJMKGJJPC = 5;</code>
       * @param value The iHIJMKGJJPC to set.
       * @return This builder for chaining.
       */
      public Builder setIHIJMKGJJPC(int value) {
        
        iHIJMKGJJPC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IHIJMKGJJPC = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIHIJMKGJJPC() {
        
        iHIJMKGJJPC_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 10;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private boolean hasReward_ ;
      /**
       * <code>bool has_reward = 4;</code>
       * @return The hasReward.
       */
      @java.lang.Override
      public boolean getHasReward() {
        return hasReward_;
      }
      /**
       * <code>bool has_reward = 4;</code>
       * @param value The hasReward to set.
       * @return This builder for chaining.
       */
      public Builder setHasReward(boolean value) {
        
        hasReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool has_reward = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearHasReward() {
        
        hasReward_ = false;
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


      // @@protoc_insertion_point(builder_scope:NMIPDNNMELF)
    }

    // @@protoc_insertion_point(class_scope:NMIPDNNMELF)
    private static final emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF();
    }

    public static emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NMIPDNNMELF>
        PARSER = new com.google.protobuf.AbstractParser<NMIPDNNMELF>() {
      @java.lang.Override
      public NMIPDNNMELF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NMIPDNNMELF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NMIPDNNMELF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NMIPDNNMELF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NMIPDNNMELFOuterClass.NMIPDNNMELF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NMIPDNNMELF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NMIPDNNMELF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NMIPDNNMELF.proto\"G\n\013NMIPDNNMELF\022\023\n\013IH" +
      "IJMKGJJPC\030\005 \001(\r\022\017\n\007is_open\030\n \001(\010\022\022\n\nhas_" +
      "reward\030\004 \001(\010B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NMIPDNNMELF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NMIPDNNMELF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NMIPDNNMELF_descriptor,
        new java.lang.String[] { "IHIJMKGJJPC", "IsOpen", "HasReward", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}