package com.google.android.libraries.elements.interfaces;

import android.graphics.Rect;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$ProminenceAlgorithmContext;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class IntersectionEngine {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends IntersectionEngine {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native IntersectionEngine create();

        public static native void nativeDestroy(long j);

        private native void native_checkProminence(long j);

        private native void native_onEnter(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_onExit(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_onScroll(long j, String str, Rect rect, Rect rect2, Rect rect3, int i, int i2);

        private native void native_onSizeChange(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_setAdditionalOcclusionEdge(long j, OcclusionEdge occlusionEdge, int i, String str);

        private native void native_setDefaultProminenceAlgorithm(long j, ProminenceAlgorithm prominenceAlgorithm);

        private native void native_setEnableProminence(long j, boolean z, ProminenceAlgorithm prominenceAlgorithm);

        private native void native_setEnableProminenceForGroup(long j, String str, boolean z);

        private native void native_setIgnoreNonVisibleCells(long j, boolean z);

        private native void native_setOcclusionEdge(long j, OcclusionEdge occlusionEdge, int i, String str);

        private native void native_setOcclusionRect(long j, Rect rect, String str);

        private native void native_setProminenceAlgorithmContext(long j, ProminenceAlgorithm prominenceAlgorithm, IntersectionPropertiesOuterClass$ProminenceAlgorithmContext intersectionPropertiesOuterClass$ProminenceAlgorithmContext);

        private native void native_setProminenceAlgorithmForGroup(long j, String str, ProminenceAlgorithm prominenceAlgorithm);

        private native void native_setRtl(long j, boolean z);

        private native IntersectionSubscription native_subscribe(long j, String str, IntersectionObserver intersectionObserver);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void checkProminence() {
            native_checkProminence(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onEnter(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onExit(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i, int i2) {
            native_onScroll(this.nativeRef, str, rect, rect2, rect3, i, i2);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onSizeChange(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onSizeChange(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setAdditionalOcclusionEdge(OcclusionEdge occlusionEdge, int i, String str) {
            native_setAdditionalOcclusionEdge(this.nativeRef, occlusionEdge, i, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setDefaultProminenceAlgorithm(ProminenceAlgorithm prominenceAlgorithm) {
            native_setDefaultProminenceAlgorithm(this.nativeRef, prominenceAlgorithm);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setEnableProminence(boolean z, ProminenceAlgorithm prominenceAlgorithm) {
            native_setEnableProminence(this.nativeRef, z, prominenceAlgorithm);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setEnableProminenceForGroup(String str, boolean z) {
            native_setEnableProminenceForGroup(this.nativeRef, str, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setIgnoreNonVisibleCells(boolean z) {
            native_setIgnoreNonVisibleCells(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setOcclusionEdge(OcclusionEdge occlusionEdge, int i, String str) {
            native_setOcclusionEdge(this.nativeRef, occlusionEdge, i, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setOcclusionRect(Rect rect, String str) {
            native_setOcclusionRect(this.nativeRef, rect, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setProminenceAlgorithmContext(ProminenceAlgorithm prominenceAlgorithm, IntersectionPropertiesOuterClass$ProminenceAlgorithmContext intersectionPropertiesOuterClass$ProminenceAlgorithmContext) {
            native_setProminenceAlgorithmContext(this.nativeRef, prominenceAlgorithm, intersectionPropertiesOuterClass$ProminenceAlgorithmContext);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setProminenceAlgorithmForGroup(String str, ProminenceAlgorithm prominenceAlgorithm) {
            native_setProminenceAlgorithmForGroup(this.nativeRef, str, prominenceAlgorithm);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setRtl(boolean z) {
            native_setRtl(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public IntersectionSubscription subscribe(String str, IntersectionObserver intersectionObserver) {
            return native_subscribe(this.nativeRef, str, intersectionObserver);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static IntersectionEngine create() {
        return CppProxy.create();
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

    public abstract void checkProminence();

    public abstract void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i, int i2);

    public abstract void onSizeChange(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void setAdditionalOcclusionEdge(OcclusionEdge occlusionEdge, int i, String str);

    public abstract void setDefaultProminenceAlgorithm(ProminenceAlgorithm prominenceAlgorithm);

    public abstract void setEnableProminence(boolean z, ProminenceAlgorithm prominenceAlgorithm);

    public abstract void setEnableProminenceForGroup(String str, boolean z);

    public abstract void setIgnoreNonVisibleCells(boolean z);

    public abstract void setOcclusionEdge(OcclusionEdge occlusionEdge, int i, String str);

    public abstract void setOcclusionRect(Rect rect, String str);

    public abstract void setProminenceAlgorithmContext(ProminenceAlgorithm prominenceAlgorithm, IntersectionPropertiesOuterClass$ProminenceAlgorithmContext intersectionPropertiesOuterClass$ProminenceAlgorithmContext);

    public abstract void setProminenceAlgorithmForGroup(String str, ProminenceAlgorithm prominenceAlgorithm);

    public abstract void setRtl(boolean z);

    public abstract IntersectionSubscription subscribe(String str, IntersectionObserver intersectionObserver);
}
