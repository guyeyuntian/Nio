// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SubscribeResp.proto

package com.codec.proto;

public final class SubscribeReqProto {
    private SubscribeReqProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    public interface SubscribeReqOrBuilder extends
            // @@protoc_insertion_point(interface_extends:netty.SubscribeReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>optional int32 subSeqID = 1;</code>
         */
        int getSubSeqID();

        /**
         * <code>optional string userName = 2;</code>
         */
        String getUserName();

        /**
         * <code>optional string userName = 2;</code>
         */
        com.google.protobuf.ByteString
        getUserNameBytes();

        /**
         * <code>optional string productName = 3;</code>
         */
        String getProductName();

        /**
         * <code>optional string productName = 3;</code>
         */
        com.google.protobuf.ByteString
        getProductNameBytes();

        /**
         * <code>optional string address = 4;</code>
         */
        String getAddress();

        /**
         * <code>optional string address = 4;</code>
         */
        com.google.protobuf.ByteString
        getAddressBytes();
    }

    /**
     * Protobuf type {@code netty.SubscribeReq}
     */
    public static final class SubscribeReq extends
            com.google.protobuf.GeneratedMessage implements
            // @@protoc_insertion_point(message_implements:netty.SubscribeReq)
            SubscribeReqOrBuilder {
        // Use SubscribeReq.newBuilder() to construct.
        private SubscribeReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
        }

        private SubscribeReq() {
            subSeqID_ = 0;
            userName_ = "";
            productName_ = "";
            address_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private SubscribeReq(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
            this();
            int mutable_bitField0_ = 0;
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

                            subSeqID_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            userName_ = s;
                            break;
                        }
                        case 26: {
                            String s = input.readStringRequireUtf8();

                            productName_ = s;
                            break;
                        }
                        case 34: {
                            String s = input.readStringRequireUtf8();

                            address_ = s;
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
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SubscribeReq.class, Builder.class);
        }

        public static final int SUBSEQID_FIELD_NUMBER = 1;
        private int subSeqID_;

        /**
         * <code>optional int32 subSeqID = 1;</code>
         */
        public int getSubSeqID() {
            return subSeqID_;
        }

        public static final int USERNAME_FIELD_NUMBER = 2;
        private volatile Object userName_;

        /**
         * <code>optional string userName = 2;</code>
         */
        public String getUserName() {
            Object ref = userName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                userName_ = s;
                return s;
            }
        }

        /**
         * <code>optional string userName = 2;</code>
         */
        public com.google.protobuf.ByteString
        getUserNameBytes() {
            Object ref = userName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                userName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int PRODUCTNAME_FIELD_NUMBER = 3;
        private volatile Object productName_;

        /**
         * <code>optional string productName = 3;</code>
         */
        public String getProductName() {
            Object ref = productName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                productName_ = s;
                return s;
            }
        }

        /**
         * <code>optional string productName = 3;</code>
         */
        public com.google.protobuf.ByteString
        getProductNameBytes() {
            Object ref = productName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                productName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ADDRESS_FIELD_NUMBER = 4;
        private volatile Object address_;

        /**
         * <code>optional string address = 4;</code>
         */
        public String getAddress() {
            Object ref = address_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                address_ = s;
                return s;
            }
        }

        /**
         * <code>optional string address = 4;</code>
         */
        public com.google.protobuf.ByteString
        getAddressBytes() {
            Object ref = address_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                address_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (subSeqID_ != 0) {
                output.writeInt32(1, subSeqID_);
            }
            if (!getUserNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessage.writeString(output, 2, userName_);
            }
            if (!getProductNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessage.writeString(output, 3, productName_);
            }
            if (!getAddressBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessage.writeString(output, 4, address_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (subSeqID_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, subSeqID_);
            }
            if (!getUserNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessage.computeStringSize(2, userName_);
            }
            if (!getProductNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessage.computeStringSize(3, productName_);
            }
            if (!getAddressBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessage.computeStringSize(4, address_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        public static SubscribeReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static SubscribeReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static SubscribeReq parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static SubscribeReq parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static SubscribeReq parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static SubscribeReq parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static SubscribeReq parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static SubscribeReq parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static SubscribeReq parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static SubscribeReq parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SubscribeReq prototype) {
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
         * Protobuf type {@code netty.SubscribeReq}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:netty.SubscribeReq)
                SubscribeReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SubscribeReqProto.internal_static_netty_SubscribeReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SubscribeReq.class, Builder.class);
            }

            // Construct using com.codec.proto.SubscribeReqProto.SubscribeReq.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                subSeqID_ = 0;

                userName_ = "";

                productName_ = "";

                address_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SubscribeReqProto.internal_static_netty_SubscribeReq_descriptor;
            }

            public SubscribeReq getDefaultInstanceForType() {
                return SubscribeReq.getDefaultInstance();
            }

            public SubscribeReq build() {
                SubscribeReq result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public SubscribeReq buildPartial() {
                SubscribeReq result = new SubscribeReq(this);
                result.subSeqID_ = subSeqID_;
                result.userName_ = userName_;
                result.productName_ = productName_;
                result.address_ = address_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SubscribeReq) {
                    return mergeFrom((SubscribeReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SubscribeReq other) {
                if (other == SubscribeReq.getDefaultInstance()) return this;
                if (other.getSubSeqID() != 0) {
                    setSubSeqID(other.getSubSeqID());
                }
                if (!other.getUserName().isEmpty()) {
                    userName_ = other.userName_;
                    onChanged();
                }
                if (!other.getProductName().isEmpty()) {
                    productName_ = other.productName_;
                    onChanged();
                }
                if (!other.getAddress().isEmpty()) {
                    address_ = other.address_;
                    onChanged();
                }
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
                SubscribeReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SubscribeReq) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int subSeqID_;

            /**
             * <code>optional int32 subSeqID = 1;</code>
             */
            public int getSubSeqID() {
                return subSeqID_;
            }

            /**
             * <code>optional int32 subSeqID = 1;</code>
             */
            public Builder setSubSeqID(int value) {

                subSeqID_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int32 subSeqID = 1;</code>
             */
            public Builder clearSubSeqID() {

                subSeqID_ = 0;
                onChanged();
                return this;
            }

            private Object userName_ = "";

            /**
             * <code>optional string userName = 2;</code>
             */
            public String getUserName() {
                Object ref = userName_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    userName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>optional string userName = 2;</code>
             */
            public com.google.protobuf.ByteString
            getUserNameBytes() {
                Object ref = userName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    userName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string userName = 2;</code>
             */
            public Builder setUserName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                userName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string userName = 2;</code>
             */
            public Builder clearUserName() {

                userName_ = getDefaultInstance().getUserName();
                onChanged();
                return this;
            }

            /**
             * <code>optional string userName = 2;</code>
             */
            public Builder setUserNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                userName_ = value;
                onChanged();
                return this;
            }

            private Object productName_ = "";

            /**
             * <code>optional string productName = 3;</code>
             */
            public String getProductName() {
                Object ref = productName_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    productName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>optional string productName = 3;</code>
             */
            public com.google.protobuf.ByteString
            getProductNameBytes() {
                Object ref = productName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    productName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string productName = 3;</code>
             */
            public Builder setProductName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                productName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string productName = 3;</code>
             */
            public Builder clearProductName() {

                productName_ = getDefaultInstance().getProductName();
                onChanged();
                return this;
            }

            /**
             * <code>optional string productName = 3;</code>
             */
            public Builder setProductNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                productName_ = value;
                onChanged();
                return this;
            }

            private Object address_ = "";

            /**
             * <code>optional string address = 4;</code>
             */
            public String getAddress() {
                Object ref = address_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    address_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>optional string address = 4;</code>
             */
            public com.google.protobuf.ByteString
            getAddressBytes() {
                Object ref = address_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    address_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string address = 4;</code>
             */
            public Builder setAddress(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                address_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string address = 4;</code>
             */
            public Builder clearAddress() {

                address_ = getDefaultInstance().getAddress();
                onChanged();
                return this;
            }

            /**
             * <code>optional string address = 4;</code>
             */
            public Builder setAddressBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                address_ = value;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:netty.SubscribeReq)
        }

        // @@protoc_insertion_point(class_scope:netty.SubscribeReq)
        private static final SubscribeReq DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new SubscribeReq();
        }

        public static SubscribeReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SubscribeReq>
                PARSER = new com.google.protobuf.AbstractParser<SubscribeReq>() {
            public SubscribeReq parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                try {
                    return new SubscribeReq(input, extensionRegistry);
                } catch (RuntimeException e) {
                    if (e.getCause() instanceof
                            com.google.protobuf.InvalidProtocolBufferException) {
                        throw (com.google.protobuf.InvalidProtocolBufferException)
                                e.getCause();
                    }
                    throw e;
                }
            }
        };

        public static com.google.protobuf.Parser<SubscribeReq> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<SubscribeReq> getParserForType() {
            return PARSER;
        }

        public SubscribeReq getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_netty_SubscribeReq_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_netty_SubscribeReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\023SubscribeResp.proto\022\005netty\"X\n\014Subscrib" +
                        "eReq\022\020\n\010subSeqID\030\001 \001(\005\022\020\n\010userName\030\002 \001(\t" +
                        "\022\023\n\013productName\030\003 \001(\t\022\017\n\007address\030\004 \001(\tB$" +
                        "\n\017com.codec.protoB\021SubscribeReqProtob\006pr" +
                        "oto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_netty_SubscribeReq_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_netty_SubscribeReq_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_netty_SubscribeReq_descriptor,
                new String[]{"SubSeqID", "UserName", "ProductName", "Address",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}