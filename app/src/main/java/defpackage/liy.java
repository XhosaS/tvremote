package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class liy extends abxd implements abyr {
    public static final liy a;
    private static volatile abyy h;
    public int b;
    public int c;
    public boolean d;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        liy liyVar = new liy();
        a = liyVar;
        liyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(liy.class, liyVar);
    }

    private liy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", liw.a, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new liy();
        }
        if (i2 == 4) {
            return new liv();
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
        synchronized (liy.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
