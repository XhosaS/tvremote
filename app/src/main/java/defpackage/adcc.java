package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcc extends abxd implements abyr {
    public static final adcc a;
    public static final abxc b;
    private static volatile abyy e;
    public abxs c;
    public abxs d;
    private byte f = 2;

    static {
        adcc adccVar = new adcc();
        a = adccVar;
        adccVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adcc.class, adccVar);
        b = new abxc(adby.a, adccVar, adccVar, new abxb(null, 119417111, acap.MESSAGE, false, false));
    }

    private adcc() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0000\u0001\u0005\u0002\u0000\u0002\u0000\u0001\u001b\u0005\u001b", new Object[]{"c", zkb.class, "d", zke.class});
        }
        if (i2 == 3) {
            return new adcc();
        }
        if (i2 == 4) {
            return new adcb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adcc.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
