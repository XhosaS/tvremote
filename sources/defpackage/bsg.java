package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsg extends clt implements cna {
    public static final bsg a;
    private static volatile cng i;
    public int b;
    public int e;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        bsg bsgVar = new bsg();
        a = bsgVar;
        clt.y(bsg.class, bsgVar);
    }

    private bsg() {
    }

    @Override // defpackage.clt
    public final Object a(int i2, Object obj) {
        cng clpVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new cnk(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", awv.f, "f", "g", "h"});
        }
        if (i3 == 3) {
            return new bsg();
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
        synchronized (bsg.class) {
            clpVar = i;
            if (clpVar == null) {
                clpVar = new clp(a);
                i = clpVar;
            }
        }
        return clpVar;
    }
}
