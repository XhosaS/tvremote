package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhi extends abxd implements abyr {
    public static final xhi a;
    private static volatile abyy f;
    public int b;
    public abxj c = abxe.a;
    public xlf d;
    public xhk e;

    static {
        xhi xhiVar = new xhi();
        a = xhiVar;
        xhiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xhi.class, xhiVar);
    }

    private xhi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0003\t\u0003\u0000\u0001\u0000\u0003ࠞ\u0006ဉ\u0002\tဉ\u0005", new Object[]{"b", "c", xhg.a, "d", "e"});
        }
        if (i2 == 3) {
            return new xhi();
        }
        if (i2 == 4) {
            return new xhf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xhi.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
