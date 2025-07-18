package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgr extends abxd implements abyr {
    public static final sgr a;
    private static volatile abyy b;

    static {
        sgr sgrVar = new sgr();
        a = sgrVar;
        sgrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(sgr.class, sgrVar);
    }

    private sgr() {
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
            return new sgr();
        }
        if (i2 == 4) {
            return new sgq();
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
        synchronized (sgr.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
