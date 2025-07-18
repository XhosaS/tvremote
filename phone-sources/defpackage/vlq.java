package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlq extends vuc implements vvk {
    public static final vlq a;
    private static volatile vvq u;
    public int b;
    public Object d;
    public long f;
    public vmm g;
    public long i;
    public long j;
    public vsl l;
    public long n;
    public vtl o;
    public int p;
    public vnz q;
    public vmw r;
    public int c = 0;
    public String e = "";
    public vun h = vvt.a;
    public String k = "";
    public String m = "";
    public vsz s = vsz.b;
    public vuj t = vud.a;

    static {
        vlq vlqVar = new vlq();
        a = vlqVar;
        vuc.y(vlq.class, vlqVar);
    }

    private vlq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0015\u0001\u0001\u0005 \u0015\u0000\u0002\u0000\u0005\u001b\bဂ\t\tဂ\n\nဈ\u0001\f<\u0000\r<\u0000\u000eဉ\f\u000fဉ\u0006\u0010ဈ\r\u0011<\u0000\u0012<\u0000\u0014ဂ\u000e\u0015᠌\u0010\u0016ဈ\u000b\u0017ဂ\u0005\u0018ဉ\u0011\u0019<\u0000\u001aဉ\u0013\u001cဉ\u000f\u001dည\u0014 '", new Object[]{"d", "c", "b", "h", vlp.class, "i", "j", "e", vld.class, vlw.class, "l", "g", "m", vmz.class, vlt.class, "n", "p", vlj.k, "k", "f", "q", vlr.class, "r", "o", "s", "t"});
        }
        if (i2 == 3) {
            return new vlq();
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
        vvq vvqVar = u;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vlq.class) {
            vtxVar = u;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                u = vtxVar;
            }
        }
        return vtxVar;
    }
}
