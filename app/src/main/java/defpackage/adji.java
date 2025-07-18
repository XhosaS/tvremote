package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adji extends abxd implements abyr {
    public static final adji a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public boolean d;

    static {
        adji adjiVar = new adji();
        a = adjiVar;
        adjiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adji.class, adjiVar);
        b = new abxc(adkb.a, adjiVar, adjiVar, new abxb(null, 77499489, acap.MESSAGE, false, false));
    }

    private adji() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adji();
        }
        if (i2 == 4) {
            return new adjh();
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
        synchronized (adji.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
