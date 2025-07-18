package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlu extends abxd implements abyr {
    public static final adlu a;
    private static volatile abyy j;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        adlu adluVar = new adlu();
        a = adluVar;
        adluVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adlu.class, adluVar);
    }

    private adlu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0000\u0002ဈ\u0004\u0003ဈ\u0005\u0004ဈ\u0006\u0006᠌\u0000\u0007ဈ\u0003\t᠌\u0001\n᠌\u0002", new Object[]{"b", "g", "h", "i", "c", adlz.a, "f", "d", admb.a, "e", admd.a});
        }
        if (i2 == 3) {
            return new adlu();
        }
        if (i2 == 4) {
            return new adlt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adlu.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
