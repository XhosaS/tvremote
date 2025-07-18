package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyk extends vuc implements vvk {
    public static final vyk a;
    private static volatile vvq f;
    public int b;
    public int c;
    public val d;
    public vbz e;

    static {
        vyk vykVar = new vyk();
        a = vykVar;
        vuc.y(vyk.class, vykVar);
    }

    private vyk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new vyk();
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
        synchronized (vyk.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
