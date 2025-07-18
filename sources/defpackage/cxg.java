package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxg extends clt implements cna {
    public static final cxg a;
    private static volatile cng e;
    public int b;
    public String c = "";
    public cmd d = cmp.a;

    static {
        cxg cxgVar = new cxg();
        a = cxgVar;
        clt.y(cxg.class, cxgVar);
    }

    private cxg() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new cxg();
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
        synchronized (cxg.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
