package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwt extends abxd implements abyr {
    public static final fwt a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        fwt fwtVar = new fwt();
        a = fwtVar;
        fwtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fwt.class, fwtVar);
    }

    private fwt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new fwt();
        }
        if (i2 == 4) {
            return new fwr();
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
        synchronized (fwt.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
