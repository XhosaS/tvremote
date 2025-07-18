package com.google.android.libraries.elements.interfaces;

import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ResourceMetadataTracker {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ResourceMetadataTracker {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native void native_addMetadata(long j, ResourceMetadata resourceMetadata);

        private native ResourceMetadata native_getResourceMetadata(long j, String str);

        private native TreeSet native_getTransitiveDeps(long j, TreeSet treeSet);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public void addMetadata(ResourceMetadata resourceMetadata) {
            native_addMetadata(this.nativeRef, resourceMetadata);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public ResourceMetadata getResourceMetadata(String str) {
            return native_getResourceMetadata(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public TreeSet getTransitiveDeps(TreeSet treeSet) {
            return native_getTransitiveDeps(this.nativeRef, treeSet);
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

    public abstract void addMetadata(ResourceMetadata resourceMetadata);

    public abstract ResourceMetadata getResourceMetadata(String str);

    public abstract TreeSet getTransitiveDeps(TreeSet treeSet);
}
