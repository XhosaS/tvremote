package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ycp implements abxf {
    VOICE_MATCH_UNKNOWN(0),
    VOICE_MATCH_ACCEPTED(1),
    VOICE_MATCH_DENIED(2),
    VOICE_MATCH_SKIP_REASON_LOAD_FAILED(3),
    VOICE_MATCH_SKIP_REASON_NOT_ENOUGH_UTTERANCES(4),
    VOICE_MATCH_SKIP_REASON_FEATURE_DISABLED(5);

    public final int g;

    ycp(int i) {
        this.g = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
