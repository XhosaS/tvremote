package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vic extends vuc implements vvk {
    public static final vic a;
    private static volatile vvq f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        vic vicVar = new vic();
        a = vicVar;
        vuc.y(vic.class, vicVar);
    }

    private vic() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u083f\u0000\u0004ဈ\u0000", new Object[]{"d", "c", "b", vib.class, vgp.b, "e"});
        }
        if (i2 == 3) {
            return new vic();
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
        synchronized (vic.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
