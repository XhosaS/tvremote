package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DebuggerClient {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends DebuggerClient {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native DebuggerClient create(String str, String str2, String str3, Executor executor, DebuggerCallback debuggerCallback);

        public static native void nativeDestroy(long j);

        private native long native_createEventId(long j);

        private native void native_sendCommandEndEvent(long j, long j2);

        private native long native_sendCommandStartEvent(long j, CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState);

        private native boolean native_sendLog(long j, byte[] bArr);

        private native boolean native_sendStoreSnapshot(long j, byte[] bArr);

        private native boolean native_sendTimelineEvent(long j, byte[] bArr);

        private native boolean native_sendViewSnapshotList(long j, byte[] bArr);

        private native void native_shutdown(long j);

        private native boolean native_traverseViewHierarchyResponse(long j, byte[] bArr);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public long createEventId() {
            return native_createEventId(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public void sendCommandEndEvent(long j) {
            native_sendCommandEndEvent(this.nativeRef, j);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public long sendCommandStartEvent(CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState) {
            return native_sendCommandStartEvent(this.nativeRef, commandOuterClass$Command, senderStateOuterClass$SenderState);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean sendLog(byte[] bArr) {
            return native_sendLog(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean sendStoreSnapshot(byte[] bArr) {
            return native_sendStoreSnapshot(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean sendTimelineEvent(byte[] bArr) {
            return native_sendTimelineEvent(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean sendViewSnapshotList(byte[] bArr) {
            return native_sendViewSnapshotList(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public void shutdown() {
            native_shutdown(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean traverseViewHierarchyResponse(byte[] bArr) {
            return native_traverseViewHierarchyResponse(this.nativeRef, bArr);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static DebuggerClient create(String str, String str2, String str3, Executor executor, DebuggerCallback debuggerCallback) {
        return CppProxy.create(str, str2, str3, executor, debuggerCallback);
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

    public abstract long createEventId();

    public abstract void sendCommandEndEvent(long j);

    public abstract long sendCommandStartEvent(CommandOuterClass$Command commandOuterClass$Command, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState);

    public abstract boolean sendLog(byte[] bArr);

    public abstract boolean sendStoreSnapshot(byte[] bArr);

    public abstract boolean sendTimelineEvent(byte[] bArr);

    public abstract boolean sendViewSnapshotList(byte[] bArr);

    public abstract void shutdown();

    public abstract boolean traverseViewHierarchyResponse(byte[] bArr);
}
