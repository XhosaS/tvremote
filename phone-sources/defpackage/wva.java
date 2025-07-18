package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wva extends vuc implements vvk {
    public static final wva a;
    public static final vvd f;
    private static volatile vvq g;
    public wlx b;
    public wls c;
    public wls d;
    public wkg e;
    private int h;
    private byte i = 2;

    static {
        wva wvaVar = new wva();
        a = wvaVar;
        vuc.y(wva.class, wvaVar);
        f = vuc.C(wkx.a, wvaVar, wvaVar, 463204655, vwo.MESSAGE);
    }

    private wva() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"h", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wva();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wva.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
