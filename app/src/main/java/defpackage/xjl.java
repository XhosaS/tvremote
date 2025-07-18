package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjl extends abxd implements abyr {
    public static final xjl a;
    private static volatile abyy c;
    public long b;
    private int d;

    static {
        xjl xjlVar = new xjl();
        a = xjlVar;
        xjlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xjl.class, xjlVar);
    }

    private xjl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဂ\u0002", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new xjl();
        }
        if (i2 == 4) {
            return new xjk();
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
        synchronized (xjl.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
