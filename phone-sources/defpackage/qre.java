package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qre extends vuc implements vvk {
    public static final qre a;
    private static volatile vvq i;
    public int b;
    public vmo d;
    public int e;
    public int g;
    public int h;
    public vun c = vvt.a;
    public String f = "";

    static {
        qre qreVar = new qre();
        a = qreVar;
        vuc.y(qre.class, qreVar);
    }

    private qre() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0002\u0004᠌\u0001\u0005᠌\u0003\u0006ဌ\u0004", new Object[]{"b", "c", vko.class, "d", "f", "e", vid.f, "g", vlj.p, "h"});
        }
        if (i3 == 3) {
            return new qre();
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
        synchronized (qre.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.c;
        if (vunVar.c()) {
            return;
        }
        this.c = vuc.s(vunVar);
    }
}
