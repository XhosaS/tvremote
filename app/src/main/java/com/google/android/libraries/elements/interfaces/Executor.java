package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Executor {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends Executor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native TaskQueue native_createTaskQueue(long j);

        private native boolean native_currentThreadIsMainThread(long j);

        private native int native_numPendingClosures(long j);

        private native void native_schedule(long j, Closure closure);

        private native void native_scheduleAfter(long j, long j2, Closure closure);

        private native void native_scheduleAfterCurrentFrame(long j, Closure closure);

        private native boolean native_trySchedule(long j, Closure closure);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Executor
        public TaskQueue createTaskQueue() {
            return native_createTaskQueue(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Executor
        public boolean currentThreadIsMainThread() {
            return native_currentThreadIsMainThread(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.Executor
        public int numPendingClosures() {
            return native_numPendingClosures(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Executor
        public void schedule(Closure closure) {
            native_schedule(this.nativeRef, closure);
        }

        @Override // com.google.android.libraries.elements.interfaces.Executor
        public void scheduleAfter(long j, Closure closure) {
            native_scheduleAfter(this.nativeRef, j, closure);
        }

        @Override // com.google.android.libraries.elements.interfaces.Executor
        public void scheduleAfterCurrentFrame(Closure closure) {
            native_scheduleAfterCurrentFrame(this.nativeRef, closure);
        }

        @Override // com.google.android.libraries.elements.interfaces.Executor
        public boolean trySchedule(Closure closure) {
            return native_trySchedule(this.nativeRef, closure);
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

    public abstract TaskQueue createTaskQueue();

    public abstract boolean currentThreadIsMainThread();

    public abstract int numPendingClosures();

    public abstract void schedule(Closure closure);

    public abstract void scheduleAfter(long j, Closure closure);

    public abstract void scheduleAfterCurrentFrame(Closure closure);

    public abstract boolean trySchedule(Closure closure);
}
