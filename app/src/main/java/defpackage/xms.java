package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xms extends abxd implements abyr {
    public static final xms a;
    private static volatile abyy c;
    public String b = "";
    private int d;

    static {
        xms xmsVar = new xms();
        a = xmsVar;
        xmsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xms.class, xmsVar);
    }

    private xms() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new xms();
        }
        if (i2 == 4) {
            return new xmr();
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
        synchronized (xms.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
