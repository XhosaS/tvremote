package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class eov extends abxd implements abyr {
    public static final eov a;
    private static volatile abyy b;
    private int c;
    private eoz d;
    private eoz e;

    static {
        eov eovVar = new eov();
        a = eovVar;
        eovVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(eov.class, eovVar);
    }

    private eov() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new eov();
        }
        if (i2 == 4) {
            return new eou();
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
        synchronized (eov.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
