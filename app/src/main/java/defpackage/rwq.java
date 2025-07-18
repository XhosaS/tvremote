package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwq extends abxd implements abyr {
    public static final rwq a;
    private static volatile abyy c;
    public rzf b;
    private int d;

    static {
        rwq rwqVar = new rwq();
        a = rwqVar;
        rwqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rwq.class, rwqVar);
    }

    private rwq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new rwq();
        }
        if (i2 == 4) {
            return new rwp();
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
        synchronized (rwq.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
