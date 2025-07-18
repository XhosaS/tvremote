package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ImageTypeProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ImageTypeProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native ImageProxy native_defaultImage(long j);

        private native ImageProxy native_errorImage(long j);

        private native ImageProxy native_image(long j);

        private native float native_preloadWidthHint(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public ImageProxy defaultImage() {
            return native_defaultImage(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public ImageProxy errorImage() {
            return native_errorImage(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public ImageProxy image() {
            return native_image(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public float preloadWidthHint() {
            return native_preloadWidthHint(this.nativeRef);
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

    public abstract ImageProxy defaultImage();

    public abstract ImageProxy errorImage();

    public abstract ImageProxy image();

    public abstract float preloadWidthHint();
}
