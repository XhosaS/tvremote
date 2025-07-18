package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvx extends clt implements cna {
    public static final bvx a;
    private static volatile cng h;
    public Object c;
    public int d;
    private int i;
    public int b = 0;
    public int e = 8000;
    public int f = 16;
    public int g = 2;

    static {
        bvx bvxVar = new bvx();
        a = bvxVar;
        clt.y(bvx.class, bvxVar);
    }

    private bvx() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0005\u0001\u0001\u0001\u0014\u0005\u0000\u0000\u0000\u0001င\u0000\nင\u0001\u000bင\u0002\fင\u0003\u0014<\u0000", new Object[]{"c", "b", "i", "d", "e", "f", "g", bwa.class});
        }
        if (i2 == 3) {
            return new bvx();
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
        synchronized (bvx.class) {
            clpVar = h;
            if (clpVar == null) {
                clpVar = new clp(a);
                h = clpVar;
            }
        }
        return clpVar;
    }
}
