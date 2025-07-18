package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jao extends abxd implements abyr {
    public static final jao a;
    private static volatile abyy e;
    public String b = "";
    public String c = "";
    public int d;
    private int f;

    static {
        jao jaoVar = new jao();
        a = jaoVar;
        jaoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(jao.class, jaoVar);
    }

    private jao() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003င\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new jao();
        }
        if (i2 == 4) {
            return new jan();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (jao.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
