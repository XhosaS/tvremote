package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cou extends clt implements cna {
    public static final cou a;
    private static volatile cng c;
    public cme b = cnj.a;

    static {
        cou couVar = new cou();
        a = couVar;
        clt.y(cou.class, couVar);
    }

    private cou() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", cot.class});
        }
        if (i2 == 3) {
            return new cou();
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
        cng cngVar = c;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cou.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }
}
