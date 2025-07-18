package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pie extends abxd implements abyr {
    public static final pie a;
    private static volatile abyy h;
    public int b;
    public long d;
    public int f;
    public phm g;
    public String c = "";
    public String e = "";

    static {
        pie pieVar = new pie();
        a = pieVar;
        pieVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pie.class, pieVar);
    }

    private pie() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", pic.a, "g"});
        }
        if (i2 == 3) {
            return new pie();
        }
        if (i2 == 4) {
            return new pib();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (pie.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
