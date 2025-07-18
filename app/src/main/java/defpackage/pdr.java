package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdr extends abxd implements abyr {
    public static final pdr a;
    private static volatile abyy d;
    public int b;
    public long c;

    static {
        pdr pdrVar = new pdr();
        a = pdrVar;
        pdrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pdr.class, pdrVar);
    }

    private pdr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new pdr();
        }
        if (i2 == 4) {
            return new pdq();
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
        synchronized (pdr.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
