package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxo extends vuc implements vvk {
    public static final vxo a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        vxo vxoVar = new vxo();
        a = vxoVar;
        vuc.y(vxo.class, vxoVar);
    }

    private vxo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", vxp.class});
        }
        if (i2 == 3) {
            return new vxo();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vxo.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
