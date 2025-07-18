package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydy extends abxd implements abyr {
    public static final ydy a;
    private static volatile abyy b;

    static {
        ydy ydyVar = new ydy();
        a = ydyVar;
        ydyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ydy.class, ydyVar);
    }

    private ydy() {
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
            return new ydy();
        }
        if (i2 == 4) {
            return new ydx();
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
        synchronized (ydy.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
