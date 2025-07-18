package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoz extends abxd implements abyr {
    public static final eoz a;
    private static volatile abyy b;
    private int c;
    private abzu d;

    static {
        eoz eozVar = new eoz();
        a = eozVar;
        eozVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(eoz.class, eozVar);
    }

    private eoz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new eoz();
        }
        if (i2 == 4) {
            return new eoy();
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
        synchronized (eoz.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
