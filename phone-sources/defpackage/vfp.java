package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfp extends vuc implements vvk {
    public static final vfp a;
    private static volatile vvq c;
    public vve b;
    private vve d;

    static {
        vfp vfpVar = new vfp();
        a = vfpVar;
        vuc.y(vfp.class, vfpVar);
    }

    private vfp() {
        vve vveVar = vve.a;
        this.d = vveVar;
        this.b = vveVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"d", vfn.a, "b", vfo.a});
        }
        if (i2 == 3) {
            return new vfp();
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
        synchronized (vfp.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
