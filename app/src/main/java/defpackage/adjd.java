package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjd extends abxd implements abyr {
    public static final adjd a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public abvo d = abvo.b;

    static {
        adjd adjdVar = new adjd();
        a = adjdVar;
        adjdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjd.class, adjdVar);
        b = new abxc(adkb.a, adjdVar, adjdVar, new abxb(null, 293101, acap.MESSAGE, false, false));
    }

    private adjd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adjd();
        }
        if (i2 == 4) {
            return new adjc();
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
        synchronized (adjd.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
