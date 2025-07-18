package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adly extends abxd implements abyr {
    public static final adly a;
    private static volatile abyy b;
    private int c;
    private adrw d;

    static {
        adly adlyVar = new adly();
        a = adlyVar;
        adlyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adly.class, adlyVar);
    }

    private adly() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဉ\u0007", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adly();
        }
        if (i2 == 4) {
            return new adlx();
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
        synchronized (adly.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
