package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqq extends abxd implements abyr {
    public static final xqq a;
    private static volatile abyy e;
    public xbg c;
    public xqs d;
    private int f;
    private xan g;
    private byte h = 2;
    public String b = "";

    static {
        xqq xqqVar = new xqq();
        a = xqqVar;
        xqqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xqq.class, xqqVar);
    }

    private xqq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0000\u0001\u0001ဈ\u0003\u0004ဉ\u0005\nᐉ\t\rဉ\u0006", new Object[]{"f", "b", "c", "g", "d"});
        }
        if (i2 == 3) {
            return new xqq();
        }
        if (i2 == 4) {
            return new xqp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xqq.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
