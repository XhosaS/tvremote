package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxb extends vuc implements vvk {
    private static volatile vvq A;
    public static final vuk a = new qiu(8);
    public static final vuk b = new qiu(9);
    public static final uxb c;
    public int d;
    public vuj e;
    public int f;
    public vsz g;
    public String h;
    public long i;
    public String j;
    public int k;
    public boolean l;
    public vuj m;
    public vuj n;
    public int o;
    public int p;
    public int q;
    public String r;
    public int s;
    public uww t;
    public vib u;
    public int v;
    public String w;
    public String x;
    public String y;
    public vun z;

    static {
        uxb uxbVar = new uxb();
        c = uxbVar;
        vuc.y(uxb.class, uxbVar);
    }

    private uxb() {
        vud vudVar = vud.a;
        this.e = vudVar;
        this.g = vsz.b;
        this.h = "";
        this.j = "";
        this.m = vudVar;
        this.n = vudVar;
        this.r = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.z = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(c, "\u0004\u0016\u0000\u0001\u0001\u001b\u0016\u0000\u0004\u0000\u0001\u0016\u0002င\u0000\u0003င\u0007\u0004ဇ\b\u0005ࠞ\u0006᠌\n\u0007᠌\u000b\t᠌\t\u000bဈ\r\fဉ\u0010\rဈ\u0004\u000eဂ\u0005\u000fဈ\u0006\u0010ဉ\u0011\u0011᠌\u0012\u0012ࠞ\u0014ည\u0002\u0017᠌\u000f\u0018ဈ\u0013\u0019ဈ\u0014\u001aဈ\u0015\u001b\u001b", new Object[]{"d", "e", "f", "k", "l", "n", uvj.i, "p", uvj.j, "q", uvj.q, "o", uvj.n, "r", "t", "h", "i", "j", "u", "v", uvj.m, "m", uvj.p, "g", "s", uvj.o, "w", "x", "y", "z", uwy.class});
        }
        if (i2 == 3) {
            return new uxb();
        }
        if (i2 == 4) {
            return new vtw(c);
        }
        if (i2 == 5) {
            return c;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = A;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uxb.class) {
            vtxVar = A;
            if (vtxVar == null) {
                vtxVar = new vtx(c);
                A = vtxVar;
            }
        }
        return vtxVar;
    }
}
