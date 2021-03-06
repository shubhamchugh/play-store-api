// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package com.google.protobuf;

/**
 * <pre>
 * `Value` represents a dynamically typed value which can be either
 * null, a number, a string, a boolean, a recursive struct value, or a
 * list of values. A producer of value is expected to set one of that
 * variants, absence of any variant indicates an error.
 * The JSON representation for `Value` is JSON value.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Value}
 */
public  final class Value extends
    com.google.protobuf.GeneratedMessageLite<
        Value, Value.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Value)
    ValueOrBuilder {
  private Value() {
  }
  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase
      implements com.google.protobuf.Internal.EnumLite {
    NULL_VALUE(1),
    NUMBER_VALUE(2),
    STRING_VALUE(3),
    BOOL_VALUE(4),
    STRUCT_VALUE(5),
    LIST_VALUE(6),
    KIND_NOT_SET(0);
    private final int value;
    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 1: return NULL_VALUE;
        case 2: return NUMBER_VALUE;
        case 3: return STRING_VALUE;
        case 4: return BOOL_VALUE;
        case 5: return STRUCT_VALUE;
        case 6: return LIST_VALUE;
        case 0: return KIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KindCase
  getKindCase() {
    return KindCase.forNumber(
        kindCase_);
  }

  private void clearKind() {
    kindCase_ = 0;
    kind_ = null;
  }

  public static final int NULL_VALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   */
  public int getNullValueValue() {
    if (kindCase_ == 1) {
      return (java.lang.Integer) kind_;
    }
    return 0;
  }
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   */
  public com.google.protobuf.NullValue getNullValue() {
    if (kindCase_ == 1) {
      com.google.protobuf.NullValue result = com.google.protobuf.NullValue.forNumber((java.lang.Integer) kind_);
      return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
    }
    return com.google.protobuf.NullValue.NULL_VALUE;
  }
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   */
  private void setNullValueValue(int value) {
    kindCase_ = 1;
    kind_ = value;
  }
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   */
  private void setNullValue(com.google.protobuf.NullValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    kindCase_ = 1;
    kind_ = value.getNumber();
  }
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   */
  private void clearNullValue() {
    if (kindCase_ == 1) {
      kindCase_ = 0;
      kind_ = null;
    }
  }

  public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>optional double number_value = 2;</code>
   */
  public double getNumberValue() {
    if (kindCase_ == 2) {
      return (java.lang.Double) kind_;
    }
    return 0D;
  }
  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>optional double number_value = 2;</code>
   */
  private void setNumberValue(double value) {
    kindCase_ = 2;
    kind_ = value;
  }
  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>optional double number_value = 2;</code>
   */
  private void clearNumberValue() {
    if (kindCase_ == 2) {
      kindCase_ = 0;
      kind_ = null;
    }
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>optional string string_value = 3;</code>
   */
  public java.lang.String getStringValue() {
    java.lang.String ref = "";
    if (kindCase_ == 3) {
      ref = (java.lang.String) kind_;
    }
    return ref;
  }
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>optional string string_value = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.String ref = "";
    if (kindCase_ == 3) {
      ref = (java.lang.String) kind_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>optional string string_value = 3;</code>
   */
  private void setStringValue(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  kindCase_ = 3;
    kind_ = value;
  }
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>optional string string_value = 3;</code>
   */
  private void clearStringValue() {
    if (kindCase_ == 3) {
      kindCase_ = 0;
      kind_ = null;
    }
  }
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>optional string string_value = 3;</code>
   */
  private void setStringValueBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    kindCase_ = 3;
    kind_ = value.toStringUtf8();
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>optional bool bool_value = 4;</code>
   */
  public boolean getBoolValue() {
    if (kindCase_ == 4) {
      return (java.lang.Boolean) kind_;
    }
    return false;
  }
  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>optional bool bool_value = 4;</code>
   */
  private void setBoolValue(boolean value) {
    kindCase_ = 4;
    kind_ = value;
  }
  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>optional bool bool_value = 4;</code>
   */
  private void clearBoolValue() {
    if (kindCase_ == 4) {
      kindCase_ = 0;
      kind_ = null;
    }
  }

  public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   */
  public com.google.protobuf.Struct getStructValue() {
    if (kindCase_ == 5) {
       return (com.google.protobuf.Struct) kind_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   */
  private void setStructValue(com.google.protobuf.Struct value) {
    if (value == null) {
      throw new NullPointerException();
    }
    kind_ = value;
    kindCase_ = 5;
  }
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   */
  private void setStructValue(
      com.google.protobuf.Struct.Builder builderForValue) {
    kind_ = builderForValue.build();
    kindCase_ = 5;
  }
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   */
  private void mergeStructValue(com.google.protobuf.Struct value) {
    if (kindCase_ == 5 &&
        kind_ != com.google.protobuf.Struct.getDefaultInstance()) {
      kind_ = com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) kind_)
          .mergeFrom(value).buildPartial();
    } else {
      kind_ = value;
    }
    kindCase_ = 5;
  }
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   */
  private void clearStructValue() {
    if (kindCase_ == 5) {
      kindCase_ = 0;
      kind_ = null;
    }
  }

  public static final int LIST_VALUE_FIELD_NUMBER = 6;
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   */
  public com.google.protobuf.ListValue getListValue() {
    if (kindCase_ == 6) {
       return (com.google.protobuf.ListValue) kind_;
    }
    return com.google.protobuf.ListValue.getDefaultInstance();
  }
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   */
  private void setListValue(com.google.protobuf.ListValue value) {
    if (value == null) {
      throw new NullPointerException();
    }
    kind_ = value;
    kindCase_ = 6;
  }
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   */
  private void setListValue(
      com.google.protobuf.ListValue.Builder builderForValue) {
    kind_ = builderForValue.build();
    kindCase_ = 6;
  }
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   */
  private void mergeListValue(com.google.protobuf.ListValue value) {
    if (kindCase_ == 6 &&
        kind_ != com.google.protobuf.ListValue.getDefaultInstance()) {
      kind_ = com.google.protobuf.ListValue.newBuilder((com.google.protobuf.ListValue) kind_)
          .mergeFrom(value).buildPartial();
    } else {
      kind_ = value;
    }
    kindCase_ = 6;
  }
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   */
  private void clearListValue() {
    if (kindCase_ == 6) {
      kindCase_ = 0;
      kind_ = null;
    }
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (kindCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) kind_));
    }
    if (kindCase_ == 2) {
      output.writeDouble(
          2, (double)((java.lang.Double) kind_));
    }
    if (kindCase_ == 3) {
      output.writeString(3, getStringValue());
    }
    if (kindCase_ == 4) {
      output.writeBool(
          4, (boolean)((java.lang.Boolean) kind_));
    }
    if (kindCase_ == 5) {
      output.writeMessage(5, (com.google.protobuf.Struct) kind_);
    }
    if (kindCase_ == 6) {
      output.writeMessage(6, (com.google.protobuf.ListValue) kind_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (kindCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) kind_));
    }
    if (kindCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            2, (double)((java.lang.Double) kind_));
    }
    if (kindCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getStringValue());
    }
    if (kindCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            4, (boolean)((java.lang.Boolean) kind_));
    }
    if (kindCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, (com.google.protobuf.Struct) kind_);
    }
    if (kindCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, (com.google.protobuf.ListValue) kind_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Value parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Value prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * `Value` represents a dynamically typed value which can be either
   * null, a number, a string, a boolean, a recursive struct value, or a
   * list of values. A producer of value is expected to set one of that
   * variants, absence of any variant indicates an error.
   * The JSON representation for `Value` is JSON value.
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Value, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Value)
      com.google.protobuf.ValueOrBuilder {
    // Construct using com.google.protobuf.Value.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    public KindCase
        getKindCase() {
      return instance.getKindCase();
    }

    public Builder clearKind() {
      copyOnWrite();
      instance.clearKind();
      return this;
    }


    /**
     * <pre>
     * Represents a null value.
     * </pre>
     *
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     */
    public int getNullValueValue() {
      return instance.getNullValueValue();
    }
    /**
     * <pre>
     * Represents a null value.
     * </pre>
     *
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     */
    public Builder setNullValueValue(int value) {
      copyOnWrite();
      instance.setNullValueValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a null value.
     * </pre>
     *
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     */
    public com.google.protobuf.NullValue getNullValue() {
      return instance.getNullValue();
    }
    /**
     * <pre>
     * Represents a null value.
     * </pre>
     *
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     */
    public Builder setNullValue(com.google.protobuf.NullValue value) {
      copyOnWrite();
      instance.setNullValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a null value.
     * </pre>
     *
     * <code>optional .google.protobuf.NullValue null_value = 1;</code>
     */
    public Builder clearNullValue() {
      copyOnWrite();
      instance.clearNullValue();
      return this;
    }

    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>optional double number_value = 2;</code>
     */
    public double getNumberValue() {
      return instance.getNumberValue();
    }
    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>optional double number_value = 2;</code>
     */
    public Builder setNumberValue(double value) {
      copyOnWrite();
      instance.setNumberValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a double value.
     * </pre>
     *
     * <code>optional double number_value = 2;</code>
     */
    public Builder clearNumberValue() {
      copyOnWrite();
      instance.clearNumberValue();
      return this;
    }

    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>optional string string_value = 3;</code>
     */
    public java.lang.String getStringValue() {
      return instance.getStringValue();
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>optional string string_value = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      return instance.getStringValueBytes();
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>optional string string_value = 3;</code>
     */
    public Builder setStringValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setStringValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>optional string string_value = 3;</code>
     */
    public Builder clearStringValue() {
      copyOnWrite();
      instance.clearStringValue();
      return this;
    }
    /**
     * <pre>
     * Represents a string value.
     * </pre>
     *
     * <code>optional string string_value = 3;</code>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setStringValueBytes(value);
      return this;
    }

    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>optional bool bool_value = 4;</code>
     */
    public boolean getBoolValue() {
      return instance.getBoolValue();
    }
    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>optional bool bool_value = 4;</code>
     */
    public Builder setBoolValue(boolean value) {
      copyOnWrite();
      instance.setBoolValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a boolean value.
     * </pre>
     *
     * <code>optional bool bool_value = 4;</code>
     */
    public Builder clearBoolValue() {
      copyOnWrite();
      instance.clearBoolValue();
      return this;
    }

    /**
     * <pre>
     * Represents a structured value.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     */
    public com.google.protobuf.Struct getStructValue() {
      return instance.getStructValue();
    }
    /**
     * <pre>
     * Represents a structured value.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     */
    public Builder setStructValue(com.google.protobuf.Struct value) {
      copyOnWrite();
      instance.setStructValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a structured value.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     */
    public Builder setStructValue(
        com.google.protobuf.Struct.Builder builderForValue) {
      copyOnWrite();
      instance.setStructValue(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Represents a structured value.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     */
    public Builder mergeStructValue(com.google.protobuf.Struct value) {
      copyOnWrite();
      instance.mergeStructValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a structured value.
     * </pre>
     *
     * <code>optional .google.protobuf.Struct struct_value = 5;</code>
     */
    public Builder clearStructValue() {
      copyOnWrite();
      instance.clearStructValue();
      return this;
    }

    /**
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     *
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     */
    public com.google.protobuf.ListValue getListValue() {
      return instance.getListValue();
    }
    /**
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     *
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     */
    public Builder setListValue(com.google.protobuf.ListValue value) {
      copyOnWrite();
      instance.setListValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     *
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     */
    public Builder setListValue(
        com.google.protobuf.ListValue.Builder builderForValue) {
      copyOnWrite();
      instance.setListValue(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     *
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     */
    public Builder mergeListValue(com.google.protobuf.ListValue value) {
      copyOnWrite();
      instance.mergeListValue(value);
      return this;
    }
    /**
     * <pre>
     * Represents a repeated `Value`.
     * </pre>
     *
     * <code>optional .google.protobuf.ListValue list_value = 6;</code>
     */
    public Builder clearListValue() {
      copyOnWrite();
      instance.clearListValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Value)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Value();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.protobuf.Value other = (com.google.protobuf.Value) arg1;
        switch (other.getKindCase()) {
          case NULL_VALUE: {
            kind_ = visitor.visitOneofInt(
               kindCase_ == 1, kind_, other.kind_);
            break;
          }
          case NUMBER_VALUE: {
            kind_ = visitor.visitOneofDouble(
                kindCase_ == 2, kind_, other.kind_);
            break;
          }
          case STRING_VALUE: {
            kind_ = visitor.visitOneofString(
               kindCase_ == 3, kind_, other.kind_);
            break;
          }
          case BOOL_VALUE: {
            kind_ = visitor.visitOneofBoolean(
                kindCase_ == 4, kind_, other.kind_);
            break;
          }
          case STRUCT_VALUE: {
            kind_ = visitor.visitOneofMessage(
                kindCase_ == 5,
                kind_,
                other.kind_);
            break;
          }
          case LIST_VALUE: {
            kind_ = visitor.visitOneofMessage(
                kindCase_ == 6,
                kind_,
                other.kind_);
            break;
          }
          case KIND_NOT_SET: {
            visitor.visitOneofNotSet(kindCase_ != 0);
            break;
          }
        }
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          if (other.kindCase_ != 0) {
            kindCase_ = other.kindCase_;
          }
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {
                int rawValue = input.readEnum();
                kindCase_ = 1;
                kind_ = rawValue;
                break;
              }
              case 17: {
                kindCase_ = 2;
                kind_ = input.readDouble();
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();
                kindCase_ = 3;
                kind_ = s;
                break;
              }
              case 32: {
                kindCase_ = 4;
                kind_ = input.readBool();
                break;
              }
              case 42: {
                com.google.protobuf.Struct.Builder subBuilder = null;
                if (kindCase_ == 5) {
                  subBuilder = ((com.google.protobuf.Struct) kind_).toBuilder();
                }
                kind_ =
                     input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((com.google.protobuf.Struct) kind_);
                  kind_ = subBuilder.buildPartial();
                }
                kindCase_ = 5;
                break;
              }
              case 50: {
                com.google.protobuf.ListValue.Builder subBuilder = null;
                if (kindCase_ == 6) {
                  subBuilder = ((com.google.protobuf.ListValue) kind_).toBuilder();
                }
                kind_ =
                     input.readMessage(com.google.protobuf.ListValue.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((com.google.protobuf.ListValue) kind_);
                  kind_ = subBuilder.buildPartial();
                }
                kindCase_ = 6;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.protobuf.Value.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.protobuf.Value)
  private static final com.google.protobuf.Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Value();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.protobuf.Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Value> PARSER;

  public static com.google.protobuf.Parser<Value> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

