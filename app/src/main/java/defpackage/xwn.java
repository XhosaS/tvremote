package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwn extends abxd implements abyr {
    public static final xwn a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xwn xwnVar = new xwn();
        a = xwnVar;
        xwnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xwn.class, xwnVar);
    }

    private xwn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", xwm.a});
        }
        if (i2 == 3) {
            return new xwn();
        }
        if (i2 == 4) {
            return new xwl();
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
        synchronized (xwn.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
