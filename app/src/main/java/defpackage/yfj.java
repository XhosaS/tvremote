package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfj extends abxd implements abyr {
    public static final yfj a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        yfj yfjVar = new yfj();
        a = yfjVar;
        yfjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yfj.class, yfjVar);
    }

    private yfj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", yfi.a});
        }
        if (i2 == 3) {
            return new yfj();
        }
        if (i2 == 4) {
            return new yfh();
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
        synchronized (yfj.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
