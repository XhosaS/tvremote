package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbz extends clt implements cna {
    public static final bbz a;
    private static volatile cng c;
    public cmu b = cmu.a;

    static {
        bbz bbzVar = new bbz();
        a = bbzVar;
        clt.y(bbz.class, bbzVar);
    }

    private bbz() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", bby.a});
        }
        if (i2 == 3) {
            return new bbz();
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
        synchronized (bbz.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }
}
