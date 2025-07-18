package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xat extends vuc implements vvk {
    public static final xat a;
    private static volatile vvq r;
    public int b;
    public long c;
    public String d = "";
    public int e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;
    public long k;
    public int l;
    public boolean m;
    public long n;
    public long o;
    public String p;
    public xas q;

    static {
        xat xatVar = new xat();
        a = xatVar;
        vuc.y(xat.class, xatVar);
    }

    private xat() {
        vud vudVar = vud.a;
        this.g = "";
        this.h = "";
        this.l = 1;
        this.p = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007\tဂ\b\n᠌\t\u000bဇ\n\fဂ\u000b\rဂ\f\u000eဈ\r\u0010ဉ\u000f", new Object[]{"b", "c", "d", "e", xal.e, "f", wjk.u, "g", "h", "i", "j", "k", "l", xal.f, "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new xat();
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
        vvq vvqVar = r;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xat.class) {
            vtxVar = r;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                r = vtxVar;
            }
        }
        return vtxVar;
    }
}
