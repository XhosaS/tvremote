package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxx extends clt implements cna {
    public static final cxx a;
    private static volatile cng e;
    public int b;
    public int c;
    public int d;

    static {
        cxx cxxVar = new cxx();
        a = cxxVar;
        clt.y(cxx.class, cxxVar);
    }

    private cxx() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", cxb.f, "d"});
        }
        if (i2 == 3) {
            return new cxx();
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
        synchronized (cxx.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
