package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yoa extends abxd implements abyr {
    public static final yoa a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        yoa yoaVar = new yoa();
        a = yoaVar;
        yoaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yoa.class, yoaVar);
    }

    private yoa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", ynx.a});
        }
        if (i2 == 3) {
            return new yoa();
        }
        if (i2 == 4) {
            return new ynw();
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
        synchronized (yoa.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
