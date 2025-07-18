package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfv extends abxd implements abyr {
    public static final xfv a;
    private static volatile abyy f;
    public int b;
    public int d;
    public String c = "";
    public abxs e = abzb.b;

    static {
        xfv xfvVar = new xfv();
        a = xfvVar;
        xfvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfv.class, xfvVar);
    }

    private xfv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u001b", new Object[]{"b", "c", "d", xgb.a, "e", xfx.class});
        }
        if (i2 == 3) {
            return new xfv();
        }
        if (i2 == 4) {
            return new xfu();
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
        synchronized (xfv.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
