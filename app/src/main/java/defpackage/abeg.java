package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abeg extends abxd implements abyr {
    public static final abeg a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        abeg abegVar = new abeg();
        a = abegVar;
        abegVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abeg.class, abegVar);
        adcx adcxVar = adcx.a;
        abee abeeVar = abee.a;
        b = new abxc(adcxVar, abeeVar, abeeVar, new abxb(null, 3, acap.MESSAGE, false, false));
    }

    private abeg() {
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
            return new abeg();
        }
        if (i2 == 4) {
            return new abef();
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
        synchronized (abeg.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
