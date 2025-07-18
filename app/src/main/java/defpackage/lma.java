package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lma extends abxd implements abyr {
    public static final lma a;
    private static volatile abyy d;
    public abxs b = abzb.b;
    public llw c;
    private int e;

    static {
        lma lmaVar = new lma();
        a = lmaVar;
        lmaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lma.class, lmaVar);
    }

    private lma() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"e", "b", lme.class, "c"});
        }
        if (i2 == 3) {
            return new lma();
        }
        if (i2 == 4) {
            return new llz();
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
        synchronized (lma.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
