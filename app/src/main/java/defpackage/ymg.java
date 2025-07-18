package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymg extends abxd implements abyr {
    public static final ymg a;
    private static volatile abyy l;
    public int b;
    public int c;
    public ylq d;
    public ykc e;
    public yhu f;
    public ylf g;
    public yip h;
    public ynn i;
    public yje j;
    public yjr k;
    private yjj m;
    private yjj n;
    private byte o = 2;

    static {
        ymg ymgVar = new ymg();
        a = ymgVar;
        ymgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ymg.class, ymgVar);
    }

    private ymg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\n\u0000\u0002\u00023\n\u0000\u0000\u0001\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\rဉ\f\u0010ဉ\u0010#ဉ!&ဉ\"3ဉ.", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "m", "n", "k"});
        }
        if (i2 == 3) {
            return new ymg();
        }
        if (i2 == 4) {
            return new ymf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ymg.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
