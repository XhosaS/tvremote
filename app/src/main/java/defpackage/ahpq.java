package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpq extends abxd implements abyr {
    public static final ahpq a;
    private static volatile abyy m;
    public int b;
    public int c;
    public long d;
    public ahqu g;
    public int h;
    public long i;
    public ahqi j;
    public long k;
    public long l;
    private byte n = 2;
    public String e = "";
    public String f = "";

    static {
        ahpq ahpqVar = new ahpq();
        a = ahpqVar;
        ahpqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahpq.class, ahpqVar);
    }

    private ahpq() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            abxh abxhVar = ahpo.a;
            return new abzc(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", abxhVar, "h", abxhVar, "i", "j", "k", "d", "e", "f", "g", "l"});
        }
        if (i2 == 3) {
            return new ahpq();
        }
        if (i2 == 4) {
            return new ahpn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahpq.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
