package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjy extends abxd implements abyr {
    public static final xjy a;
    private static volatile abyy e;
    public int b;
    public boolean c;
    public boolean d;

    static {
        xjy xjyVar = new xjy();
        a = xjyVar;
        xjyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xjy.class, xjyVar);
    }

    private xjy() {
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
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\r\u0002\u0000\u0000\u0000\u0001ဇ\u0000\rဇ\n", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xjy();
        }
        if (i2 == 4) {
            return new xjx();
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
        synchronized (xjy.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
