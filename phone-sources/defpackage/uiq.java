package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uiq extends vuc implements vvk {
    public static final uiq a;
    private static volatile vvq c;
    public vuj b = vud.a;

    static {
        uiq uiqVar = new uiq();
        a = uiqVar;
        vuc.y(uiq.class, uiqVar);
    }

    private uiq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u0016", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new uiq();
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
        synchronized (uiq.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
