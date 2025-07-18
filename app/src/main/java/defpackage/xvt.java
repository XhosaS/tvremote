package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvt extends abxd implements abyr {
    public static final xvt a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xvt xvtVar = new xvt();
        a = xvtVar;
        xvtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xvt.class, xvtVar);
    }

    private xvt() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u0004࠲", new Object[]{"c", xvr.a, xvs.a});
        }
        if (i2 == 3) {
            return new xvt();
        }
        if (i2 == 4) {
            return new xvq();
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
        synchronized (xvt.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
