package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ElementProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ElementProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native ElementProxy create(byte[] bArr);

        public static native void nativeDestroy(long j);

        private native ArrayList native_childElements(long j);

        private native String native_key(long j);

        private native PropertiesProxy native_properties(long j);

        private native TypeProxy native_type(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public ArrayList childElements() {
            return native_childElements(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public String key() {
            return native_key(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public PropertiesProxy properties() {
            return native_properties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public TypeProxy type() {
            return native_type(this.nativeRef);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static ElementProxy create(byte[] bArr) {
        return CppProxy.create(bArr);
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

    public abstract ArrayList childElements();

    public abstract String key();

    public abstract PropertiesProxy properties();

    public abstract TypeProxy type();
}
