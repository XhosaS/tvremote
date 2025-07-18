package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acq extends clt implements cna {
    public static final acq a;
    private static volatile cng d;
    public cme b = cnj.a;
    public boolean c;

    static {
        acq acqVar = new acq();
        a = acqVar;
        clt.y(acq.class, acqVar);
    }

    private acq() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u0007", new Object[]{"b", acp.class, "c"});
        }
        if (i2 == 3) {
            return new acq();
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
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (acq.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
