package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxk extends clt implements cna {
    public static final cxk a;
    private static volatile cng b;
    private cmu c = cmu.a;

    static {
        cxk cxkVar = new cxk();
        a = cxkVar;
        clt.y(cxk.class, cxkVar);
    }

    private cxk() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0001\u0000\u0000\u0010\u0010\u0001\u0001\u0000\u0000\u00102", new Object[]{"c", cxj.a});
        }
        if (i2 == 3) {
            return new cxk();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        cng cngVar = b;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxk.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
