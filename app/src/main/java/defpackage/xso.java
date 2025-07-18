package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xso extends abxd implements abyr {
    public static final xso a;
    private static volatile abyy b;
    private abyl c;
    private abyl d;

    static {
        xso xsoVar = new xso();
        a = xsoVar;
        xsoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xso.class, xsoVar);
    }

    private xso() {
        abyl abylVar = abyl.a;
        this.c = abylVar;
        this.d = abylVar;
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
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"c", xsn.a, "d", xsm.a});
        }
        if (i2 == 3) {
            return new xso();
        }
        if (i2 == 4) {
            return new xsl();
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
        synchronized (xso.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
