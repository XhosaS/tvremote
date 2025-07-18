package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lbw implements vug {
    COLOR_UNSPECIFIED(0),
    COLOR_SOLID(1),
    COLOR_GRADIENT(2),
    COLOR_UI_THEME(3),
    UNRECOGNIZED(-1);

    private final int g;

    lbw(int i) {
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
