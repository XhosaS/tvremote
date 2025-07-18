package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iod extends vuc implements vvk {
    public static final iod a;
    private static volatile vvq v;
    public int b;
    public boolean c;
    public vun d;
    public vun e;
    public vun f;
    public ioc g;
    public vun h;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public vtl n;
    public boolean o;
    public wkc p;
    public wkc q;
    public wjz r;
    public boolean s;
    public boolean t;
    public boolean u;

    static {
        iod iodVar = new iod();
        a = iodVar;
        vuc.y(iod.class, iodVar);
    }

    private iod() {
        vvt vvtVar = vvt.a;
        this.d = vvtVar;
        this.e = vvtVar;
        this.f = vvtVar;
        this.h = vvtVar;
        this.k = "";
        this.l = "";
        this.m = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0004\u0000\u0001\u0007\u0002Ț\u0003Ț\u0004Ț\u0005ဉ\u0000\u0007Ț\t\u0007\n\u0007\u000bȈ\fȈ\rȈ\u000eဉ\u0002\u000f\u0007\u0010ဉ\u0003\u0011ဉ\u0004\u0012ဉ\u0005\u0013\u0007\u0014\u0007\u0015\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
        }
        if (i2 == 3) {
            return new iod();
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
        vvq vvqVar = v;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (iod.class) {
            vtxVar = v;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                v = vtxVar;
            }
        }
        return vtxVar;
    }
}
