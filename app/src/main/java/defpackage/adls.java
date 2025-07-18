package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adls extends abxd implements abyr {
    public static final adls a;
    private static volatile abyy f;
    public int b;
    public int c = 1;
    public int d;
    public int e;

    static {
        adls adlsVar = new adls();
        a = adlsVar;
        adlsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adls.class, adlsVar);
    }

    private adls() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"b", "c", adlq.a, "d", "e"});
        }
        if (i2 == 3) {
            return new adls();
        }
        if (i2 == 4) {
            return new adlp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adls.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
