package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xww extends abxd implements abyr {
    public static final xww a;
    private static volatile abyy b;
    private int c;
    private xxb d;

    static {
        xww xwwVar = new xww();
        a = xwwVar;
        xwwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xww.class, xwwVar);
    }

    private xww() {
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
            return new abzc(a, "\u0004\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rဉ\t", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new xww();
        }
        if (i2 == 4) {
            return new xwv();
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
        synchronized (xww.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
