package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyj extends abxd implements abyr {
    public static final xyj a;
    private static volatile abyy b;

    static {
        xyj xyjVar = new xyj();
        a = xyjVar;
        xyjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xyj.class, xyjVar);
    }

    private xyj() {
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
            return new xyj();
        }
        if (i2 == 4) {
            return new xyi();
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
        synchronized (xyj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
