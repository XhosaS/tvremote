package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmk extends abxd implements abyr {
    public static final zmk a;
    private static volatile abyy b;

    static {
        zmk zmkVar = new zmk();
        a = zmkVar;
        zmkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zmk.class, zmkVar);
    }

    private zmk() {
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
            return new zmk();
        }
        if (i2 == 4) {
            return new zmj();
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
        synchronized (zmk.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
