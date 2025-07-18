package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljh extends abxd implements abyr {
    public static final ljh a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;
    private int f;

    static {
        ljh ljhVar = new ljh();
        a = ljhVar;
        ljhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ljh.class, ljhVar);
    }

    private ljh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"f", "b", ljm.a, "c", ljk.a, "d", ljq.a});
        }
        if (i2 == 3) {
            return new ljh();
        }
        if (i2 == 4) {
            return new ljg();
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
        synchronized (ljh.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
