package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ImageSourceProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ImageSourceProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native ClientResourceProxy native_clientResource(long j);

        private native long native_height(long j);

        private native byte[] native_imageData(long j);

        private native String native_url(long j);

        private native long native_width(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public ClientResourceProxy clientResource() {
            return native_clientResource(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public long height() {
            return native_height(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public byte[] imageData() {
            return native_imageData(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public String url() {
            return native_url(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public long width() {
            return native_width(this.nativeRef);
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

    public abstract ClientResourceProxy clientResource();

    public abstract long height();

    public abstract byte[] imageData();

    public abstract String url();

    public abstract long width();
}
