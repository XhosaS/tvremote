package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwi extends clt implements cna {
    public static final cwi a;
    private static volatile cng c;
    public cma b = clu.a;

    static {
        cwi cwiVar = new cwi();
        a = cwiVar;
        clt.y(cwi.class, cwiVar);
    }

    private cwi() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"b", awv.t});
        }
        if (i2 == 3) {
            return new cwi();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        cng cngVar = c;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cwi.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }
}
