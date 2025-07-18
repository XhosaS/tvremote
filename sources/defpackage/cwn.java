package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwn extends clt implements cna {
    public static final cwn a;
    private static volatile cng e;
    public int b;
    public long c;
    public String d = "";

    static {
        cwn cwnVar = new cwn();
        a = cwnVar;
        clt.y(cwn.class, cwnVar);
    }

    private cwn() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new cwn();
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
        synchronized (cwn.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
