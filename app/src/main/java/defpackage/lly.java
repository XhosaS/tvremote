package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lly extends abxd implements abyr {
    public static final lly a;
    private static volatile abyy d;
    public String b = "";
    public abxs c = abzb.b;
    private int e;

    static {
        lly llyVar = new lly();
        a = llyVar;
        llyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lly.class, llyVar);
    }

    private lly() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", lme.class});
        }
        if (i2 == 3) {
            return new lly();
        }
        if (i2 == 4) {
            return new llx();
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
        synchronized (lly.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
