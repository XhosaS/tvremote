package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqq extends abxd implements abyr {
    public static final ahqq a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public ahqs d;

    static {
        ahqq ahqqVar = new ahqq();
        a = ahqqVar;
        ahqqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahqq.class, ahqqVar);
        b = new abxc(ahqu.a, ahqqVar, ahqqVar, new abxb(null, 483048578, acap.MESSAGE, false, false));
    }

    private ahqq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new ahqq();
        }
        if (i2 == 4) {
            return new ahqp();
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
        synchronized (ahqq.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
