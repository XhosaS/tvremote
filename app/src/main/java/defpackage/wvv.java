package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvv extends abxd implements abyr {
    public static final wvv a;
    private static volatile abyy k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public boolean j;

    static {
        wvv wvvVar = new wvv();
        a = wvvVar;
        wvvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(wvv.class, wvvVar);
    }

    private wvv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0005\u0006ဇ\b\b᠌\t\tဇ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", wvu.a, "j"});
        }
        if (i2 == 3) {
            return new wvv();
        }
        if (i2 == 4) {
            return new wvt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (wvv.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
