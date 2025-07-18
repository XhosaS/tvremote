package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvu extends clt implements cna {
    public static final bvu a;
    private static volatile cng f;
    public int b;
    public int c;
    public but d;
    public cma e = clu.a;

    static {
        bvu bvuVar = new bvu();
        a = bvuVar;
        clt.y(bvu.class, bvuVar);
    }

    private bvu() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ࠞ", new Object[]{"b", "c", "d", "e", awv.n});
        }
        if (i2 == 3) {
            return new bvu();
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
        cng cngVar = f;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bvu.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
