package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdm extends clt implements cna {
    public static final bdm a;
    private static volatile cng h;
    public int b;
    public long f;
    public String c = "";
    public ckv d = ckv.b;
    public String e = "";
    public cme g = cnj.a;

    static {
        bdm bdmVar = new bdm();
        a = bdmVar;
        clt.y(bdm.class, bdmVar);
    }

    private bdm() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", bdn.class});
        }
        if (i2 == 3) {
            return new bdm();
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
        synchronized (bdm.class) {
            clpVar = h;
            if (clpVar == null) {
                clpVar = new clp(a);
                h = clpVar;
            }
        }
        return clpVar;
    }
}
