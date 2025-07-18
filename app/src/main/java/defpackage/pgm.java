package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgm extends abxd implements abyr {
    public static final pgm a;
    private static volatile abyy f;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e;

    static {
        pgm pgmVar = new pgm();
        a = pgmVar;
        pgmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pgm.class, pgmVar);
    }

    private pgm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new pgm();
        }
        if (i2 == 4) {
            return new pgl();
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
        synchronized (pgm.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
