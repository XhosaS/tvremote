package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class run extends abxd implements abyr {
    public static final run a;
    private static volatile abyy d;
    public int b;
    public int c = 10000;

    static {
        run runVar = new run();
        a = runVar;
        runVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(run.class, runVar);
    }

    private run() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new run();
        }
        if (i2 == 4) {
            return new rum();
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
        synchronized (run.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
