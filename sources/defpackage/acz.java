package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acz extends clt implements cna {
    public static final acz a;
    private static volatile cng h;
    public int b;
    public String c = "";
    public String d = "";
    public cme e;
    public cme f;
    public boolean g;

    static {
        acz aczVar = new acz();
        a = aczVar;
        clt.y(acz.class, aczVar);
    }

    private acz() {
        cnj cnjVar = cnj.a;
        this.e = cnjVar;
        this.f = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ț\u0004\u001b\u0005ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", acu.class, "g"});
        }
        if (i2 == 3) {
            return new acz();
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
        synchronized (acz.class) {
            clpVar = h;
            if (clpVar == null) {
                clpVar = new clp(a);
                h = clpVar;
            }
        }
        return clpVar;
    }
}
