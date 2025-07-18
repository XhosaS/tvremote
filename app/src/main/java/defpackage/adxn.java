package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adxn extends abxd implements abyr {
    public static final adxn a;
    private static volatile abyy g;
    public int b;
    public int d;
    public int e;
    public String c = "";
    public abxs f = abzb.b;

    static {
        adxn adxnVar = new adxn();
        a = adxnVar;
        adxnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adxn.class, adxnVar);
    }

    private adxn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", adwq.class});
        }
        if (i2 == 3) {
            return new adxn();
        }
        if (i2 == 4) {
            return new adxm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adxn.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
