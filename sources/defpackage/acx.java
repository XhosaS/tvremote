package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acx extends clt implements cna {
    public static final acx a;
    private static volatile cng g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public cme f = cnj.a;

    static {
        acx acxVar = new acx();
        a = acxVar;
        clt.y(acx.class, acxVar);
    }

    private acx() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", acu.class});
        }
        if (i2 == 3) {
            return new acx();
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
        synchronized (acx.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
