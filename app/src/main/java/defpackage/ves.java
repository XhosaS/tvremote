package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ves extends abxd implements abyr {
    public static final ves a;
    private static volatile abyy c;
    public int b = 1;
    private int d;

    static {
        ves vesVar = new ves();
        a = vesVar;
        vesVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ves.class, vesVar);
    }

    private ves() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0003", new Object[]{"d", "b", vep.a});
        }
        if (i2 == 3) {
            return new ves();
        }
        if (i2 == 4) {
            return new ver();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ves.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
