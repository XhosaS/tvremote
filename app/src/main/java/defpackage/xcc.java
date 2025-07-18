package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcc extends abxd implements abyr {
    public static final xcc a;
    private static volatile abyy c;
    public abxj b = abxe.a;

    static {
        xcc xccVar = new xcc();
        a = xccVar;
        xccVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xcc.class, xccVar);
    }

    private xcc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new xcc();
        }
        if (i2 == 4) {
            return new xcb();
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
        synchronized (xcc.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
