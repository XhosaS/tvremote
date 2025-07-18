package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xuh extends abxd implements abyr {
    public static final xuh a;
    private static volatile abyy d;
    public xuf b;
    public xuc c;
    private int e;
    private byte f = 2;

    static {
        xuh xuhVar = new xuh();
        a = xuhVar;
        xuhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xuh.class, xuhVar);
    }

    private xuh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new xuh();
        }
        if (i2 == 4) {
            return new xug();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xuh.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
