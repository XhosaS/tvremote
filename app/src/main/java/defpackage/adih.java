package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adih extends abxd implements abyr {
    public static final adih a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        adih adihVar = new adih();
        a = adihVar;
        adihVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adih.class, adihVar);
    }

    private adih() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"c", adig.a});
        }
        if (i2 == 3) {
            return new adih();
        }
        if (i2 == 4) {
            return new adif();
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
        synchronized (adih.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
