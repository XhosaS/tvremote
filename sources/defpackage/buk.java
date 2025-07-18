package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buk extends clt implements cna {
    public static final buk a;
    private static volatile cng c;
    public cme b = cnj.a;

    static {
        buk bukVar = new buk();
        a = bukVar;
        clt.y(buk.class, bukVar);
    }

    private buk() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", buo.class});
        }
        if (i2 == 3) {
            return new buk();
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
        synchronized (buk.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }
}
