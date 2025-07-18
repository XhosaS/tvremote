package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfs extends abxd implements abyr {
    public static final xfs a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xfs xfsVar = new xfs();
        a = xfsVar;
        xfsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xfs.class, xfsVar);
    }

    private xfs() {
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
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"c", xfr.a});
        }
        if (i2 == 3) {
            return new xfs();
        }
        if (i2 == 4) {
            return new xfq();
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
        synchronized (xfs.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
