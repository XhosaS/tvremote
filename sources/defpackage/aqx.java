package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqx extends clt implements cna {
    public static final aqx a;
    private static volatile cng g;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        aqx aqxVar = new aqx();
        a = aqxVar;
        clt.y(aqx.class, aqxVar);
    }

    private aqx() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aqx();
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
        synchronized (aqx.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
