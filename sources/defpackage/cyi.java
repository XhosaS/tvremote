package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyi extends clt implements cna {
    public static final cyi a;
    private static volatile cng l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public cme k = cnj.a;

    static {
        cyi cyiVar = new cyi();
        a = cyiVar;
        clt.y(cyi.class, cyiVar);
    }

    private cyi() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", cyh.class});
        }
        if (i2 == 3) {
            return new cyi();
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
        cng cngVar = l;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cyi.class) {
            clpVar = l;
            if (clpVar == null) {
                clpVar = new clp(a);
                l = clpVar;
            }
        }
        return clpVar;
    }
}
