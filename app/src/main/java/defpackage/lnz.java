package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lnz implements abxf {
    UNKNOWN(0),
    NONE(1),
    EXACT(2),
    SUBSTRING(3),
    HEURISTIC(4),
    SHEEPDOG_ELIGIBLE(5);

    public final int g;

    lnz(int i) {
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
