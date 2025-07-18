package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkl extends vuc implements vvk {
    public static final vkl a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public vun f = vvt.a;

    static {
        vkl vklVar = new vkl();
        a = vklVar;
        vuc.y(vkl.class, vklVar);
    }

    private vkl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002\u083f\u0000\u0003\u001a\u0004ဈ\u0000", new Object[]{"d", "c", "b", vkk.class, vid.h, "f", "e"});
        }
        if (i2 == 3) {
            return new vkl();
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
        synchronized (vkl.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
