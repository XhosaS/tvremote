package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsh extends clt implements cna {
    public static final bsh a;
    private static volatile cng g;
    public int b;
    public long c;
    public int d;
    public int e;
    public bsg f;

    static {
        bsh bshVar = new bsh();
        a = bshVar;
        clt.y(bsh.class, bshVar);
    }

    private bsh() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", awv.g, "e", "f"});
        }
        if (i2 == 3) {
            return new bsh();
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
        synchronized (bsh.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
