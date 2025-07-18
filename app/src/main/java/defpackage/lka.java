package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lka extends abxd implements abyr {
    public static final lka a;
    private static volatile abyy d;
    public String b = "";
    public String c = "";
    private int e;

    static {
        lka lkaVar = new lka();
        a = lkaVar;
        lkaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lka.class, lkaVar);
    }

    private lka() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new lka();
        }
        if (i2 == 4) {
            return new ljz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lka.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
