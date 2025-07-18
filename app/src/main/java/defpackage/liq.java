package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class liq extends abxd implements abyr {
    public static final liq a;
    private static volatile abyy f;
    public int b;
    public int c;
    public abxs d;
    public abxs e;

    static {
        liq liqVar = new liq();
        a = liqVar;
        liqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(liq.class, liqVar);
    }

    private liq() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", lja.class, "e", lis.class});
        }
        if (i2 == 3) {
            return new liq();
        }
        if (i2 == 4) {
            return new lip();
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
        synchronized (liq.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
