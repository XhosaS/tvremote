package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfa extends abxd implements abyr {
    public static final yfa a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abxs d = abzb.b;

    static {
        yfa yfaVar = new yfa();
        a = yfaVar;
        yfaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yfa.class, yfaVar);
    }

    private yfa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", yev.a, "d", yez.class});
        }
        if (i2 == 3) {
            return new yfa();
        }
        if (i2 == 4) {
            return new yex();
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
        synchronized (yfa.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
