package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtx extends abxd implements abyr {
    public static final adtx a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        adtx adtxVar = new adtx();
        a = adtxVar;
        adtxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adtx.class, adtxVar);
    }

    private adtx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", adtz.class});
        }
        if (i2 == 3) {
            return new adtx();
        }
        if (i2 == 4) {
            return new adtw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adtx.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
