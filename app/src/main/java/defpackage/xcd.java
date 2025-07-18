package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcd extends abxd implements abyr {
    public static final xcd a;
    private static volatile abyy f;
    public int b;
    public int d;
    public xcc e;
    private xtr g;
    private byte h = 2;
    public String c = "";

    static {
        xcd xcdVar = new xcd();
        a = xcdVar;
        xcdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xcd.class, xcdVar);
    }

    private xcd() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0005\u0017\u0004\u0000\u0000\u0001\u0005ဈ\u0001\u0007င\u0002\nᐉ\u0004\u0017ဉ\r", new Object[]{"b", "c", "d", "g", "e"});
        }
        if (i2 == 3) {
            return new xcd();
        }
        if (i2 == 4) {
            return new xca();
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
        synchronized (xcd.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
