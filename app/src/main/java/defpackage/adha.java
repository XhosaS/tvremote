package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adha extends abxd implements abyr {
    public static final adha a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        adha adhaVar = new adha();
        a = adhaVar;
        adhaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adha.class, adhaVar);
    }

    private adha() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", adgz.class});
        }
        if (i2 == 3) {
            return new adha();
        }
        if (i2 == 4) {
            return new adgx();
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
        synchronized (adha.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
