package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyc extends vuc implements vvk {
    public static final uyc a;
    private static volatile vvq p;
    public int b;
    public Object d;
    public boolean g;
    public int h;
    public vun i;
    public int j;
    public int k;
    public vun l;
    public int m;
    public int n;
    public int o;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        uyc uycVar = new uyc();
        a = uycVar;
        vuc.y(uyc.class, uycVar);
    }

    private uyc() {
        vvt vvtVar = vvt.a;
        this.i = vvtVar;
        this.l = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\r\u0001\u0001\u0001\u0010\r\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0005;\u0000\u0006᠌\t\b᠌\u0004\t᠌\u0005\n᠌\u0003\u000b᠌\b\f;\u0000\r\u001b\u000f᠌\n\u0010ဇ\u0002", new Object[]{"d", "c", "b", "e", "f", "i", uxw.class, "n", uxz.d, "j", uxz.b, "k", uvj.u, "h", uxz.e, "m", uxz.c, "l", uyw.class, "o", uxz.a, "g"});
        }
        if (i2 == 3) {
            return new uyc();
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
        vvq vvqVar = p;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uyc.class) {
            vtxVar = p;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                p = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.i;
        if (vunVar.c()) {
            return;
        }
        this.i = vuc.s(vunVar);
    }
}
