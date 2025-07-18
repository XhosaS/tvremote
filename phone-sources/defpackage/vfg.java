package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfg extends vuc implements vvk {
    public static final vfg a;
    private static volatile vvq i;
    public int b;
    public vdo c;
    public vfl d;
    public vgc e;
    public vfx f;
    public vfp g;
    public vfa h;

    static {
        vfg vfgVar = new vfg();
        a = vfgVar;
        vuc.y(vfg.class, vfgVar);
    }

    private vfg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new vfg();
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
        synchronized (vfg.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
