package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xta extends abxd implements abyr {
    public static final xta a;
    private static volatile abyy b;
    private int c;
    private yoq d;

    static {
        xta xtaVar = new xta();
        a = xtaVar;
        xtaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xta.class, xtaVar);
    }

    private xta() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0005", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new xta();
        }
        if (i2 == 4) {
            return new xsz();
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
        synchronized (xta.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
