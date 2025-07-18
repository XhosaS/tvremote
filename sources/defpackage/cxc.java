package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxc extends clt implements cna {
    public static final cxc a;
    private static volatile cng h;
    public int b;
    public cxa c;
    public cxr d;
    public int e;
    public cwz f;
    public String g = "";

    static {
        cxc cxcVar = new cxc();
        a = cxcVar;
        clt.y(cxc.class, cxcVar);
    }

    private cxc() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", cxb.a, "f", "g"});
        }
        if (i2 == 3) {
            return new cxc();
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
        synchronized (cxc.class) {
            clpVar = h;
            if (clpVar == null) {
                clpVar = new clp(a);
                h = clpVar;
            }
        }
        return clpVar;
    }
}
