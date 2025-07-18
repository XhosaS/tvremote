package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwo extends clt implements cna {
    public static final cwo a;
    private static volatile cng f;
    public int b;
    public cme c;
    public cme d;
    public cwn e;

    static {
        cwo cwoVar = new cwo();
        a = cwoVar;
        clt.y(cwo.class, cwoVar);
    }

    private cwo() {
        cnj cnjVar = cnj.a;
        this.c = cnjVar;
        this.d = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", cwr.class, "d", cwm.class, "e"});
        }
        if (i2 == 3) {
            return new cwo();
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
        cng cngVar = f;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cwo.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
