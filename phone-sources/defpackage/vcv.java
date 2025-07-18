package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vcv implements vug {
    COLOR_UNSPECIFIED(0),
    COLOR_SOLID(1),
    COLOR_GRADIENT(2),
    COLOR_UI_THEME(3),
    UNRECOGNIZED(-1);

    private final int g;

    vcv(int i) {
        this.g = i;
    }

    public static vcv b(int i) {
        if (i == 0) {
            return COLOR_UNSPECIFIED;
        }
        if (i == 1) {
            return COLOR_SOLID;
        }
        if (i == 2) {
            return COLOR_GRADIENT;
        }
        if (i != 3) {
            return null;
        }
        return COLOR_UI_THEME;
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
