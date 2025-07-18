package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yga extends abxd implements abyr {
    public static final yga a;
    private static volatile abyy j;
    public int b;
    public int c;
    public int g;
    public int i;
    public String d = "";
    public int e = 1;
    public String f = "";
    public String h = "";

    static {
        yga ygaVar = new yga();
        a = ygaVar;
        ygaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yga.class, ygaVar);
    }

    private yga() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006ဈ\u0005\t᠌\b", new Object[]{"b", "c", "d", "e", yfu.a, "f", "g", yfx.a, "h", "i", yfz.a});
        }
        if (i2 == 3) {
            return new yga();
        }
        if (i2 == 4) {
            return new yfw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yga.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
