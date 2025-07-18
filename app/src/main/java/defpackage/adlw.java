package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlw extends abxd implements abyr {
    public static final adlw a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        adlw adlwVar = new adlw();
        a = adlwVar;
        adlwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adlw.class, adlwVar);
    }

    private adlw() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0001\u0000\b\t\u0002\u0000\u0000\u0000\b;\u0000\t\u083f\u0000", new Object[]{"c", "b", admt.a});
        }
        if (i2 == 3) {
            return new adlw();
        }
        if (i2 == 4) {
            return new adlv();
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
        synchronized (adlw.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
