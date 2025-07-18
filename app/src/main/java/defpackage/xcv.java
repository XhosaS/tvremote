package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcv extends abxd implements abyr {
    public static final xcv a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        xcv xcvVar = new xcv();
        a = xcvVar;
        xcvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xcv.class, xcvVar);
    }

    private xcv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", xda.a});
        }
        if (i2 == 3) {
            return new xcv();
        }
        if (i2 == 4) {
            return new xcu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xcv.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
