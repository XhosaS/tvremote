package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjs extends vuc implements vvk {
    public static final vuk a = new qiu(16);
    public static final vjs b;
    private static volatile vvq k;
    public int c;
    public vkl e;
    public vki g;
    public int h;
    public int j;
    public String d = "";
    public vun f = vvt.a;
    public vuj i = vud.a;

    static {
        vjs vjsVar = new vjs();
        b = vjsVar;
        vuc.y(vjs.class, vjsVar);
    }

    private vjs() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\u0007\u0000\u0001\u0001\u0012\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဉ\u0001\bဉ\u0004\t᠌\u0005\u000bࠬ\u000f᠌\t\u0012\u001b", new Object[]{"c", "d", "e", "g", "h", vlj.e, "i", vlj.f, "j", vlj.i, "f", vkm.class});
        }
        if (i2 == 3) {
            return new vjs();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vjs.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
