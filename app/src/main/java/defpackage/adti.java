package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adti extends abxd implements abyr {
    public static final adti a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        adti adtiVar = new adti();
        a = adtiVar;
        adtiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adti.class, adtiVar);
    }

    private adti() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", adth.class, adtd.class});
        }
        if (i2 == 3) {
            return new adti();
        }
        if (i2 == 4) {
            return new adtb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adti.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
