package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wge extends vuc implements vvk {
    public static final wge a;
    private static volatile vvq f;
    public int b;
    public int e;
    private byte g = 2;
    public String c = "";
    public int d = 1;

    static {
        wge wgeVar = new wge();
        a = wgeVar;
        vuc.y(wge.class, wgeVar);
    }

    private wge() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᴌ\u0001\u0003ᴌ\u0002", new Object[]{"b", "c", "d", wgf.a, "e", wdp.j});
        }
        if (i2 == 3) {
            return new wge();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wge.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
