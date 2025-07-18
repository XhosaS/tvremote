package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwu extends clt implements cna {
    public static final cwu a;
    private static volatile cng g;
    public int b;
    public int c;
    public clf d;
    public long e;
    public int f;

    static {
        cwu cwuVar = new cwu();
        a = cwuVar;
        clt.y(cwu.class, cwuVar);
    }

    private cwu() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003စ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", cxb.b});
        }
        if (i2 == 3) {
            return new cwu();
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
        synchronized (cwu.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
