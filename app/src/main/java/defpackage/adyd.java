package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyd extends abxd implements abyr {
    public static final adyd a;
    private static volatile abyy x;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public abxs f;
    public adxn g;
    public abxs h;
    public abxs i;
    public adyf j;
    public int k;
    public int l;
    public adws m;
    public adwo n;
    public int o;
    public int p;
    public adyz q;
    public String r;
    public adxk s;
    public abxs t;
    public boolean u;
    public String v;
    public boolean w;

    static {
        adyd adydVar = new adyd();
        a = adydVar;
        adydVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyd.class, adydVar);
    }

    private adyd() {
        abzb abzbVar = abzb.b;
        this.f = abzbVar;
        this.h = abzbVar;
        this.i = abzbVar;
        this.r = "";
        this.t = abzbVar;
        this.v = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0015\u0000\u0001\u0001\u001d\u0015\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဉ\u0003\u0007\u001b\b\u001b\fဉ\b\u000e᠌\t\u000fင\n\u0010ဉ\u000b\u0011ဉ\f\u0013᠌\u000e\u0014င\u000f\u0015ဉ\u0010\u0016ဈ\u0011\u0017ဉ\u0012\u0018\u001b\u0019ဇ\u0013\u001cဈ\u0016\u001dဇ\u0017", new Object[]{"b", "c", "d", "e", "f", adxg.class, "g", "h", adyn.class, "i", aear.class, "j", "k", adyg.a, "l", "m", "n", "o", adyb.a, "p", "q", "r", "s", "t", aeax.class, "u", "v", "w"});
        }
        if (i2 == 3) {
            return new adyd();
        }
        if (i2 == 4) {
            return new adya();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = x;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adyd.class) {
            abwxVar = x;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                x = abwxVar;
            }
        }
        return abwxVar;
    }
}
