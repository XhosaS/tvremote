package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awu extends clt implements cna {
    public static final awu a;
    private static volatile cng d;
    public int b;
    public String c = "";
    private int e;

    static {
        awu awuVar = new awu();
        a = awuVar;
        clt.y(awu.class, awuVar);
    }

    private awu() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"e", "b", awv.a, "c"});
        }
        if (i2 == 3) {
            return new awu();
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
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (awu.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
