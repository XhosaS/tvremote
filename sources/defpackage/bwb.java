package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwb extends clt implements cna {
    public static final bwb a;
    private static volatile cng e;
    public int b;
    public int c;
    public cme d = cnj.a;

    static {
        bwb bwbVar = new bwb();
        a = bwbVar;
        clt.y(bwb.class, bwbVar);
    }

    private bwb() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new bwb();
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
        synchronized (bwb.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
