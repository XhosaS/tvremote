package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adan extends abxd implements abyr {
    public static final adan a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public String d = "";
    public long e;

    static {
        adan adanVar = new adan();
        a = adanVar;
        adanVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adan.class, adanVar);
    }

    private adan() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new adan();
        }
        if (i2 == 4) {
            return new adam();
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
        synchronized (adan.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
