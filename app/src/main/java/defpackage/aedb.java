package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aedb extends abxd implements abyr {
    public static final aedb a;
    private static volatile abyy b;

    static {
        aedb aedbVar = new aedb();
        a = aedbVar;
        aedbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aedb.class, aedbVar);
    }

    private aedb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aedb();
        }
        if (i2 == 4) {
            return new aeda();
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
        synchronized (aedb.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
