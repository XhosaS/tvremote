package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pja extends abxd implements abyr {
    public static final pja a;
    public static volatile abyy b;
    public boolean c;
    private int d;

    static {
        pja pjaVar = new pja();
        a = pjaVar;
        pjaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pja.class, pjaVar);
    }

    private pja() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "c"});
        }
        if (i2 == 3) {
            return new pja();
        }
        if (i2 == 4) {
            return new piz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (pja.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
