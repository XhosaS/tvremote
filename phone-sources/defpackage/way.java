package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class way extends vuc implements vvk {
    public static final way a;
    private static volatile vvq h;
    public String b = "";
    public String c = "";
    public vbn d;
    public vun e;
    public vun f;
    public vun g;
    private int i;

    static {
        way wayVar = new way();
        a = wayVar;
        vuc.y(way.class, wayVar);
    }

    private way() {
        vvt vvtVar = vvt.a;
        this.e = vvtVar;
        this.f = vvtVar;
        this.g = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0006\u0000\u0001\u0001\t\u0006\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0006\u001b\b\u001b\t\u001b", new Object[]{"i", "b", "c", "d", "e", vbg.class, "f", wau.class, "g", vcb.class});
        }
        if (i2 == 3) {
            return new way();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (way.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
