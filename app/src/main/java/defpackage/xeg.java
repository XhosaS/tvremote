package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xeg extends abxd implements abyr {
    public static final xeg a;
    private static volatile abyy h;
    public int b;
    public xjp d;
    public int e;
    public int f;
    private zpe i;
    public byte g = 2;
    public String c = "";

    static {
        xeg xegVar = new xeg();
        a = xegVar;
        xegVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xeg.class, xegVar);
    }

    public xeg() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0003\u0011\u0005\u0000\u0000\u0001\u0003ဈ\u0001\tဉ\b\r᠌\n\u000fᐉ\f\u0011င\u000e", new Object[]{"b", "c", "d", "e", xbl.a, "i", "f"});
        }
        if (i2 == 3) {
            return new xeg();
        }
        if (i2 == 4) {
            return new xef();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xeg.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
