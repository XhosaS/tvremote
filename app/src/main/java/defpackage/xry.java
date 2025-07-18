package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xry extends abxd implements abyr {
    public static final xry a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xry xryVar = new xry();
        a = xryVar;
        xryVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xry.class, xryVar);
    }

    private xry() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u00042", new Object[]{"c", xrx.a});
        }
        if (i2 == 3) {
            return new xry();
        }
        if (i2 == 4) {
            return new xrw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xry.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
