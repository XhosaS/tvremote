package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxd extends abxd implements abyr {
    public static final rxd a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        rxd rxdVar = new rxd();
        a = rxdVar;
        rxdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rxd.class, rxdVar);
    }

    private rxd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000", new Object[]{"c", "b", rxe.a, rxa.a});
        }
        if (i2 == 3) {
            return new rxd();
        }
        if (i2 == 4) {
            return new rxc();
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
        synchronized (rxd.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
