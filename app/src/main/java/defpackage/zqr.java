package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqr extends abxd implements abyr {
    public static final zqr a;
    private static volatile abyy g;
    public int b;
    public int c;
    public zqf d;
    public int e;
    public int f;

    static {
        zqr zqrVar = new zqr();
        a = zqrVar;
        zqrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqr.class, zqrVar);
    }

    private zqr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"b", "c", zsa.a, "d", "e", zry.a, "f"});
        }
        if (i2 == 3) {
            return new zqr();
        }
        if (i2 == 4) {
            return new zqq();
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
        synchronized (zqr.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
