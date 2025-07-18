package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azo extends clr implements cna {
    public static final azo a;
    private static volatile cng e;
    public int b;
    public cym c;
    private byte f = 2;

    static {
        azo azoVar = new azo();
        a = azoVar;
        clt.y(azo.class, azoVar);
    }

    private azo() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new azo();
        }
        if (i2 == 4) {
            return new clq(a);
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
        synchronized (azo.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
