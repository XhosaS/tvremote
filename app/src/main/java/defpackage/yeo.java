package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yeo extends abxd implements abyr {
    public static final yeo a;
    private static volatile abyy g;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public int f;

    static {
        yeo yeoVar = new yeo();
        a = yeoVar;
        yeoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yeo.class, yeoVar);
    }

    private yeo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", yem.a, "d", "e", "f", yen.a});
        }
        if (i2 == 3) {
            return new yeo();
        }
        if (i2 == 4) {
            return new yel();
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
        synchronized (yeo.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
