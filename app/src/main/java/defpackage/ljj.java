package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljj extends abxd implements abyr {
    public static final ljj a;
    private static volatile abyy d;
    public int b;
    public int c;
    private int e;

    static {
        ljj ljjVar = new ljj();
        a = ljjVar;
        ljjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ljj.class, ljjVar);
    }

    private ljj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            abxh abxhVar = ljm.a;
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"e", "b", abxhVar, "c", abxhVar});
        }
        if (i2 == 3) {
            return new ljj();
        }
        if (i2 == 4) {
            return new lji();
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
        synchronized (ljj.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
