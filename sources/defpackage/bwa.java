package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwa extends clt implements cna {
    public static final bwa a;
    private static volatile cng c;
    public int b;
    private int d;

    static {
        bwa bwaVar = new bwa();
        a = bwaVar;
        clt.y(bwa.class, bwaVar);
    }

    private bwa() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new bwa();
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
        synchronized (bwa.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }
}
