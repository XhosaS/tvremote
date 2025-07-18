package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayc extends abxd implements abyr {
    public static final aayc a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        aayc aaycVar = new aayc();
        a = aaycVar;
        aaycVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aayc.class, aaycVar);
    }

    private aayc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006᠌\u0000", new Object[]{"b", "c", aayb.a});
        }
        if (i2 == 3) {
            return new aayc();
        }
        if (i2 == 4) {
            return new aaya();
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
        synchronized (aayc.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
