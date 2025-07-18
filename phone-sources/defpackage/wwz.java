package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwz extends vuc implements vvk {
    public static final wwz a;
    private static volatile vvq f;
    public int b;
    public wom c;
    public wyw e;
    private byte g = 2;
    public vun d = vvt.a;

    static {
        wwz wwzVar = new wwz();
        a = wwzVar;
        vuc.y(wwz.class, wwzVar);
    }

    private wwz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002\u001b\u0004ᐉ\u0002", new Object[]{"b", "c", "d", wlm.class, "e"});
        }
        if (i2 == 3) {
            return new wwz();
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
        synchronized (wwz.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
