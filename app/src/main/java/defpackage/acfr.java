package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfr extends abxd implements abyr {
    public static final abxk a = new acfp();
    public static final acfr b;
    public static volatile abyy c;
    public int d;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int n;
    public abxj e = abxe.a;
    public String f = "";
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        acfr acfrVar = new acfr();
        b = acfrVar;
        acfrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfr.class, acfrVar);
    }

    private acfr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003᠌\u0001\u0004᠌\u0002\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t᠌\u0003\nင\b", new Object[]{"d", "e", acgc.a, "f", "g", achl.a, "h", achn.a, "j", "k", "l", "m", "i", achp.a, "n"});
        }
        if (i2 == 3) {
            return new acfr();
        }
        if (i2 == 4) {
            return new acfq();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acfr.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
