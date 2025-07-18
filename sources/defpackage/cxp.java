package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxp extends clt implements cna {
    public static final cxp a;
    private static volatile cng e;
    public int b = 0;
    public long c;
    public clf d;
    private int f;
    private Object g;

    static {
        cxp cxpVar = new cxp();
        a = cxpVar;
        clt.y(cxp.class, cxpVar);
    }

    private cxp() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"g", "b", "f", "c", "d", cxn.class, cxo.class, cxm.class});
        }
        if (i2 == 3) {
            return new cxp();
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
        cng cngVar = e;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxp.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
