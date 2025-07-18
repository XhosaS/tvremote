package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagl extends abxd implements abyr {
    public static final aagl a;
    private static volatile abyy c;
    public long b = -1;
    private int d;

    static {
        aagl aaglVar = new aagl();
        a = aaglVar;
        aaglVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aagl.class, aaglVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new aagl();
        }
        if (i2 == 4) {
            return new aagk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aagl.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
