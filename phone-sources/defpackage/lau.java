package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lau extends vuc implements vvk {
    private static volatile vvq A;
    public static final lau a;
    public int b;
    public law c;
    public lcr e;
    public lcr f;
    public lcr g;
    public int h;
    public int i;
    public vun k;
    public String l;
    public String m;
    public String n;
    public long o;
    public lac p;
    public String q;
    public boolean r;
    public vun s;
    public vun t;
    public String u;
    public boolean v;
    public vun w;
    public int x;
    public int y;
    public law z;
    public String d = "";
    public String j = "";

    static {
        lau lauVar = new lau();
        a = lauVar;
        vuc.y(lau.class, lauVar);
    }

    private lau() {
        vvt vvtVar = vvt.a;
        this.k = vvtVar;
        this.l = "";
        this.m = "";
        this.n = "";
        this.q = "";
        this.s = vvtVar;
        this.t = vvtVar;
        this.u = "";
        this.w = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0018\u0000\u0001\u0001\u001a\u0018\u0000\u0004\u0000\u0001ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\b\u0004\t\u0004\nȈ\u000b\u001b\fȈ\rȈ\u000eȈ\u000f\u0002\u0010ဉ\u0004\u0011Ȉ\u0012\u0007\u0013\u001b\u0014\u001b\u0015Ȉ\u0016\u0007\u0017\u001b\u0018\u0004\u0019\u0004\u001aဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", lbt.class, "l", "m", "n", "o", "p", "q", "r", "s", kzr.class, "t", kzy.class, "u", "v", "w", lcw.class, "x", "y", "z"});
        }
        if (i2 == 3) {
            return new lau();
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
        vvq vvqVar = A;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lau.class) {
            vtxVar = A;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                A = vtxVar;
            }
        }
        return vtxVar;
    }
}
