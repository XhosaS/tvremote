package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acw extends clt implements cna {
    public static final acw a;
    private static volatile cng d;
    public int b = 0;
    public Object c;

    static {
        acw acwVar = new acw();
        a = acwVar;
        clt.y(acw.class, acwVar);
    }

    private acw() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002Ȼ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new acw();
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
        synchronized (acw.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
