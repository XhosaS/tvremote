package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acds extends abxd implements abyr {
    public static final acds a;
    private static volatile abyy d;
    public long b;
    public long c;
    private int e;

    static {
        acds acdsVar = new acds();
        a = acdsVar;
        acdsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acds.class, acdsVar);
    }

    private acds() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new acds();
        }
        if (i2 == 4) {
            return new acdr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acds.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
