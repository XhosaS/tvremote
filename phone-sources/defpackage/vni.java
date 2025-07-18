package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vni implements vug {
    FONT_SIZE_UNSPECIFIED(0),
    SMALL(1),
    LARGE(2);

    private final int e;

    vni(int i) {
        this.e = i;
    }

    public static vni b(int i) {
        if (i == 0) {
            return FONT_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return SMALL;
        }
        if (i != 2) {
            return null;
        }
        return LARGE;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
