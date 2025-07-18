package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wui extends vuc implements vvk {
    public static final wui a;
    public static final vvd f;
    private static volatile vvq g;
    public wll b;
    public wlx c;
    public String d = "";
    public wls e;
    private int h;

    static {
        wui wuiVar = new wui();
        a = wuiVar;
        vuc.y(wui.class, wuiVar);
        f = vuc.C(wkx.a, wuiVar, wuiVar, 358026859, vwo.MESSAGE);
    }

    private wui() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"h", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wui();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wui.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
