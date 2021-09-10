// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: result.proto

package com.students_information.stubs.result;

/**
 * <pre>
 * This is the response message
 * </pre>
 *
 * Protobuf type {@code com.students_information.stubs.result.ResultResponse}
 */
public final class ResultResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.students_information.stubs.result.ResultResponse)
    ResultResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultResponse.newBuilder() to construct.
  private ResultResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultResponse() {
    studentId_ = "";
    maths_ = 0;
    art_ = 0;
    chemistry_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResultResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            studentId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            maths_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            art_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            chemistry_ = rawValue;
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
    return com.students_information.stubs.result.Result.internal_static_com_students_information_stubs_result_ResultResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.students_information.stubs.result.Result.internal_static_com_students_information_stubs_result_ResultResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.students_information.stubs.result.ResultResponse.class, com.students_information.stubs.result.ResultResponse.Builder.class);
  }

  public static final int STUDENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object studentId_;
  /**
   * <code>string student_id = 1;</code>
   * @return The studentId.
   */
  @java.lang.Override
  public java.lang.String getStudentId() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      studentId_ = s;
      return s;
    }
  }
  /**
   * <code>string student_id = 1;</code>
   * @return The bytes for studentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStudentIdBytes() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      studentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MATHS_FIELD_NUMBER = 2;
  private int maths_;
  /**
   * <code>.com.students_information.stubs.result.Grade maths = 2;</code>
   * @return The enum numeric value on the wire for maths.
   */
  @java.lang.Override public int getMathsValue() {
    return maths_;
  }
  /**
   * <code>.com.students_information.stubs.result.Grade maths = 2;</code>
   * @return The maths.
   */
  @java.lang.Override public com.students_information.stubs.result.Grade getMaths() {
    @SuppressWarnings("deprecation")
    com.students_information.stubs.result.Grade result = com.students_information.stubs.result.Grade.valueOf(maths_);
    return result == null ? com.students_information.stubs.result.Grade.UNRECOGNIZED : result;
  }

  public static final int ART_FIELD_NUMBER = 3;
  private int art_;
  /**
   * <code>.com.students_information.stubs.result.Grade art = 3;</code>
   * @return The enum numeric value on the wire for art.
   */
  @java.lang.Override public int getArtValue() {
    return art_;
  }
  /**
   * <code>.com.students_information.stubs.result.Grade art = 3;</code>
   * @return The art.
   */
  @java.lang.Override public com.students_information.stubs.result.Grade getArt() {
    @SuppressWarnings("deprecation")
    com.students_information.stubs.result.Grade result = com.students_information.stubs.result.Grade.valueOf(art_);
    return result == null ? com.students_information.stubs.result.Grade.UNRECOGNIZED : result;
  }

  public static final int CHEMISTRY_FIELD_NUMBER = 4;
  private int chemistry_;
  /**
   * <code>.com.students_information.stubs.result.Grade chemistry = 4;</code>
   * @return The enum numeric value on the wire for chemistry.
   */
  @java.lang.Override public int getChemistryValue() {
    return chemistry_;
  }
  /**
   * <code>.com.students_information.stubs.result.Grade chemistry = 4;</code>
   * @return The chemistry.
   */
  @java.lang.Override public com.students_information.stubs.result.Grade getChemistry() {
    @SuppressWarnings("deprecation")
    com.students_information.stubs.result.Grade result = com.students_information.stubs.result.Grade.valueOf(chemistry_);
    return result == null ? com.students_information.stubs.result.Grade.UNRECOGNIZED : result;
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
    if (!getStudentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, studentId_);
    }
    if (maths_ != com.students_information.stubs.result.Grade.PASS.getNumber()) {
      output.writeEnum(2, maths_);
    }
    if (art_ != com.students_information.stubs.result.Grade.PASS.getNumber()) {
      output.writeEnum(3, art_);
    }
    if (chemistry_ != com.students_information.stubs.result.Grade.PASS.getNumber()) {
      output.writeEnum(4, chemistry_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStudentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, studentId_);
    }
    if (maths_ != com.students_information.stubs.result.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, maths_);
    }
    if (art_ != com.students_information.stubs.result.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, art_);
    }
    if (chemistry_ != com.students_information.stubs.result.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, chemistry_);
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
    if (!(obj instanceof com.students_information.stubs.result.ResultResponse)) {
      return super.equals(obj);
    }
    com.students_information.stubs.result.ResultResponse other = (com.students_information.stubs.result.ResultResponse) obj;

    if (!getStudentId()
        .equals(other.getStudentId())) return false;
    if (maths_ != other.maths_) return false;
    if (art_ != other.art_) return false;
    if (chemistry_ != other.chemistry_) return false;
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
    hash = (37 * hash) + STUDENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStudentId().hashCode();
    hash = (37 * hash) + MATHS_FIELD_NUMBER;
    hash = (53 * hash) + maths_;
    hash = (37 * hash) + ART_FIELD_NUMBER;
    hash = (53 * hash) + art_;
    hash = (37 * hash) + CHEMISTRY_FIELD_NUMBER;
    hash = (53 * hash) + chemistry_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.students_information.stubs.result.ResultResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.students_information.stubs.result.ResultResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.students_information.stubs.result.ResultResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.students_information.stubs.result.ResultResponse parseFrom(
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
  public static Builder newBuilder(com.students_information.stubs.result.ResultResponse prototype) {
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
   * This is the response message
   * </pre>
   *
   * Protobuf type {@code com.students_information.stubs.result.ResultResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.students_information.stubs.result.ResultResponse)
      com.students_information.stubs.result.ResultResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.students_information.stubs.result.Result.internal_static_com_students_information_stubs_result_ResultResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.students_information.stubs.result.Result.internal_static_com_students_information_stubs_result_ResultResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.students_information.stubs.result.ResultResponse.class, com.students_information.stubs.result.ResultResponse.Builder.class);
    }

    // Construct using com.students_information.stubs.result.ResultResponse.newBuilder()
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
      studentId_ = "";

      maths_ = 0;

      art_ = 0;

      chemistry_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.students_information.stubs.result.Result.internal_static_com_students_information_stubs_result_ResultResponse_descriptor;
    }

    @java.lang.Override
    public com.students_information.stubs.result.ResultResponse getDefaultInstanceForType() {
      return com.students_information.stubs.result.ResultResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.students_information.stubs.result.ResultResponse build() {
      com.students_information.stubs.result.ResultResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.students_information.stubs.result.ResultResponse buildPartial() {
      com.students_information.stubs.result.ResultResponse result = new com.students_information.stubs.result.ResultResponse(this);
      result.studentId_ = studentId_;
      result.maths_ = maths_;
      result.art_ = art_;
      result.chemistry_ = chemistry_;
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
      if (other instanceof com.students_information.stubs.result.ResultResponse) {
        return mergeFrom((com.students_information.stubs.result.ResultResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.students_information.stubs.result.ResultResponse other) {
      if (other == com.students_information.stubs.result.ResultResponse.getDefaultInstance()) return this;
      if (!other.getStudentId().isEmpty()) {
        studentId_ = other.studentId_;
        onChanged();
      }
      if (other.maths_ != 0) {
        setMathsValue(other.getMathsValue());
      }
      if (other.art_ != 0) {
        setArtValue(other.getArtValue());
      }
      if (other.chemistry_ != 0) {
        setChemistryValue(other.getChemistryValue());
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
      com.students_information.stubs.result.ResultResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.students_information.stubs.result.ResultResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object studentId_ = "";
    /**
     * <code>string student_id = 1;</code>
     * @return The studentId.
     */
    public java.lang.String getStudentId() {
      java.lang.Object ref = studentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        studentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     * @return The bytes for studentId.
     */
    public com.google.protobuf.ByteString
        getStudentIdBytes() {
      java.lang.Object ref = studentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        studentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     * @param value The studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      studentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStudentId() {
      
      studentId_ = getDefaultInstance().getStudentId();
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     * @param value The bytes for studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      studentId_ = value;
      onChanged();
      return this;
    }

    private int maths_ = 0;
    /**
     * <code>.com.students_information.stubs.result.Grade maths = 2;</code>
     * @return The enum numeric value on the wire for maths.
     */
    @java.lang.Override public int getMathsValue() {
      return maths_;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade maths = 2;</code>
     * @param value The enum numeric value on the wire for maths to set.
     * @return This builder for chaining.
     */
    public Builder setMathsValue(int value) {
      
      maths_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade maths = 2;</code>
     * @return The maths.
     */
    @java.lang.Override
    public com.students_information.stubs.result.Grade getMaths() {
      @SuppressWarnings("deprecation")
      com.students_information.stubs.result.Grade result = com.students_information.stubs.result.Grade.valueOf(maths_);
      return result == null ? com.students_information.stubs.result.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade maths = 2;</code>
     * @param value The maths to set.
     * @return This builder for chaining.
     */
    public Builder setMaths(com.students_information.stubs.result.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      maths_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade maths = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaths() {
      
      maths_ = 0;
      onChanged();
      return this;
    }

    private int art_ = 0;
    /**
     * <code>.com.students_information.stubs.result.Grade art = 3;</code>
     * @return The enum numeric value on the wire for art.
     */
    @java.lang.Override public int getArtValue() {
      return art_;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade art = 3;</code>
     * @param value The enum numeric value on the wire for art to set.
     * @return This builder for chaining.
     */
    public Builder setArtValue(int value) {
      
      art_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade art = 3;</code>
     * @return The art.
     */
    @java.lang.Override
    public com.students_information.stubs.result.Grade getArt() {
      @SuppressWarnings("deprecation")
      com.students_information.stubs.result.Grade result = com.students_information.stubs.result.Grade.valueOf(art_);
      return result == null ? com.students_information.stubs.result.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade art = 3;</code>
     * @param value The art to set.
     * @return This builder for chaining.
     */
    public Builder setArt(com.students_information.stubs.result.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      art_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade art = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearArt() {
      
      art_ = 0;
      onChanged();
      return this;
    }

    private int chemistry_ = 0;
    /**
     * <code>.com.students_information.stubs.result.Grade chemistry = 4;</code>
     * @return The enum numeric value on the wire for chemistry.
     */
    @java.lang.Override public int getChemistryValue() {
      return chemistry_;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade chemistry = 4;</code>
     * @param value The enum numeric value on the wire for chemistry to set.
     * @return This builder for chaining.
     */
    public Builder setChemistryValue(int value) {
      
      chemistry_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade chemistry = 4;</code>
     * @return The chemistry.
     */
    @java.lang.Override
    public com.students_information.stubs.result.Grade getChemistry() {
      @SuppressWarnings("deprecation")
      com.students_information.stubs.result.Grade result = com.students_information.stubs.result.Grade.valueOf(chemistry_);
      return result == null ? com.students_information.stubs.result.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade chemistry = 4;</code>
     * @param value The chemistry to set.
     * @return This builder for chaining.
     */
    public Builder setChemistry(com.students_information.stubs.result.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      chemistry_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.students_information.stubs.result.Grade chemistry = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearChemistry() {
      
      chemistry_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.students_information.stubs.result.ResultResponse)
  }

  // @@protoc_insertion_point(class_scope:com.students_information.stubs.result.ResultResponse)
  private static final com.students_information.stubs.result.ResultResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.students_information.stubs.result.ResultResponse();
  }

  public static com.students_information.stubs.result.ResultResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultResponse>
      PARSER = new com.google.protobuf.AbstractParser<ResultResponse>() {
    @java.lang.Override
    public ResultResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.students_information.stubs.result.ResultResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
