package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lls extends abxd implements abyr {
    public static final lls a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        lls llsVar = new lls();
        a = llsVar;
        llsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lls.class, llsVar);
    }

    private lls() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", llq.a, "d", llm.a, "e", llo.a});
        }
        if (i2 == 3) {
            return new lls();
        }
        if (i2 == 4) {
            return new lll();
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
        synchronized (lls.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
