package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vze extends vuc implements vvk {
    public static final vze a;
    private static volatile vvq d;
    public vun b = vvt.a;
    public vsz c = vsz.b;

    static {
        vze vzeVar = new vze();
        a = vzeVar;
        vuc.y(vze.class, vzeVar);
    }

    private vze() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\n", new Object[]{"b", vza.class, "c"});
        }
        if (i2 == 3) {
            return new vze();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vze.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
