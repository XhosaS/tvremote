package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwh extends clt implements cna {
    public static final cwh a;
    private static volatile cng f;
    public int b;
    public cwi d;
    public int e;
    private byte g = 2;
    public cme c = cnj.a;

    static {
        cwh cwhVar = new cwh();
        a = cwhVar;
        clt.y(cwh.class, cwhVar);
    }

    private cwh() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003င\u0001", new Object[]{"b", "c", cwg.class, "d", "e"});
        }
        if (i2 == 3) {
            return new cwh();
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
        synchronized (cwh.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
