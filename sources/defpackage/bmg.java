package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmg extends clt implements cna {
    public static final bmg a;
    private static volatile cng f;
    public int b;
    public cme c;
    public cme d;
    public int e;
    private byte g = 2;

    static {
        bmg bmgVar = new bmg();
        a = bmgVar;
        clt.y(bmg.class, bmgVar);
    }

    private bmg() {
        cnj cnjVar = cnj.a;
        this.c = cnjVar;
        this.d = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003᠌\u0000", new Object[]{"b", "c", bmf.class, "d", bmf.class, "e", awv.d});
        }
        if (i2 == 3) {
            return new bmg();
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
        synchronized (bmg.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
