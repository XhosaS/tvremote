package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Component {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends Component {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;
        private final AtomicBoolean registeredWithNativeObjectManager;

        public static native StatusOr create(ByteBuffer byteBuffer, SubscriptionProcessorResolver subscriptionProcessorResolver, ComponentSharedResources componentSharedResources, ComponentConfig componentConfig, ComponentState componentState, SubscriptionResources subscriptionResources);

        public static native StatusOr createWithElement(HybridElement hybridElement, SubscriptionProcessorResolver subscriptionProcessorResolver, ComponentSharedResources componentSharedResources, ComponentConfig componentConfig, ComponentState componentState, SubscriptionResources subscriptionResources);

        public static native int getInstanceCount();

        public static native int getUndisposedInstanceCount();

        public static native void nativeDestroy(long j);

        private native byte[] native_debugLatestModel(long j);

        private native Status native_debugSetModel(long j, byte[] bArr);

        private native Status native_debugSetModelUpb(long j, byte[] bArr);

        private native Status native_dispose(long j);

        private native int native_getCompletedMaterializationCount(long j);

        private native HybridElement native_getElement(long j);

        private native int native_getMaterializationCount(long j);

        private native String native_getTemplateUri(long j);

        private native boolean native_isDirty(long j);

        private native boolean native_isObservable(long j);

        private native byte[] native_latestSubscriptionConfig(long j);

        private native void native_markDirtyForHotReload(long j);

        private native StatusOr native_materialize(long j, boolean z);

        private native StatusOr native_materializeWithResult(long j, boolean z);

        private native Status native_setElement(long j, HybridElement hybridElement);

        private native void native_setObserver(long j, ComponentObserver componentObserver);

        public void _djinni_private_destroy() {
            if (this.registeredWithNativeObjectManager.get() || this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public byte[] debugLatestModel() {
            return native_debugLatestModel(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public Status debugSetModel(byte[] bArr) {
            return native_debugSetModel(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public Status debugSetModelUpb(byte[] bArr) {
            return native_debugSetModelUpb(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public Status dispose() {
            return native_dispose(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            if (this.registeredWithNativeObjectManager.get()) {
                return;
            }
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public int getCompletedMaterializationCount() {
            return native_getCompletedMaterializationCount(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public HybridElement getElement() {
            return native_getElement(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public int getMaterializationCount() {
            return native_getMaterializationCount(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public String getTemplateUri() {
            return native_getTemplateUri(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public boolean isDirty() {
            return native_isDirty(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public boolean isObservable() {
            return native_isObservable(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public byte[] latestSubscriptionConfig() {
            return native_latestSubscriptionConfig(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public void markDirtyForHotReload() {
            native_markDirtyForHotReload(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public StatusOr materialize(boolean z) {
            return native_materialize(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public StatusOr materializeWithResult(boolean z) {
            return native_materializeWithResult(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public Status setElement(HybridElement hybridElement) {
            return native_setElement(this.nativeRef, hybridElement);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public void setObserver(ComponentObserver componentObserver) {
            native_setObserver(this.nativeRef, componentObserver);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            this.registeredWithNativeObjectManager = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static StatusOr create(ByteBuffer byteBuffer, SubscriptionProcessorResolver subscriptionProcessorResolver, ComponentSharedResources componentSharedResources, ComponentConfig componentConfig, ComponentState componentState, SubscriptionResources subscriptionResources) {
        return CppProxy.create(byteBuffer, subscriptionProcessorResolver, componentSharedResources, componentConfig, componentState, subscriptionResources);
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

    public static StatusOr createWithElement(HybridElement hybridElement, SubscriptionProcessorResolver subscriptionProcessorResolver, ComponentSharedResources componentSharedResources, ComponentConfig componentConfig, ComponentState componentState, SubscriptionResources subscriptionResources) {
        return CppProxy.createWithElement(hybridElement, subscriptionProcessorResolver, componentSharedResources, componentConfig, componentState, subscriptionResources);
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

    public static int getInstanceCount() {
        return CppProxy.getInstanceCount();
    }

    public static int getUndisposedInstanceCount() {
        return CppProxy.getUndisposedInstanceCount();
    }

    public abstract byte[] debugLatestModel();

    public abstract Status debugSetModel(byte[] bArr);

    public abstract Status debugSetModelUpb(byte[] bArr);

    public abstract Status dispose();

    public abstract int getCompletedMaterializationCount();

    public abstract HybridElement getElement();

    public abstract int getMaterializationCount();

    public abstract String getTemplateUri();

    public abstract boolean isDirty();

    public abstract boolean isObservable();

    public abstract byte[] latestSubscriptionConfig();

    public abstract void markDirtyForHotReload();

    public abstract StatusOr materialize(boolean z);

    public abstract StatusOr materializeWithResult(boolean z);

    public abstract Status setElement(HybridElement hybridElement);

    public abstract void setObserver(ComponentObserver componentObserver);
}
