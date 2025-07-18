package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlb extends abxd implements abyr {
    public static final adlb a;
    public static final abxc b;
    private static volatile abyy d;
    public abxs c = abzb.b;

    static {
        adlb adlbVar = new adlb();
        a = adlbVar;
        adlbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adlb.class, adlbVar);
        b = new abxc(adkf.a, adlbVar, adlbVar, new abxb(null, 144480582, acap.MESSAGE, false, false));
    }

    private adlb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", adkx.class});
        }
        if (i2 == 3) {
            return new adlb();
        }
        if (i2 == 4) {
            return new adla();
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
        synchronized (adlb.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
