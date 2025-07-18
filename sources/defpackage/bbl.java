package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbl extends clt implements cna {
    public static final bbl a;
    private static volatile cng g;
    public long e;
    private int h;
    public cmu f = cmu.a;
    public String b = "";
    public ckv c = ckv.b;
    public String d = "";

    static {
        bbl bblVar = new bbl();
        a = bblVar;
        clt.y(bbl.class, bblVar);
    }

    private bbl() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", bbk.a});
        }
        if (i2 == 3) {
            return new bbl();
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
        synchronized (bbl.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
