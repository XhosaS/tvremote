package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tsw implements abxf {
    PRIVILEGED_FEATURE_UNSPECIFIED(0),
    PRIVILEGED_FEATURE_S3_DIARIZATION(1),
    PRIVILEGED_FEATURE_PER_APP_CONCURRENCY(2),
    PRIVILEGED_FEATURE_AICORE_ALWAYS_FALLBACK(3),
    PRIVILEGED_FEATURE_TRANSLATION(4),
    PRIVILEGED_FEATURE_CONVERSATION(5),
    PRIVILEGED_FEATURE_AICORE_INTERNAL_DEBUG_LOGGING(6),
    UNRECOGNIZED(-1);

    private final int j;

    tsw(int i2) {
        this.j = i2;
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
