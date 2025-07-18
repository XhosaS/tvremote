package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagq extends abxd implements abyr {
    public static final aagq a;
    private static volatile abyy b;
    private int c;
    private ackj d;
    private acqo e;
    private byte f = 2;

    static {
        aagq aagqVar = new aagq();
        a = aagqVar;
        aagqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aagq.class, aagqVar);
    }

    private aagq() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\b\u0012\u0002\u0000\u0000\u0001\bᐉ\u0005\u0012ဉ\t", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new aagq();
        }
        if (i2 == 4) {
            return new aagp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aagq.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
