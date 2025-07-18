package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqu extends clt implements cna {
    public static final aqu a;
    private static volatile cng d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqu aquVar = new aqu();
        a = aquVar;
        clt.y(aqu.class, aquVar);
    }

    private aqu() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", cww.class, aqv.class, aqw.class, aqx.class});
        }
        if (i2 == 3) {
            return new aqu();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = d;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (aqu.class) {
            clpVar = d;
            if (clpVar == null) {
                clpVar = new clp(a);
                d = clpVar;
            }
        }
        return clpVar;
    }
}
