// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Audio.proto

package com.skw.protoBean;

public final class AudioOuterClass {
  private AudioOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skw_protoBean_SendBean_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skw_protoBean_SendBean_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skw_protoBean_Audio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skw_protoBean_Audio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skw_protoBean_Ok_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skw_protoBean_Ok_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skw_protoBean_AskReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skw_protoBean_AskReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013Audio.proto\022\021com.skw.protoBean\"W\n\010Send" +
      "Bean\022\022\n\nnearPlayer\030\001 \003(\005\022\016\n\006player\030\002 \001(\005" +
      "\022\'\n\005audio\030\003 \001(\0132\030.com.skw.protoBean.Audi" +
      "o\"\032\n\005Audio\022\021\n\ta_message\030\001 \003(\002\"\020\n\002Ok\022\n\n\002o" +
      "k\030\001 \001(\t\"\025\n\006AskReq\022\013\n\003req\030\001 \001(\0052\233\001\n\017IAudi" +
      "oTransform\022B\n\010GetAudio\022\033.com.skw.protoBe" +
      "an.SendBean\032\025.com.skw.protoBean.Ok\"\000(\001\022D" +
      "\n\tSendAudio\022\031.com.skw.protoBean.AskReq\032\030" +
      ".com.skw.protoBean.Audio\"\0000\001B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_skw_protoBean_SendBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_skw_protoBean_SendBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skw_protoBean_SendBean_descriptor,
        new String[] { "NearPlayer", "Player", "Audio", });
    internal_static_com_skw_protoBean_Audio_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_skw_protoBean_Audio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skw_protoBean_Audio_descriptor,
        new String[] { "AMessage", });
    internal_static_com_skw_protoBean_Ok_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_skw_protoBean_Ok_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skw_protoBean_Ok_descriptor,
        new String[] { "Ok", });
    internal_static_com_skw_protoBean_AskReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_skw_protoBean_AskReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skw_protoBean_AskReq_descriptor,
        new String[] { "Req", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
