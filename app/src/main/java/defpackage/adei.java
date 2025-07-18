package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adei extends abxd implements abyr {
    public static final adei a;
    private static volatile abyy c;
    public abyl b = abyl.a;

    static {
        adei adeiVar = new adei();
        a = adeiVar;
        adeiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adei.class, adeiVar);
    }

    private adei() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", adeg.a});
        }
        if (i2 == 3) {
            return new adei();
        }
        if (i2 == 4) {
            return new adeh();
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
        synchronized (adei.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
