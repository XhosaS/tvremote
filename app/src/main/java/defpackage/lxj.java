package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxj extends abxd implements abyr {
    public static final lxj a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public long d;
    public long e;
    public abyl f = abyl.a;

    static {
        lxj lxjVar = new lxj();
        a = lxjVar;
        lxjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lxj.class, lxjVar);
        b = new abxc(aagu.a, lxjVar, lxjVar, new abxb(null, 525000004, acap.MESSAGE, false, false));
    }

    private lxj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u00032", new Object[]{"c", "d", "e", "f", lxh.a});
        }
        if (i2 == 3) {
            return new lxj();
        }
        if (i2 == 4) {
            return new lxi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lxj.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
