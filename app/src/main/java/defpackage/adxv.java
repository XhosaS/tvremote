package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adxv extends abxd implements abyr {
    public static final adxv a;
    private static volatile abyy j;
    public int b;
    public int c;
    public adxk g;
    public boolean h;
    public String d = "";
    public String e = "";
    public abxs f = abzb.b;
    public String i = "";

    static {
        adxv adxvVar = new adxv();
        a = adxvVar;
        adxvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adxv.class, adxvVar);
    }

    private adxv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဇ\u0004\bဈ\u0006", new Object[]{"b", "c", adxt.a, "d", "e", "f", adxz.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new adxv();
        }
        if (i2 == 4) {
            return new adxs();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adxv.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
