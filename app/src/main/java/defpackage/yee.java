package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yee extends abxd implements abyr {
    public static final yee a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        yee yeeVar = new yee();
        a = yeeVar;
        yeeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yee.class, yeeVar);
    }

    private yee() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", ygg.a});
        }
        if (i2 == 3) {
            return new yee();
        }
        if (i2 == 4) {
            return new yed();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yee.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
