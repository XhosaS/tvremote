package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygf extends abxd implements abyr {
    public static final ygf a;
    private static volatile abyy b;

    static {
        ygf ygfVar = new ygf();
        a = ygfVar;
        ygfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ygf.class, ygfVar);
    }

    private ygf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new ygf();
        }
        if (i2 == 4) {
            return new yge();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ygf.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
