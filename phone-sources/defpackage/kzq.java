package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum kzq implements vug {
    UNKNOWN_TRACK_TYPE(0),
    PRIMARY(1),
    COMMENTARY(2),
    PRIMARY_DESCRIPTIVE(3),
    NARRATION(4),
    UNRECOGNIZED(-1);

    private final int h;

    kzq(int i) {
        this.h = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
