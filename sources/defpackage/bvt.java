package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvt extends clt implements cna {
    public static final bvt a;
    private static volatile cng e;
    public int b;
    public int c;
    public bux d;

    static {
        bvt bvtVar = new bvt();
        a = bvtVar;
        clt.y(bvt.class, bvtVar);
    }

    private bvt() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", awv.m, "d"});
        }
        if (i2 == 3) {
            return new bvt();
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
        synchronized (bvt.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
