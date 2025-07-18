package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtn extends abxd implements abyr {
    public static final adtn a;
    private static volatile abyy c;
    public abyl b = abyl.a;

    static {
        adtn adtnVar = new adtn();
        a = adtnVar;
        adtnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adtn.class, adtnVar);
    }

    private adtn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", adtm.a});
        }
        if (i2 == 3) {
            return new adtn();
        }
        if (i2 == 4) {
            return new adtl();
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
        synchronized (adtn.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
