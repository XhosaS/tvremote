package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbf extends clt implements cna {
    public static final bbf a;
    private static volatile cng j;
    public int b;
    public String c = "";
    public ckv d = ckv.b;
    public String e = "";
    public cme f;
    public cme g;
    public boolean h;
    public long i;

    static {
        bbf bbfVar = new bbf();
        a = bbfVar;
        clt.y(bbf.class, bbfVar);
    }

    private bbf() {
        cnj cnjVar = cnj.a;
        this.f = cnjVar;
        this.g = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", bbg.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new bbf();
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
        cng cngVar = j;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bbf.class) {
            clpVar = j;
            if (clpVar == null) {
                clpVar = new clp(a);
                j = clpVar;
            }
        }
        return clpVar;
    }
}
