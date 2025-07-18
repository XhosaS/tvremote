package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xih extends abxd implements abyr {
    public static final xih a;
    private static volatile abyy c;
    public int b;
    private int d;

    static {
        xih xihVar = new xih();
        a = xihVar;
        xihVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xih.class, xihVar);
    }

    private xih() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", xif.a});
        }
        if (i2 == 3) {
            return new xih();
        }
        if (i2 == 4) {
            return new xie();
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
        synchronized (xih.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
