package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abre extends abxd implements abyr {
    public static final abxk a = new abrb();
    public static final abre b;
    private static volatile abyy f;
    public int c;
    public int d;
    public abxj e = abxe.a;

    static {
        abre abreVar = new abre();
        b = abreVar;
        abreVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abre.class, abreVar);
    }

    private abre() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002\f\u0003,\u0004\f", new Object[]{"d", "e", "c"});
        }
        if (i2 == 3) {
            return new abre();
        }
        if (i2 == 4) {
            return new abrc();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abre.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
