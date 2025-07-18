package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acs extends clt implements cna {
    public static final acs a;
    private static volatile cng h;
    public int b;
    public int d;
    public boolean f;
    public boolean g;
    private int i;
    public String c = "";
    public cme e = cnj.a;

    static {
        acs acsVar = new acs();
        a = acsVar;
        clt.y(acs.class, acsVar);
    }

    private acs() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003င\u0000\u0004Ț\u0005\u0007\u0006\u0007", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new acs();
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
        cng cngVar = h;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (acs.class) {
            clpVar = h;
            if (clpVar == null) {
                clpVar = new clp(a);
                h = clpVar;
            }
        }
        return clpVar;
    }
}
