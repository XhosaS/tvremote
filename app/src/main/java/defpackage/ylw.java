package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylw extends abxd implements abyr {
    public static final ylw a;
    private static volatile abyy f;
    public int b;
    public ylv c;
    public String d = "";
    public String e = "";

    static {
        ylw ylwVar = new ylw();
        a = ylwVar;
        ylwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylw.class, ylwVar);
    }

    private ylw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဈ\u0004\u0005ဈ\u0005", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ylw();
        }
        if (i2 == 4) {
            return new ylt();
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
        synchronized (ylw.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
