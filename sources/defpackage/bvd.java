package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvd extends clt implements cna {
    public static final bvd a;
    private static volatile cng e;
    public int b;
    public int c;
    public String d = "";
    private int f;

    static {
        bvd bvdVar = new bvd();
        a = bvdVar;
        clt.y(bvd.class, bvdVar);
    }

    private bvd() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new bvd();
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
        cng cngVar = e;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bvd.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
