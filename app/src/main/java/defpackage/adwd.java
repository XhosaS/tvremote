package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwd extends abxd implements abyr {
    public static final adwd a;
    public static volatile abyy b;
    public abxs c = abzb.b;

    static {
        adwd adwdVar = new adwd();
        a = adwdVar;
        adwdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adwd.class, adwdVar);
    }

    private adwd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", adwb.class});
        }
        if (i2 == 3) {
            return new adwd();
        }
        if (i2 == 4) {
            return new adwc();
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
        synchronized (adwd.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
