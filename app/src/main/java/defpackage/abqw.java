package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqw extends abxd implements abyr {
    public static final abqw a;
    private static volatile abyy b;
    private int c;
    private abra d;

    static {
        abqw abqwVar = new abqw();
        a = abqwVar;
        abqwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abqw.class, abqwVar);
    }

    private abqw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new abqw();
        }
        if (i2 == 4) {
            return new abqv();
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
        synchronized (abqw.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
