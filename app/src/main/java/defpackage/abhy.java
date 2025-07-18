package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhy extends abxd implements abyr {
    public static final abhy a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public abig d;
    public boolean e;

    static {
        abhy abhyVar = new abhy();
        a = abhyVar;
        abhyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abhy.class, abhyVar);
    }

    private abhy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abhy();
        }
        if (i2 == 4) {
            return new abhx();
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
        synchronized (abhy.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
