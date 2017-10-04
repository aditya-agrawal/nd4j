// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/reader_base.proto

package org.tensorflow.framework;

/**
 * <pre>
 * For serializing and restoring the state of ReaderBase, see
 * reader_base.h for details.
 * </pre>
 *
 * Protobuf opType {@code tensorflow.ReaderBaseState}
 */
public  final class ReaderBaseState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ReaderBaseState)
    ReaderBaseStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReaderBaseState.newBuilder() to construct.
  private ReaderBaseState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReaderBaseState() {
    workStarted_ = 0L;
    workFinished_ = 0L;
    numRecordsProduced_ = 0L;
    currentWork_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReaderBaseState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            workStarted_ = input.readInt64();
            break;
          }
          case 16: {

            workFinished_ = input.readInt64();
            break;
          }
          case 24: {

            numRecordsProduced_ = input.readInt64();
            break;
          }
          case 34: {

            currentWork_ = input.readBytes();
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
    return ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ReaderBaseState.class, Builder.class);
  }

  public static final int WORK_STARTED_FIELD_NUMBER = 1;
  private long workStarted_;
  /**
   * <code>int64 work_started = 1;</code>
   */
  public long getWorkStarted() {
    return workStarted_;
  }

  public static final int WORK_FINISHED_FIELD_NUMBER = 2;
  private long workFinished_;
  /**
   * <code>int64 work_finished = 2;</code>
   */
  public long getWorkFinished() {
    return workFinished_;
  }

  public static final int NUM_RECORDS_PRODUCED_FIELD_NUMBER = 3;
  private long numRecordsProduced_;
  /**
   * <code>int64 num_records_produced = 3;</code>
   */
  public long getNumRecordsProduced() {
    return numRecordsProduced_;
  }

  public static final int CURRENT_WORK_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString currentWork_;
  /**
   * <code>bytes current_work = 4;</code>
   */
  public com.google.protobuf.ByteString getCurrentWork() {
    return currentWork_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (workStarted_ != 0L) {
      output.writeInt64(1, workStarted_);
    }
    if (workFinished_ != 0L) {
      output.writeInt64(2, workFinished_);
    }
    if (numRecordsProduced_ != 0L) {
      output.writeInt64(3, numRecordsProduced_);
    }
    if (!currentWork_.isEmpty()) {
      output.writeBytes(4, currentWork_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workStarted_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, workStarted_);
    }
    if (workFinished_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, workFinished_);
    }
    if (numRecordsProduced_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, numRecordsProduced_);
    }
    if (!currentWork_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, currentWork_);
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
    if (!(obj instanceof ReaderBaseState)) {
      return super.equals(obj);
    }
    ReaderBaseState other = (ReaderBaseState) obj;

    boolean result = true;
    result = result && (getWorkStarted()
        == other.getWorkStarted());
    result = result && (getWorkFinished()
        == other.getWorkFinished());
    result = result && (getNumRecordsProduced()
        == other.getNumRecordsProduced());
    result = result && getCurrentWork()
        .equals(other.getCurrentWork());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WORK_STARTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWorkStarted());
    hash = (37 * hash) + WORK_FINISHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWorkFinished());
    hash = (37 * hash) + NUM_RECORDS_PRODUCED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumRecordsProduced());
    hash = (37 * hash) + CURRENT_WORK_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentWork().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ReaderBaseState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReaderBaseState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReaderBaseState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReaderBaseState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReaderBaseState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReaderBaseState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReaderBaseState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReaderBaseState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReaderBaseState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ReaderBaseState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReaderBaseState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReaderBaseState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ReaderBaseState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * For serializing and restoring the state of ReaderBase, see
   * reader_base.h for details.
   * </pre>
   *
   * Protobuf opType {@code tensorflow.ReaderBaseState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ReaderBaseState)
      ReaderBaseStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReaderBaseState.class, Builder.class);
    }

    // Construct using org.tensorflow.framework.ReaderBaseState.newBuilder()
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
    public Builder clear() {
      super.clear();
      workStarted_ = 0L;

      workFinished_ = 0L;

      numRecordsProduced_ = 0L;

      currentWork_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ReaderBaseProtos.internal_static_tensorflow_ReaderBaseState_descriptor;
    }

    public ReaderBaseState getDefaultInstanceForType() {
      return ReaderBaseState.getDefaultInstance();
    }

    public ReaderBaseState build() {
      ReaderBaseState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ReaderBaseState buildPartial() {
      ReaderBaseState result = new ReaderBaseState(this);
      result.workStarted_ = workStarted_;
      result.workFinished_ = workFinished_;
      result.numRecordsProduced_ = numRecordsProduced_;
      result.currentWork_ = currentWork_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ReaderBaseState) {
        return mergeFrom((ReaderBaseState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ReaderBaseState other) {
      if (other == ReaderBaseState.getDefaultInstance()) return this;
      if (other.getWorkStarted() != 0L) {
        setWorkStarted(other.getWorkStarted());
      }
      if (other.getWorkFinished() != 0L) {
        setWorkFinished(other.getWorkFinished());
      }
      if (other.getNumRecordsProduced() != 0L) {
        setNumRecordsProduced(other.getNumRecordsProduced());
      }
      if (other.getCurrentWork() != com.google.protobuf.ByteString.EMPTY) {
        setCurrentWork(other.getCurrentWork());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ReaderBaseState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ReaderBaseState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long workStarted_ ;
    /**
     * <code>int64 work_started = 1;</code>
     */
    public long getWorkStarted() {
      return workStarted_;
    }
    /**
     * <code>int64 work_started = 1;</code>
     */
    public Builder setWorkStarted(long value) {
      
      workStarted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 work_started = 1;</code>
     */
    public Builder clearWorkStarted() {
      
      workStarted_ = 0L;
      onChanged();
      return this;
    }

    private long workFinished_ ;
    /**
     * <code>int64 work_finished = 2;</code>
     */
    public long getWorkFinished() {
      return workFinished_;
    }
    /**
     * <code>int64 work_finished = 2;</code>
     */
    public Builder setWorkFinished(long value) {
      
      workFinished_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 work_finished = 2;</code>
     */
    public Builder clearWorkFinished() {
      
      workFinished_ = 0L;
      onChanged();
      return this;
    }

    private long numRecordsProduced_ ;
    /**
     * <code>int64 num_records_produced = 3;</code>
     */
    public long getNumRecordsProduced() {
      return numRecordsProduced_;
    }
    /**
     * <code>int64 num_records_produced = 3;</code>
     */
    public Builder setNumRecordsProduced(long value) {
      
      numRecordsProduced_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_records_produced = 3;</code>
     */
    public Builder clearNumRecordsProduced() {
      
      numRecordsProduced_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString currentWork_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes current_work = 4;</code>
     */
    public com.google.protobuf.ByteString getCurrentWork() {
      return currentWork_;
    }
    /**
     * <code>bytes current_work = 4;</code>
     */
    public Builder setCurrentWork(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currentWork_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes current_work = 4;</code>
     */
    public Builder clearCurrentWork() {
      
      currentWork_ = getDefaultInstance().getCurrentWork();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.ReaderBaseState)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ReaderBaseState)
  private static final ReaderBaseState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReaderBaseState();
  }

  public static ReaderBaseState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReaderBaseState>
      PARSER = new com.google.protobuf.AbstractParser<ReaderBaseState>() {
    public ReaderBaseState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReaderBaseState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReaderBaseState> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ReaderBaseState> getParserForType() {
    return PARSER;
  }

  public ReaderBaseState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
