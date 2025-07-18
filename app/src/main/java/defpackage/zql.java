package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zql extends abxd implements abyr {
    public static final zql a;
    private static volatile abyy k;
    public int b;
    public int c;
    public int e;
    public boolean g;
    public long h;
    public long i;
    public String d = "";
    public String f = "";
    public String j = "";

    static {
        zql zqlVar = new zql();
        a = zqlVar;
        zqlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zql.class, zqlVar);
    }

    private zql() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\bဂ\u0007\tဈ\b", new Object[]{"b", "c", zrw.a, "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new zql();
        }
        if (i2 == 4) {
            return new zqk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zql.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
