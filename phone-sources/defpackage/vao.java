package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vao extends vuc implements vvk {
    public static final vao a;
    private static volatile vvq d;
    public val b;
    public vun c = vvt.a;
    private int e;

    static {
        vao vaoVar = new vao();
        a = vaoVar;
        vuc.y(vao.class, vaoVar);
    }

    private vao() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", van.class});
        }
        if (i2 == 3) {
            return new vao();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vao.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
