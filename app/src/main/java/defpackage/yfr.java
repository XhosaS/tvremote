package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfr extends abxd implements abyr {
    public static final yfr a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        yfr yfrVar = new yfr();
        a = yfrVar;
        yfrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yfr.class, yfrVar);
    }

    private yfr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", yfq.a});
        }
        if (i2 == 3) {
            return new yfr();
        }
        if (i2 == 4) {
            return new yfp();
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
        synchronized (yfr.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
