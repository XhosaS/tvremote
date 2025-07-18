package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xax extends vuc<xax, vtw> implements vvk {
    public static final xax a;
    private static volatile vvq r;
    public int b;
    public xaz c;
    public xaz d;
    public vun e;
    public xaz f;
    public xar g;
    public xah h;
    public vun i;
    public vun j;
    public vun k;
    public xav l;
    public vun m;
    public vun n;
    public vun o;
    public boolean p;
    public vun q;

    static {
        xax xaxVar = new xax();
        a = xaxVar;
        vuc.y(xax.class, xaxVar);
    }

    private xax() {
        vvt vvtVar = vvt.a;
        this.e = vvtVar;
        this.i = vvtVar;
        this.j = vvtVar;
        this.k = vvtVar;
        this.m = vvtVar;
        this.n = vvtVar;
        this.o = vvtVar;
        this.q = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u000f\u0000\u0001\u0001\u0014\u000f\u0000\b\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0004\u0007\u001b\bဉ\u0005\t\u001b\n\u001b\u000bဉ\u0007\r\u001b\u000e\u001b\u000f\u001b\u0010ဇ\t\u0011ဉ\u0002\u0014\u001b", new Object[]{"b", "c", "d", "e", xaz.class, "g", "i", xaz.class, "h", "j", xat.class, "k", xbs.class, "l", "m", xaz.class, "n", xbb.class, "o", xbd.class, "p", "f", "q", xaf.class});
        }
        if (i2 == 3) {
            return new xax();
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
        synchronized (xax.class) {
            vtxVar = r;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                r = vtxVar;
            }
        }
        return vtxVar;
    }
}
