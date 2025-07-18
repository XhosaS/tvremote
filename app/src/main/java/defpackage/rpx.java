package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpx {
    public static final rqo a = new rqn(1673);
    public static final int[] b = new int[0];
    public static final yzq c = yzq.q(1, 1673);
    public static final String d = "com.google.android.libraries.search.appflows.apps.searchtranscriptionandroid.FlowEventsProto.FlowEvent";

    public static final rqw a() {
        return new rqw(new rpz("INTENT_API_FINISH", false, ypv.a, 103, rpy.TRANSCRIPTION_INTENT_API, new int[]{101, 102}, a, c, d));
    }

    public static final rqw b() {
        return new rqw(new rpz("RECOGNITION_GRPC_SERVICE_FINISH", false, ypv.a, 201, rpy.TRANSCRIPTION_RECOGNITION_GRPC_SERVICE, new int[]{198}, a, c, d));
    }

    public static final rqw c() {
        return new rqw(new rpz("RECOGNITION_SERVICE_FINISH", false, ypv.a, 109, rpy.TRANSCRIPTION_RECOGNITION_SERVICE, new int[]{108}, a, c, d));
    }
}
