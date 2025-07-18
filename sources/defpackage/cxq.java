package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxq extends clt implements cna {
    public static final cxq a;
    private static volatile cng i;
    public int b;
    public long c;
    public boolean d;
    public int e;
    public int g;
    public String f = "";
    public String h = "";

    static {
        cxq cxqVar = new cxq();
        a = cxqVar;
        clt.y(cxq.class, cxqVar);
    }

    private cxq() {
    }

    @Override // defpackage.clt
    public final Object a(int i2, Object obj) {
        cng clpVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new cnk(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new cxq();
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
        synchronized (cxq.class) {
            clpVar = i;
            if (clpVar == null) {
                clpVar = new clp(a);
                i = clpVar;
            }
        }
        return clpVar;
    }
}
