// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Audio.proto

package com.skw.protoBean;

/**
 * Protobuf type {@code com.skw.protoBean.SendBean}
 */
public  final class SendBean extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skw.protoBean.SendBean)
    SendBeanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendBean.newBuilder() to construct.
  private SendBean(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendBean() {
    nearPlayer_ = emptyIntList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendBean(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nearPlayer_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            nearPlayer_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              nearPlayer_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              nearPlayer_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {

            player_ = input.readInt32();
            break;
          }
          case 26: {
            Audio.Builder subBuilder = null;
            if (audio_ != null) {
              subBuilder = audio_.toBuilder();
            }
            audio_ = input.readMessage(Audio.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audio_);
              audio_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nearPlayer_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return AudioOuterClass.internal_static_com_skw_protoBean_SendBean_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AudioOuterClass.internal_static_com_skw_protoBean_SendBean_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SendBean.class, Builder.class);
  }

  private int bitField0_;
  public static final int NEARPLAYER_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList nearPlayer_;
  /**
   * <code>repeated int32 nearPlayer = 1;</code>
   */
  public java.util.List<Integer>
      getNearPlayerList() {
    return nearPlayer_;
  }
  /**
   * <code>repeated int32 nearPlayer = 1;</code>
   */
  public int getNearPlayerCount() {
    return nearPlayer_.size();
  }
  /**
   * <code>repeated int32 nearPlayer = 1;</code>
   */
  public int getNearPlayer(int index) {
    return nearPlayer_.getInt(index);
  }
  private int nearPlayerMemoizedSerializedSize = -1;

  public static final int PLAYER_FIELD_NUMBER = 2;
  private int player_;
  /**
   * <code>int32 player = 2;</code>
   */
  public int getPlayer() {
    return player_;
  }

  public static final int AUDIO_FIELD_NUMBER = 3;
  private Audio audio_;
  /**
   * <code>.com.skw.protoBean.Audio audio = 3;</code>
   */
  public boolean hasAudio() {
    return audio_ != null;
  }
  /**
   * <code>.com.skw.protoBean.Audio audio = 3;</code>
   */
  public Audio getAudio() {
    return audio_ == null ? Audio.getDefaultInstance() : audio_;
  }
  /**
   * <code>.com.skw.protoBean.Audio audio = 3;</code>
   */
  public AudioOrBuilder getAudioOrBuilder() {
    return getAudio();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getNearPlayerList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(nearPlayerMemoizedSerializedSize);
    }
    for (int i = 0; i < nearPlayer_.size(); i++) {
      output.writeInt32NoTag(nearPlayer_.getInt(i));
    }
    if (player_ != 0) {
      output.writeInt32(2, player_);
    }
    if (audio_ != null) {
      output.writeMessage(3, getAudio());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < nearPlayer_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(nearPlayer_.getInt(i));
      }
      size += dataSize;
      if (!getNearPlayerList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      nearPlayerMemoizedSerializedSize = dataSize;
    }
    if (player_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, player_);
    }
    if (audio_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAudio());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SendBean)) {
      return super.equals(obj);
    }
    SendBean other = (SendBean) obj;

    if (!getNearPlayerList()
        .equals(other.getNearPlayerList())) return false;
    if (getPlayer()
        != other.getPlayer()) return false;
    if (hasAudio() != other.hasAudio()) return false;
    if (hasAudio()) {
      if (!getAudio()
          .equals(other.getAudio())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getNearPlayerCount() > 0) {
      hash = (37 * hash) + NEARPLAYER_FIELD_NUMBER;
      hash = (53 * hash) + getNearPlayerList().hashCode();
    }
    hash = (37 * hash) + PLAYER_FIELD_NUMBER;
    hash = (53 * hash) + getPlayer();
    if (hasAudio()) {
      hash = (37 * hash) + AUDIO_FIELD_NUMBER;
      hash = (53 * hash) + getAudio().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SendBean parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendBean parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendBean parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendBean parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendBean parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendBean parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendBean parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SendBean parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SendBean parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SendBean parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SendBean parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SendBean parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SendBean prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.skw.protoBean.SendBean}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skw.protoBean.SendBean)
      SendBeanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AudioOuterClass.internal_static_com_skw_protoBean_SendBean_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AudioOuterClass.internal_static_com_skw_protoBean_SendBean_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SendBean.class, Builder.class);
    }

    // Construct using com.skw.protoBean.SendBean.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      nearPlayer_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      player_ = 0;

      if (audioBuilder_ == null) {
        audio_ = null;
      } else {
        audio_ = null;
        audioBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AudioOuterClass.internal_static_com_skw_protoBean_SendBean_descriptor;
    }

    @Override
    public SendBean getDefaultInstanceForType() {
      return SendBean.getDefaultInstance();
    }

    @Override
    public SendBean build() {
      SendBean result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SendBean buildPartial() {
      SendBean result = new SendBean(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        nearPlayer_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.nearPlayer_ = nearPlayer_;
      result.player_ = player_;
      if (audioBuilder_ == null) {
        result.audio_ = audio_;
      } else {
        result.audio_ = audioBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SendBean) {
        return mergeFrom((SendBean)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SendBean other) {
      if (other == SendBean.getDefaultInstance()) return this;
      if (!other.nearPlayer_.isEmpty()) {
        if (nearPlayer_.isEmpty()) {
          nearPlayer_ = other.nearPlayer_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNearPlayerIsMutable();
          nearPlayer_.addAll(other.nearPlayer_);
        }
        onChanged();
      }
      if (other.getPlayer() != 0) {
        setPlayer(other.getPlayer());
      }
      if (other.hasAudio()) {
        mergeAudio(other.getAudio());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      SendBean parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SendBean) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList nearPlayer_ = emptyIntList();
    private void ensureNearPlayerIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nearPlayer_ = mutableCopy(nearPlayer_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 nearPlayer = 1;</code>
     */
    public java.util.List<Integer>
        getNearPlayerList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(nearPlayer_) : nearPlayer_;
    }
    /**
     * <code>repeated int32 nearPlayer = 1;</code>
     */
    public int getNearPlayerCount() {
      return nearPlayer_.size();
    }
    /**
     * <code>repeated int32 nearPlayer = 1;</code>
     */
    public int getNearPlayer(int index) {
      return nearPlayer_.getInt(index);
    }
    /**
     * <code>repeated int32 nearPlayer = 1;</code>
     */
    public Builder setNearPlayer(
        int index, int value) {
      ensureNearPlayerIsMutable();
      nearPlayer_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nearPlayer = 1;</code>
     */
    public Builder addNearPlayer(int value) {
      ensureNearPlayerIsMutable();
      nearPlayer_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nearPlayer = 1;</code>
     */
    public Builder addAllNearPlayer(
        Iterable<? extends Integer> values) {
      ensureNearPlayerIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nearPlayer_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 nearPlayer = 1;</code>
     */
    public Builder clearNearPlayer() {
      nearPlayer_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int player_ ;
    /**
     * <code>int32 player = 2;</code>
     */
    public int getPlayer() {
      return player_;
    }
    /**
     * <code>int32 player = 2;</code>
     */
    public Builder setPlayer(int value) {
      
      player_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 player = 2;</code>
     */
    public Builder clearPlayer() {
      
      player_ = 0;
      onChanged();
      return this;
    }

    private Audio audio_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Audio, Audio.Builder, AudioOrBuilder> audioBuilder_;
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public boolean hasAudio() {
      return audioBuilder_ != null || audio_ != null;
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public Audio getAudio() {
      if (audioBuilder_ == null) {
        return audio_ == null ? Audio.getDefaultInstance() : audio_;
      } else {
        return audioBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public Builder setAudio(Audio value) {
      if (audioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audio_ = value;
        onChanged();
      } else {
        audioBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public Builder setAudio(
        Audio.Builder builderForValue) {
      if (audioBuilder_ == null) {
        audio_ = builderForValue.build();
        onChanged();
      } else {
        audioBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public Builder mergeAudio(Audio value) {
      if (audioBuilder_ == null) {
        if (audio_ != null) {
          audio_ =
            Audio.newBuilder(audio_).mergeFrom(value).buildPartial();
        } else {
          audio_ = value;
        }
        onChanged();
      } else {
        audioBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public Builder clearAudio() {
      if (audioBuilder_ == null) {
        audio_ = null;
        onChanged();
      } else {
        audio_ = null;
        audioBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public Audio.Builder getAudioBuilder() {
      
      onChanged();
      return getAudioFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    public AudioOrBuilder getAudioOrBuilder() {
      if (audioBuilder_ != null) {
        return audioBuilder_.getMessageOrBuilder();
      } else {
        return audio_ == null ?
            Audio.getDefaultInstance() : audio_;
      }
    }
    /**
     * <code>.com.skw.protoBean.Audio audio = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Audio, Audio.Builder, AudioOrBuilder>
        getAudioFieldBuilder() {
      if (audioBuilder_ == null) {
        audioBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Audio, Audio.Builder, AudioOrBuilder>(
                getAudio(),
                getParentForChildren(),
                isClean());
        audio_ = null;
      }
      return audioBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.skw.protoBean.SendBean)
  }

  // @@protoc_insertion_point(class_scope:com.skw.protoBean.SendBean)
  private static final SendBean DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SendBean();
  }

  public static SendBean getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendBean>
      PARSER = new com.google.protobuf.AbstractParser<SendBean>() {
    @Override
    public SendBean parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendBean(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendBean> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SendBean> getParserForType() {
    return PARSER;
  }

  @Override
  public SendBean getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
