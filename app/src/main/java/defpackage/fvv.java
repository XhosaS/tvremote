package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvv extends abxd implements abyr {
    public static final fvv a;
    private static volatile abyy c;
    public abyl b = abyl.a;

    static {
        fvv fvvVar = new fvv();
        a = fvvVar;
        fvvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fvv.class, fvvVar);
    }

    private fvv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", fvs.a});
        }
        if (i2 == 3) {
            return new fvv();
        }
        if (i2 == 4) {
            return new fvr();
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
        synchronized (fvv.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
