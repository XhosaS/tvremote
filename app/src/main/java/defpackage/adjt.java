package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjt extends abxd implements abyr {
    public static final adjt a;
    public static final abxc b;
    private static volatile abyy l;
    public int c;
    public String d = "";
    public abxs e = abzb.b;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";

    static {
        adjt adjtVar = new adjt();
        a = adjtVar;
        adjtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjt.class, adjtVar);
        b = new abxc(adkb.a, adjtVar, adjtVar, new abxb(null, 294000, acap.MESSAGE, false, false));
    }

    private adjt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0002\u0010\b\u0000\u0001\u0000\u0002ဈ\u0004\u0004ဈ\u0001\u0005\u001a\bဈ\u0002\tဈ\u0003\nဈ\u0005\u000bဈ\u0006\u0010ဈ\u000b", new Object[]{"c", "h", "d", "e", "f", "g", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new adjt();
        }
        if (i2 == 4) {
            return new adjs();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adjt.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
