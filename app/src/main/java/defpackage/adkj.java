package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkj extends abxd implements abyr {
    public static final adkj a;
    public static final abxc b;
    private static volatile abyy d;
    public boolean c;
    private int e;

    static {
        adkj adkjVar = new adkj();
        a = adkjVar;
        adkjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkj.class, adkjVar);
        b = new abxc(adkf.a, adkjVar, adkjVar, new abxb(null, 443278602, acap.MESSAGE, false, false));
    }

    private adkj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"e", "c"});
        }
        if (i2 == 3) {
            return new adkj();
        }
        if (i2 == 4) {
            return new adki();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adkj.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
