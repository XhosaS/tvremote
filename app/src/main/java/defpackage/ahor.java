package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahor extends abxd implements abyr {
    public static final ahor a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ahor ahorVar = new ahor();
        a = ahorVar;
        ahorVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahor.class, ahorVar);
    }

    private ahor() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", rxm.a, "d", ahos.a, "e"});
        }
        if (i2 == 3) {
            return new ahor();
        }
        if (i2 == 4) {
            return new ahoq();
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
        synchronized (ahor.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
