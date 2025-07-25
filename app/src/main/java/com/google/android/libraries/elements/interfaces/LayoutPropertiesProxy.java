package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class LayoutPropertiesProxy {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends LayoutPropertiesProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native AlignItems native_alignContent(long j);

        private native AlignItems native_alignItems(long j);

        private native AlignItems native_alignSelf(long j);

        private native float native_aspectRatio(long j);

        private native DimensionProxy native_flexBasis(long j);

        private native FlexDirection native_flexDirection(long j);

        private native float native_flexGrow(long j);

        private native float native_flexShrink(long j);

        private native FlexWrap native_flexWrap(long j);

        private native boolean native_hasAspectRatio(long j);

        private native boolean native_hasFlexGrow(long j);

        private native boolean native_hasFlexShrink(long j);

        private native DimensionProxy native_height(long j);

        private native JustifyContent native_justifyContent(long j);

        private native DimensionEdgesProxy native_margin(long j);

        private native DimensionProxy native_maxHeight(long j);

        private native DimensionProxy native_maxWidth(long j);

        private native DimensionProxy native_minHeight(long j);

        private native DimensionProxy native_minWidth(long j);

        private native DimensionEdgesProxy native_padding(long j);

        private native DimensionEdgesProxy native_position(long j);

        private native Position native_positionType(long j);

        private native SemanticContentAttribute native_semanticContentAttribute(long j);

        private native DimensionProxy native_width(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public AlignItems alignContent() {
            return native_alignContent(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public AlignItems alignItems() {
            return native_alignItems(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public AlignItems alignSelf() {
            return native_alignSelf(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public float aspectRatio() {
            return native_aspectRatio(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionProxy flexBasis() {
            return native_flexBasis(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public FlexDirection flexDirection() {
            return native_flexDirection(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public float flexGrow() {
            return native_flexGrow(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public float flexShrink() {
            return native_flexShrink(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public FlexWrap flexWrap() {
            return native_flexWrap(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public boolean hasAspectRatio() {
            return native_hasAspectRatio(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public boolean hasFlexGrow() {
            return native_hasFlexGrow(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public boolean hasFlexShrink() {
            return native_hasFlexShrink(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionProxy height() {
            return native_height(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public JustifyContent justifyContent() {
            return native_justifyContent(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionEdgesProxy margin() {
            return native_margin(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionProxy maxHeight() {
            return native_maxHeight(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionProxy maxWidth() {
            return native_maxWidth(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionProxy minHeight() {
            return native_minHeight(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionProxy minWidth() {
            return native_minWidth(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionEdgesProxy padding() {
            return native_padding(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionEdgesProxy position() {
            return native_position(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public Position positionType() {
            return native_positionType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public SemanticContentAttribute semanticContentAttribute() {
            return native_semanticContentAttribute(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.LayoutPropertiesProxy
        public DimensionProxy width() {
            return native_width(this.nativeRef);
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

    public abstract AlignItems alignContent();

    public abstract AlignItems alignItems();

    public abstract AlignItems alignSelf();

    public abstract float aspectRatio();

    public abstract DimensionProxy flexBasis();

    public abstract FlexDirection flexDirection();

    public abstract float flexGrow();

    public abstract float flexShrink();

    public abstract FlexWrap flexWrap();

    public abstract boolean hasAspectRatio();

    public abstract boolean hasFlexGrow();

    public abstract boolean hasFlexShrink();

    public abstract DimensionProxy height();

    public abstract JustifyContent justifyContent();

    public abstract DimensionEdgesProxy margin();

    public abstract DimensionProxy maxHeight();

    public abstract DimensionProxy maxWidth();

    public abstract DimensionProxy minHeight();

    public abstract DimensionProxy minWidth();

    public abstract DimensionEdgesProxy padding();

    public abstract DimensionEdgesProxy position();

    public abstract Position positionType();

    public abstract SemanticContentAttribute semanticContentAttribute();

    public abstract DimensionProxy width();
}
