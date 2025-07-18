package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxj extends abxd implements abyr {
    public static final rxj a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        rxj rxjVar = new rxj();
        a = rxjVar;
        rxjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rxj.class, rxjVar);
    }

    private rxj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000", new Object[]{"c", "b", rxk.a, rxg.a});
        }
        if (i2 == 3) {
            return new rxj();
        }
        if (i2 == 4) {
            return new rxi();
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
        synchronized (rxj.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
