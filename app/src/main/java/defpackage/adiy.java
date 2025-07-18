package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adiy extends abxd implements abyr {
    public static final adiy a;
    private static volatile abyy g;
    public int b;
    public int e;
    public int c = 2;
    public int d = 2;
    public int f = 1;

    static {
        adiy adiyVar = new adiy();
        a = adiyVar;
        adiyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adiy.class, adiyVar);
    }

    private adiy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003င\u0001\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", adix.a, "f", adit.a});
        }
        if (i2 == 3) {
            return new adiy();
        }
        if (i2 == 4) {
            return new adiw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adiy.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
