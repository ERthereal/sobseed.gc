// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DKPDHJGFLKM.proto

package emu.grasscutter.net.proto;

public final class DKPDHJGFLKMOuterClass {
  private DKPDHJGFLKMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DKPDHJGFLKMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DKPDHJGFLKM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
     * @return Whether the eNNAPNPNDNB field is set.
     */
    boolean hasENNAPNPNDNB();
    /**
     * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
     * @return The eNNAPNPNDNB.
     */
    emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot getENNAPNPNDNB();
    /**
     * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
     */
    emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder getENNAPNPNDNBOrBuilder();
  }
  /**
   * <pre>
   * Name: DKPDHJGFLKM
   * </pre>
   *
   * Protobuf type {@code DKPDHJGFLKM}
   */
  public static final class DKPDHJGFLKM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DKPDHJGFLKM)
      DKPDHJGFLKMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DKPDHJGFLKM.newBuilder() to construct.
    private DKPDHJGFLKM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DKPDHJGFLKM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DKPDHJGFLKM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DKPDHJGFLKM(
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
            case 34: {
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder subBuilder = null;
              if (eNNAPNPNDNB_ != null) {
                subBuilder = eNNAPNPNDNB_.toBuilder();
              }
              eNNAPNPNDNB_ = input.readMessage(emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(eNNAPNPNDNB_);
                eNNAPNPNDNB_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.internal_static_DKPDHJGFLKM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.internal_static_DKPDHJGFLKM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM.class, emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM.Builder.class);
    }

    public static final int ENNAPNPNDNB_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot eNNAPNPNDNB_;
    /**
     * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
     * @return Whether the eNNAPNPNDNB field is set.
     */
    @java.lang.Override
    public boolean hasENNAPNPNDNB() {
      return eNNAPNPNDNB_ != null;
    }
    /**
     * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
     * @return The eNNAPNPNDNB.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot getENNAPNPNDNB() {
      return eNNAPNPNDNB_ == null ? emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.getDefaultInstance() : eNNAPNPNDNB_;
    }
    /**
     * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder getENNAPNPNDNBOrBuilder() {
      return getENNAPNPNDNB();
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
      if (eNNAPNPNDNB_ != null) {
        output.writeMessage(4, getENNAPNPNDNB());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eNNAPNPNDNB_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getENNAPNPNDNB());
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
      if (!(obj instanceof emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM other = (emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM) obj;

      if (hasENNAPNPNDNB() != other.hasENNAPNPNDNB()) return false;
      if (hasENNAPNPNDNB()) {
        if (!getENNAPNPNDNB()
            .equals(other.getENNAPNPNDNB())) return false;
      }
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
      if (hasENNAPNPNDNB()) {
        hash = (37 * hash) + ENNAPNPNDNB_FIELD_NUMBER;
        hash = (53 * hash) + getENNAPNPNDNB().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM prototype) {
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
     * Name: DKPDHJGFLKM
     * </pre>
     *
     * Protobuf type {@code DKPDHJGFLKM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DKPDHJGFLKM)
        emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.internal_static_DKPDHJGFLKM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.internal_static_DKPDHJGFLKM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM.class, emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM.newBuilder()
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
        if (eNNAPNPNDNBBuilder_ == null) {
          eNNAPNPNDNB_ = null;
        } else {
          eNNAPNPNDNB_ = null;
          eNNAPNPNDNBBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.internal_static_DKPDHJGFLKM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM build() {
        emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM buildPartial() {
        emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM result = new emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM(this);
        if (eNNAPNPNDNBBuilder_ == null) {
          result.eNNAPNPNDNB_ = eNNAPNPNDNB_;
        } else {
          result.eNNAPNPNDNB_ = eNNAPNPNDNBBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM) {
          return mergeFrom((emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM other) {
        if (other == emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM.getDefaultInstance()) return this;
        if (other.hasENNAPNPNDNB()) {
          mergeENNAPNPNDNB(other.getENNAPNPNDNB());
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
        emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot eNNAPNPNDNB_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder> eNNAPNPNDNBBuilder_;
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       * @return Whether the eNNAPNPNDNB field is set.
       */
      public boolean hasENNAPNPNDNB() {
        return eNNAPNPNDNBBuilder_ != null || eNNAPNPNDNB_ != null;
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       * @return The eNNAPNPNDNB.
       */
      public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot getENNAPNPNDNB() {
        if (eNNAPNPNDNBBuilder_ == null) {
          return eNNAPNPNDNB_ == null ? emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.getDefaultInstance() : eNNAPNPNDNB_;
        } else {
          return eNNAPNPNDNBBuilder_.getMessage();
        }
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       */
      public Builder setENNAPNPNDNB(emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot value) {
        if (eNNAPNPNDNBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          eNNAPNPNDNB_ = value;
          onChanged();
        } else {
          eNNAPNPNDNBBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       */
      public Builder setENNAPNPNDNB(
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder builderForValue) {
        if (eNNAPNPNDNBBuilder_ == null) {
          eNNAPNPNDNB_ = builderForValue.build();
          onChanged();
        } else {
          eNNAPNPNDNBBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       */
      public Builder mergeENNAPNPNDNB(emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot value) {
        if (eNNAPNPNDNBBuilder_ == null) {
          if (eNNAPNPNDNB_ != null) {
            eNNAPNPNDNB_ =
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.newBuilder(eNNAPNPNDNB_).mergeFrom(value).buildPartial();
          } else {
            eNNAPNPNDNB_ = value;
          }
          onChanged();
        } else {
          eNNAPNPNDNBBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       */
      public Builder clearENNAPNPNDNB() {
        if (eNNAPNPNDNBBuilder_ == null) {
          eNNAPNPNDNB_ = null;
          onChanged();
        } else {
          eNNAPNPNDNB_ = null;
          eNNAPNPNDNBBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       */
      public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder getENNAPNPNDNBBuilder() {
        
        onChanged();
        return getENNAPNPNDNBFieldBuilder().getBuilder();
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       */
      public emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder getENNAPNPNDNBOrBuilder() {
        if (eNNAPNPNDNBBuilder_ != null) {
          return eNNAPNPNDNBBuilder_.getMessageOrBuilder();
        } else {
          return eNNAPNPNDNB_ == null ?
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.getDefaultInstance() : eNNAPNPNDNB_;
        }
      }
      /**
       * <code>.BreakoutSnapShot ENNAPNPNDNB = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder> 
          getENNAPNPNDNBFieldBuilder() {
        if (eNNAPNPNDNBBuilder_ == null) {
          eNNAPNPNDNBBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShot.Builder, emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.BreakoutSnapShotOrBuilder>(
                  getENNAPNPNDNB(),
                  getParentForChildren(),
                  isClean());
          eNNAPNPNDNB_ = null;
        }
        return eNNAPNPNDNBBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DKPDHJGFLKM)
    }

    // @@protoc_insertion_point(class_scope:DKPDHJGFLKM)
    private static final emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM();
    }

    public static emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DKPDHJGFLKM>
        PARSER = new com.google.protobuf.AbstractParser<DKPDHJGFLKM>() {
      @java.lang.Override
      public DKPDHJGFLKM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DKPDHJGFLKM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DKPDHJGFLKM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DKPDHJGFLKM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DKPDHJGFLKMOuterClass.DKPDHJGFLKM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DKPDHJGFLKM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DKPDHJGFLKM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DKPDHJGFLKM.proto\032\026BreakoutSnapShot.pr" +
      "oto\"5\n\013DKPDHJGFLKM\022&\n\013ENNAPNPNDNB\030\004 \001(\0132" +
      "\021.BreakoutSnapShotB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.getDescriptor(),
        });
    internal_static_DKPDHJGFLKM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DKPDHJGFLKM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DKPDHJGFLKM_descriptor,
        new java.lang.String[] { "ENNAPNPNDNB", });
    emu.grasscutter.net.proto.BreakoutSnapShotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}