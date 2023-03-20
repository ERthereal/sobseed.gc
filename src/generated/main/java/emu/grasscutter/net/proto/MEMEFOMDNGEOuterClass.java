// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MEMEFOMDNGE.proto

package emu.grasscutter.net.proto;

public final class MEMEFOMDNGEOuterClass {
  private MEMEFOMDNGEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MEMEFOMDNGEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MEMEFOMDNGE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
     * @return The enum numeric value on the wire for retcode.
     */
    int getRetcodeValue();
    /**
     * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
     * @return The retcode.
     */
    emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN getRetcode();
  }
  /**
   * <pre>
   * Name: MEMEFOMDNGE
   * CmdId: 101
   * </pre>
   *
   * Protobuf type {@code MEMEFOMDNGE}
   */
  public static final class MEMEFOMDNGE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MEMEFOMDNGE)
      MEMEFOMDNGEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MEMEFOMDNGE.newBuilder() to construct.
    private MEMEFOMDNGE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MEMEFOMDNGE() {
      name_ = "";
      retcode_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MEMEFOMDNGE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MEMEFOMDNGE(
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
            case 8: {

              id_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              retcode_ = rawValue;
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
      return emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.internal_static_MEMEFOMDNGE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.internal_static_MEMEFOMDNGE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.class, emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.Builder.class);
    }

    /**
     * <pre>
     * Name: DAKKMFPGCFN
     * </pre>
     *
     * Protobuf enum {@code MEMEFOMDNGE.DAKKMFPGCFN}
     */
    public enum DAKKMFPGCFN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DAKKMFPGCFN_SUCC = 0;</code>
       */
      DAKKMFPGCFN_SUCC(0),
      /**
       * <code>DAKKMFPGCFN_FAIL = 1;</code>
       */
      DAKKMFPGCFN_FAIL(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>DAKKMFPGCFN_SUCC = 0;</code>
       */
      public static final int DAKKMFPGCFN_SUCC_VALUE = 0;
      /**
       * <code>DAKKMFPGCFN_FAIL = 1;</code>
       */
      public static final int DAKKMFPGCFN_FAIL_VALUE = 1;


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
      public static DAKKMFPGCFN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DAKKMFPGCFN forNumber(int value) {
        switch (value) {
          case 0: return DAKKMFPGCFN_SUCC;
          case 1: return DAKKMFPGCFN_FAIL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DAKKMFPGCFN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DAKKMFPGCFN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DAKKMFPGCFN>() {
              public DAKKMFPGCFN findValueByNumber(int number) {
                return DAKKMFPGCFN.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.getDescriptor().getEnumTypes().get(0);
      }

      private static final DAKKMFPGCFN[] VALUES = values();

      public static DAKKMFPGCFN valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private DAKKMFPGCFN(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MEMEFOMDNGE.DAKKMFPGCFN)
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
     * @return The enum numeric value on the wire for retcode.
     */
    @java.lang.Override public int getRetcodeValue() {
      return retcode_;
    }
    /**
     * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN getRetcode() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN result = emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN.valueOf(retcode_);
      return result == null ? emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN.UNRECOGNIZED : result;
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
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (retcode_ != emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN.DAKKMFPGCFN_SUCC.getNumber()) {
        output.writeEnum(3, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (retcode_ != emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN.DAKKMFPGCFN_SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE other = (emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE) obj;

      if (getId()
          != other.getId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (retcode_ != other.retcode_) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + retcode_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE prototype) {
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
     * Name: MEMEFOMDNGE
     * CmdId: 101
     * </pre>
     *
     * Protobuf type {@code MEMEFOMDNGE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MEMEFOMDNGE)
        emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.internal_static_MEMEFOMDNGE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.internal_static_MEMEFOMDNGE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.class, emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.newBuilder()
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
        id_ = 0;

        name_ = "";

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.internal_static_MEMEFOMDNGE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE build() {
        emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE buildPartial() {
        emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE result = new emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE(this);
        result.id_ = id_;
        result.name_ = name_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE) {
          return mergeFrom((emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE other) {
        if (other == emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.retcode_ != 0) {
          setRetcodeValue(other.getRetcodeValue());
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
        emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int retcode_ = 0;
      /**
       * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
       * @return The enum numeric value on the wire for retcode.
       */
      @java.lang.Override public int getRetcodeValue() {
        return retcode_;
      }
      /**
       * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
       * @param value The enum numeric value on the wire for retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcodeValue(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN getRetcode() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN result = emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN.valueOf(retcode_);
        return result == null ? emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN.UNRECOGNIZED : result;
      }
      /**
       * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE.DAKKMFPGCFN value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        retcode_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MEMEFOMDNGE.DAKKMFPGCFN retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MEMEFOMDNGE)
    }

    // @@protoc_insertion_point(class_scope:MEMEFOMDNGE)
    private static final emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE();
    }

    public static emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MEMEFOMDNGE>
        PARSER = new com.google.protobuf.AbstractParser<MEMEFOMDNGE>() {
      @java.lang.Override
      public MEMEFOMDNGE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MEMEFOMDNGE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MEMEFOMDNGE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MEMEFOMDNGE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MEMEFOMDNGEOuterClass.MEMEFOMDNGE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MEMEFOMDNGE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MEMEFOMDNGE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MEMEFOMDNGE.proto\"\215\001\n\013MEMEFOMDNGE\022\n\n\002i" +
      "d\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\022)\n\007retcode\030\003 \001(\0162\030" +
      ".MEMEFOMDNGE.DAKKMFPGCFN\"9\n\013DAKKMFPGCFN\022" +
      "\024\n\020DAKKMFPGCFN_SUCC\020\000\022\024\n\020DAKKMFPGCFN_FAI" +
      "L\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MEMEFOMDNGE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MEMEFOMDNGE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MEMEFOMDNGE_descriptor,
        new java.lang.String[] { "Id", "Name", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}