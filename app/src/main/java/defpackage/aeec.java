package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeec extends abxd implements abyr {
    public static final aeec a;
    private static volatile abyy f;
    public String b = "";
    public int c;
    public int d;
    public aeeb e;
    private int g;

    static {
        aeec aeecVar = new aeec();
        a = aeecVar;
        aeecVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeec.class, aeecVar);
    }

    private aeec() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002᠌\u0001\u0004ဌ\u0002\u0005ဉ\u0003", new Object[]{"g", "b", "c", abqa.a, "d", "e"});
        }
        if (i2 == 3) {
            return new aeec();
        }
        if (i2 == 4) {
            return new aedz();
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
        synchronized (aeec.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
