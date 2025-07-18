package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxi extends clr implements cna {
    public static final cxi a;
    private static volatile cng g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String f = "";

    static {
        cxi cxiVar = new cxi();
        a = cxiVar;
        clt.y(cxi.class, cxiVar);
    }

    private cxi() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "e", "f"});
        }
        if (i2 == 3) {
            return new cxi();
        }
        if (i2 == 4) {
            return new clq(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = g;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxi.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
