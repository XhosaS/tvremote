package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xot extends abxd implements abyr {
    public static final abxk a = new xop();
    public static final xot b;
    private static volatile abyy d;
    public abxj c = abxe.a;

    static {
        xot xotVar = new xot();
        b = xotVar;
        xotVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xot.class, xotVar);
    }

    private xot() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003ࠞ", new Object[]{"c", xor.a});
        }
        if (i2 == 3) {
            return new xot();
        }
        if (i2 == 4) {
            return new xoq();
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
        synchronized (xot.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
