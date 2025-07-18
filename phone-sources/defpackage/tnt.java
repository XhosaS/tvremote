package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tnt implements vug {
    NONE(0),
    LC3(1);

    private final int d;

    tnt(int i) {
        this.d = i;
    }

    public static tnt b(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i != 1) {
            return null;
        }
        return LC3;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
