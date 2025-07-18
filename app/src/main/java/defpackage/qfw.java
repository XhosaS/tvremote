package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfw extends abxd implements abyr {
    public static final qfw a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        qfw qfwVar = new qfw();
        a = qfwVar;
        qfwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(qfw.class, qfwVar);
    }

    private qfw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", qfv.a});
        }
        if (i2 == 3) {
            return new qfw();
        }
        if (i2 == 4) {
            return new qfu();
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
        synchronized (qfw.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
