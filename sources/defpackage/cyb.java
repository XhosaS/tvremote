package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyb extends clt implements cna {
    public static final cyb a;
    private static volatile cng h;
    public cmd b;
    public cmd c;
    public cma d;
    public cma e;
    public cma f;
    public cme g;

    static {
        cyb cybVar = new cyb();
        a = cybVar;
        clt.y(cyb.class, cybVar);
    }

    private cyb() {
        cmp cmpVar = cmp.a;
        this.b = cmpVar;
        this.c = cmpVar;
        clu cluVar = clu.a;
        this.d = cluVar;
        this.e = cluVar;
        this.f = cluVar;
        this.g = cnj.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new cyb();
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
        synchronized (cyb.class) {
            clpVar = h;
            if (clpVar == null) {
                clpVar = new clp(a);
                h = clpVar;
            }
        }
        return clpVar;
    }
}
