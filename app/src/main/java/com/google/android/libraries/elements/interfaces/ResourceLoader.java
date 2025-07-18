package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ResourceLoader {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ResourceLoader {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native StatusOr create(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native StatusOr createWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider);

        public static native StatusOr createWithCache(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native StatusOr createWithCacheWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider);

        public static native ResourceLoader createWithDefaultConfig(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate);

        public static native ResourceLoader createWithDefaultConfigWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, WasmTemplateProvider wasmTemplateProvider);

        public static native void enableEkoStoreParsedCallTransforms();

        public static native void nativeDestroy(long j);

        private native Status native_cacheResources(long j);

        private native CertificateTracker native_getCertificateTracker(long j);

        private native StatusOr native_getDiskCacheResourceIds(long j);

        private native ResourceMetadataTracker native_getMetadataTracker(long j);

        private native ResourcePreloader native_getPreloader(long j);

        private native byte[] native_getServingContext(long j);

        private native Status native_handleOmittedResources(long j, TreeSet treeSet, boolean z);

        private native Status native_handleResources(long j, ArrayList arrayList);

        private native boolean native_isCacheValid(long j);

        private native void native_registerMissingResourceHandler(long j, MissingResourceHandler missingResourceHandler);

        private native void native_registerVerifier(long j, String str, StatusOr statusOr);

        private native void native_updateResourceStatus(long j, ResourceCheck resourceCheck);

        private native Status native_updateResources(long j, ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);

        public static native void setEkoCallTransformCacheCapacity(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status cacheResources() {
            return native_cacheResources(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public CertificateTracker getCertificateTracker() {
            return native_getCertificateTracker(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public StatusOr getDiskCacheResourceIds() {
            return native_getDiskCacheResourceIds(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public ResourceMetadataTracker getMetadataTracker() {
            return native_getMetadataTracker(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public ResourcePreloader getPreloader() {
            return native_getPreloader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public byte[] getServingContext() {
            return native_getServingContext(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status handleOmittedResources(TreeSet treeSet, boolean z) {
            return native_handleOmittedResources(this.nativeRef, treeSet, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status handleResources(ArrayList arrayList) {
            return native_handleResources(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public boolean isCacheValid() {
            return native_isCacheValid(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler) {
            native_registerMissingResourceHandler(this.nativeRef, missingResourceHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void registerVerifier(String str, StatusOr statusOr) {
            native_registerVerifier(this.nativeRef, str, statusOr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void updateResourceStatus(ResourceCheck resourceCheck) {
            native_updateResourceStatus(this.nativeRef, resourceCheck);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback) {
            return native_updateResources(this.nativeRef, arrayList, resourceLoaderCallback);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static StatusOr create(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.create(controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate, resourceLoaderConfig);
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

    public static StatusOr createWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithBlocks(controllerModuleLoader, blocksContainerLoaderProxy, themeLoaderProxy, capabilitiesLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, resourceLoaderConfig, wasmTemplateProvider);
    }

    public static StatusOr createWithCache(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.createWithCache(controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate, cacheStrategyDelegate, resourceLoaderConfig);
    }

    public static StatusOr createWithCacheWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithCacheWithBlocks(controllerModuleLoader, blocksContainerLoaderProxy, themeLoaderProxy, capabilitiesLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, cacheStrategyDelegate, resourceLoaderConfig, wasmTemplateProvider);
    }

    public static ResourceLoader createWithDefaultConfig(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate) {
        return CppProxy.createWithDefaultConfig(controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate);
    }

    public static ResourceLoader createWithDefaultConfigWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithDefaultConfigWithBlocks(controllerModuleLoader, blocksContainerLoaderProxy, themeLoaderProxy, capabilitiesLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, wasmTemplateProvider);
    }

    public static void enableEkoStoreParsedCallTransforms() {
        CppProxy.enableEkoStoreParsedCallTransforms();
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

    public static void setEkoCallTransformCacheCapacity(long j) {
        CppProxy.setEkoCallTransformCacheCapacity(j);
    }

    public abstract Status cacheResources();

    public abstract CertificateTracker getCertificateTracker();

    public abstract StatusOr getDiskCacheResourceIds();

    public abstract ResourceMetadataTracker getMetadataTracker();

    public abstract ResourcePreloader getPreloader();

    public abstract byte[] getServingContext();

    public abstract Status handleOmittedResources(TreeSet treeSet, boolean z);

    public abstract Status handleResources(ArrayList arrayList);

    public abstract boolean isCacheValid();

    public abstract void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler);

    public abstract void registerVerifier(String str, StatusOr statusOr);

    public abstract void updateResourceStatus(ResourceCheck resourceCheck);

    public abstract Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);
}
