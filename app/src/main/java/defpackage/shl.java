package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shl extends abxd implements abyr {
    public static final shl a;
    private static volatile abyy b;

    static {
        shl shlVar = new shl();
        a = shlVar;
        shlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(shl.class, shlVar);
    }

    private shl() {
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
            return new shl();
        }
        if (i2 == 4) {
            return new shk();
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
        synchronized (shl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
