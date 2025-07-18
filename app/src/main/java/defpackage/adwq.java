package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwq extends abxd implements abyr {
    public static final adwq a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        adwq adwqVar = new adwq();
        a = adwqVar;
        adwqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adwq.class, adwqVar);
    }

    private adwq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new adwq();
        }
        if (i2 == 4) {
            return new adwp();
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
        synchronized (adwq.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
