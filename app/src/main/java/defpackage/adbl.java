package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adbl extends abxd implements abyr {
    public static final adbl a;
    private static volatile abyy b;
    private int c;
    private xre d;
    private byte e = 2;

    static {
        adbl adblVar = new adbl();
        a = adblVar;
        adblVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adbl.class, adblVar);
    }

    private adbl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0001\u000eᐉ\u000b", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new adbl();
        }
        if (i2 == 4) {
            return new adbk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adbl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
