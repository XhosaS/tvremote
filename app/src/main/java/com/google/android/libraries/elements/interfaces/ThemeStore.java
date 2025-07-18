package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ThemeStore {
    public static final long INVALID_SUBSCRIPTION = -1;
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends ThemeStore {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native ThemeStore create(long j);

        public static native void nativeDestroy(long j);

        private native StatusOr native_getCurrentThemeBytes(long j, String str);

        private native StatusOr native_getForcedThemeBytes(long j, String str, long j2);

        private native ThemeLoaderProxy native_getThemeLoader(long j);

        private native StatusOr native_getThemePayloadBytes(long j, String str);

        private native Status native_setActiveTheme(long j, long j2);

        private native void native_setPreloader(long j, ResourcePreloader resourcePreloader);

        private native long native_subscribe(long j, ThemeStoreObserver themeStoreObserver);

        private native void native_unsubscribe(long j, long j2);

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

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public StatusOr getCurrentThemeBytes(String str) {
            return native_getCurrentThemeBytes(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public StatusOr getForcedThemeBytes(String str, long j) {
            return native_getForcedThemeBytes(this.nativeRef, str, j);
        }

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public ThemeLoaderProxy getThemeLoader() {
            return native_getThemeLoader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public StatusOr getThemePayloadBytes(String str) {
            return native_getThemePayloadBytes(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public Status setActiveTheme(long j) {
            return native_setActiveTheme(this.nativeRef, j);
        }

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public void setPreloader(ResourcePreloader resourcePreloader) {
            native_setPreloader(this.nativeRef, resourcePreloader);
        }

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public long subscribe(ThemeStoreObserver themeStoreObserver) {
            return native_subscribe(this.nativeRef, themeStoreObserver);
        }

        @Override // com.google.android.libraries.elements.interfaces.ThemeStore
        public void unsubscribe(long j) {
            native_unsubscribe(this.nativeRef, j);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static ThemeStore create(long j) {
        return CppProxy.create(j);
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

    public abstract StatusOr getCurrentThemeBytes(String str);

    public abstract StatusOr getForcedThemeBytes(String str, long j);

    public abstract ThemeLoaderProxy getThemeLoader();

    public abstract StatusOr getThemePayloadBytes(String str);

    public abstract Status setActiveTheme(long j);

    public abstract void setPreloader(ResourcePreloader resourcePreloader);

    public abstract long subscribe(ThemeStoreObserver themeStoreObserver);

    public abstract void unsubscribe(long j);
}
