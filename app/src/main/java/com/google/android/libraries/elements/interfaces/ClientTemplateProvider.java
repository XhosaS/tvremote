package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ClientTemplateProvider {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ClientTemplateProvider {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native ClientTemplateProvider getSingleton();

        public static native void nativeDestroy(long j);

        private native void native_addObserver(long j, ClientTemplateProviderObserver clientTemplateProviderObserver);

        private native long native_getTemplatesSize(long j);

        private native long native_getTransformStoreSize(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public void addObserver(ClientTemplateProviderObserver clientTemplateProviderObserver) {
            native_addObserver(this.nativeRef, clientTemplateProviderObserver);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public long getTemplatesSize() {
            return native_getTemplatesSize(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public long getTransformStoreSize() {
            return native_getTransformStoreSize(this.nativeRef);
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

    public static ClientTemplateProvider getSingleton() {
        return CppProxy.getSingleton();
    }

    public abstract void addObserver(ClientTemplateProviderObserver clientTemplateProviderObserver);

    public abstract long getTemplatesSize();

    public abstract long getTransformStoreSize();
}
