package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adku extends abxd implements abyr {
    public static final adku a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public int d;

    static {
        adku adkuVar = new adku();
        a = adkuVar;
        adkuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adku.class, adkuVar);
        b = new abxc(adjv.a, adkuVar, adkuVar, new abxb(null, 112997213, acap.MESSAGE, false, false));
    }

    private adku() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "d", adkt.a});
        }
        if (i2 == 3) {
            return new adku();
        }
        if (i2 == 4) {
            return new adks();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adku.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
