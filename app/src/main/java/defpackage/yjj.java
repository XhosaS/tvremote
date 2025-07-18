package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjj extends abxd implements abyr {
    public static final yjj a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        yjj yjjVar = new yjj();
        a = yjjVar;
        yjjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yjj.class, yjjVar);
    }

    private yjj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", yji.a});
        }
        if (i2 == 3) {
            return new yjj();
        }
        if (i2 == 4) {
            return new yjh();
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
        synchronized (yjj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
