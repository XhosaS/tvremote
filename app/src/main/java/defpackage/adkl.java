package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkl extends abxd implements abyr {
    public static final adkl a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public int d;

    static {
        adkl adklVar = new adkl();
        a = adklVar;
        adklVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkl.class, adklVar);
        b = new abxc(adkb.a, adklVar, adklVar, new abxb(null, 29735924, acap.MESSAGE, false, false));
    }

    private adkl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adkl();
        }
        if (i2 == 4) {
            return new adkk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adkl.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
