package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aos extends clt implements cna {
    public static final aos a;
    private static volatile cng f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        aos aosVar = new aos();
        a = aosVar;
        clt.y(aos.class, aosVar);
    }

    private aos() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new aos();
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
        synchronized (aos.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
