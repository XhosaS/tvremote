package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lae implements vug {
    OFF(0),
    LIGHT(1),
    MODERATE(2),
    STRICT(3),
    UNRECOGNIZED(-1);

    private final int g;

    lae(int i) {
        this.g = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
