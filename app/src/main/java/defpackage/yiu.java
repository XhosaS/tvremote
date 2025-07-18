package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yiu extends abxd implements abyr {
    public static final yiu a;
    private static volatile abyy h;
    public int b;
    public yil f;
    public String c = "";
    public int d = 1;
    public int e = 1;
    public String g = "";

    static {
        yiu yiuVar = new yiu();
        a = yiuVar;
        yiuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yiu.class, yiuVar);
    }

    private yiu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0005\u0003᠌\u0001\u0004᠌\u0003\u0006ဈ\b", new Object[]{"b", "c", "f", "d", yib.a, "e", yis.a, "g"});
        }
        if (i2 == 3) {
            return new yiu();
        }
        if (i2 == 4) {
            return new yit();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yiu.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
