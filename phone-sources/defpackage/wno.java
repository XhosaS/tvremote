package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wno extends vuc implements vvk {
    public static final wno a;
    private static volatile vvq f;
    public String b = "";
    public wls c;
    public wls d;
    public wlx e;
    private int g;

    static {
        wno wnoVar = new wno();
        a = wnoVar;
        vuc.y(wno.class, wnoVar);
    }

    private wno() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wno();
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
        synchronized (wno.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
