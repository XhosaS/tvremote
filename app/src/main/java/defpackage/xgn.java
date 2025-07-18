package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgn extends abxd implements abyr {
    public static final xgn a;
    private static volatile abyy j;
    public int b;
    public abxs c;
    public xka d;
    public abxs e;
    public xgr f;
    public xgd g;
    public abxs h;
    public xfy i;
    private abyl k = abyl.a;
    private byte l = 2;

    static {
        xgn xgnVar = new xgn();
        a = xgnVar;
        xgnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xgn.class, xgnVar);
    }

    private xgn() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.e = abzbVar;
        this.h = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0001\u0016\b\u0001\u0003\u0001\u0001\u001b\u0002ဉ\u0000\u0004\u001b\u0007ဉ\u0007\bᐉ\b\u0014\u001b\u0015ဉ\u000f\u00162", new Object[]{"b", "c", xgp.class, "d", "e", xfb.class, "f", "g", "h", xga.class, "i", "k", xgl.a});
        }
        if (i2 == 3) {
            return new xgn();
        }
        if (i2 == 4) {
            return new xgm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.l = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xgn.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
