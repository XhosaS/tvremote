package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ExecutorRegistry {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ExecutorRegistry {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native ExecutorRegistry create(Executor executor, Executor executor2);

        public static native void nativeDestroy(long j);

        private native Executor native_executorForExecutorThread(long j, ExecutorThread executorThread);

        private native void native_schedule(long j, ExecutorThread executorThread, Closure closure);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ExecutorRegistry
        public Executor executorForExecutorThread(ExecutorThread executorThread) {
            return native_executorForExecutorThread(this.nativeRef, executorThread);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ExecutorRegistry
        public void schedule(ExecutorThread executorThread, Closure closure) {
            native_schedule(this.nativeRef, executorThread, closure);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static ExecutorRegistry create(Executor executor, Executor executor2) {
        return CppProxy.create(executor, executor2);
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

    public abstract Executor executorForExecutorThread(ExecutorThread executorThread);

    public abstract void schedule(ExecutorThread executorThread, Closure closure);
}
