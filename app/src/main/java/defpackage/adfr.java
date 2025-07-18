package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfr extends abxd implements abyr {
    public static final adfr a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        adfr adfrVar = new adfr();
        a = adfrVar;
        adfrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfr.class, adfrVar);
        adcx adcxVar = adcx.a;
        adfp adfpVar = adfp.a;
        b = new abxc(adcxVar, adfpVar, adfpVar, new abxb(null, 2, acap.MESSAGE, false, false));
    }

    private adfr() {
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
            return new adfr();
        }
        if (i2 == 4) {
            return new adfq();
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
        synchronized (adfr.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
