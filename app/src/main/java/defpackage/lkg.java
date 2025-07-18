package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkg extends abxd implements abyr {
    public static final lkg a;
    private static volatile abyy m;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;
    public String h;
    public String i;
    public long j;
    public abyl k;
    public abyl l;

    static {
        lkg lkgVar = new lkg();
        a = lkgVar;
        lkgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lkg.class, lkgVar);
    }

    private lkg() {
        abyl abylVar = abyl.a;
        this.k = abylVar;
        this.l = abylVar;
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = "";
        this.h = "";
        this.i = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", lke.a, "l", lkf.a});
        }
        if (i2 == 3) {
            return new lkg();
        }
        if (i2 == 4) {
            return new lkd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lkg.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
