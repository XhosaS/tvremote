package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xho extends abxd implements abyr {
    public static final xho a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        xho xhoVar = new xho();
        a = xhoVar;
        xhoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xho.class, xhoVar);
    }

    private xho() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0001\u0000\u0003\u0005\u0002\u0000\u0000\u0000\u0003<\u0000\u0005<\u0000", new Object[]{"c", "b", xhe.class, xgw.class});
        }
        if (i2 == 3) {
            return new xho();
        }
        if (i2 == 4) {
            return new xhn();
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
        synchronized (xho.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
