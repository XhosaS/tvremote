package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aww extends clt implements cna {
    public static final aww a;
    private static volatile cng e;
    public String b = "";
    public cme c = cnj.a;
    public boolean d;
    private int f;

    static {
        aww awwVar = new aww();
        a = awwVar;
        clt.y(aww.class, awwVar);
    }

    private aww() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"f", "b", "c", awu.class, "d"});
        }
        if (i2 == 3) {
            return new aww();
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
        synchronized (aww.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
