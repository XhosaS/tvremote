package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DevResourceManager {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends DevResourceManager {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native StatusOr native_getAvailableResourceIds(long j);

        private native StatusOr native_getTemplateDetails(long j, String str);

        private native StatusOr native_getTemplateFixture(long j, String str, String str2);

        private native Status native_loadResource(long j, String str);

        private native void native_logError(long j, String str);

        private native String native_resolveIdentifier(long j, String str);

        private native void native_setBundleChangeListener(long j, GlobalBundleChangeListener globalBundleChangeListener);

        private native DevResourceSubscription native_subscribe(long j, String str, DevResourceObserver devResourceObserver);

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

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public StatusOr getAvailableResourceIds() {
            return native_getAvailableResourceIds(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public StatusOr getTemplateDetails(String str) {
            return native_getTemplateDetails(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public StatusOr getTemplateFixture(String str, String str2) {
            return native_getTemplateFixture(this.nativeRef, str, str2);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public Status loadResource(String str) {
            return native_loadResource(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public void logError(String str) {
            native_logError(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public String resolveIdentifier(String str) {
            return native_resolveIdentifier(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public void setBundleChangeListener(GlobalBundleChangeListener globalBundleChangeListener) {
            native_setBundleChangeListener(this.nativeRef, globalBundleChangeListener);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public DevResourceSubscription subscribe(String str, DevResourceObserver devResourceObserver) {
            return native_subscribe(this.nativeRef, str, devResourceObserver);
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

    public abstract StatusOr getAvailableResourceIds();

    public abstract StatusOr getTemplateDetails(String str);

    public abstract StatusOr getTemplateFixture(String str, String str2);

    public abstract Status loadResource(String str);

    public abstract void logError(String str);

    public abstract String resolveIdentifier(String str);

    public abstract void setBundleChangeListener(GlobalBundleChangeListener globalBundleChangeListener);

    public abstract DevResourceSubscription subscribe(String str, DevResourceObserver devResourceObserver);
}
