package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adth extends abxd implements abyr {
    public static final adth a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        adth adthVar = new adth();
        a = adthVar;
        adthVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adth.class, adthVar);
    }

    private adth() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", adtf.class});
        }
        if (i2 == 3) {
            return new adth();
        }
        if (i2 == 4) {
            return new adtg();
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
        synchronized (adth.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
