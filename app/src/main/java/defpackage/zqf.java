package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqf extends abxd implements abyr {
    public static final zqf a;
    private static volatile abyy l;
    public int b;
    public int d;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public boolean k;
    public String c = "";
    public String e = "";
    public String j = "";

    static {
        zqf zqfVar = new zqf();
        a = zqfVar;
        zqfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqf.class, zqfVar);
    }

    private zqf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဈ\u0007\bင\u0004\tဇ\b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
        }
        if (i2 == 3) {
            return new zqf();
        }
        if (i2 == 4) {
            return new zqe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zqf.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
