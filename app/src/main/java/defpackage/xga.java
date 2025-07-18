package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xga extends abxd implements abyr {
    public static final xga a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public int d;
    public xbg e;

    static {
        xga xgaVar = new xga();
        a = xgaVar;
        xgaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xga.class, xgaVar);
    }

    private xga() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", xgb.a, "e"});
        }
        if (i2 == 3) {
            return new xga();
        }
        if (i2 == 4) {
            return new xfz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xga.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
