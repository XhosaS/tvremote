package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzj extends vuc implements vvk {
    public static final yzj a;
    private static volatile vvq b;

    static {
        yzj yzjVar = new yzj();
        a = yzjVar;
        vuc.y(yzj.class, yzjVar);
    }

    private yzj() {
        vud vudVar = vud.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new yzj();
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
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzj.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
