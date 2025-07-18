package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clg extends clt implements cna {
    public static final clg a;
    private static volatile cng b;

    static {
        clg clgVar = new clg();
        a = clgVar;
        clt.y(clg.class, clgVar);
    }

    private clg() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new clg();
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
        cng cngVar = b;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (clg.class) {
            clpVar = b;
            if (clpVar == null) {
                clpVar = new clp(a);
                b = clpVar;
            }
        }
        return clpVar;
    }
}
