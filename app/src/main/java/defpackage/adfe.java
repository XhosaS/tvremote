package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfe extends abxd implements abyr {
    public static final adfe a;
    private static volatile abyy e;
    public float b;
    public float c = 1.0f;
    public long d = 1000;
    private int f;

    static {
        adfe adfeVar = new adfe();
        a = adfeVar;
        adfeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfe.class, adfeVar);
    }

    private adfe() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဂ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new adfe();
        }
        if (i2 == 4) {
            return new adfd();
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
        synchronized (adfe.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
