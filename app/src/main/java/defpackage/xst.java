package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xst extends abxd implements abyr {
    public static final xst a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xst xstVar = new xst();
        a = xstVar;
        xstVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xst.class, xstVar);
    }

    private xst() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", xss.a});
        }
        if (i2 == 3) {
            return new xst();
        }
        if (i2 == 4) {
            return new xsr();
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
        synchronized (xst.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
