package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjo extends vuc implements vvk {
    public static final vjo a;
    private static volatile vvq g;
    public int b;
    public String c = "";
    public vun d = vvt.a;
    public vkk e;
    public vme f;

    static {
        vjo vjoVar = new vjo();
        a = vjoVar;
        vuc.y(vjo.class, vjoVar);
    }

    private vjo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", vjw.class, "e", "f"});
        }
        if (i2 == 3) {
            return new vjo();
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
        synchronized (vjo.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
