package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcr extends abxd implements abyr {
    public static final adcr a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        adcr adcrVar = new adcr();
        a = adcrVar;
        adcrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adcr.class, adcrVar);
        acxt acxtVar = acxt.a;
        adcp adcpVar = adcp.a;
        b = new abxc(acxtVar, adcpVar, adcpVar, new abxb(null, 336074812, acap.MESSAGE, false, false));
    }

    private adcr() {
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
            return new adcr();
        }
        if (i2 == 4) {
            return new adcq();
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
        synchronized (adcr.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
