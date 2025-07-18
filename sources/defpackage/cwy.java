package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwy extends clt implements cna {
    public static final cwy a;
    private static volatile cng j;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    static {
        cwy cwyVar = new cwy();
        a = cwyVar;
        clt.y(cwy.class, cwyVar);
    }

    private cwy() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new cwy();
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
        cng cngVar = j;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cwy.class) {
            clpVar = j;
            if (clpVar == null) {
                clpVar = new clp(a);
                j = clpVar;
            }
        }
        return clpVar;
    }
}
