package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfd extends abxd implements abyr {
    public static final xfd a;
    private static volatile abyy b;

    static {
        xfd xfdVar = new xfd();
        a = xfdVar;
        xfdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfd.class, xfdVar);
    }

    private xfd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new xfd();
        }
        if (i2 == 4) {
            return new xfc();
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
        synchronized (xfd.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
