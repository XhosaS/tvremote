package com.google.assistant.sdk.libassistant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ActionExecutor {

    /* compiled from: PG */
    public class ConversationParams {
        public byte[] data;
        public String key;
        public String type;

        public ConversationParams(String str, String str2, byte[] bArr) {
            this.key = str;
            this.type = str2;
            this.data = bArr;
        }
    }

    /* compiled from: PG */
    public class Payload {
        public byte[] data;
        public String key;
        public String type;

        public Payload(String str, String str2, byte[] bArr) {
            this.key = str;
            this.type = str2;
            this.data = bArr;
        }
    }

    /* compiled from: PG */
    public class ResponseParams {
        public String eventId;
        public boolean exmoSpecified;

        public ResponseParams(boolean z, String str) {
            this.exmoSpecified = z;
            this.eventId = str;
        }
    }

    /* compiled from: PG */
    public class Result {
        public final String errorMessage;
        public final Payload[] payloads;
        public final Status status;

        public Result() {
            this(Status.OK, "", new ArrayList());
        }

        public Result(Status status, String str) {
            this(status, str, new ArrayList());
        }

        public Result(Status status, String str, List list) {
            this.status = status;
            this.errorMessage = str;
            this.payloads = (Payload[]) list.toArray(new Payload[list.size()]);
        }
    }

    /* compiled from: PG */
    public enum Status {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        UNIMPLEMENTED(12),
        IGNORE(17);

        private final int statusCode;

        Status(int i) {
            this.statusCode = i;
        }
    }

    /* compiled from: PG */
    public class SupportedAction {
        public Arg[] args;
        public String name;
        public byte[] properties_protobuf_data;
        public String properties_protobuf_type;
        public int version;

        /* compiled from: PG */
        public class Arg {
            public String args_key;
            private String args_type;

            public Arg(String str, String str2) {
                this.args_key = str;
                this.args_type = str2;
            }

            public Arg() {
                this("", "");
            }
        }

        public SupportedAction(String str, int i, String str2, byte[] bArr, Arg[] argArr) {
            this.name = str;
            this.version = i;
            this.properties_protobuf_type = str2;
            this.properties_protobuf_data = bArr;
            this.args = argArr;
        }

        public SupportedAction(String str) {
            this(str, 1, "", new byte[0], new Arg[0]);
        }
    }

    public Result ExecuteAction(String str, Map map, ResponseParams responseParams) {
        return new Result();
    }

    public ConversationParams[] GetConversationParams() {
        return new ConversationParams[0];
    }

    public void PrepareExecution(String str, Map map, ResponseParams responseParams) {
    }
}
