package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amq implements amc {
    private final /* synthetic */ int c;
    public static final amq b = new amq(1);
    public static final amq a = new amq(0);

    public amq(int i) {
        this.c = i;
    }

    @Override // defpackage.amc
    public final long a(aml amlVar, int i) {
        if (this.c == 0) {
            return amlVar.d.k(i);
        }
        String strB = amlVar.b();
        long jN = ccf.N(hq.t(strB, i), hq.s(strB, i));
        long j = chb.a;
        return jN;
    }
}
