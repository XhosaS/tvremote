package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgs extends abxd implements abyr {
    public static final rgs a;
    private static volatile abyy f;
    public int b;
    public rgr d;
    public String c = "";
    public String e = "";

    static {
        rgs rgsVar = new rgs();
        a = rgsVar;
        rgsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rgs.class, rgsVar);
    }

    private rgs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new rgs();
        }
        if (i2 == 4) {
            return new rgo();
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
        synchronized (rgs.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
