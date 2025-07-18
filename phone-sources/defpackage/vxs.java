package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxs extends vuc implements vvk {
    public static final vxs a;
    private static volatile vvq e;
    public int b;
    public vdn c;
    public vun d = vvt.a;

    static {
        vxs vxsVar = new vxs();
        a = vxsVar;
        vuc.y(vxs.class, vxsVar);
    }

    private vxs() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", vxw.class});
        }
        if (i2 == 3) {
            return new vxs();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vxs.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
