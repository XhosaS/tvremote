package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adnx extends abwz implements abxa {
    public static final adnx a;
    private static volatile abyy g;
    public int b;
    public int c;
    public int f;
    private byte h = 2;
    public int d = 2;
    public int e = 2;

    static {
        adnx adnxVar = new adnx();
        a = adnxVar;
        adnxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adnx.class, adnxVar);
    }

    private adnx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0002\u0003င\u0003\u0005᠌\u0004", new Object[]{"b", "c", adnu.a, "d", "e", "f", adnw.a});
        }
        if (i2 == 3) {
            return new adnx();
        }
        if (i2 == 4) {
            return new adnt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adnx.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
