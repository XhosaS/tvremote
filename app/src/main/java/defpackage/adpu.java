package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpu extends abxd implements abyr {
    public static final adpu a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        adpu adpuVar = new adpu();
        a = adpuVar;
        adpuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpu.class, adpuVar);
    }

    private adpu() {
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0001\u0000\u0000\u00072", new Object[]{"c", adpt.a});
        }
        if (i2 == 3) {
            return new adpu();
        }
        if (i2 == 4) {
            return new adps();
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
        synchronized (adpu.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
