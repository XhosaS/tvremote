package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcg extends abxd implements abyr {
    public static final adcg a;
    private static volatile abyy c;
    public String b = "";

    static {
        adcg adcgVar = new adcg();
        a = adcgVar;
        adcgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adcg.class, adcgVar);
    }

    private adcg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new adcg();
        }
        if (i2 == 4) {
            return new adcf();
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
        synchronized (adcg.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
