package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yie extends abxd implements abyr {
    public static final yie a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public boolean d;
    public int e;
    public yil f;

    static {
        yie yieVar = new yie();
        a = yieVar;
        yieVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yie.class, yieVar);
    }

    private yie() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0007\u0003ဉ\b\u0005ဇ\u0006", new Object[]{"b", "c", "e", yib.a, "f", "d"});
        }
        if (i2 == 3) {
            return new yie();
        }
        if (i2 == 4) {
            return new yid();
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
        synchronized (yie.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
