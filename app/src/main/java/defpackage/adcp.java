package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcp extends abxd implements abyr {
    public static final adcp a;
    private static volatile abyy f;
    public int b;
    public zpk c;
    public boolean d;
    public int e;
    private zlt g;
    private byte h = 2;

    static {
        adcp adcpVar = new adcp();
        a = adcpVar;
        adcpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adcp.class, adcpVar);
    }

    private adcp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0004\u000b\u0004\u0000\u0000\u0002\u0004ဇ\u0004\u0006ᐉ\u0001\u0007င\b\u000bᐉ\n", new Object[]{"b", "d", "c", "e", "g"});
        }
        if (i2 == 3) {
            return new adcp();
        }
        if (i2 == 4) {
            return new adco();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adcp.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
