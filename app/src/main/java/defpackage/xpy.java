package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpy extends abxd implements abyr {
    public static final xpy a;
    private static volatile abyy e;
    public int d;
    private int f;
    private byte g = 2;
    public abxs b = abzb.b;
    public String c = "";

    static {
        xpy xpyVar = new xpy();
        a = xpyVar;
        xpyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xpy.class, xpyVar);
    }

    private xpy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002᠌\u0001\u0003ဈ\u0000", new Object[]{"f", "b", xpk.class, "d", xpw.a, "c"});
        }
        if (i2 == 3) {
            return new xpy();
        }
        if (i2 == 4) {
            return new xpv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xpy.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
