package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admo extends abxd implements abyr {
    public static final admo a;
    private static volatile abyy b;
    private int c;
    private admk d;

    static {
        admo admoVar = new admo();
        a = admoVar;
        admoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(admo.class, admoVar);
    }

    private admo() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new admo();
        }
        if (i2 == 4) {
            return new admn();
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
        synchronized (admo.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
