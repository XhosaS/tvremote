package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrq extends abxd implements abyr {
    public static final abrq a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        abrq abrqVar = new abrq();
        a = abrqVar;
        abrqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abrq.class, abrqVar);
    }

    private abrq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", abrn.class});
        }
        if (i2 == 3) {
            return new abrq();
        }
        if (i2 == 4) {
            return new abrp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abrq.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
