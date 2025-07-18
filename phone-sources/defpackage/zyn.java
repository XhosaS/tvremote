package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyn extends vuc implements vvk {
    public static final zyn a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        zyn zynVar = new zyn();
        a = zynVar;
        vuc.y(zyn.class, zynVar);
    }

    private zyn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (i2 == 3) {
            return new zyn();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zyn.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
