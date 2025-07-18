package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbb extends vuc implements vvk {
    public static final vbb a;
    private static volatile vvq f;
    public int b;
    public int c;
    public int d;
    public vba e;

    static {
        vbb vbbVar = new vbb();
        a = vbbVar;
        vuc.y(vbb.class, vbbVar);
    }

    private vbb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new vbb();
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
        synchronized (vbb.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
