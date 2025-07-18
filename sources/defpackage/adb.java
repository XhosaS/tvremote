package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adb extends clt implements cna {
    public static final adb a;
    private static volatile cng d;
    public int b = 0;
    public Object c;

    static {
        adb adbVar = new adb();
        a = adbVar;
        clt.y(adb.class, adbVar);
    }

    private adb() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", act.class, acs.class, acx.class, ada.class, acw.class, acy.class, acv.class, acq.class, acr.class, acz.class});
        }
        if (i2 == 3) {
            return new adb();
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
        synchronized (adb.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
