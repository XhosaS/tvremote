package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class advj extends abxd implements abyr {
    public static final advj a;
    public static final abxc b;
    private static volatile abyy r;
    public int c;
    public int d;
    public int e;
    public adge f;
    public boolean h;
    public boolean i;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public adiy p;
    public boolean q;
    private byte s = 2;
    public int g = 1;
    public int j = 2;

    static {
        advj advjVar = new advj();
        a = advjVar;
        advjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(advj.class, advjVar);
        b = new abxc(adkb.a, advjVar, advjVar, new abxb(null, 294500, acap.MESSAGE, false, false));
    }

    private advj() {
        Object[] objArr = abzb.a;
        this.k = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.s);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\f\u0000\u0003\u0001@\f\u0000\u0000\u0001\u0001ᐉ\u0000\u0003င\u0001\u0005ဇ\u0004\u0007င\u000e\u000eဇ\u0019\u0014ဇ \u0017ဇ\u0006(ဇ0*ဇ4+ဉ5>ဇC@ဈ\u0015", new Object[]{"c", "d", "e", "f", "g", "h", "j", "l", "m", "i", "n", "o", "p", "q", "k"});
        }
        if (i2 == 3) {
            return new advj();
        }
        if (i2 == 4) {
            return new advi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.s = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = r;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (advj.class) {
            abwxVar = r;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                r = abwxVar;
            }
        }
        return abwxVar;
    }
}
