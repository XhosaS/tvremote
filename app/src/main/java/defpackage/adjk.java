package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjk extends abxd implements abyr {
    public static final adjk a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public int d;

    static {
        adjk adjkVar = new adjk();
        a = adjkVar;
        adjkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjk.class, adjkVar);
        b = new abxc(adkb.a, adjkVar, adjkVar, new abxb(null, 27301014, acap.MESSAGE, false, false));
    }

    private adjk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005င\u0004", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adjk();
        }
        if (i2 == 4) {
            return new adjj();
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
        synchronized (adjk.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
