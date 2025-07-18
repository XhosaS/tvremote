package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzl extends abxd implements abyr {
    public static final rzl a;
    private static volatile abyy b;

    static {
        rzl rzlVar = new rzl();
        a = rzlVar;
        rzlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rzl.class, rzlVar);
    }

    private rzl() {
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
            return new rzl();
        }
        if (i2 == 4) {
            return new rzk();
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
        synchronized (rzl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
