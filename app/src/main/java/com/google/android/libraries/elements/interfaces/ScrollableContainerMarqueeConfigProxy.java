package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ScrollableContainerMarqueeConfigProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ScrollableContainerMarqueeConfigProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native boolean native_alwaysScroll(long j);

        private native float native_delaySeconds(long j);

        private native long native_loopCount(long j);

        private native float native_marqueeSpacing(long j);

        private native ScrollableContainerMarqueeSpeedProxy native_marqueeSpeed(long j);

        private native MarqueeScrollDirection native_scrollDirection(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy
        public boolean alwaysScroll() {
            return native_alwaysScroll(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy
        public float delaySeconds() {
            return native_delaySeconds(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy
        public long loopCount() {
            return native_loopCount(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy
        public float marqueeSpacing() {
            return native_marqueeSpacing(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy
        public ScrollableContainerMarqueeSpeedProxy marqueeSpeed() {
            return native_marqueeSpeed(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerMarqueeConfigProxy
        public MarqueeScrollDirection scrollDirection() {
            return native_scrollDirection(this.nativeRef);
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

    public abstract boolean alwaysScroll();

    public abstract float delaySeconds();

    public abstract long loopCount();

    public abstract float marqueeSpacing();

    public abstract ScrollableContainerMarqueeSpeedProxy marqueeSpeed();

    public abstract MarqueeScrollDirection scrollDirection();
}
