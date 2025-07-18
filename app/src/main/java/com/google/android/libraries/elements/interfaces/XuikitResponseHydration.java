package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class XuikitResponseHydration {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends XuikitResponseHydration {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native XuikitResponseHydration create(ResourceMetadataTracker resourceMetadataTracker, ResourcePreloader resourcePreloader);

        public static native void nativeDestroy(long j);

        private native StatusOr native_rehydrateResponse(long j, byte[] bArr);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.XuikitResponseHydration
        public StatusOr rehydrateResponse(byte[] bArr) {
            return native_rehydrateResponse(this.nativeRef, bArr);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static XuikitResponseHydration create(ResourceMetadataTracker resourceMetadataTracker, ResourcePreloader resourcePreloader) {
        return CppProxy.create(resourceMetadataTracker, resourcePreloader);
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

    public abstract StatusOr rehydrateResponse(byte[] bArr);
}
