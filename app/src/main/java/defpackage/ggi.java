package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggi extends abxd implements abyr {
    public static final ggi a;
    private static volatile abyy n;
    public int b;
    public Object d;
    public Object f;
    public int g;
    public abwf i;
    public ahrs m;
    public int c = 0;
    public int e = 0;
    public abyl k = abyl.a;
    public String h = "";
    public int j = 2;
    public String l = "";

    static {
        ggi ggiVar = new ggi();
        a = ggiVar;
        ggiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ggi.class, ggiVar);
    }

    private ggi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000b\u0002\u0001\u0001\u000b\u000b\u0001\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004?\u0000\u0005\u083f\u0000\u0006Ȼ\u0001\u0007?\u0001\b2\tለ\u0004\nဉ\u0005\u000bဌ\u0003", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", abqa.a, "k", ggh.a, "l", "m", "j"});
        }
        if (i2 == 3) {
            return new ggi();
        }
        if (i2 == 4) {
            return new ggf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = n;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ggi.class) {
            abwxVar = n;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                n = abwxVar;
            }
        }
        return abwxVar;
    }
}
