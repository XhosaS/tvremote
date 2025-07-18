package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrs extends abxd implements abyr {
    public static final xrs a;
    private static volatile abyy b;
    private int c;
    private xrl d;

    static {
        xrs xrsVar = new xrs();
        a = xrsVar;
        xrsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xrs.class, xrsVar);
    }

    private xrs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new xrs();
        }
        if (i2 == 4) {
            return new xrr();
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
        synchronized (xrs.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
