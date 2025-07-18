package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhu extends abxd implements abyr {
    public static final abhu a;
    private static volatile abyy f;
    public int b;
    public abfv c;
    public abwq d;
    public abfj e;

    static {
        abhu abhuVar = new abhu();
        a = abhuVar;
        abhuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abhu.class, abhuVar);
    }

    private abhu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (i2 == 3) {
            return new abhu();
        }
        if (i2 == 4) {
            return new abht();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abhu.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
