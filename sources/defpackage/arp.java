package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arp implements arr {
    private final cyq a;
    private final Comparable b;

    public arp(cyq cyqVar, Comparable comparable) {
        this.a = cyqVar;
        this.b = comparable;
    }

    @Override // defpackage.arr
    public final long a() {
        int iL;
        cyq cyqVar = this.a;
        if (cyqVar.A()) {
            iL = cyqVar.l(null);
            if (iL < 0) {
                throw new IllegalStateException(b.e(iL, "serialized size must be non-negative, was "));
            }
        } else {
            int iL2 = cyqVar.u & Integer.MAX_VALUE;
            if (iL2 == Integer.MAX_VALUE) {
                iL2 = cyqVar.l(null);
                if (iL2 < 0) {
                    throw new IllegalStateException(b.e(iL2, "serialized size must be non-negative, was "));
                }
                cyqVar.u = (cyqVar.u & Integer.MIN_VALUE) | iL2;
            }
            iL = iL2;
        }
        return iL;
    }

    @Override // defpackage.arr
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((arp) obj).b);
    }
}
