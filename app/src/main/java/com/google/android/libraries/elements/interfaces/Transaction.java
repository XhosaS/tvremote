package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Transaction {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends Transaction {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;
        private final AtomicBoolean registeredWithNativeObjectManager;

        public static native void nativeDestroy(long j);

        private native void native_abort(long j);

        private native void native_commit(long j);

        private native byte[] native_get(long j, String str);

        private native byte[] native_getMetadata(long j, String str);

        private native void native_remove(long j, String str);

        private native void native_set(long j, String str, byte[] bArr);

        private native void native_setMetadata(long j, String str, byte[] bArr);

        private native void native_setWithMetadata(long j, String str, byte[] bArr, byte[] bArr2);

        public void _djinni_private_destroy() {
            if (this.registeredWithNativeObjectManager.get() || this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void abort() {
            native_abort(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void commit() {
            native_commit(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            if (this.registeredWithNativeObjectManager.get()) {
                return;
            }
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public byte[] get(String str) {
            return native_get(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public byte[] getMetadata(String str) {
            return native_getMetadata(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void remove(String str) {
            native_remove(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void set(String str, byte[] bArr) {
            native_set(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void setMetadata(String str, byte[] bArr) {
            native_setMetadata(this.nativeRef, str, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.Transaction
        public void setWithMetadata(String str, byte[] bArr, byte[] bArr2) {
            native_setWithMetadata(this.nativeRef, str, bArr, bArr2);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            this.registeredWithNativeObjectManager = new AtomicBoolean(false);
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

    public abstract void abort();

    public abstract void commit();

    public abstract byte[] get(String str);

    public abstract byte[] getMetadata(String str);

    public abstract void remove(String str);

    public abstract void set(String str, byte[] bArr);

    public abstract void setMetadata(String str, byte[] bArr);

    public abstract void setWithMetadata(String str, byte[] bArr, byte[] bArr2);
}
