package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcv extends abxd implements abyr {
    public static final adcv a;
    private static volatile abyy e;
    public int c;
    public adcx d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        adcv adcvVar = new adcv();
        a = adcvVar;
        adcvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adcv.class, adcvVar);
    }

    private adcv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002᠌\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c", adcy.a, "d"});
        }
        if (i2 == 3) {
            return new adcv();
        }
        if (i2 == 4) {
            return new adcu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adcv.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
