package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhe extends vuc implements vvk {
    public static final vhe a;
    private static volatile vvq e;
    public int b;
    public int c;
    public vun d = vvt.a;

    static {
        vhe vheVar = new vhe();
        a = vheVar;
        vuc.y(vhe.class, vheVar);
    }

    private vhe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0003\u001b", new Object[]{"b", "c", vgp.h, "d", vhd.class});
        }
        if (i2 == 3) {
            return new vhe();
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
        synchronized (vhe.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
