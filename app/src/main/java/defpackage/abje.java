package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abje extends abxd implements abyr {
    public static final abje a;
    private static volatile abyy g;
    public int b;
    public abjk c;
    public abjk d;
    public abjm e;
    public abkp f;

    static {
        abje abjeVar = new abje();
        a = abjeVar;
        abjeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abje.class, abjeVar);
    }

    private abje() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "e", "f", "c", "d"});
        }
        if (i2 == 3) {
            return new abje();
        }
        if (i2 == 4) {
            return new abjd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abje.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
