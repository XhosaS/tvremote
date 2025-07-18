package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woy extends vuc implements vvk {
    public static final woy a;
    private static volatile vvq f;
    public wlx b;
    public wkg e;
    private int g;
    private byte h = 2;
    public String c = "";
    public String d = "";

    static {
        woy woyVar = new woy();
        a = woyVar;
        vuc.y(woy.class, woyVar);
    }

    private woy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002Ȉ\u0004ᐉ\u0002\u0006Ȉ", new Object[]{"g", "b", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new woy();
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
        synchronized (woy.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
