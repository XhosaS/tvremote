package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwf extends abxd implements abyr {
    public static final xwf a;
    private static volatile abyy e;
    public int b;
    public int c = 1;
    public boolean d;

    static {
        xwf xwfVar = new xwf();
        a = xwfVar;
        xwfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xwf.class, xwfVar);
    }

    private xwf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0005\t\u0002\u0000\u0000\u0000\u0005᠌\u0000\tဇ\u0001", new Object[]{"b", "c", xjw.a, "d"});
        }
        if (i2 == 3) {
            return new xwf();
        }
        if (i2 == 4) {
            return new xwe();
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
        synchronized (xwf.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
