package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivg extends abxd implements abyr {
    public static final ivg a;
    private static volatile abyy e;
    public int b;
    public abzy c;
    public abvo d = abvo.b;

    static {
        ivg ivgVar = new ivg();
        a = ivgVar;
        ivgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ivg.class, ivgVar);
    }

    private ivg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ivg();
        }
        if (i2 == 4) {
            return new ivf();
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
        synchronized (ivg.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
