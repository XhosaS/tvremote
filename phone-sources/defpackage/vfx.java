package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfx extends vuc implements vvk {
    public static final vfx a;
    private static volatile vvq c;
    public vve b = vve.a;

    static {
        vfx vfxVar = new vfx();
        a = vfxVar;
        vuc.y(vfx.class, vfxVar);
    }

    private vfx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", vfw.a});
        }
        if (i2 == 3) {
            return new vfx();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vfx.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
