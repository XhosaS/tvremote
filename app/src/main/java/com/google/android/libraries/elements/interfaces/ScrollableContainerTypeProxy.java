package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ScrollableContainerTypeProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ScrollableContainerTypeProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native PointProxy native_contentOffset(long j);

        private native SizeProxy native_contentSize(long j);

        private native ScrollableContainerTypeDirection native_direction(long j);

        private native ScrollableContainerMarqueeConfigProxy native_marqueeConfig(long j);

        private native ScrollableContainerTypeOverscrollMode native_overscrollMode(long j);

        private native boolean native_showHorizontalIndicator(long j);

        private native boolean native_showVerticalIndicator(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public PointProxy contentOffset() {
            return native_contentOffset(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public SizeProxy contentSize() {
            return native_contentSize(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public ScrollableContainerTypeDirection direction() {
            return native_direction(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public ScrollableContainerMarqueeConfigProxy marqueeConfig() {
            return native_marqueeConfig(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public ScrollableContainerTypeOverscrollMode overscrollMode() {
            return native_overscrollMode(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public boolean showHorizontalIndicator() {
            return native_showHorizontalIndicator(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public boolean showVerticalIndicator() {
            return native_showVerticalIndicator(this.nativeRef);
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

    public abstract PointProxy contentOffset();

    public abstract SizeProxy contentSize();

    public abstract ScrollableContainerTypeDirection direction();

    public abstract ScrollableContainerMarqueeConfigProxy marqueeConfig();

    public abstract ScrollableContainerTypeOverscrollMode overscrollMode();

    public abstract boolean showHorizontalIndicator();

    public abstract boolean showVerticalIndicator();
}
