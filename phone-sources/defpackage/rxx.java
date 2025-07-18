package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxx extends vuc implements vvk {
    public static final rxx a;
    private static volatile vvq c;
    public vve b = vve.a;

    static {
        rxx rxxVar = new rxx();
        a = rxxVar;
        vuc.y(rxx.class, rxxVar);
    }

    private rxx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", rxw.a});
        }
        if (i2 == 3) {
            return new rxx();
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
        synchronized (rxx.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
