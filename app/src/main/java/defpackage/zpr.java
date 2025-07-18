package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpr extends abxd implements abyr {
    public static final zpr a;
    private static volatile abyy l;
    public int b;
    public zpp c;
    public int e;
    public int h;
    public zqb k;
    private byte m = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        zpr zprVar = new zpr();
        a = zprVar;
        zprVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zpr.class, zprVar);
    }

    private zpr() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005\u000eဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "h", "i"});
        }
        if (i2 == 3) {
            return new zpr();
        }
        if (i2 == 4) {
            return new zpq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zpr.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
