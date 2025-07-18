package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuq extends vuc implements vvk {
    public static final wuq a;
    public static final vvd f;
    private static volatile vvq g;
    public wll b;
    public String c = "";
    public String d = "";
    public wkk e;
    private int h;

    static {
        wuq wuqVar = new wuq();
        a = wuqVar;
        vuc.y(wuq.class, wuqVar);
        f = vuc.C(wkx.a, wuqVar, wuqVar, 357761352, vwo.MESSAGE);
    }

    private wuq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"h", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wuq();
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
        synchronized (wuq.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
