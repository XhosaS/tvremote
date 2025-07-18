package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahov extends abxd implements abyr {
    public static final ahov a;
    public static final abxc b;
    private static volatile abyy l;
    public int c;
    public int d;
    public int e;
    public ahor f;
    public ahou g;
    public ahom h;
    public ahog i;
    public ahoi j;
    public ahok k;

    static {
        ahov ahovVar = new ahov();
        a = ahovVar;
        ahovVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahov.class, ahovVar);
        b = new abxc(epd.a, ahovVar, ahovVar, new abxb(null, 493626098, acap.MESSAGE, false, false));
    }

    private ahov() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0000\u0001\u0002\u000e\b\u0000\u0000\u0000\u0002᠌\u0000\u0003᠌\u0001\u0004ဉ\u0006\u0005ဉ\u0005\u0006ဉ\u0007\bဉ\t\tဉ\n\u000eဉ\f", new Object[]{"c", "d", ahop.a, "e", ahoo.a, "g", "f", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new ahov();
        }
        if (i2 == 4) {
            return new ahon();
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
        synchronized (ahov.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
