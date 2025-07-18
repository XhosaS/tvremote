package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrq extends abxd implements abyr {
    public static final xrq a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xrq xrqVar = new xrq();
        a = xrqVar;
        xrqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xrq.class, xrqVar);
    }

    private xrq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", xrp.a});
        }
        if (i2 == 3) {
            return new xrq();
        }
        if (i2 == 4) {
            return new xrm();
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
        synchronized (xrq.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
