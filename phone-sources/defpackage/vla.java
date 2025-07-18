package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vla extends vuc implements vvk {
    public static final vla a;
    private static volatile vvq i;
    public String b = "";
    public String c = "";
    public vun d;
    public vun e;
    public int f;
    public vun g;
    public vkz h;
    private int j;

    static {
        vla vlaVar = new vla();
        a = vlaVar;
        vuc.y(vla.class, vlaVar);
    }

    private vla() {
        vvt vvtVar = vvt.a;
        this.d = vvtVar;
        this.e = vvtVar;
        this.g = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002\u0006\u001b\u0007ဉ\u0003", new Object[]{"j", "b", "c", "d", vls.class, "e", vks.class, "f", vid.t, "g", vls.class, "h"});
        }
        if (i3 == 3) {
            return new vla();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vla.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
