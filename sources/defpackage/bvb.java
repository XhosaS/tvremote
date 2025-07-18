package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvb extends clt implements cna {
    public static final bvb a;
    private static volatile cng e;
    public int b;
    public int c;
    public cme d = cnj.a;
    private int f;

    static {
        bvb bvbVar = new bvb();
        a = bvbVar;
        clt.y(bvb.class, bvbVar);
    }

    private bvb() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"f", "b", "c", "d", bve.class});
        }
        if (i2 == 3) {
            return new bvb();
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
        cng cngVar = e;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bvb.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
