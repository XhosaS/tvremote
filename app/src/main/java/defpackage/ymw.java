package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymw extends abxd implements abyr {
    public static final ymw a;
    private static volatile abyy f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        ymw ymwVar = new ymw();
        a = ymwVar;
        ymwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ymw.class, ymwVar);
    }

    private ymw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", ymv.a, ymt.class});
        }
        if (i2 == 3) {
            return new ymw();
        }
        if (i2 == 4) {
            return new ymu();
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
        synchronized (ymw.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
