package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auw extends clt implements cna {
    public static final auw a;
    private static volatile cng g;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public float f;
    private int h;

    static {
        auw auwVar = new auw();
        a = auwVar;
        clt.y(auw.class, auwVar);
    }

    private auw() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new auw();
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
        cng cngVar = g;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (auw.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
