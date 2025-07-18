package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkc extends abxd implements abyr {
    public static final lkc a;
    private static volatile abyy f;
    public int d;
    private int g;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        lkc lkcVar = new lkc();
        a = lkcVar;
        lkcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lkc.class, lkcVar);
    }

    private lkc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004င\u0003\u0005ဈ\u0004", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new lkc();
        }
        if (i2 == 4) {
            return new lkb();
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
        synchronized (lkc.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
