package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xds extends abxd implements abyr {
    public static final xds a;
    private static volatile abyy g;
    public int b;
    public abmr c;
    public int d;
    public boolean e;
    public xej f;
    private byte h = 2;

    static {
        xds xdsVar = new xds();
        a = xdsVar;
        xdsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xds.class, xdsVar);
    }

    private xds() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", xdr.a, "e", "f"});
        }
        if (i2 == 3) {
            return new xds();
        }
        if (i2 == 4) {
            return new xdq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xds.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
