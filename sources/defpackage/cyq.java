package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyq extends clt implements cna {
    public static final cyq a;
    private static volatile cng f;
    public int b;
    public Object d;
    public cyp e;
    public int c = 0;
    private byte g = 2;

    static {
        cyq cyqVar = new cyq();
        a = cyqVar;
        clt.y(cyq.class, cyqVar);
    }

    private cyq() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new Object[]{"d", "c", "b", cxl.class, "e", cyt.class});
        }
        if (i2 == 3) {
            return new cyq();
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
        synchronized (cyq.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
