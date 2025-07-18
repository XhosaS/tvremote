package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xar extends vuc implements vvk {
    public static final xar a;
    private static volatile vvq w;
    public int b;
    public String c = "";
    public String d = "";
    public long e;
    public int f;
    public int g;
    public vun h;
    public String i;
    public vun j;
    public vun k;
    public boolean l;
    public vun m;
    public vun n;
    public vun o;
    public boolean p;
    public xap q;
    public xap r;
    public xan s;
    public vun t;
    public xaq u;
    public vun v;

    static {
        xar xarVar = new xar();
        a = xarVar;
        vuc.y(xar.class, xarVar);
    }

    private xar() {
        vvt vvtVar = vvt.a;
        this.h = vvtVar;
        this.i = "";
        this.j = vvtVar;
        this.k = vvtVar;
        this.m = vvtVar;
        this.n = vvtVar;
        this.o = vvtVar;
        this.t = vvtVar;
        this.v = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0014\u0000\u0001\u0001\u001b\u0014\u0000\b\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0003\u0006\u001b\u0007ဈ\u0007\b\u001b\t\u001b\nဇ\b\r\u001a\u000e\u001a\u000f\u001b\u0010င\u0004\u0011ဇ\u000b\u0012ဉ\f\u0013ဉ\r\u0015ဉ\u000f\u0016\u001b\u0017ဉ\u0010\u001b\u001b", new Object[]{"b", "c", "d", "e", "f", "h", xao.class, "i", "j", xak.class, "k", xaj.class, "l", "m", "n", "o", xba.class, "g", "p", "q", "r", "s", "t", xbt.class, "u", "v", xam.class});
        }
        if (i2 == 3) {
            return new xar();
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
        vvq vvqVar = w;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xar.class) {
            vtxVar = w;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                w = vtxVar;
            }
        }
        return vtxVar;
    }
}
