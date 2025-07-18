package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhg extends abxd implements abyr {
    public static final rhg a;
    private static volatile abyy g;
    public long e;
    private int h;
    public abyl f = abyl.a;
    public String b = "";
    public abvo c = abvo.b;
    public String d = "";

    static {
        rhg rhgVar = new rhg();
        a = rhgVar;
        rhgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rhg.class, rhgVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"h", "b", "c", "d", "e", "f", rhf.a});
        }
        if (i2 == 3) {
            return new rhg();
        }
        if (i2 == 4) {
            return new rhe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rhg.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
