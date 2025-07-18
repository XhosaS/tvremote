package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxl extends clt implements cna {
    public static final cxl a;
    private static volatile cng d;
    public cnv b;
    public cme c = cnj.a;
    private int e;

    static {
        cxl cxlVar = new cxl();
        a = cxlVar;
        clt.y(cxl.class, cxlVar);
    }

    private cxl() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0001\u0000\u0004ဉ\u0004\u0007\u001b", new Object[]{"e", "b", "c", cxp.class});
        }
        if (i2 == 3) {
            return new cxl();
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
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxl.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
