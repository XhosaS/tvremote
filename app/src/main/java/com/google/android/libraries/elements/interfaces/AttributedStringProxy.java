package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AttributedStringProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends AttributedStringProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native TextAlignment native_alignment(long j);

        private native boolean native_androidIncludeFontPadding(long j);

        private native String native_content(long j);

        private native LineBreakMode native_lineBreakMode(long j);

        private native float native_lineSpacing(long j);

        private native TruncationMode native_truncationMode(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public TextAlignment alignment() {
            return native_alignment(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public boolean androidIncludeFontPadding() {
            return native_androidIncludeFontPadding(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public String content() {
            return native_content(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public LineBreakMode lineBreakMode() {
            return native_lineBreakMode(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public float lineSpacing() {
            return native_lineSpacing(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public TruncationMode truncationMode() {
            return native_truncationMode(this.nativeRef);
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

    public abstract TextAlignment alignment();

    public abstract boolean androidIncludeFontPadding();

    public abstract String content();

    public abstract LineBreakMode lineBreakMode();

    public abstract float lineSpacing();

    public abstract TruncationMode truncationMode();
}
