package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcx extends abxd implements abyr {
    public static final xcx a;
    private static volatile abyy e;
    public String b = "";
    public String c = "";
    public abxs d = abzb.b;
    private int f;

    static {
        xcx xcxVar = new xcx();
        a = xcxVar;
        xcxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xcx.class, xcxVar);
    }

    private xcx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"f", "b", "c", "d", xcz.class});
        }
        if (i2 == 3) {
            return new xcx();
        }
        if (i2 == 4) {
            return new xcw();
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
        synchronized (xcx.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
