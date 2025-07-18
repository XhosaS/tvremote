package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwq extends clt implements cna {
    public static final cwq a;
    private static volatile cng j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public cwn i;

    static {
        cwq cwqVar = new cwq();
        a = cwqVar;
        clt.y(cwq.class, cwqVar);
    }

    private cwq() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new cwq();
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
        synchronized (cwq.class) {
            clpVar = j;
            if (clpVar == null) {
                clpVar = new clp(a);
                j = clpVar;
            }
        }
        return clpVar;
    }
}
