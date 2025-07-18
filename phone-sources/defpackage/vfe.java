package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfe extends vuc implements vvk {
    public static final vfe a;
    private static volatile vvq c;
    public int b = 18;
    private int d;

    static {
        vfe vfeVar = new vfe();
        a = vfeVar;
        vuc.y(vfe.class, vfeVar);
    }

    private vfe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", xal.t});
        }
        if (i2 == 3) {
            return new vfe();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vfe.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
