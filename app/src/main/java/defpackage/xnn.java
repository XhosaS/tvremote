package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnn extends abxd implements abyr {
    public static final xnn a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public abvo d = abvo.b;

    static {
        xnn xnnVar = new xnn();
        a = xnnVar;
        xnnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xnn.class, xnnVar);
    }

    private xnn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xnn();
        }
        if (i2 == 4) {
            return new xnm();
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
        synchronized (xnn.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
