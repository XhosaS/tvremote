package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abis extends abxd implements abyr {
    public static final abis a;
    private static volatile abyy e;
    public int b;
    public long c;
    public long d;

    static {
        abis abisVar = new abis();
        a = abisVar;
        abisVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abis.class, abisVar);
    }

    private abis() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abis();
        }
        if (i2 == 4) {
            return new abir();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abis.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
