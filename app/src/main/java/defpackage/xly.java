package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xly extends abxd implements abyr {
    public static final xly a;
    private static volatile abyy m;
    public int b;
    public Object d;
    public xbg f;
    public xmk g;
    public int j;
    public xjp k;
    public acjc l;
    private xaj n;
    public int c = 0;
    private byte o = 2;
    public String e = "";
    public abxs h = abzb.b;
    public String i = "";

    static {
        xly xlyVar = new xly();
        a = xlyVar;
        xlyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xly.class, xlyVar);
    }

    private xly() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u000b\u0001\u0001\u0001\u0013\u000b\u0000\u0001\u0004\u0001ဈ\u0000\u0002ဉ\u0002\u0003ᐉ\u0003\f\u001a\rဈ\b\u000e᠌\t\u000f<\u0000\u0010м\u0000\u0011ဉ\n\u0012ᐉ\u000b\u0013ᐉ\f", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", xlw.a, aago.class, xan.class, "k", "l", "n"});
        }
        if (i2 == 3) {
            return new xly();
        }
        if (i2 == 4) {
            return new xlv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xly.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
