package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xoj extends abxd implements abyr {
    public static final abxk a = new xoh();
    public static final xoj b;
    private static volatile abyy f;
    public Object d;
    public int c = 0;
    public abxj e = abxe.a;

    static {
        xoj xojVar = new xoj();
        b = xojVar;
        xojVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xoj.class, xojVar);
    }

    private xoj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001;\u0000\u0002ࠞ\u0003;\u0000", new Object[]{"d", "c", "e", xok.a});
        }
        if (i2 == 3) {
            return new xoj();
        }
        if (i2 == 4) {
            return new xoi();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xoj.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
