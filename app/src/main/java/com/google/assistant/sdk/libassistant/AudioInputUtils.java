package com.google.assistant.sdk.libassistant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AudioInputUtils {
    public static final int INVALID_DSP_SESSION_ID = -1;
    public static final int INVALID_FILE_DESCRIPTOR = -1;

    /* compiled from: PG */
    public enum MicType {
        FAR_FIELD(0),
        NEAR_FIELD(1);

        private final int inputType;

        MicType(int i) {
            this.inputType = i;
        }

        public int getInputType() {
            return this.inputType;
        }
    }
}
