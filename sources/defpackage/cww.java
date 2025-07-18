package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cww extends clr implements cna {
    public static final cww a;
    private static volatile cng b;
    private byte c = 2;

    static {
        cww cwwVar = new cww();
        a = cwwVar;
        clt.y(cww.class, cwwVar);
    }

    private cww() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new cww();
        }
        if (i2 == 4) {
            return new clq(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = b;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cww.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
