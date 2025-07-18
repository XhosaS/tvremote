package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpp {
    public static final rqo a = new rqn(2759);
    public static final int[] b = new int[0];
    public static final yzq c = yzq.u(6, 7, 1673, 1739, 1770, 1827, 1855, 1856, 1870, 1909, 2369, 2512, 2711, 2734, 2759, 2895, 2974);
    public static final String d = "com.google.android.libraries.search.appflows.apps.audiolibraryandroid.FlowEventsProto.FlowEvent";

    public static final rqs a() {
        return new rqt(new rpz("AUDIO_BUFFER_COPY_INTERRUPTED", false, ypv.a, 112, rpq.NONE, b, a, c, d));
    }

    public static final rqs b() {
        return new rqt(new rpz("AUDIO_BUFFER_COUNTER_OVERFLOW", false, ypv.a, 115, rpq.NONE, b, a, c, d));
    }

    public static final rqs c() {
        return new rqt(new rpz("AUDIO_BUFFER_CREATED", true, yqt.i(3600000L), 110, rpq.AUDIO_BUFFER, b, a, c, d));
    }

    public static final rqs d() {
        return new rqt(new rpz("AUDIO_BUFFER_OVERFLOW", false, ypv.a, 114, rpq.NONE, b, a, c, d));
    }

    public static final rqs e() {
        return new rqt(new rpz("AUDIO_BUFFER_READ_ERROR", false, ypv.a, 113, rpq.NONE, b, a, c, d));
    }

    public static final rqs f() {
        return new rqt(new rpz("AUDIO_BYTES_RECEIVER_REGISTERED", false, ypv.a, 111, rpq.NONE, b, a, c, d));
    }

    public static final rqs g() {
        return new rqt(new rpz("AUDIO_RECORD_PREFERRED_DEVICE_FETCHED", false, ypv.a, 143, rpq.NONE, b, a, c, d));
    }

    public static final rqs h() {
        return new rqt(new rpz("AUDIO_RECORD_PREFERRED_DEVICE_SET", false, ypv.a, 145, rpq.NONE, b, a, c, d));
    }

    public static final rqw i() {
        return new rqw(new rpz("AUDIO_BUFFER_CLOSED", false, ypv.a, 116, rpq.AUDIO_BUFFER, new int[]{110}, a, c, d));
    }
}
