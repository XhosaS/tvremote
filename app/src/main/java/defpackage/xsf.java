package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsf extends abxd implements abyr {
    public static final xsf a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        xsf xsfVar = new xsf();
        a = xsfVar;
        xsfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xsf.class, xsfVar);
    }

    private xsf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0001\u0000\u0000\u00072", new Object[]{"c", xse.a});
        }
        if (i2 == 3) {
            return new xsf();
        }
        if (i2 == 4) {
            return new xsb();
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
        synchronized (xsf.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
