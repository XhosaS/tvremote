package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Snapshot {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends Snapshot {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;
        private final AtomicBoolean registeredWithNativeObjectManager;

        public static native void nativeDestroy(long j);

        private native long native_byteSize(long j);

        private native boolean native_contains(long j, String str);

        private native boolean native_empty(long j);

        private native boolean native_equals(long j, Snapshot snapshot);

        private native byte[] native_find(long j, String str);

        private native byte[] native_findNoCopy(long j, String str);

        private native long native_id(long j);

        private native HashSet native_keys(long j);

        private native byte[] native_retrieveMetadata(long j, String str);

        private native long native_size(long j);

        public void _djinni_private_destroy() {
            if (this.registeredWithNativeObjectManager.get() || this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public long byteSize() {
            return native_byteSize(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public boolean contains(String str) {
            return native_contains(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public boolean empty() {
            return native_empty(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public boolean equals(Snapshot snapshot) {
            return native_equals(this.nativeRef, snapshot);
        }

        protected void finalize() throws Throwable {
            if (this.registeredWithNativeObjectManager.get()) {
                return;
            }
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public byte[] find(String str) {
            return native_find(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public byte[] findNoCopy(String str) {
            return native_findNoCopy(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public long id() {
            return native_id(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public HashSet keys() {
            return native_keys(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public byte[] retrieveMetadata(String str) {
            return native_retrieveMetadata(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.Snapshot
        public long size() {
            return native_size(this.nativeRef);
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

    public abstract long byteSize();

    public abstract boolean contains(String str);

    public abstract boolean empty();

    public abstract boolean equals(Snapshot snapshot);

    public abstract byte[] find(String str);

    public abstract byte[] findNoCopy(String str);

    public abstract long id();

    public abstract HashSet keys();

    public abstract byte[] retrieveMetadata(String str);

    public abstract long size();
}
