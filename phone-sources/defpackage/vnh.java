package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnh extends vuc implements vvk {
    public static final vnh a;
    private static volatile vvq f;
    public int b;
    public vnc c;
    public vnf d;
    public int e;

    static {
        vnh vnhVar = new vnh();
        a = vnhVar;
        vuc.y(vnh.class, vnhVar);
    }

    private vnh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0007᠌\u0002", new Object[]{"b", "c", "d", "e", vlj.u});
        }
        if (i2 == 3) {
            return new vnh();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vnh.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
