package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cos extends clr implements cna {
    public static final cos a;
    private static volatile cng g;
    public int b;
    public coq c;
    public int e;
    public ckb f;
    private byte h = 2;

    static {
        cos cosVar = new cos();
        a = cosVar;
        clt.y(cos.class, cosVar);
    }

    private cos() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "e", awv.r, "f"});
        }
        if (i2 == 3) {
            return new cos();
        }
        if (i2 == 4) {
            return new clq(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = g;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cos.class) {
            clpVar = g;
            if (clpVar == null) {
                clpVar = new clp(a);
                g = clpVar;
            }
        }
        return clpVar;
    }
}
