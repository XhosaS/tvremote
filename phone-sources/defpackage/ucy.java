package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucy extends vuc implements vvk {
    public static final ucy a;
    private static volatile vvq f;
    public int b;
    public int d;
    public ucz e;
    private byte g = 2;
    public int c = -1;

    static {
        ucy ucyVar = new ucy();
        a = ucyVar;
        vuc.y(ucy.class, ucyVar);
    }

    private ucy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\rᐉ\u000b", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ucy();
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
        synchronized (ucy.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
