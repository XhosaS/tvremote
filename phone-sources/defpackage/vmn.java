package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmn extends vuc implements vvk {
    public static final vuk a = new qiu(17);
    public static final vmn b;
    private static volatile vvq d;
    public vuj c = vud.a;

    static {
        vmn vmnVar = new vmn();
        b = vmnVar;
        vuc.y(vmn.class, vmnVar);
    }

    private vmn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002ࠬ", new Object[]{"c", vlj.d});
        }
        if (i2 == 3) {
            return new vmn();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vmn.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
