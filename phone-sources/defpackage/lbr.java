package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbr extends vuc implements vvk {
    public static final lbr a;
    private static volatile vvq y;
    public int b;
    public kzv c;
    public lcr e;
    public lcr f;
    public lcv h;
    public lac i;
    public vun j;
    public vun k;
    public int l;
    public boolean m;
    public boolean n;
    public vun o;
    public vun p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public vun u;
    public vun v;
    public vun w;
    public boolean x;
    public String d = "";
    public String g = "";

    static {
        lbr lbrVar = new lbr();
        a = lbrVar;
        vuc.y(lbr.class, lbrVar);
    }

    private lbr() {
        vvt vvtVar = vvt.a;
        this.j = vvtVar;
        this.k = vvtVar;
        this.o = vvtVar;
        this.p = vvtVar;
        this.q = "";
        this.u = vvtVar;
        this.v = vvtVar;
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
            return new vvu(a, "\u0004\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0007\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006ဉ\u0003\u0007ဉ\u0004\b\u001b\t\u001b\n\u0004\u000b\u0007\f\u0007\r\u001b\u000e\u001b\u000fȈ\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u001b\u0014\u001b\u0015Ț\u0016\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", lbt.class, "k", lcp.class, "l", "m", "n", "o", kzr.class, "p", kzy.class, "q", "r", "s", "t", "u", kzm.class, "v", lbo.class, "w", "x"});
        }
        if (i2 == 3) {
            return new lbr();
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
        vvq vvqVar = y;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lbr.class) {
            vtxVar = y;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                y = vtxVar;
            }
        }
        return vtxVar;
    }
}
