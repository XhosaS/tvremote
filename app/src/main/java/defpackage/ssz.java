package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssz extends abxd implements abyr {
    public static final ssz a;
    private static volatile abyy g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public int f = -1;

    static {
        ssz sszVar = new ssz();
        a = sszVar;
        sszVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ssz.class, sszVar);
    }

    private ssz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004င\u0001", new Object[]{"d", "c", "b", "e", stc.a, rxj.class, rxd.class, "f"});
        }
        if (i2 == 3) {
            return new ssz();
        }
        if (i2 == 4) {
            return new ssy();
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
        synchronized (ssz.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
