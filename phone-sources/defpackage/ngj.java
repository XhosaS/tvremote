package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ngj implements vug {
    UNKNOWN(0),
    STARTUP(1),
    TELEDOCTOR(2),
    UNRECOGNIZED(-1);

    private final int f;

    ngj(int i) {
        this.f = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
