package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdy extends abxd implements abyr {
    public static final abxk a = new xdw();
    public static final xdy b;
    private static volatile abyy j;
    public int c;
    public xbg d;
    public xkw e;
    public xmk f;
    public int h;
    public long i;
    private byte k = 2;
    public abxj g = abxe.a;

    static {
        xdy xdyVar = new xdy();
        b = xdyVar;
        xdyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xdy.class, xdyVar);
    }

    private xdy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abzc(b, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ࠞ\u0005᠌\u0004\u0007ဂ\u0006", new Object[]{"c", "d", "e", "f", "g", xec.a, "h", xea.a, "i"});
        }
        if (i2 == 3) {
            return new xdy();
        }
        if (i2 == 4) {
            return new xdx();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xdy.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
