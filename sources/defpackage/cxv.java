package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxv extends clt implements cna {
    public static final cxv a;
    private static volatile cng j;
    public int b;
    public int e;
    public long f;
    public boolean h;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";

    static {
        cxv cxvVar = new cxv();
        a = cxvVar;
        clt.y(cxv.class, cxvVar);
    }

    private cxv() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0007ဈ\u0007\bဇ\u0006", new Object[]{"b", "c", "d", "e", cxb.e, "f", "g", "i", "h"});
        }
        if (i2 == 3) {
            return new cxv();
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
        cng cngVar = j;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxv.class) {
            clpVar = j;
            if (clpVar == null) {
                clpVar = new clp(a);
                j = clpVar;
            }
        }
        return clpVar;
    }
}
