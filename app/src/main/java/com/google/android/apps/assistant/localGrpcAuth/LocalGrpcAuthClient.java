package com.google.android.apps.assistant.localGrpcAuth;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface LocalGrpcAuthClient {
    public static final String EXTRA_REPLY_TO_BINDER = "reply-to";
    public static final String EXTRA_REQUEST_TOKEN_STRING = "request-token";
    public static final int WHAT_GET_LOCAL_CLOUDCAST_SERVICE_INFO = 1;

    /* compiled from: PG */
    public interface Callback {
        void onError();

        void onResult(int i, String str);
    }

    void getLocalCloudcastServiceInfo(Callback callback);

    void unbind();
}
