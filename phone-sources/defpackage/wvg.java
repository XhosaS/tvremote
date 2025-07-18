package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvg extends vuc implements vvk {
    public static final wvg a;
    public static final vvd g;
    private static volatile vvq h;
    public int b;
    public wll c;
    public String d = "";
    public String e = "";
    public wkk f;

    static {
        wvg wvgVar = new wvg();
        a = wvgVar;
        vuc.y(wvg.class, wvgVar);
        g = vuc.C(wkx.a, wvgVar, wvgVar, 356573169, vwo.MESSAGE);
    }

    private wvg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wvg();
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
        synchronized (wvg.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
