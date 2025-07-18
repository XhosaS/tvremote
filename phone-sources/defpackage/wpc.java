package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpc extends vuc implements vvk {
    public static final wpc a;
    private static volatile vvq h;
    public int b;
    public int c = 0;
    public Object d;
    public wls e;
    public wls f;
    public wng g;

    static {
        wpc wpcVar = new wpc();
        a = wpcVar;
        vuc.y(wpc.class, wpcVar);
    }

    private wpc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"d", "c", "b", "e", wpa.class, wpb.class, "f", "g"});
        }
        if (i2 == 3) {
            return new wpc();
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
        synchronized (wpc.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
