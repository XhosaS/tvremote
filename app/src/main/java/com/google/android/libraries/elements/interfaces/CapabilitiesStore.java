package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CapabilitiesStore {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends CapabilitiesStore {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native CapabilitiesStore create(boolean z);

        public static native void nativeDestroy(long j);

        private native StatusOr native_getCapabilitiesBytes(long j, String str, boolean z);

        private native CapabilitiesLoaderProxy native_getCapabilitiesLoader(long j);

        private native void native_setPreloader(long j, ResourcePreloader resourcePreloader);

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

        @Override // com.google.android.libraries.elements.interfaces.CapabilitiesStore
        public StatusOr getCapabilitiesBytes(String str, boolean z) {
            return native_getCapabilitiesBytes(this.nativeRef, str, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.CapabilitiesStore
        public CapabilitiesLoaderProxy getCapabilitiesLoader() {
            return native_getCapabilitiesLoader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CapabilitiesStore
        public void setPreloader(ResourcePreloader resourcePreloader) {
            native_setPreloader(this.nativeRef, resourcePreloader);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static CapabilitiesStore create(boolean z) {
        return CppProxy.create(z);
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

    public abstract StatusOr getCapabilitiesBytes(String str, boolean z);

    public abstract CapabilitiesLoaderProxy getCapabilitiesLoader();

    public abstract void setPreloader(ResourcePreloader resourcePreloader);
}
