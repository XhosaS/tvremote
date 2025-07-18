package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toz extends vuc implements vvk {
    public static final toz a;
    private static volatile vvq k;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public vun f;
    public vun g;
    public vun h;
    public boolean i;
    public String j;
    private int l;

    static {
        toz tozVar = new toz();
        a = tozVar;
        vuc.y(toz.class, tozVar);
    }

    private toz() {
        vvt vvtVar = vvt.a;
        this.f = vvtVar;
        this.g = vvtVar;
        this.h = vvtVar;
        this.j = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0000\u0001\u0001\u000e\t\u0000\u0003\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0006\u001b\b\u001b\nင\u0004\f\u001b\rဇ\u0007\u000eဈ\b", new Object[]{"l", "b", "c", "d", "f", tpb.class, "g", tpd.class, "e", "h", toz.class, "i", "j"});
        }
        if (i2 == 3) {
            return new toz();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (toz.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
