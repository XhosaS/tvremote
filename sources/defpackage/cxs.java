package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxs extends clt implements cna {
    public static final cxs a;
    private static volatile cng e;
    public int b;
    public long c;
    public int d;

    static {
        cxs cxsVar = new cxs();
        a = cxsVar;
        clt.y(cxs.class, cxsVar);
    }

    private cxs() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", cxb.d});
        }
        if (i2 == 3) {
            return new cxs();
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
        synchronized (cxs.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
