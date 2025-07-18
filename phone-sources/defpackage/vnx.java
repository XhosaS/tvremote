package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vnx implements vug {
    PLACEMENT_UNSPECIFIED(0),
    ABOVE(1),
    BELOW(2);

    private final int e;

    vnx(int i) {
        this.e = i;
    }

    public static vnx b(int i) {
        if (i == 0) {
            return PLACEMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return ABOVE;
        }
        if (i != 2) {
            return null;
        }
        return BELOW;
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
