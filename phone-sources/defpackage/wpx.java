package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpx extends vuc implements vvk {
    public static final wpx a;
    public static final vvd d;
    private static volatile vvq e;
    public wly b;
    public wmc c;
    private int f;
    private byte g = 2;

    static {
        wpx wpxVar = new wpx();
        a = wpxVar;
        vuc.y(wpx.class, wpxVar);
        d = vuc.C(wkg.a, wpxVar, wpxVar, 392557649, vwo.MESSAGE);
    }

    private wpx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"f", "b", "c"});
        }
        if (i2 == 3) {
            return new wpx();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wpx.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
