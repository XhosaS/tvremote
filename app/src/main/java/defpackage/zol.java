package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zol extends abxd implements abyr {
    public static final zol a;
    public static final abxc b;
    private static volatile abyy p;
    public int c;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public long m;
    public boolean n;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String l = "";
    public abxs o = abzb.b;

    static {
        zol zolVar = new zol();
        a = zolVar;
        zolVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zol.class, zolVar);
        b = new abxc(epd.a, zolVar, zolVar, new abxb(null, 295747467, acap.MESSAGE, false, false));
    }

    private zol() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\f\u0000\u0001\u0001\u0011\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007ဂ\u0006\bဂ\u0007\tဈ\b\nဂ\t\u0010ဇ\r\u0011\u001a", new Object[]{"c", "d", "e", "f", "g", "h", "i", tux.a, "j", "k", "l", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new zol();
        }
        if (i2 == 4) {
            return new zok();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = p;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zol.class) {
            abwxVar = p;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                p = abwxVar;
            }
        }
        return abwxVar;
    }
}
