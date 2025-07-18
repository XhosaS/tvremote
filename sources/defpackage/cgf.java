package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgf extends clt implements cna {
    public static final cgf a;
    private static volatile cng b;
    private int c;
    private long d;
    private int e;
    private int f;
    private byte g = 2;

    static {
        cgf cgfVar = new cgf();
        a = cgfVar;
        clt.y(cgf.class, cgfVar);
    }

    private cgf() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new cgf();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = b;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cgf.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
