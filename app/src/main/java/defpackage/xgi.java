package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgi extends abxd implements abyr {
    public static final xgi a;
    private static volatile abyy e;
    public int b;
    public xgg c;
    public int d;

    static {
        xgi xgiVar = new xgi();
        a = xgiVar;
        xgiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xgi.class, xgiVar);
    }

    private xgi() {
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0005᠌\u0003", new Object[]{"b", "c", "d", xgh.a});
        }
        if (i2 == 3) {
            return new xgi();
        }
        if (i2 == 4) {
            return new xge();
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
        synchronized (xgi.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
