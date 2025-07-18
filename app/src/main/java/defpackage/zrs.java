package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrs extends abxd implements abyr {
    public static final zrs a;
    private static volatile abyy j;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public int g;
    public long h;
    public long i;

    static {
        zrs zrsVar = new zrs();
        a = zrsVar;
        zrsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zrs.class, zrsVar);
    }

    private zrs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", zsk.a, "d", zsl.a, "e", "f", "g", zsm.a, "h", "i"});
        }
        if (i2 == 3) {
            return new zrs();
        }
        if (i2 == 4) {
            return new zrr();
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
        synchronized (zrs.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
