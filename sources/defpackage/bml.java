package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bml extends clt implements cna {
    public static final bml a;
    private static volatile cng d;
    public int b;
    private byte e = 2;
    public ckv c = ckv.b;

    static {
        bml bmlVar = new bml();
        a = bmlVar;
        clt.y(bml.class, bmlVar);
    }

    private bml() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔊ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new bml();
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
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bml.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
