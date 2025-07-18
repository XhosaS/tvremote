package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cys extends clt implements cna {
    public static final cys a;
    private static volatile cng e;
    public int b;
    public clf c;
    public clf d;
    private byte f = 2;

    static {
        cys cysVar = new cys();
        a = cysVar;
        clt.y(cys.class, cysVar);
    }

    private cys() {
        cmp cmpVar = cmp.a;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new cys();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = e;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cys.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
