package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adrt extends abxd implements abyr {
    public static final adrt a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        adrt adrtVar = new adrt();
        a = adrtVar;
        adrtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adrt.class, adrtVar);
    }

    private adrt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", adrs.a});
        }
        if (i2 == 3) {
            return new adrt();
        }
        if (i2 == 4) {
            return new adrr();
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
        synchronized (adrt.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
