package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class FetcherResolver {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends FetcherResolver {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native StatusOr native_getFetcher(long j, int i, byte[] bArr);

        private native void native_register(long j, int i, FetcherFactory fetcherFactory);

        public static native FetcherResolver sharedResolver();

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

        @Override // com.google.android.libraries.elements.interfaces.FetcherResolver
        public StatusOr getFetcher(int i, byte[] bArr) {
            return native_getFetcher(this.nativeRef, i, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.FetcherResolver
        public void register(int i, FetcherFactory fetcherFactory) {
            native_register(this.nativeRef, i, fetcherFactory);
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

    public static FetcherResolver sharedResolver() {
        return CppProxy.sharedResolver();
    }

    public abstract StatusOr getFetcher(int i, byte[] bArr);

    public abstract void register(int i, FetcherFactory fetcherFactory);
}
