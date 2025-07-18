package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpu extends abxd implements abyr {
    public static final xpu a;
    private static volatile abyy c;
    private byte d = 2;
    public abxs b = abzb.b;

    static {
        xpu xpuVar = new xpu();
        a = xpuVar;
        xpuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xpu.class, xpuVar);
    }

    private xpu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", xlm.class});
        }
        if (i2 == 3) {
            return new xpu();
        }
        if (i2 == 4) {
            return new xpt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xpu.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
