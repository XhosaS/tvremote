package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxq extends abxd implements abyr {
    public static final aaxq a;
    private static volatile abyy e;
    public int b;
    public aaxu c;
    public aayc d;

    static {
        aaxq aaxqVar = new aaxq();
        a = aaxqVar;
        aaxqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aaxq.class, aaxqVar);
    }

    private aaxq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aaxq();
        }
        if (i2 == 4) {
            return new aaxp();
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
        synchronized (aaxq.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
