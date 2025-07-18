package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdt extends abxd implements abyr {
    public static final pdt a;
    private static volatile abyy c;
    public int b;
    private int d;

    static {
        pdt pdtVar = new pdt();
        a = pdtVar;
        pdtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pdt.class, pdtVar);
    }

    private pdt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new pdt();
        }
        if (i2 == 4) {
            return new pds();
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
        synchronized (pdt.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
