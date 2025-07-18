package com.google.android.libraries.multiplatform.elements.runtime;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeLibraryInitializer {
    static {
        new AtomicBoolean(false);
    }

    private NativeLibraryInitializer() {
    }

    private static native void jniInitialize();
}
