package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmi extends clt implements cna {
    public static final bmi a;
    private static volatile cng e;
    public int b;
    private byte f = 2;
    public String c = "";
    public String d = "";

    static {
        bmi bmiVar = new bmi();
        a = bmiVar;
        clt.y(bmi.class, bmiVar);
    }

    private bmi() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new bmi();
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
        synchronized (bmi.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
