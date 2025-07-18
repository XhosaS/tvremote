package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgc extends vuc implements vvk {
    public static final vgc a;
    private static volatile vvq c;
    public vve b = vve.a;

    static {
        vgc vgcVar = new vgc();
        a = vgcVar;
        vuc.y(vgc.class, vgcVar);
    }

    private vgc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", vgb.a});
        }
        if (i2 == 3) {
            return new vgc();
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
        synchronized (vgc.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
