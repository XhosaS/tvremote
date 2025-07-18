package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bse extends clt implements cna {
    public static final bse a;
    private static volatile cng i;
    public int b;
    public int c;
    public bsf d;
    public bsh e;
    public bss f;
    public bst g;
    public long h;

    static {
        bse bseVar = new bse();
        a = bseVar;
        clt.y(bse.class, bseVar);
    }

    private bse() {
    }

    @Override // defpackage.clt
    public final Object a(int i2, Object obj) {
        cng clpVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new cnk(a, "\u0004\u0006\u0000\u0001\u0001d\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005dဂ\u0006", new Object[]{"b", "c", awv.h, "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new bse();
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
        synchronized (bse.class) {
            clpVar = i;
            if (clpVar == null) {
                clpVar = new clp(a);
                i = clpVar;
            }
        }
        return clpVar;
    }
}
