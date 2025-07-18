package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqy extends abxd implements abyr {
    public static final xqy a;
    private static volatile abyy d;
    public String b = "";
    public int c;
    private int e;

    static {
        xqy xqyVar = new xqy();
        a = xqyVar;
        xqyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xqy.class, xqyVar);
    }

    private xqy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"e", "b", "c", xqw.a});
        }
        if (i2 == 3) {
            return new xqy();
        }
        if (i2 == 4) {
            return new xqv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xqy.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
