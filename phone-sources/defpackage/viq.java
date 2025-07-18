package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class viq extends vuc implements vvk {
    public static final viq a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        viq viqVar = new viq();
        a = viqVar;
        vuc.y(viq.class, viqVar);
    }

    private viq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0001\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", vix.class, vin.class, vio.class, vkp.class, vir.class, vkj.class, viy.class});
        }
        if (i2 == 3) {
            return new viq();
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
        synchronized (viq.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
