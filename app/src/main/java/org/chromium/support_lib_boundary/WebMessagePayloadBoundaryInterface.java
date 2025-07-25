package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebMessagePayloadType {
        public static final int TYPE_ARRAY_BUFFER = 1;
        public static final int TYPE_STRING = 0;
    }

    byte[] getAsArrayBuffer();

    String getAsString();

    int getType();
}
