package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqg extends abxd implements abyr {
    public static final xqg a;
    private static volatile abyy e;
    public int b;
    public abvo c = abvo.b;
    public boolean d;

    static {
        xqg xqgVar = new xqg();
        a = xqgVar;
        xqgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xqg.class, xqgVar);
    }

    private xqg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\b\u0002\u0000\u0000\u0000\u0001ည\u0000\bဇ\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xqg();
        }
        if (i2 == 4) {
            return new xqf();
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
        synchronized (xqg.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
