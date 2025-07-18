package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxm extends vuc implements vvk {
    public static final vxm a;
    private static volatile vvq b;
    private vve c = vve.a;

    static {
        vxm vxmVar = new vxm();
        a = vxmVar;
        vuc.y(vxm.class, vxmVar);
    }

    private vxm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", vxk.a});
        }
        if (i2 == 3) {
            return new vxm();
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
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vxm.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
