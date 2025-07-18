package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CommandRunContext {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends CommandRunContext {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native void nativeDestroy(long j);

        private native BlockRegistryProvider native_blockRegistryProvider(long j);

        private native String native_blockRegistryRef(long j);

        private native ByteStore native_byteStore(long j);

        private native DebuggerClient native_debuggerClient(long j);

        private native boolean native_enableV2(long j);

        private native LoggingDelegate native_logger(long j);

        private native SenderStateOuterClass$SenderState native_senderState(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
        public BlockRegistryProvider blockRegistryProvider() {
            return native_blockRegistryProvider(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
        public String blockRegistryRef() {
            return native_blockRegistryRef(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
        public ByteStore byteStore() {
            return native_byteStore(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
        public DebuggerClient debuggerClient() {
            return native_debuggerClient(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
        public boolean enableV2() {
            return native_enableV2(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
        public LoggingDelegate logger() {
            return native_logger(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
        public SenderStateOuterClass$SenderState senderState() {
            return native_senderState(this.nativeRef);
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

    public abstract BlockRegistryProvider blockRegistryProvider();

    public abstract String blockRegistryRef();

    public abstract ByteStore byteStore();

    public abstract DebuggerClient debuggerClient();

    public abstract boolean enableV2();

    public abstract LoggingDelegate logger();

    public abstract SenderStateOuterClass$SenderState senderState();
}
