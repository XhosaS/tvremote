package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xka extends abxd implements abyr {
    public static final xka a;
    private static volatile abyy f;
    public int b;
    public int c = 1;
    public boolean d;
    public xjy e;

    static {
        xka xkaVar = new xka();
        a = xkaVar;
        xkaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xka.class, xkaVar);
    }

    private xka() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0005\u001d\u0003\u0000\u0000\u0000\u0005᠌\u0003\tဇ\u0007\u001dဉ\u001b", new Object[]{"b", "c", xjw.a, "d", "e"});
        }
        if (i2 == 3) {
            return new xka();
        }
        if (i2 == 4) {
            return new xjz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xka.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
