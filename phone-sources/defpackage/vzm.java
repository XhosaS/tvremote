package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vzm implements vug {
    AUDIO_CAPABILITY_UNSPECIFIED(0),
    CHANNELS_5_1(1),
    UNRECOGNIZED(-1);

    private final int e;

    vzm(int i) {
        this.e = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
