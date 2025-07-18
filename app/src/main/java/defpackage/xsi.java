package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsi extends abxd implements abyr {
    public static final xsi a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xsi xsiVar = new xsi();
        a = xsiVar;
        xsiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xsi.class, xsiVar);
    }

    private xsi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", xsh.a});
        }
        if (i2 == 3) {
            return new xsi();
        }
        if (i2 == 4) {
            return new xsg();
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
        synchronized (xsi.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
