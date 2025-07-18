package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvg extends abxd implements abyr {
    public static final xvg a;
    private static volatile abyy k;
    public int b;
    public abkt c;
    public xdl d;
    public xfp e;
    public xds f;
    public int g;
    public String h;
    public xvn i;
    public String j;
    private xvj l;
    private xvl m;
    private byte n = 2;

    static {
        xvg xvgVar = new xvg();
        a = xvgVar;
        xvgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xvg.class, xvgVar);
    }

    private xvg() {
        abvo abvoVar = abvo.b;
        abyf abyfVar = abyf.a;
        Object[] objArr = abzb.a;
        this.h = "";
        this.j = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\n\u0000\u0001\u0002\u0017\n\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\t᠌\t\u000fဈ\u000e\u0010ᐉ\u0005\u0011ဉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011\u0017ဈ\u0014", new Object[]{"b", "c", "d", "e", "g", xtu.a, "h", "f", "l", "m", "i", "j"});
        }
        if (i2 == 3) {
            return new xvg();
        }
        if (i2 == 4) {
            return new xvf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xvg.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
