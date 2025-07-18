package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyk extends clt implements cna {
    public static final cyk a;
    private static volatile cng b;
    private int c;
    private cxy d;
    private byte e = 2;

    static {
        cyk cykVar = new cyk();
        a = cykVar;
        clt.y(cyk.class, cykVar);
    }

    private cyk() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new cyk();
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
        synchronized (cyk.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
