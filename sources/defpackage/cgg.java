package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgg extends clt implements cna {
    public static final cgg a;
    private static volatile cng b;
    private int c;
    private cgf d;
    private int f;
    private cgl g;
    private byte h = 2;
    private String e = "";

    static {
        cgg cggVar = new cgg();
        a = cggVar;
        clt.y(cgg.class, cggVar);
    }

    private cgg() {
        cnj cnjVar = cnj.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\bᐉ\n", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new cgg();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = b;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cgg.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
