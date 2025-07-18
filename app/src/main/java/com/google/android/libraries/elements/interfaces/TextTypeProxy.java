package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class TextTypeProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends TextTypeProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native AttributedStringProxy native_additionalTruncationText(long j);

        private native int native_maxLines(long j);

        private native AttributedStringProxy native_text(long j);

        private native AttributedStringProxy native_truncationText(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public AttributedStringProxy additionalTruncationText() {
            return native_additionalTruncationText(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public int maxLines() {
            return native_maxLines(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public AttributedStringProxy text() {
            return native_text(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public AttributedStringProxy truncationText() {
            return native_truncationText(this.nativeRef);
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

    public abstract AttributedStringProxy additionalTruncationText();

    public abstract int maxLines();

    public abstract AttributedStringProxy text();

    public abstract AttributedStringProxy truncationText();
}
