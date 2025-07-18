package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbr extends abxd implements abyr {
    public static final xbr a;
    private static volatile abyy d;
    public int b;
    public long c;
    private int e;
    private acqk f;
    private byte g = 2;

    static {
        xbr xbrVar = new xbr();
        a = xbrVar;
        xbrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xbr.class, xbrVar);
    }

    private xbr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0005\t\u0003\u0000\u0000\u0001\u0005᠌\u0002\u0006ဂ\u0003\tᐉ\u0006", new Object[]{"e", "b", xbo.a, "c", "f"});
        }
        if (i2 == 3) {
            return new xbr();
        }
        if (i2 == 4) {
            return new xbq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xbr.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
