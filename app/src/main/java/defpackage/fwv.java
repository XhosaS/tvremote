package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwv extends abxd implements abyr {
    public static final fwv a;
    private static volatile abyy c;
    public boolean b;

    static {
        fwv fwvVar = new fwv();
        a = fwvVar;
        fwvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fwv.class, fwvVar);
    }

    private fwv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u0007", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new fwv();
        }
        if (i2 == 4) {
            return new fwu();
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
        synchronized (fwv.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
