package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgy extends vuc implements vvk {
    public static final vgy a;
    private static volatile vvq i;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;
    public vsz h;

    static {
        vgy vgyVar = new vgy();
        a = vgyVar;
        vuc.y(vgy.class, vgyVar);
    }

    private vgy() {
        vvt vvtVar = vvt.a;
        this.f = "";
        this.g = "";
        this.h = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002\tည\u0007", new Object[]{"b", "c", "d", "f", "g", "e", "h"});
        }
        if (i3 == 3) {
            return new vgy();
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
        synchronized (vgy.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
