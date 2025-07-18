package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqv extends abxd implements abyr {
    public static final zqv a;
    private static volatile abyy g;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    static {
        zqv zqvVar = new zqv();
        a = zqvVar;
        zqvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqv.class, zqvVar);
    }

    private zqv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", zse.a, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zqv();
        }
        if (i2 == 4) {
            return new zqu();
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
        synchronized (zqv.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
