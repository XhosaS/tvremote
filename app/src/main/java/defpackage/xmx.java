package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmx extends abxd implements abyr {
    public static final xmx a;
    private static volatile abyy g;
    public int b;
    public xmk c;
    public xbg d;
    public boolean f;
    private byte h = 2;
    public String e = "";

    static {
        xmx xmxVar = new xmx();
        a = xmxVar;
        xmxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xmx.class, xmxVar);
    }

    private xmx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xmx();
        }
        if (i2 == 4) {
            return new xmw();
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
        synchronized (xmx.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
