package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkn extends abxd implements abyr {
    public static final adkn a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        adkn adknVar = new adkn();
        a = adknVar;
        adknVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkn.class, adknVar);
        b = new abxc(adkf.a, adknVar, adknVar, new abxb(null, 29737259, acap.MESSAGE, false, false));
    }

    private adkn() {
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
            return new adkn();
        }
        if (i2 == 4) {
            return new adkm();
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
        synchronized (adkn.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
