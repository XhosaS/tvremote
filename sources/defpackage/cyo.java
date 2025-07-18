package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyo extends clt implements cna {
    public static final cyo a;
    private static volatile cng f;
    public int b;
    public cnv d;
    public int e;
    private byte g = 2;
    public cme c = cnj.a;

    static {
        cyo cyoVar = new cyo();
        a = cyoVar;
        clt.y(cyo.class, cyoVar);
    }

    private cyo() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", cyq.class, "d", "e", cxb.i});
        }
        if (i2 == 3) {
            return new cyo();
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
        cng cngVar = f;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cyo.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
