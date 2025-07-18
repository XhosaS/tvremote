package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phu extends abxd implements abyr {
    public static final phu a;
    private static volatile abyy q;
    public int b;
    public long e;
    public int f;
    public adwd h;
    public long j;
    public adwd k;
    public int m;
    public int n;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public abxs l = abzb.b;
    public String o = "";
    public String p = "";

    static {
        phu phuVar = new phu();
        a = phuVar;
        phuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(phu.class, phuVar);
    }

    private phu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u000e\u0000\u0001\u0002\u0014\u000e\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", pie.class, "i", "f", phs.a, "j", "m", php.a, "n", phn.a, "o", "p"});
        }
        if (i2 == 3) {
            return new phu();
        }
        if (i2 == 4) {
            return new phr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = q;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (phu.class) {
            abwxVar = q;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                q = abwxVar;
            }
        }
        return abwxVar;
    }
}
