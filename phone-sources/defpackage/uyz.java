package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyz extends vuc implements vvk {
    public static final vuk a = new qiu(11);
    public static final uyz b;
    private static volatile vvq g;
    public int c;
    public wev d;
    public wev e;
    public vuj f = vud.a;

    static {
        uyz uyzVar = new uyz();
        b = uyzVar;
        vuc.y(uyz.class, uyzVar);
    }

    private uyz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ࠞ", new Object[]{"c", "d", "e", "f", wdp.i});
        }
        if (i2 == 3) {
            return new uyz();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uyz.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
