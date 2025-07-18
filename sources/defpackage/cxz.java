package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxz extends clt implements cna {
    public static final cxz a;
    private static volatile cng g;
    public int b;
    public int c;
    public int d;
    public cma e;
    public cma f;

    static {
        cxz cxzVar = new cxz();
        a = cxzVar;
        clt.y(cxz.class, cxzVar);
    }

    private cxz() {
        clu cluVar = clu.a;
        this.e = cluVar;
        this.f = cluVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new cxz();
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
        cng cngVar = g;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxz.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
