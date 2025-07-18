package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adoq implements abxf {
    DEFAULT_OPTIMIZE_QUALITY(0),
    OPTIMIZE_LATENCY(1);

    public final int c;

    adoq(int i) {
        this.c = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
