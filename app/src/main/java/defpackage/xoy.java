package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xoy extends abxd implements abyr {
    public static final xoy a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        xoy xoyVar = new xoy();
        a = xoyVar;
        xoyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xoy.class, xoyVar);
    }

    private xoy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", xfb.class});
        }
        if (i2 == 3) {
            return new xoy();
        }
        if (i2 == 4) {
            return new xox();
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
        synchronized (xoy.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
