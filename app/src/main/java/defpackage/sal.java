package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum sal implements abxf {
    BISTO(0),
    SODA(2),
    CAR(3),
    GACS(4),
    TEST(100);

    private final int g;

    sal(int i) {
        this.g = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
