package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DirectUpdateDataRelay {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends DirectUpdateDataRelay {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native DirectUpdateDataRelay create();

        public static native void nativeDestroy(long j);

        private native byte[] native_find(long j, String str);

        private native void native_send(long j, String str, byte[] bArr);

        private native Subscription native_subscribe(long j, String str, DirectUpdateDataObserver directUpdateDataObserver);

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

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay
        public byte[] find(String str) {
            return native_find(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay
        public void send(String str, byte[] bArr) {
            native_send(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay
        public Subscription subscribe(String str, DirectUpdateDataObserver directUpdateDataObserver) {
            return native_subscribe(this.nativeRef, str, directUpdateDataObserver);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static DirectUpdateDataRelay create() {
        return CppProxy.create();
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

    public abstract byte[] find(String str);

    public abstract void send(String str, byte[] bArr);

    public abstract Subscription subscribe(String str, DirectUpdateDataObserver directUpdateDataObserver);
}
