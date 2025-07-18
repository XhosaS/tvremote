package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aded extends abxd implements abyr {
    public static final aded a;
    public static final abxc b;
    private static volatile abyy d;
    public abxs c = abzb.b;

    static {
        aded adedVar = new aded();
        a = adedVar;
        adedVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aded.class, adedVar);
        b = new abxc(adcx.a, adedVar, adedVar, new abxb(null, 6, acap.MESSAGE, false, false));
    }

    private aded() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", adeb.class});
        }
        if (i2 == 3) {
            return new aded();
        }
        if (i2 == 4) {
            return new adec();
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
        synchronized (aded.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
