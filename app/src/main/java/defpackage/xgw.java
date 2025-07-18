package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgw extends abxd implements abyr {
    public static final xgw a;
    private static volatile abyy e;
    public int b;
    public abyl d = abyl.a;
    public String c = "";

    static {
        xgw xgwVar = new xgw();
        a = xgwVar;
        xgwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xgw.class, xgwVar);
    }

    private xgw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဈ\u0000\u00022", new Object[]{"b", "c", "d", xgv.a});
        }
        if (i2 == 3) {
            return new xgw();
        }
        if (i2 == 4) {
            return new xgu();
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
        synchronized (xgw.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
