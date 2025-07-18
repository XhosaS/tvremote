package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkx extends abxd implements abyr {
    public static final adkx a;
    private static volatile abyy c;
    public int b;
    private int d;

    static {
        adkx adkxVar = new adkx();
        a = adkxVar;
        adkxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkx.class, adkxVar);
    }

    private adkx() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004င\u0003", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new adkx();
        }
        if (i2 == 4) {
            return new adkw();
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
        synchronized (adkx.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
