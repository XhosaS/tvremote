package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ImageProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ImageProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native ContentMode native_contentMode(long j);

        private native boolean native_flipForRtlLayout(long j);

        private native ImageFormatHint native_imageFormatHint(long j);

        private native ArrayList native_sources(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public ContentMode contentMode() {
            return native_contentMode(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public boolean flipForRtlLayout() {
            return native_flipForRtlLayout(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public ImageFormatHint imageFormatHint() {
            return native_imageFormatHint(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public ArrayList sources() {
            return native_sources(this.nativeRef);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j);
        proxyMap.b(j, new WeakReference(cppProxy));
        return cppProxy;
    }

    private static CppProxy getExistingProxy(long j) {
        wu wuVar = proxyMap;
        WeakReference weakReference = (WeakReference) wuVar.a(j);
        if (weakReference == null) {
            return null;
        }
        CppProxy cppProxy = (CppProxy) weakReference.get();
        if (cppProxy != null) {
            return cppProxy;
        }
        wuVar.c(j);
        return null;
    }

    public abstract ContentMode contentMode();

    public abstract boolean flipForRtlLayout();

    public abstract ImageFormatHint imageFormatHint();

    public abstract ArrayList sources();
}
