package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwd extends clt implements cna {
    public static final bwd a;
    private static volatile cng k;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    static {
        bwd bwdVar = new bwd();
        a = bwdVar;
        clt.y(bwd.class, bwdVar);
    }

    private bwd() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007", new Object[]{"b", "c", "d", "e", "f", awv.p, "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new bwd();
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
        cng cngVar = k;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bwd.class) {
            clpVar = k;
            if (clpVar == null) {
                clpVar = new clp(a);
                k = clpVar;
            }
        }
        return clpVar;
    }
}
