package com.google.android.exoplayer2.drm;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ExoMediaDrm {

    /* compiled from: PG */
    public final class KeyRequest {
        public static final int REQUEST_TYPE_UNKNOWN = Integer.MIN_VALUE;
        private final byte[] data;
        private final String licenseServerUrl;
        private final int requestType;

        /* compiled from: PG */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] bArr, String str, int i) {
            this.data = bArr;
            this.licenseServerUrl = str;
            this.requestType = i;
        }

        public byte[] getData() {
            return this.data;
        }

        public String getLicenseServerUrl() {
            return this.licenseServerUrl;
        }

        public int getRequestType() {
            return this.requestType;
        }

        public KeyRequest(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }
    }

    /* compiled from: PG */
    public final class ProvisionRequest {
        private final byte[] data;
        private final String defaultUrl;

        public ProvisionRequest(byte[] bArr, String str) {
            this.data = bArr;
            this.defaultUrl = str;
        }

        public byte[] getData() {
            return this.data;
        }

        public String getDefaultUrl() {
            return this.defaultUrl;
        }
    }
}
