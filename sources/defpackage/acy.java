package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acy extends clt implements cna {
    public static final acy a;
    private static volatile cng f;
    public boolean b;
    public String c = "";
    public cme d;
    public cme e;
    private int g;

    static {
        acy acyVar = new acy();
        a = acyVar;
        clt.y(acy.class, acyVar);
    }

    private acy() {
        cnj cnjVar = cnj.a;
        this.d = cnjVar;
        this.e = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဇ\u0000\u0002Ȉ\u0003Ț\u0004Ț", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acy();
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
        synchronized (acy.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
