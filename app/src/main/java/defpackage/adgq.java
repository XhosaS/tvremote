package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgq extends abxd implements abyr {
    public static final adgq a;
    private static volatile abyy d;
    public adgo b;
    public boolean c;
    private int e;

    static {
        adgq adgqVar = new adgq();
        a = adgqVar;
        adgqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adgq.class, adgqVar);
    }

    private adgq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new adgq();
        }
        if (i2 == 4) {
            return new adgp();
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
        synchronized (adgq.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
