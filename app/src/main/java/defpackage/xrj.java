package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrj extends abxd implements abyr {
    public static final xrj a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xrj xrjVar = new xrj();
        a = xrjVar;
        xrjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xrj.class, xrjVar);
    }

    private xrj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"c", xri.a});
        }
        if (i2 == 3) {
            return new xrj();
        }
        if (i2 == 4) {
            return new xrh();
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
        synchronized (xrj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
