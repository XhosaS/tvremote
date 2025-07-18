package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsr extends abxd implements abyr {
    public static final abxk a = new tsp();
    public static final tsr b;
    private static volatile abyy d;
    public abxj c = abxe.a;

    static {
        tsr tsrVar = new tsr();
        b = tsrVar;
        tsrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(tsr.class, tsrVar);
    }

    private tsr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (i2 == 3) {
            return new tsr();
        }
        if (i2 == 4) {
            return new tsq();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (tsr.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
