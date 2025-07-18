package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyg extends clt implements cna {
    public static final cyg a;
    private static volatile cng i;
    public int b;
    public int c;
    public cnv d;
    public String e = "";
    public String f = "";
    public int g;
    public long h;

    static {
        cyg cygVar = new cyg();
        a = cygVar;
        clt.y(cyg.class, cygVar);
    }

    private cyg() {
    }

    @Override // defpackage.clt
    public final Object a(int i2, Object obj) {
        cng clpVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new cnk(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new cyg();
        }
        if (i3 == 4) {
            return new clo(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        cng cngVar = i;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cyg.class) {
            clpVar = i;
            if (clpVar == null) {
                clpVar = new clp(a);
                i = clpVar;
            }
        }
        return clpVar;
    }
}
