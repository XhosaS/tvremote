package com.google.android.apps.grpc;

import com.google.assistant.base.annotations.JNINamespace;

/* compiled from: PG */
@JNINamespace("chromecast")
/* loaded from: classes.dex */
final class GrpcNativeCallsGoogle3 implements IGrpcNativeCalls {
    private static native int nativeGetGrpcSocketFd(String str);

    private static native void nativeGrpcIpcSocketClientOnError(long j);

    private static native void nativeGrpcIpcSocketClientOnFileDescriptor(long j, int i);

    @Override // com.google.android.apps.grpc.IGrpcNativeCalls
    public int getGrpcSocketFd(String str) {
        return nativeGetGrpcSocketFd(str);
    }

    @Override // com.google.android.apps.grpc.IGrpcNativeCalls
    public void grpcIpcSocketClientOnError(long j) {
        nativeGrpcIpcSocketClientOnError(j);
    }

    @Override // com.google.android.apps.grpc.IGrpcNativeCalls
    public void grpcIpcSocketClientOnFileDescriptor(long j, int i) {
        nativeGrpcIpcSocketClientOnFileDescriptor(j, i);
    }
}
