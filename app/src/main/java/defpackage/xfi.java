package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfi extends abxd implements abyr {
    public static final xfi a;
    private static volatile abyy e;
    public int b;
    public int c = 1;
    public int d = 1;

    static {
        xfi xfiVar = new xfi();
        a = xfiVar;
        xfiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfi.class, xfiVar);
    }

    private xfi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", xfj.a, "d", xfe.a});
        }
        if (i2 == 3) {
            return new xfi();
        }
        if (i2 == 4) {
            return new xfh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xfi.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
