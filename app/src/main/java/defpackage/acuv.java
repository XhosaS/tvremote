package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acuv extends abxd implements abyr {
    public static final acuv a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        acuv acuvVar = new acuv();
        a = acuvVar;
        acuvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acuv.class, acuvVar);
    }

    private acuv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", acuu.a});
        }
        if (i2 == 3) {
            return new acuv();
        }
        if (i2 == 4) {
            return new acut();
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
        synchronized (acuv.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
