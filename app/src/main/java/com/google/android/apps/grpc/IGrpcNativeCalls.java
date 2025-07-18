package com.google.android.apps.grpc;

/* compiled from: PG */
/* loaded from: classes.dex */
interface IGrpcNativeCalls {
    int getGrpcSocketFd(String str);

    void grpcIpcSocketClientOnError(long j);

    void grpcIpcSocketClientOnFileDescriptor(long j, int i);
}
