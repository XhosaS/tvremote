package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxd extends clt implements cna {
    public static final cxd a;
    private static volatile cng h;
    public int b;
    public int c;
    public int d;
    public String e;
    public cmd f;
    public cxf g;
    private byte i = 2;

    static {
        cxd cxdVar = new cxd();
        a = cxdVar;
        clt.y(cxd.class, cxdVar);
    }

    private cxd() {
        cnj cnjVar = cnj.a;
        this.e = "";
        this.f = cmp.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0005\u0000\u0001\u0005\u0016\u0005\u0000\u0001\u0000\u0005င\u0005\b᠌\b\u0011ဈ\u0013\u0015(\u0016ဉ\u0016", new Object[]{"b", "c", "d", cxb.c, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new cxd();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = h;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxd.class) {
            clpVar = h;
            if (clpVar == null) {
                clpVar = new clp(a);
                h = clpVar;
            }
        }
        return clpVar;
    }
}
