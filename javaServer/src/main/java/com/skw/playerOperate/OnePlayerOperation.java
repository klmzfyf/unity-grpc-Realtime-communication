// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOperate.proto

package com.skw.playerOperate;

/**
 * <pre>
 *客户端x发送过来的操作
 * </pre>
 *
 * Protobuf type {@code com.skw.playerOperate.OnePlayerOperation}
 */
public  final class OnePlayerOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.skw.playerOperate.OnePlayerOperation)
    OnePlayerOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnePlayerOperation.newBuilder() to construct.
  private OnePlayerOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnePlayerOperation() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OnePlayerOperation(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            com.skw.playerOperate.Position.Builder subBuilder = null;
            if (position_ != null) {
              subBuilder = position_.toBuilder();
            }
            position_ = input.readMessage(com.skw.playerOperate.Position.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(position_);
              position_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.skw.playerOperate.MoveParameter.Builder subBuilder = null;
            if (parameter_ != null) {
              subBuilder = parameter_.toBuilder();
            }
            parameter_ = input.readMessage(com.skw.playerOperate.MoveParameter.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(parameter_);
              parameter_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            crouch_ = input.readBool();
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
    return com.skw.playerOperate.PlayerOperateOuterClass.internal_static_com_skw_playerOperate_OnePlayerOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.skw.playerOperate.PlayerOperateOuterClass.internal_static_com_skw_playerOperate_OnePlayerOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.skw.playerOperate.OnePlayerOperation.class, com.skw.playerOperate.OnePlayerOperation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   *指明是哪个用户发送过来的操作
   * </pre>
   *
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int POSITION_FIELD_NUMBER = 2;
  private com.skw.playerOperate.Position position_;
  /**
   * <pre>
   *指明该用户发送该消息时所处的位置
   * </pre>
   *
   * <code>.com.skw.playerOperate.Position Position = 2;</code>
   */
  public boolean hasPosition() {
    return position_ != null;
  }
  /**
   * <pre>
   *指明该用户发送该消息时所处的位置
   * </pre>
   *
   * <code>.com.skw.playerOperate.Position Position = 2;</code>
   */
  public com.skw.playerOperate.Position getPosition() {
    return position_ == null ? com.skw.playerOperate.Position.getDefaultInstance() : position_;
  }
  /**
   * <pre>
   *指明该用户发送该消息时所处的位置
   * </pre>
   *
   * <code>.com.skw.playerOperate.Position Position = 2;</code>
   */
  public com.skw.playerOperate.PositionOrBuilder getPositionOrBuilder() {
    return getPosition();
  }

  public static final int PARAMETER_FIELD_NUMBER = 3;
  private com.skw.playerOperate.MoveParameter parameter_;
  /**
   * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
   */
  public boolean hasParameter() {
    return parameter_ != null;
  }
  /**
   * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
   */
  public com.skw.playerOperate.MoveParameter getParameter() {
    return parameter_ == null ? com.skw.playerOperate.MoveParameter.getDefaultInstance() : parameter_;
  }
  /**
   * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
   */
  public com.skw.playerOperate.MoveParameterOrBuilder getParameterOrBuilder() {
    return getParameter();
  }

  public static final int CROUCH_FIELD_NUMBER = 4;
  private boolean crouch_;
  /**
   * <code>bool crouch = 4;</code>
   */
  public boolean getCrouch() {
    return crouch_;
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
      output.writeInt32(1, id_);
    }
    if (position_ != null) {
      output.writeMessage(2, getPosition());
    }
    if (parameter_ != null) {
      output.writeMessage(3, getParameter());
    }
    if (crouch_ != false) {
      output.writeBool(4, crouch_);
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
        .computeInt32Size(1, id_);
    }
    if (position_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPosition());
    }
    if (parameter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getParameter());
    }
    if (crouch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, crouch_);
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
    if (!(obj instanceof com.skw.playerOperate.OnePlayerOperation)) {
      return super.equals(obj);
    }
    com.skw.playerOperate.OnePlayerOperation other = (com.skw.playerOperate.OnePlayerOperation) obj;

    if (getId()
        != other.getId()) return false;
    if (hasPosition() != other.hasPosition()) return false;
    if (hasPosition()) {
      if (!getPosition()
          .equals(other.getPosition())) return false;
    }
    if (hasParameter() != other.hasParameter()) return false;
    if (hasParameter()) {
      if (!getParameter()
          .equals(other.getParameter())) return false;
    }
    if (getCrouch()
        != other.getCrouch()) return false;
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
    if (hasPosition()) {
      hash = (37 * hash) + POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getPosition().hashCode();
    }
    if (hasParameter()) {
      hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
      hash = (53 * hash) + getParameter().hashCode();
    }
    hash = (37 * hash) + CROUCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCrouch());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.skw.playerOperate.OnePlayerOperation parseFrom(
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
  public static Builder newBuilder(com.skw.playerOperate.OnePlayerOperation prototype) {
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
   *客户端x发送过来的操作
   * </pre>
   *
   * Protobuf type {@code com.skw.playerOperate.OnePlayerOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.skw.playerOperate.OnePlayerOperation)
      com.skw.playerOperate.OnePlayerOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.skw.playerOperate.PlayerOperateOuterClass.internal_static_com_skw_playerOperate_OnePlayerOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.skw.playerOperate.PlayerOperateOuterClass.internal_static_com_skw_playerOperate_OnePlayerOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.skw.playerOperate.OnePlayerOperation.class, com.skw.playerOperate.OnePlayerOperation.Builder.class);
    }

    // Construct using com.skw.playerOperate.OnePlayerOperation.newBuilder()
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

      if (positionBuilder_ == null) {
        position_ = null;
      } else {
        position_ = null;
        positionBuilder_ = null;
      }
      if (parameterBuilder_ == null) {
        parameter_ = null;
      } else {
        parameter_ = null;
        parameterBuilder_ = null;
      }
      crouch_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.skw.playerOperate.PlayerOperateOuterClass.internal_static_com_skw_playerOperate_OnePlayerOperation_descriptor;
    }

    @java.lang.Override
    public com.skw.playerOperate.OnePlayerOperation getDefaultInstanceForType() {
      return com.skw.playerOperate.OnePlayerOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.skw.playerOperate.OnePlayerOperation build() {
      com.skw.playerOperate.OnePlayerOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.skw.playerOperate.OnePlayerOperation buildPartial() {
      com.skw.playerOperate.OnePlayerOperation result = new com.skw.playerOperate.OnePlayerOperation(this);
      result.id_ = id_;
      if (positionBuilder_ == null) {
        result.position_ = position_;
      } else {
        result.position_ = positionBuilder_.build();
      }
      if (parameterBuilder_ == null) {
        result.parameter_ = parameter_;
      } else {
        result.parameter_ = parameterBuilder_.build();
      }
      result.crouch_ = crouch_;
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
      if (other instanceof com.skw.playerOperate.OnePlayerOperation) {
        return mergeFrom((com.skw.playerOperate.OnePlayerOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.skw.playerOperate.OnePlayerOperation other) {
      if (other == com.skw.playerOperate.OnePlayerOperation.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.hasPosition()) {
        mergePosition(other.getPosition());
      }
      if (other.hasParameter()) {
        mergeParameter(other.getParameter());
      }
      if (other.getCrouch() != false) {
        setCrouch(other.getCrouch());
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
      com.skw.playerOperate.OnePlayerOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.skw.playerOperate.OnePlayerOperation) e.getUnfinishedMessage();
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
     * <pre>
     *指明是哪个用户发送过来的操作
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     *指明是哪个用户发送过来的操作
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *指明是哪个用户发送过来的操作
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private com.skw.playerOperate.Position position_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.skw.playerOperate.Position, com.skw.playerOperate.Position.Builder, com.skw.playerOperate.PositionOrBuilder> positionBuilder_;
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public boolean hasPosition() {
      return positionBuilder_ != null || position_ != null;
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public com.skw.playerOperate.Position getPosition() {
      if (positionBuilder_ == null) {
        return position_ == null ? com.skw.playerOperate.Position.getDefaultInstance() : position_;
      } else {
        return positionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public Builder setPosition(com.skw.playerOperate.Position value) {
      if (positionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        position_ = value;
        onChanged();
      } else {
        positionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public Builder setPosition(
        com.skw.playerOperate.Position.Builder builderForValue) {
      if (positionBuilder_ == null) {
        position_ = builderForValue.build();
        onChanged();
      } else {
        positionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public Builder mergePosition(com.skw.playerOperate.Position value) {
      if (positionBuilder_ == null) {
        if (position_ != null) {
          position_ =
            com.skw.playerOperate.Position.newBuilder(position_).mergeFrom(value).buildPartial();
        } else {
          position_ = value;
        }
        onChanged();
      } else {
        positionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public Builder clearPosition() {
      if (positionBuilder_ == null) {
        position_ = null;
        onChanged();
      } else {
        position_ = null;
        positionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public com.skw.playerOperate.Position.Builder getPositionBuilder() {
      
      onChanged();
      return getPositionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    public com.skw.playerOperate.PositionOrBuilder getPositionOrBuilder() {
      if (positionBuilder_ != null) {
        return positionBuilder_.getMessageOrBuilder();
      } else {
        return position_ == null ?
            com.skw.playerOperate.Position.getDefaultInstance() : position_;
      }
    }
    /**
     * <pre>
     *指明该用户发送该消息时所处的位置
     * </pre>
     *
     * <code>.com.skw.playerOperate.Position Position = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.skw.playerOperate.Position, com.skw.playerOperate.Position.Builder, com.skw.playerOperate.PositionOrBuilder> 
        getPositionFieldBuilder() {
      if (positionBuilder_ == null) {
        positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.skw.playerOperate.Position, com.skw.playerOperate.Position.Builder, com.skw.playerOperate.PositionOrBuilder>(
                getPosition(),
                getParentForChildren(),
                isClean());
        position_ = null;
      }
      return positionBuilder_;
    }

    private com.skw.playerOperate.MoveParameter parameter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.skw.playerOperate.MoveParameter, com.skw.playerOperate.MoveParameter.Builder, com.skw.playerOperate.MoveParameterOrBuilder> parameterBuilder_;
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public boolean hasParameter() {
      return parameterBuilder_ != null || parameter_ != null;
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public com.skw.playerOperate.MoveParameter getParameter() {
      if (parameterBuilder_ == null) {
        return parameter_ == null ? com.skw.playerOperate.MoveParameter.getDefaultInstance() : parameter_;
      } else {
        return parameterBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public Builder setParameter(com.skw.playerOperate.MoveParameter value) {
      if (parameterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameter_ = value;
        onChanged();
      } else {
        parameterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public Builder setParameter(
        com.skw.playerOperate.MoveParameter.Builder builderForValue) {
      if (parameterBuilder_ == null) {
        parameter_ = builderForValue.build();
        onChanged();
      } else {
        parameterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public Builder mergeParameter(com.skw.playerOperate.MoveParameter value) {
      if (parameterBuilder_ == null) {
        if (parameter_ != null) {
          parameter_ =
            com.skw.playerOperate.MoveParameter.newBuilder(parameter_).mergeFrom(value).buildPartial();
        } else {
          parameter_ = value;
        }
        onChanged();
      } else {
        parameterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public Builder clearParameter() {
      if (parameterBuilder_ == null) {
        parameter_ = null;
        onChanged();
      } else {
        parameter_ = null;
        parameterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public com.skw.playerOperate.MoveParameter.Builder getParameterBuilder() {
      
      onChanged();
      return getParameterFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    public com.skw.playerOperate.MoveParameterOrBuilder getParameterOrBuilder() {
      if (parameterBuilder_ != null) {
        return parameterBuilder_.getMessageOrBuilder();
      } else {
        return parameter_ == null ?
            com.skw.playerOperate.MoveParameter.getDefaultInstance() : parameter_;
      }
    }
    /**
     * <code>.com.skw.playerOperate.MoveParameter parameter = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.skw.playerOperate.MoveParameter, com.skw.playerOperate.MoveParameter.Builder, com.skw.playerOperate.MoveParameterOrBuilder> 
        getParameterFieldBuilder() {
      if (parameterBuilder_ == null) {
        parameterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.skw.playerOperate.MoveParameter, com.skw.playerOperate.MoveParameter.Builder, com.skw.playerOperate.MoveParameterOrBuilder>(
                getParameter(),
                getParentForChildren(),
                isClean());
        parameter_ = null;
      }
      return parameterBuilder_;
    }

    private boolean crouch_ ;
    /**
     * <code>bool crouch = 4;</code>
     */
    public boolean getCrouch() {
      return crouch_;
    }
    /**
     * <code>bool crouch = 4;</code>
     */
    public Builder setCrouch(boolean value) {
      
      crouch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool crouch = 4;</code>
     */
    public Builder clearCrouch() {
      
      crouch_ = false;
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


    // @@protoc_insertion_point(builder_scope:com.skw.playerOperate.OnePlayerOperation)
  }

  // @@protoc_insertion_point(class_scope:com.skw.playerOperate.OnePlayerOperation)
  private static final com.skw.playerOperate.OnePlayerOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.skw.playerOperate.OnePlayerOperation();
  }

  public static com.skw.playerOperate.OnePlayerOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnePlayerOperation>
      PARSER = new com.google.protobuf.AbstractParser<OnePlayerOperation>() {
    @java.lang.Override
    public OnePlayerOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OnePlayerOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OnePlayerOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnePlayerOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.skw.playerOperate.OnePlayerOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

