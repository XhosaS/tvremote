package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwq extends abxd implements abyr {
    public static final xwq a;
    private static volatile abyy d;
    public int b;
    public String c = "";
    private int e;

    static {
        xwq xwqVar = new xwq();
        a = xwqVar;
        xwqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xwq.class, xwqVar);
    }

    private xwq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"e", "b", cou.a, "c"});
        }
        if (i2 == 3) {
            return new xwq();
        }
        if (i2 == 4) {
            return new xwp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xwq.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
