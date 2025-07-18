package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgv extends vuc implements vvk {
    public static final vgv a;
    private static volatile vvq g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        vgv vgvVar = new vgv();
        a = vgvVar;
        vuc.y(vgv.class, vgvVar);
    }

    private vgv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", vgp.e, "f", vgp.d});
        }
        if (i2 == 3) {
            return new vgv();
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
        synchronized (vgv.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
