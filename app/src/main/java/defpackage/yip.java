package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yip extends abxd implements abyr {
    public static final yip a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        yip yipVar = new yip();
        a = yipVar;
        yipVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yip.class, yipVar);
    }

    private yip() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", yiu.class});
        }
        if (i2 == 3) {
            return new yip();
        }
        if (i2 == 4) {
            return new yio();
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
        synchronized (yip.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
