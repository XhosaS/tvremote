package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esc extends abxd implements abyr {
    public static final esc a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        esc escVar = new esc();
        a = escVar;
        escVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(esc.class, escVar);
    }

    private esc() {
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
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0001\u0000\u0000\u00052", new Object[]{"c", esb.a});
        }
        if (i2 == 3) {
            return new esc();
        }
        if (i2 == 4) {
            return new esa();
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
        synchronized (esc.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
