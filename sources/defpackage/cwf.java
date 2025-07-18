package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwf extends clt implements cna {
    public static final cwf a;
    private static volatile cng f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        cwf cwfVar = new cwf();
        a = cwfVar;
        clt.y(cwf.class, cwfVar);
    }

    private cwf() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0001\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002=\u0000\u0005=\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new cwf();
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
        synchronized (cwf.class) {
            clpVar = f;
            if (clpVar == null) {
                clpVar = new clp(a);
                f = clpVar;
            }
        }
        return clpVar;
    }
}
