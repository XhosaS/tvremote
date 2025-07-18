package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlo extends abxd implements abyr {
    public static final xlo a;
    public static volatile abyy b;
    public String c = "";
    private int d;

    static {
        xlo xloVar = new xlo();
        a = xloVar;
        xloVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xlo.class, xloVar);
    }

    private xlo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (i2 == 3) {
            return new xlo();
        }
        if (i2 == 4) {
            return new xln();
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
        synchronized (xlo.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
