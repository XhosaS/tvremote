package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xeq extends abxd implements abyr {
    public static final xeq a;
    private static volatile abyy e;
    public int b;
    public long c;
    public String d = "";
    private int f;

    static {
        xeq xeqVar = new xeq();
        a = xeqVar;
        xeqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xeq.class, xeqVar);
    }

    private xeq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0006ဈ\u0003", new Object[]{"f", "b", xeo.a, "c", "d"});
        }
        if (i2 == 3) {
            return new xeq();
        }
        if (i2 == 4) {
            return new xen();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xeq.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
