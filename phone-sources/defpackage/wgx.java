package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgx extends vuc implements vvk {
    public static final wgx a;
    private static volatile vvq f;
    public int b;
    public wgp c;
    public boolean d;
    public udi e;
    private byte g = 2;

    static {
        wgx wgxVar = new wgx();
        a = wgxVar;
        vuc.y(wgx.class, wgxVar);
    }

    private wgx() {
        vsz vszVar = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0001\u0004ဇ\u0004\u0005ᐉ\u0005\u0006ဉ\u0001", new Object[]{"b", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new wgx();
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
        synchronized (wgx.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
