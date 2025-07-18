package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzu extends abxd implements abyr {
    public static final rzu a;
    private static volatile abyy f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        rzu rzuVar = new rzu();
        a = rzuVar;
        rzuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rzu.class, rzuVar);
    }

    private rzu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002\u083f\u0000\u0003\u083f\u0000", new Object[]{"d", "c", "b", "e", rzs.a, rxk.a, rxe.a});
        }
        if (i2 == 3) {
            return new rzu();
        }
        if (i2 == 4) {
            return new rzt();
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
        synchronized (rzu.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
