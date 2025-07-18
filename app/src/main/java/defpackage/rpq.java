package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rpq implements rqp {
    FLOW_TYPE_UNKNOWN(0),
    NONE(1),
    AUDIO_ROUTE_CONNECT(101),
    AUDIO_ROUTE_DISCONNECT(102),
    AUDIO_LISTENING(103),
    AUDIO_BUFFER(104),
    AUDIOTACTILE_FEEDBACK(105),
    AUDIO_FOCUS_ACQUIRE(106),
    AUDIO_FOCUS_RELEASE(107),
    AUDIO_ROUTE_INNER_CONNECT(108),
    AUDIO_PLAYBACK(109);

    private final int m;

    rpq(int i) {
        this.m = i;
    }

    @Override // defpackage.rqp
    public final int a() {
        return this.m;
    }
}
