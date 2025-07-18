package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfp extends abxd implements abyr {
    public static final xfp a;
    private static volatile abyy k;
    public int b;
    public xfi d;
    public xfg e;
    public xgi f;
    public xfl g;
    public xgn h;
    public xgk i;
    public xgt j;
    private xfs l;
    private byte m = 2;
    public String c = "";

    static {
        xfp xfpVar = new xfp();
        a = xfpVar;
        xfpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfp.class, xfpVar);
    }

    private xfp() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0000\u0001\u0002\u0019\t\u0000\u0000\u0001\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0006\u0006ᐉ\u0007\tဈ\u0001\u000fဉ\u0010\u0016ဉ\u0014\u0019ဉ\u001b", new Object[]{"b", "d", "e", "f", "g", "h", "c", "l", "i", "j"});
        }
        if (i2 == 3) {
            return new xfp();
        }
        if (i2 == 4) {
            return new xfo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xfp.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
