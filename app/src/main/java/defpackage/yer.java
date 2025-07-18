package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yer extends abxd implements abyr {
    public static final yer a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        yer yerVar = new yer();
        a = yerVar;
        yerVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yer.class, yerVar);
    }

    private yer() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", yev.a, "d", yet.a, "e", yep.a});
        }
        if (i2 == 3) {
            return new yer();
        }
        if (i2 == 4) {
            return new yeq();
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
        synchronized (yer.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
