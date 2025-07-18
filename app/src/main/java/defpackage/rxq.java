package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxq extends abxd implements abyr {
    public static final rxq a;
    private static volatile abyy g;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;

    static {
        rxq rxqVar = new rxq();
        a = rxqVar;
        rxqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rxq.class, rxqVar);
    }

    private rxq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", ryc.a, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new rxq();
        }
        if (i2 == 4) {
            return new rxp();
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
        synchronized (rxq.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
