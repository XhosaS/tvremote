package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vja extends vuc implements vvk {
    public static final vja a;
    private static volatile vvq f;
    public int b;
    public String c = "";
    public vun d = vvt.a;
    public vme e;

    static {
        vja vjaVar = new vja();
        a = vjaVar;
        vuc.y(vja.class, vjaVar);
    }

    private vja() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002", new Object[]{"b", "c", "d", viz.class, "e"});
        }
        if (i2 == 3) {
            return new vja();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vja.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
