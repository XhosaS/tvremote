package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DirectUpdateExecutor {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends DirectUpdateExecutor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native Status native_applyChangeAnimatedVectorTypeAnimationProgress(long j, float f);

        private native Status native_applyChangeStylePropertiesBackgroundColor(long j, long j2);

        private native Status native_applyChangeStylePropertiesOpacity(long j, float f);

        private native Status native_applyChangeStylePropertiesRotation(long j, float f);

        private native Status native_applyChangeStylePropertiesScale(long j, float f);

        private native Status native_applyChangeStylePropertiesScaleX(long j, float f);

        private native Status native_applyChangeStylePropertiesScaleY(long j, float f);

        private native Status native_applyChangeStylePropertiesTranslation(long j, float f, float f2);

        private native Status native_applyChangeStylePropertiesTranslationX(long j, float f);

        private native Status native_applyChangeStylePropertiesTranslationY(long j, float f);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeAnimatedVectorTypeAnimationProgress(float f) {
            return native_applyChangeAnimatedVectorTypeAnimationProgress(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesBackgroundColor(long j) {
            return native_applyChangeStylePropertiesBackgroundColor(this.nativeRef, j);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesOpacity(float f) {
            return native_applyChangeStylePropertiesOpacity(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesRotation(float f) {
            return native_applyChangeStylePropertiesRotation(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesScale(float f) {
            return native_applyChangeStylePropertiesScale(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesScaleX(float f) {
            return native_applyChangeStylePropertiesScaleX(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesScaleY(float f) {
            return native_applyChangeStylePropertiesScaleY(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesTranslation(float f, float f2) {
            return native_applyChangeStylePropertiesTranslation(this.nativeRef, f, f2);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesTranslationX(float f) {
            return native_applyChangeStylePropertiesTranslationX(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public Status applyChangeStylePropertiesTranslationY(float f) {
            return native_applyChangeStylePropertiesTranslationY(this.nativeRef, f);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
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

    public abstract Status applyChangeAnimatedVectorTypeAnimationProgress(float f);

    public abstract Status applyChangeStylePropertiesBackgroundColor(long j);

    public abstract Status applyChangeStylePropertiesOpacity(float f);

    public abstract Status applyChangeStylePropertiesRotation(float f);

    public abstract Status applyChangeStylePropertiesScale(float f);

    public abstract Status applyChangeStylePropertiesScaleX(float f);

    public abstract Status applyChangeStylePropertiesScaleY(float f);

    public abstract Status applyChangeStylePropertiesTranslation(float f, float f2);

    public abstract Status applyChangeStylePropertiesTranslationX(float f);

    public abstract Status applyChangeStylePropertiesTranslationY(float f);
}
