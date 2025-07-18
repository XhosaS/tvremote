package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aebo extends abxd implements abyr {
    public static final aebo a;
    private static volatile abyy w;
    public int b;
    public int d;
    public aebs g;
    public aebu h;
    public aeaz j;
    public int k;
    public aebg r;
    public aebw t;
    public String c = "";
    public String e = "";
    public String f = "";
    public String i = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String s = "";
    public String u = "";
    public String v = "";

    static {
        aebo aeboVar = new aebo();
        a = aeboVar;
        aeboVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aebo.class, aeboVar);
    }

    private aebo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0014\u0000\u0001\u0001\u001d\u0014\u0000\u0000\u0000\u0001ဈ\u0000\u0003᠌\u0002\u0005ဈ\u0004\u0006ဈ\u0005\bဉ\u0007\tဉ\b\nဈ\t\u000bဉ\n\fင\u000b\rဈ\f\u000eဈ\r\u000fဈ\u0011\u0010ဉ\u0012\u0014ဈ\u0016\u0015ဉ\u0017\u0017ဈ\u0019\u001aဈ\u001c\u001bဈ\u000e\u001cဈ\u000f\u001dဈ\u0010", new Object[]{"b", "c", "d", aeba.a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "q", "r", "s", "t", "u", "v", "n", "o", "p"});
        }
        if (i2 == 3) {
            return new aebo();
        }
        if (i2 == 4) {
            return new aebn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = w;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aebo.class) {
            abwxVar = w;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                w = abwxVar;
            }
        }
        return abwxVar;
    }
}
