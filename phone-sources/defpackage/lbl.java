package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbl extends vuc implements vvk {
    private static volatile vvq Q;
    public static final lbl a;
    public vun A;
    public vun B;
    public lbm C;
    public vun D;
    public vun E;
    public String F;
    public boolean G;
    public vun H;
    public boolean I;
    public boolean J;
    public boolean K;
    public vun L;
    public int b;
    public lbo c;
    public lcr f;
    public lcr g;
    public int i;
    public boolean j;
    public lcv k;
    public vun l;
    public vun m;
    public int n;
    public int o;
    public lac p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public String v;
    public vun w;
    public vun x;
    public vun y;
    public vun z;
    public String d = "";
    public String e = "";
    public String h = "";

    static {
        lbl lblVar = new lbl();
        a = lblVar;
        vuc.y(lbl.class, lblVar);
    }

    private lbl() {
        vvt vvtVar = vvt.a;
        this.l = vvtVar;
        this.m = vvtVar;
        this.v = "";
        this.w = vvtVar;
        this.x = vvtVar;
        this.y = vvtVar;
        this.z = vvtVar;
        this.A = vvtVar;
        this.B = vvtVar;
        this.D = vvtVar;
        this.E = vvtVar;
        this.F = "";
        this.H = vvtVar;
        this.L = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004$\u0000\u0001\u0001'$\u0000\f\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006\u0004\u0007\u0007\bဉ\u0003\t\u001b\n\u001b\u000b\u0004\f\u0004\rဉ\u0004\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012Ȉ\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017\u001b\u0018ဉ\u0005\u0019\u001b\u001a\u001b\u001bȈ\u001c\u0007\u001d\u001b\u001e\u0007 \u0007#\u001b$Ȉ%\u001b&\u0007'\u0007", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "k", "l", lcp.class, "m", lbt.class, "n", "o", "p", "q", "r", "s", "t", "v", "w", laj.class, "x", laj.class, "y", laj.class, "z", laj.class, "A", kzv.class, "C", "D", kzr.class, "E", kzy.class, "F", "G", "H", lcw.class, "I", "K", "L", kzm.class, "d", "B", lbo.class, "J", "u"});
        }
        if (i2 == 3) {
            return new lbl();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = Q;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lbl.class) {
            vtxVar = Q;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                Q = vtxVar;
            }
        }
        return vtxVar;
    }
}
