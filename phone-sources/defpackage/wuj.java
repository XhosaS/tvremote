package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuj extends vuc implements vvk {
    public static final wuj a;
    private static volatile vvq f;
    public wll b;
    public wls d;
    public wly e;
    private int g;
    private byte h = 2;
    public String c = "";

    static {
        wuj wujVar = new wuj();
        a = wujVar;
        vuc.y(wuj.class, wujVar);
    }

    private wuj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wuj();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wuj.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
