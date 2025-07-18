package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xir extends abxd implements abyr {
    public static final xir a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        xir xirVar = new xir();
        a = xirVar;
        xirVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xir.class, xirVar);
    }

    private xir() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0004᠌\u0003", new Object[]{"b", "c", "d", xip.a, "e", xin.a});
        }
        if (i2 == 3) {
            return new xir();
        }
        if (i2 == 4) {
            return new xim();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xir.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
