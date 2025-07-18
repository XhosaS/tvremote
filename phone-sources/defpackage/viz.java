package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class viz extends vuc implements vvk {
    public static final viz a;
    private static volatile vvq g;
    public int b;
    public vun c = vvt.a;
    public vmo d;
    public vim e;
    public int f;

    static {
        viz vizVar = new viz();
        a = vizVar;
        vuc.y(viz.class, vizVar);
    }

    private viz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0005᠌\u0003", new Object[]{"b", "c", vko.class, "d", "e", "f", vlj.p});
        }
        if (i2 == 3) {
            return new viz();
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
        synchronized (viz.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
