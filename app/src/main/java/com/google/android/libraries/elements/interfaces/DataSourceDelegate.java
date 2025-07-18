package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.wu;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DataSourceDelegate {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends DataSourceDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native StatusOr native_elementAtIndex(long j, int i);

        private native StatusOr native_elementBytesAtIndex(long j, int i);

        private native StatusOr native_elementBytesByKey(long j, String str);

        private native ArrayList native_identifiers(long j);

        private native Status native_loadMore(long j);

        private native Status native_moveItem(long j, int i, int i2);

        private native Status native_reload(long j);

        private native Status native_removeItem(long j, int i);

        private native int native_size(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public void dispose() {
            native_dispose(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public StatusOr elementAtIndex(int i) {
            return native_elementAtIndex(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public StatusOr elementBytesAtIndex(int i) {
            return native_elementBytesAtIndex(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public StatusOr elementBytesByKey(String str) {
            return native_elementBytesByKey(this.nativeRef, str);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public ArrayList identifiers() {
            return native_identifiers(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public Status loadMore() {
            return native_loadMore(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public Status moveItem(int i, int i2) {
            return native_moveItem(this.nativeRef, i, i2);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public Status reload() {
            return native_reload(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public Status removeItem(int i) {
            return native_removeItem(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public int size() {
            return native_size(this.nativeRef);
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

    public abstract void dispose();

    public abstract StatusOr elementAtIndex(int i);

    public abstract StatusOr elementBytesAtIndex(int i);

    public abstract StatusOr elementBytesByKey(String str);

    public abstract ArrayList identifiers();

    public abstract Status loadMore();

    public abstract Status moveItem(int i, int i2);

    public abstract Status reload();

    public abstract Status removeItem(int i);

    public abstract int size();
}
