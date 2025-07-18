package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adxr extends abxd implements abyr {
    public static final adxr a;
    private static volatile abyy c;
    public int b;
    private adyn d;

    static {
        adxr adxrVar = new adxr();
        a = adxrVar;
        adxrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adxr.class, adxrVar);
    }

    private adxr() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "d"});
        }
        if (i2 == 3) {
            return new adxr();
        }
        if (i2 == 4) {
            return new adxq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adxr.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
