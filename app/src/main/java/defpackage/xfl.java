package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfl extends abxd implements abyr {
    public static final xfl a;
    private static volatile abyy e;
    public int b;
    public boolean c;
    public xky d;

    static {
        xfl xflVar = new xfl();
        a = xflVar;
        xflVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfl.class, xflVar);
    }

    private xfl() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xfl();
        }
        if (i2 == 4) {
            return new xfk();
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
        synchronized (xfl.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
