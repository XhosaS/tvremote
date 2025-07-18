package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjj extends vuc implements vvk {
    public static final vjj a;
    private static volatile vvq i;
    public int b;
    public vkk d;
    public int e;
    public vis g;
    public String c = "";
    public vun f = vvt.a;
    public String h = "";

    static {
        vjj vjjVar = new vjj();
        a = vjjVar;
        vuc.y(vjj.class, vjjVar);
    }

    private vjj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0005᠌\u0002\u0006ဉ\u0003\u0007ဈ\u0004", new Object[]{"b", "c", "d", "f", vji.class, "e", vlj.h, "g", "h"});
        }
        if (i3 == 3) {
            return new vjj();
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
        synchronized (vjj.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.f;
        if (vunVar.c()) {
            return;
        }
        this.f = vuc.s(vunVar);
    }
}
