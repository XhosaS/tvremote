package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbe extends clt implements cna {
    public static final bbe a;
    private static volatile cng f;
    public int b;
    public bbd d;
    public String c = "";
    public String e = "";

    static {
        bbe bbeVar = new bbe();
        a = bbeVar;
        clt.y(bbe.class, bbeVar);
    }

    private bbe() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new bbe();
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
        synchronized (bbe.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
