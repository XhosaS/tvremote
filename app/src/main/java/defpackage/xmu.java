package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmu extends abxd implements abyr {
    public static final xmu a;
    private static volatile abyy b;

    static {
        xmu xmuVar = new xmu();
        a = xmuVar;
        xmuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xmu.class, xmuVar);
    }

    private xmu() {
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
            return new xmu();
        }
        if (i2 == 4) {
            return new xmt();
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
        synchronized (xmu.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
