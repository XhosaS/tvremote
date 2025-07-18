package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sec extends abxd implements abyr {
    public static final sec a;
    private static volatile abyy l;
    public int b;
    public Object d;
    public ruo e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    private int m;
    private rzn n;
    public int c = 0;
    private byte o = 2;

    static {
        sec secVar = new sec();
        a = secVar;
        secVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(sec.class, secVar);
    }

    private sec() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004<\u0000\u0005ဉ\u0006\u0006\u083f\u0000\u0007ဇ\u0003\bင\u0007\tင\b\nဇ\u0004\u000bဇ\u0005", new Object[]{"d", "c", "b", "e", "m", "f", sag.class, "n", tiw.a, "g", "j", "k", "h", "i"});
        }
        if (i2 == 3) {
            return new sec();
        }
        if (i2 == 4) {
            return new seb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (sec.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
