package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxw extends clt implements cna {
    public static final cxw a;
    private static volatile cng b;
    private int c;
    private cgg d;
    private byte e = 2;

    static {
        cxw cxwVar = new cxw();
        a = cxwVar;
        clt.y(cxw.class, cxwVar);
    }

    private cxw() {
        cnj cnjVar = cnj.a;
        cmp cmpVar = cmp.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new cxw();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = b;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxw.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
