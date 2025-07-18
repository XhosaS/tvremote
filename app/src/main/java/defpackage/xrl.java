package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrl extends abxd implements abyr {
    public static final xrl a;
    private static volatile abyy b;
    private int c;
    private xrj d;

    static {
        xrl xrlVar = new xrl();
        a = xrlVar;
        xrlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xrl.class, xrlVar);
    }

    private xrl() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\f", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new xrl();
        }
        if (i2 == 4) {
            return new xrk();
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
        synchronized (xrl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
