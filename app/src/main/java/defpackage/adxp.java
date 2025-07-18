package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adxp extends abxd implements abyr {
    public static final adxp a;
    private static volatile abyy e;
    public abxs b = abzb.b;
    public int c;
    public int d;
    private int f;

    static {
        adxp adxpVar = new adxp();
        a = adxpVar;
        adxpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adxp.class, adxpVar);
    }

    private adxp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0007\t\u0003\u0000\u0001\u0000\u0007\u001b\bင\u0006\tင\u0007", new Object[]{"f", "b", adwq.class, "c", "d"});
        }
        if (i2 == 3) {
            return new adxp();
        }
        if (i2 == 4) {
            return new adxo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adxp.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
