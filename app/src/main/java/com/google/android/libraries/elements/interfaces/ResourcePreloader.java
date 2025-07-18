package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ResourcePreloader {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ResourcePreloader {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native Status native_ensureLoaded(long j, HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

        private native Status native_loadAll(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l) {
            return native_ensureLoaded(this.nativeRef, hashSet, processState, errorPolicy, l);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status loadAll() {
            return native_loadAll(this.nativeRef);
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

    public abstract Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

    public abstract Status loadAll();
}
