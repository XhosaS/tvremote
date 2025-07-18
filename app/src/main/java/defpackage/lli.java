package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lli extends abxd implements abyr {
    public static final lli a;
    private static volatile abyy f;
    public abxm b;
    public abxm c;
    public abxs d;
    public abxs e;

    static {
        lli lliVar = new lli();
        a = lliVar;
        lliVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lli.class, lliVar);
    }

    private lli() {
        abyf abyfVar = abyf.a;
        this.b = abyfVar;
        this.c = abyfVar;
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
            return new abzc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"b", "c", "d", lku.class, "e", llk.class});
        }
        if (i2 == 3) {
            return new lli();
        }
        if (i2 == 4) {
            return new llh();
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
        synchronized (lli.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
