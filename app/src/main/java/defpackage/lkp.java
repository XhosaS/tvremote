package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkp extends abxd implements abyr {
    public static final lkp a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;

    static {
        lkp lkpVar = new lkp();
        a = lkpVar;
        lkpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lkp.class, lkpVar);
    }

    private lkp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", lkm.a, "d", lkq.a});
        }
        if (i2 == 3) {
            return new lkp();
        }
        if (i2 == 4) {
            return new lko();
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
        synchronized (lkp.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
