package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuu extends vuc implements vvk {
    public static final wuu a;
    public static final vvd e;
    private static volatile vvq f;
    public wll b;
    public String c = "";
    public String d = "";
    private int g;

    static {
        wuu wuuVar = new wuu();
        a = wuuVar;
        vuc.y(wuu.class, wuuVar);
        e = vuc.C(wkx.a, wuuVar, wuuVar, 355011217, vwo.MESSAGE);
    }

    private wuu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"g", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wuu();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wuu.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
