package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wse extends vuc implements vvk {
    public static final wse a;
    public static final vvd g;
    private static volatile vvq h;
    public int b;
    public wlx c;
    public wls d;
    public String e = "";
    public int f;

    static {
        wse wseVar = new wse();
        a = wseVar;
        vuc.y(wse.class, wseVar);
        g = vuc.C(wkx.a, wseVar, wseVar, 480990576, vwo.MESSAGE);
    }

    private wse() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wse();
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
        synchronized (wse.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
