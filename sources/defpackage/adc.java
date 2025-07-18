package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adc extends clt implements cna {
    public static final adc a;
    private static volatile cng e;
    public int b;
    public adb c;
    public String d = "";
    private int f;

    static {
        adc adcVar = new adc();
        a = adcVar;
        clt.y(adc.class, adcVar);
    }

    private adc() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0004Ȉ", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new adc();
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
        synchronized (adc.class) {
            clpVar = e;
            if (clpVar == null) {
                clpVar = new clp(a);
                e = clpVar;
            }
        }
        return clpVar;
    }
}
