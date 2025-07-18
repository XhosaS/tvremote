package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfb extends abxd implements abyr {
    public static final xfb a;
    private static volatile abyy g;
    public int b;
    public xbg c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        xfb xfbVar = new xfb();
        a = xfbVar;
        xfbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfb.class, xfbVar);
    }

    private xfb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xfb();
        }
        if (i2 == 4) {
            return new xfa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xfb.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
