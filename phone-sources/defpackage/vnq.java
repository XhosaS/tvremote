package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnq extends vuc implements vvk {
    public static final vnq a;
    private static volatile vvq i;
    public int b;
    public vno c;
    public vnb d;
    public vnb e;
    public int f;
    public float g = 1.0f;
    public boolean h;

    static {
        vnq vnqVar = new vnq();
        a = vnqVar;
        vuc.y(vnq.class, vnqVar);
    }

    private vnq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", vnk.d, "g", "h"});
        }
        if (i3 == 3) {
            return new vnq();
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
        synchronized (vnq.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
