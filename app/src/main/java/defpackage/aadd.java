package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadd extends abxd implements abyr {
    public static final aadd a;
    private static volatile abyy g;
    public int b;
    public aacz c;
    public int d;
    public int e;
    public int f;

    static {
        aadd aaddVar = new aadd();
        a = aaddVar;
        aaddVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aadd.class, aaddVar);
    }

    private aadd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aadd();
        }
        if (i2 == 4) {
            return new aadc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aadd.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
