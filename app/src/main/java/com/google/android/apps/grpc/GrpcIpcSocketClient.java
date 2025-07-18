package com.google.android.apps.grpc;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface GrpcIpcSocketClient {
    public static final String EXTRA_REPLY_TO_BINDER = "reply-to";
    public static final String EXTRA_REQUEST_SOCKET = "request-socket";
    public static final String EXTRA_REQUEST_SOCKET_URI = "request-uri";
    public static final int WHAT_GET_GRPC_IPC_SOCKET = 1;

    void getGrpcIpcSocket();

    void unbind();
}
