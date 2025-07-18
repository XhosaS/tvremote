package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bva extends clt implements cna {
    public static final bva a;
    private static volatile cng c;
    public int b;
    private int d;

    static {
        bva bvaVar = new bva();
        a = bvaVar;
        clt.y(bva.class, bvaVar);
    }

    private bva() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", awv.k});
        }
        if (i2 == 3) {
            return new bva();
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
        synchronized (bva.class) {
            clpVar = c;
            if (clpVar == null) {
                clpVar = new clp(a);
                c = clpVar;
            }
        }
        return clpVar;
    }
}
