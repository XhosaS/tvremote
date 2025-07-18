package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrm extends abxd implements abyr {
    public static final ahrm a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public int d;
    public long e;
    public long f;

    static {
        ahrm ahrmVar = new ahrm();
        a = ahrmVar;
        ahrmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahrm.class, ahrmVar);
    }

    private ahrm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new ahrm();
        }
        if (i2 == 4) {
            return new ahrl();
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
        synchronized (ahrm.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
