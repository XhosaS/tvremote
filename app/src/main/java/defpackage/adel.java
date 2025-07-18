package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adel implements abxf {
    UNKNOWN_TYPE(0),
    DISMISS_ROW(1),
    DISMISS_PAGE(2);

    private final int e;

    adel(int i) {
        this.e = i;
    }

    public static adel b(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return DISMISS_ROW;
        }
        if (i != 2) {
            return null;
        }
        return DISMISS_PAGE;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
