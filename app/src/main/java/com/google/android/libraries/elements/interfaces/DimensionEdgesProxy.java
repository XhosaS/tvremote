package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DimensionEdgesProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends DimensionEdgesProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native DimensionProxy native_all(long j);

        private native DimensionProxy native_bottom(long j);

        private native DimensionProxy native_end(long j);

        private native DimensionProxy native_horizontal(long j);

        private native DimensionProxy native_left(long j);

        private native DimensionProxy native_right(long j);

        private native DimensionProxy native_start(long j);

        private native DimensionProxy native_top(long j);

        private native DimensionProxy native_vertical(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy all() {
            return native_all(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy bottom() {
            return native_bottom(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy end() {
            return native_end(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy horizontal() {
            return native_horizontal(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy left() {
            return native_left(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy right() {
            return native_right(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy start() {
            return native_start(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy top() {
            return native_top(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy vertical() {
            return native_vertical(this.nativeRef);
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

    public abstract DimensionProxy all();

    public abstract DimensionProxy bottom();

    public abstract DimensionProxy end();

    public abstract DimensionProxy horizontal();

    public abstract DimensionProxy left();

    public abstract DimensionProxy right();

    public abstract DimensionProxy start();

    public abstract DimensionProxy top();

    public abstract DimensionProxy vertical();
}
