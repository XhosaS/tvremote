package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvw extends abxd implements abyr {
    public static final rvw a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        rvw rvwVar = new rvw();
        a = rvwVar;
        rvwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rvw.class, rvwVar);
    }

    private rvw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"c", "b", rwc.class, rwg.class, rwm.class, rvy.class, rwq.class, rww.class, rwi.class, rwo.class});
        }
        if (i2 == 3) {
            return new rvw();
        }
        if (i2 == 4) {
            return new rvv();
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
        synchronized (rvw.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
