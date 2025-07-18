package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvc extends vuc implements vvk {
    public static final wvc a;
    public static final vvd g;
    private static volatile vvq h;
    public wls b;
    public wls c;
    public wls d;
    public wls e;
    public wls f;
    private int i;

    static {
        wvc wvcVar = new wvc();
        a = wvcVar;
        vuc.y(wvc.class, wvcVar);
        g = vuc.C(wkx.a, wvcVar, wvcVar, 348544994, vwo.MESSAGE);
    }

    private wvc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"i", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wvc();
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
        synchronized (wvc.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
