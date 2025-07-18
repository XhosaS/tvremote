package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xem extends abxd implements abyr {
    public static final xem a;
    private static volatile abyy e;
    public int b;
    public abvo c;
    public abvo d;

    static {
        xem xemVar = new xem();
        a = xemVar;
        xemVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xem.class, xemVar);
    }

    private xem() {
        abvo abvoVar = abvo.b;
        this.c = abvoVar;
        this.d = abvoVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xem();
        }
        if (i2 == 4) {
            return new xel();
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
        synchronized (xem.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
