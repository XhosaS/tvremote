package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ElementsDataSourceDelegateFactory {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ElementsDataSourceDelegateFactory {
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native StatusOr getDelegate(byte[] bArr, DataSourceListener dataSourceListener, ByteStore byteStore, String str);

        public static native void nativeDestroy(long j);

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

    public static StatusOr getDelegate(byte[] bArr, DataSourceListener dataSourceListener, ByteStore byteStore, String str) {
        return CppProxy.getDelegate(bArr, dataSourceListener, byteStore, str);
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
}
