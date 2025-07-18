package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PropertiesProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends PropertiesProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native boolean native_hasLayoutProperties(long j);

        private native boolean native_hasStyleProperties(long j);

        private native LayoutPropertiesProxy native_layoutProperties(long j);

        private native StylePropertiesProxy native_styleProperties(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public boolean hasLayoutProperties() {
            return native_hasLayoutProperties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public boolean hasStyleProperties() {
            return native_hasStyleProperties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public LayoutPropertiesProxy layoutProperties() {
            return native_layoutProperties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public StylePropertiesProxy styleProperties() {
            return native_styleProperties(this.nativeRef);
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

    public abstract boolean hasLayoutProperties();

    public abstract boolean hasStyleProperties();

    public abstract LayoutPropertiesProxy layoutProperties();

    public abstract StylePropertiesProxy styleProperties();
}
