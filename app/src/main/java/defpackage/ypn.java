package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ypn implements abxf {
    DATA_SOURCE_UNKNOWN(0),
    CACHE(1),
    SERVER(2);

    private final int e;

    ypn(int i) {
        this.e = i;
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
