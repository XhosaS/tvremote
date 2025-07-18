package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpi extends abxd implements abyr {
    public static final ahpi a;
    private static volatile abyy p;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public ahpd l;
    public ahqu m;
    public ahwb n;
    public ahwh o;
    private byte q = 2;
    public String c = "";

    static {
        ahpi ahpiVar = new ahpi();
        a = ahpiVar;
        ahpiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahpi.class, ahpiVar);
    }

    private ahpi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f", new Object[]{"b", "c", "d", ahpg.a, "e", "f", ahpf.a, "g", "i", "j", "k", "l", "h", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new ahpi();
        }
        if (i2 == 4) {
            return new ahpe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = p;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahpi.class) {
            abwxVar = p;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                p = abwxVar;
            }
        }
        return abwxVar;
    }
}
