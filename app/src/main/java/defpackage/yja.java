package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yja extends abxd implements abyr {
    public static final yja a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        yja yjaVar = new yja();
        a = yjaVar;
        yjaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yja.class, yjaVar);
    }

    private yja() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", yiz.a});
        }
        if (i2 == 3) {
            return new yja();
        }
        if (i2 == 4) {
            return new yiy();
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
        synchronized (yja.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
