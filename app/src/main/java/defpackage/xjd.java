package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjd extends abxd implements abyr {
    public static final xjd a;
    public static volatile abyy b;
    public String c = "";
    public String d = "";
    private int e;

    static {
        xjd xjdVar = new xjd();
        a = xjdVar;
        xjdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xjd.class, xjdVar);
    }

    private xjd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "c", "d"});
        }
        if (i2 == 3) {
            return new xjd();
        }
        if (i2 == 4) {
            return new xjc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xjd.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
