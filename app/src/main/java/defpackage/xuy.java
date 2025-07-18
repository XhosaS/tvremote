package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xuy extends abxd implements abyr {
    public static final xuy a;
    private static volatile abyy f;
    public int b;
    public xuu d;
    public int e;
    private byte g = 2;
    public abxs c = abzb.b;

    static {
        xuy xuyVar = new xuy();
        a = xuyVar;
        xuyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xuy.class, xuyVar);
    }

    private xuy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003ဉ\u0001\u0004င\u0002", new Object[]{"b", "c", xva.class, "d", "e"});
        }
        if (i2 == 3) {
            return new xuy();
        }
        if (i2 == 4) {
            return new xuv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xuy.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
