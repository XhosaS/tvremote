package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buu extends clt implements cna {
    public static final buu a;
    private static volatile cng d;
    public int b;
    public but c;
    private int e;

    static {
        buu buuVar = new buu();
        a = buuVar;
        clt.y(buu.class, buuVar);
    }

    private buu() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new buu();
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
        synchronized (buu.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
