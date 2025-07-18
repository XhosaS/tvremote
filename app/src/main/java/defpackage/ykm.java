package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykm extends abxd implements abyr {
    public static final ykm a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        ykm ykmVar = new ykm();
        a = ykmVar;
        ykmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ykm.class, ykmVar);
    }

    private ykm() {
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
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", ykk.a});
        }
        if (i2 == 3) {
            return new ykm();
        }
        if (i2 == 4) {
            return new ykl();
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
        synchronized (ykm.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
