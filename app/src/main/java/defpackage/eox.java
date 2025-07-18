package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eox extends abxd implements abyr {
    public static final eox a;
    private static volatile abyy b;
    private int c;
    private eoz d;

    static {
        eox eoxVar = new eox();
        a = eoxVar;
        eoxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(eox.class, eoxVar);
    }

    private eox() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new eox();
        }
        if (i2 == 4) {
            return new eow();
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
        synchronized (eox.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
