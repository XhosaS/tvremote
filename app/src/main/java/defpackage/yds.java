package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yds extends abxd implements abyr {
    public static final yds a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;

    static {
        yds ydsVar = new yds();
        a = ydsVar;
        ydsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yds.class, ydsVar);
    }

    private yds() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", ydr.a, "d", ydq.a});
        }
        if (i2 == 3) {
            return new yds();
        }
        if (i2 == 4) {
            return new ydp();
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
        synchronized (yds.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
