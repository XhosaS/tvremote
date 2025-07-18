package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxp extends vuc implements vvk {
    public static final vxp a;
    private static volatile vvq g;
    public vaq b;
    public int c;
    public String d = "";
    public String e = "";
    public vun f = vvt.a;
    private int h;

    static {
        vxp vxpVar = new vxp();
        a = vxpVar;
        vuc.y(vxp.class, vxpVar);
    }

    private vxp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"h", "b", "c", "d", "e", "f", vcb.class});
        }
        if (i2 == 3) {
            return new vxp();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vxp.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
