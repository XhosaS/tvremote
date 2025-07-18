package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjb extends abxd implements abyr {
    public static final xjb a;
    private static volatile abyy c;
    public int b;
    private int d;

    static {
        xjb xjbVar = new xjb();
        a = xjbVar;
        xjbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xjb.class, xjbVar);
    }

    private xjb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"d", "b", xiz.a});
        }
        if (i2 == 3) {
            return new xjb();
        }
        if (i2 == 4) {
            return new xiy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xjb.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
