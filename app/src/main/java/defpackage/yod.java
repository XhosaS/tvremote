package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yod extends abxd implements abyr {
    public static final yod a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        yod yodVar = new yod();
        a = yodVar;
        yodVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yod.class, yodVar);
    }

    private yod() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", yoc.a});
        }
        if (i2 == 3) {
            return new yod();
        }
        if (i2 == 4) {
            return new yob();
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
        synchronized (yod.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
